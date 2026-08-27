import javax.annotation.Nullable;

public class fub implements fua {
   public static final int a = 0;
   private final fub.b c = new fub.b();
   private final fub.b d = new fub.b();
   public final fub.a b;

   public fub(fub.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cfz $$0, @Nullable few $$1, @Nullable bfz $$2, int $$3) {
      bfj $$4 = (bfj)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cfz $$0, few $$1, int $$2, bfj $$3) {
      hd $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.V();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return apa.b((float)$$2, 1.0F);
   }

   private float a(bfj $$0, long $$1, gu $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof byo $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return apa.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return apa.b((float)$$7, 1.0F);
   }

   @Nullable
   private few a(bfj $$0, @Nullable few $$1) {
      return $$1 == null && $$0.dI() instanceof few ? (few)$$0.dI() : $$1;
   }

   private boolean a(bfj $$0, @Nullable hd $$1) {
      return $$1 != null && $$1.a() == $$0.dI().ac() && !($$1.b().b($$0.dg()) < 1.0E-5F);
   }

   private double a(bfj $$0, gu $$1) {
      eei $$2 = eei.b($$1);
      return Math.atan2($$2.c() - $$0.dt(), $$2.a() - $$0.dn()) / (float) (Math.PI * 2);
   }

   private double a(bfj $$0) {
      return apa.c((double)($$0.dz() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      hd getPos(few var1, cfz var2, bfj var3);
   }

   static class b {
      double a;
      private double b;
      private long c;

      boolean a(long $$0) {
         return this.c != $$0;
      }

      void a(long $$0, double $$1) {
         this.c = $$0;
         double $$2 = $$1 - this.a;
         $$2 = apa.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = apa.c(this.a + this.b, 1.0);
      }
   }
}
