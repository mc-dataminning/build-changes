import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class aex implements yv<abk> {
   public static final ym<vz, aex> a = yv.a(aex::a, aex::new);
   private static final byte b = -128;
   private final int c;
   private final List<Pair<bus, cwp>> d;

   public aex(int $$0, List<Pair<bus, cwp>> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private aex(vz $$0) {
      this.c = $$0.l();
      this.d = Lists.newArrayList();

      int $$1;
      do {
         $$1 = $$0.readByte();
         bus $$2 = bus.i.get($$1 & 127);
         cwp $$3 = cwp.g.decode($$0);
         this.d.add(Pair.of($$2, $$3));
      } while (($$1 & -128) != 0);
   }

   private void a(vz $$0) {
      $$0.c(this.c);
      int $$1 = this.d.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bus, cwp> $$3 = this.d.get($$2);
         bus $$4 = (bus)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.l($$5 ? $$6 | -128 : $$6);
         cwp.g.encode($$0, (cwp)$$3.getSecond());
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

   public List<Pair<bus, cwp>> e() {
      return this.d;
   }
}
