public class flh extends flq {
   private static final wx a = wx.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private flh.a s;
   final gpd u;

   public flh(fly $$0, fed $$1, gpd $$2) {
      super($$0, $$1, wx.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new flh.a(this.m));
      this.d.a(53);
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   @Override
   protected void h() {
      fjq $$0 = this.d.b(fjq.d()).a(8);
      $$0.c().b();
      $$0.a(new fhg(a, this.p));
      fjq $$1 = $$0.a(fjq.e().a(8));
      $$1.a(ffz.a(wx.c("options.font"), $$0x -> this.m.a(new fld(this, this.c))).a());
      $$1.a(ffz.a(ww.d, $$0x -> this.C()).a());
   }

   void C() {
      flh.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ad = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fgv<flh.a.a> {
      public a(fdz $$0) {
         super($$0, flh.this.n, flh.this.o - 33 - 53, 33, 18);
         String $$1 = flh.this.u.a();
         flh.this.u.b().forEach(($$1x, $$2) -> {
            flh.a.a $$3 = new flh.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.h() != null) {
            this.e(this.h());
         }
      }

      @Override
      public int b() {
         return super.b() + 50;
      }

      public class a extends fgv.a<flh.a.a> {
         final String b;
         private final wx c;
         private long d;

         public a(String $$1, gpc $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(flh.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fka.a($$0)) {
               this.b();
               flh.this.C();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.c() - this.d < 250L) {
               flh.this.C();
            }

            this.d = ac.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", this.c);
         }
      }
   }
}
