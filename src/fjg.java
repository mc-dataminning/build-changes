public class fjg extends fjp {
   private static final wi a = wi.c("options.languageAccuracyWarning").a(n.h);
   private static final int o = 53;
   private fjg.a p;
   final gmz q;

   public fjg(fjx $$0, fcc $$1, gmz $$2) {
      super($$0, $$1, wi.c("options.language.title"));
      this.q = $$2;
   }

   @Override
   protected void aM_() {
      this.p = this.c(new fjg.a(this.j));
      this.d.a(53);
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.p.a(this.k, this.d);
   }

   @Override
   protected void h() {
      fhp $$0 = this.d.b(fhp.d()).a(8);
      $$0.c().b();
      $$0.a(new fff(a, this.m));
      fhp $$1 = $$0.a(fhp.e().a(8));
      $$1.a(fdy.a(wi.c("options.font"), $$0x -> this.j.a(new fjc(this, this.c))).a());
      $$1.a(fdy.a(wh.d, $$0x -> this.d()).a());
   }

   void C() {
      fjg.a.a $$0 = this.p.h();
      if ($$0 != null && !$$0.b.equals(this.q.a())) {
         this.q.a($$0.b);
         this.c.ad = $$0.b;
         this.j.l();
         this.c.av();
      }

      this.j.a(this.b);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fhz.a($$0)) {
         fjg.a.a $$3 = this.p.h();
         if ($$3 != null) {
            $$3.b();
            this.C();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   class a extends feu<fjg.a.a> {
      public a(fby $$0) {
         super($$0, fjg.this.k, fjg.this.l - 33 - 53, 33, 18);
         String $$1 = fjg.this.q.a();
         fjg.this.q.b().forEach(($$1x, $$2) -> {
            fjg.a.a $$3 = new fjg.a.a($$1x, $$2);
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

      public class a extends feu.a<fjg.a.a> {
         final String b;
         private final wi c;
         private long d;

         public a(String $$1, gmy $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fjg.this.m, this.c, a.this.g / 2, $$2 + 1, -1);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ac.b() - this.d < 250L) {
               fjg.this.C();
            }

            this.d = ac.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", this.c);
         }
      }
   }
}
