import com.mojang.serialization.MapCodec;

public class djd extends djw {
   public static final MapCodec<djd> a = b(djd::new);
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, ayo.a($$1.E_(), 60, 120));
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         jd.a $$4 = new jd.a();

         for (ji $$5 : ji.values()) {
            $$4.a($$2, $$5);
            dtc $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ayo.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ayo.a($$3, 20, 40));
      }
   }

   private boolean e(dtc $$0, dcw $$1, jd $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dcc $$0, jd $$1, int $$2) {
      int $$3 = 0;
      jd.a $$4 = new jd.a();

      for (ji $$5 : ji.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return cuq.l;
   }
}
