import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aex implements yv<abk> {
   public static final ym<vz, aex> a = yv.a(aex::a, aex::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bur, cwn>> d;

   public aex(int $$0, List<Pair<bur, cwn>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aex(vz $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bur $$2 = bur.i.get($$1 & 127);
         cwn $$3 = cwn.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(vz $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bur, cwn> $$3 = this.d.get($$2);
         bur $$4 = (bur)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwn.g.encode($$0, (cwn)$$3.getSecond());
      }
   }

   @Override
   public yx<aex> a() {
      return agd.aI;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<Pair<bur, cwn>> e() {
      return this.d;
   }
}
