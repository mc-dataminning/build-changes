public class fkc extends fkl {
   private static final ws a = ws.c("options.languageAccuracyWarning").a(n.h);
   private static final int r = 53;
   private fkc.a s;
   final gnv u;

   public fkc(fkt $$0, fcy $$1, gnv $$2) {
      super($$0, $$1, ws.c("options.language.title"));
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fkc.a(this.m));
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
      fil $$0 = this.d.b(fil.d()).a(8);
      $$0.c().b();
      $$0.a(new fgb(a, this.p));
      fil $$1 = $$0.a(fil.e().a(8));
      $$1.a(feu.a(ws.c("options.font"), $$0x -> this.m.a(new fjy(this, this.c))).a());
      $$1.a(feu.a(wr.d, $$0x -> this.C()).a());
   }

   void C() {
      fkc.a.a $$0 = this.s.h();
      if ($$0 != null && !$$0.b.equals(this.u.a())) {
         this.u.a($$0.b);
         this.c.ad = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends ffq<fkc.a.a> {
      public a(fcu $$0) {
         super($$0, fkc.this.n, fkc.this.o - 33 - 53, 33, 18);
         String $$1 = fkc.this.u.a();
         fkc.this.u.b().forEach(($$1x, $$2) -> {
            fkc.a.a $$3 = new fkc.a.a($$1x, $$2);
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

      public class a extends ffq.a<fkc.a.a> {
         final String b;
         private final ws c;
         private long d;

         public a(String $$1, gnu $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fkc.this.p, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fiv.a($$0)) {
               this.b();
               fkc.this.C();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fkc.this.C();
            }

            this.d = ac.b();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", this.c);
         }
      }
   }
}
