import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aex implements ze<abq> {
   public static final yv<wi, aex> a = ze.a(aex::a, aex::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsb, cto>> d;

   public aex(int $$0, List<Pair<bsb, cto>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aex(wi $$0) {
      this.c = $$0.l();
      bsb[] $$1 = bsb.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsb $$3 = $$1[$$2 & 127];
         cto $$4 = cto.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wi $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsb, cto> $$3 = this.d.get($$2);
         bsb $$4 = (bsb)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         cto.e.encode($$0, (cto)$$3.getSecond());
      }
   }

   @Override
   public zg<aex> a() {
      return agb.aF;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsb, cto>> e() {
      return this.d;
   }
}
