import com.mojang.serialization.MapCodec;

public class dli extends dfy implements dgb {
   public static final MapCodec<dli> a = b(dli::new);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   protected dli(dtb.d $$0) {
      super($$0);
   }

   private static boolean b(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      int $$5 = eov.a($$1, $$0, $$2, $$4, $$3, ji.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dga.dV.o());
      }
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      dtc $$4 = $$0.a_($$2);
      jd $$5 = $$2.d();
      duz $$6 = $$0.l().g();
      jz<ebq<?, ?>> $$7 = $$0.H_().d(lu.aI);
      if ($$4.a(dga.ow)) {
         this.a($$7, rt.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dga.on)) {
         this.a($$7, rt.j, $$0, $$6, $$1, $$5);
         this.a($$7, rt.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rt.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jz<ebq<?, ?>> $$0, akq<ebq<?, ?>> $$1, aqu $$2, duz $$3, ayw $$4, jd $$5) {
      $$0.b($$1).ifPresent($$4x -> ((ebq)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dgb.a au_() {
      return dgb.a.a;
   }
}
