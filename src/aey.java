import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aey implements ze<abq> {
   public static final yv<wi, aey> a = ze.a(aey::a, aey::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bsd, ctq>> d;

   public aey(int $$0, List<Pair<bsd, ctq>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aey(wi $$0) {
      this.c = $$0.l();
      bsd[] $$1 = bsd.values();
      this.d = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bsd $$3 = $$1[$$2 & 127];
         ctq $$4 = ctq.e.decode($$0);
         this.d.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   private void a(wi $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bsd, ctq> $$3 = this.d.get($$2);
         bsd $$4 = (bsd)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         ctq.e.encode($$0, (ctq)$$3.getSecond());
      }
   }

   @Override
   public zg<aey> a() {
      return agc.aF;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bsd, ctq>> e() {
      return this.d;
   }
}
