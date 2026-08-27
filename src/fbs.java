public class fbs extends fbg<cgs> {
   private static final agg x = new agg("container/crafter/disabled_slot");
   private static final agg y = new agg("container/crafter/powered_redstone");
   private static final agg z = new agg("container/crafter/unpowered_redstone");
   private static final agg A = new agg("textures/gui/container/crafter.png");
   private static final ur B = ur.c("gui.togglable_slot");
   private final cdm C;

   public fbs(cgs $$0, cdl $$1, ur $$2) {
      super($$0, $$1, $$2);
      this.C = $$1.m;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.l = (this.c - this.i.a(this.e)) / 2;
   }

   @Override
   protected void a(chz $$0, int $$1, int $$2, cgn $$3) {
      if (this.C.N_()) {
         super.a($$0, $$1, $$2, $$3);
      } else {
         if ($$1 > -1 && $$1 < 9 && $$0 instanceof cgt) {
            if ($$0.g()) {
               super.a($$0, $$1, $$2, $$3);
               return;
            }

            boolean $$4 = this.p.e($$1);
            if ($$4 || this.p.g().b()) {
               this.p.a($$1, $$4);
               super.a($$1, this.p.j, $$4);
               if ($$4) {
                  this.C.a(aqn.yy.a(), 0.4F, 1.0F);
               } else {
                  this.C.a(aqn.yy.a(), 0.4F, 0.75F);
               }
            }
         }

         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void a(eub $$0, chz $$1) {
      if ($$1 instanceof cgt $$2 && this.p.e($$1.e)) {
         this.a($$0, $$2);
         return;
      }

      super.a($$0, $$1);
   }

   private void a(eub $$0, cgt $$1) {
      $$0.a(x, $$1.f - 1, $$1.g - 1, 18, 18);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.a($$0, $$1, $$2);
      if (this.r instanceof cgt && !this.p.e(this.r.e) && this.p.g().b() && !this.r.g()) {
         $$0.a(this.i, B, $$1, $$2);
      }
   }

   private void c(eub $$0) {
      int $$1 = this.g / 2 + 9;
      int $$2 = this.h / 2 - 48;
      agg $$3;
      if (this.p.l()) {
         $$3 = y;
      } else {
         $$3 = z;
      }

      $$0.a($$3, $$1, $$2, 16, 16);
   }

   @Override
   protected void a(eub $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.k);
   }
}
