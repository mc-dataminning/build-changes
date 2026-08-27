import com.google.common.annotations.VisibleForTesting;

public class dnu extends dmo implements dud.b<dnu.a> {
   private final dnu.a a;

   public dnu(id $$0, dpi $$1) {
      super(dmq.K, $$0, $$1);
      this.a = new dnu.a($$1, new dtx($$0));
   }

   public static void a(czg $$0, id $$1, dpi $$2, dnu $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dnu.a b() {
      return this.a;
   }

   public static class a implements dud {
      public static final int a = 8;
      final djb b;
      private final dpi c;
      private final duf d;

      public a(dpi $$0, duf $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = djb.a();
      }

      @Override
      public duf a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dud.a c() {
         return dud.a.b;
      }

      @Override
      public boolean a(apu $$0, in<dub> $$1, dub.a $$2, esj $$3) {
         if ($$1.a(dub.p) && $$2.a() instanceof bqt $$4) {
            if (!$$4.eF()) {
               int $$5 = $$4.eg();
               if ($$4.ee() && $$5 > 0) {
                  this.b.a(id.a($$3.a(ij.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eE();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, id.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public djb d() {
         return this.b;
      }

      private void a(apu $$0, id $$1, dpi $$2, axt $$3) {
         $$0.a($$1, $$2.a(diy.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kn.H, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, auo.vE, aup.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(czg $$0, bqt $$1) {
         if ($$1.ej() instanceof apv $$3) {
            boy $$4 = $$1.ez() == null ? $$0.ai().a((cka)$$3) : $$1.ez();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
