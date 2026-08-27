import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class foc extends fjo {
   private static final wg a = wg.c("selectWorld.experimental.title");
   private static final wg b = wg.c("selectWorld.experimental.message");
   private static final wg c = wg.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int o = 100;
   private final BooleanConsumer p;
   final Collection<ask> q;
   private final fhb r = new fhb().a(10).b(20);

   public foc(Collection<ask> $$0, BooleanConsumer $$1) {
      super(a);
      this.q = $$0;
      this.p = $$1;
   }

   @Override
   public wg i() {
      return wf.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fhb.b $$0 = this.r.d(2);
      fhf $$1 = $$0.b().b();
      $$0.a(new few(this.i, this.m), 2, $$1);
      fej $$2 = $$0.a(new fej(b, this.m).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fdp.a(c, $$0x -> this.j.a(new foc.a())).a(100).a(), 2, $$1);
      $$0.a(fdp.a(wf.i, $$0x -> this.p.accept(true)).a());
      $$0.a(fdp.a(wf.k, $$0x -> this.p.accept(false)).a());
      this.r.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.r.a();
      this.c();
   }

   @Override
   protected void c() {
      fha.a(this.r, 0, 0, this.k, this.l, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.p.accept(false);
   }

   class a extends fjo {
      private static final wg b = wg.c("selectWorld.experimental.details.title");
      final fhc c = new fhc(this);

      a() {
         super(b);
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.m);
         this.c.c(new foc.a.a(this.j, foc.this.q));
         this.c.b(fdp.a(wf.k, $$0 -> this.d()).a());
         this.c.a($$1 -> {
            fdn var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.j.a(foc.this);
      }

      class a extends fel<foc.a.b> {
         public a(fbp $$0, Collection<ask> $$1) {
            super($$0, a.this.k, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (ask $$2 : $$1) {
               String $$3 = cmi.a(cmi.g, $$2.e());
               if (!$$3.isEmpty()) {
                  wg $$4 = wj.a($$2.b().f(), xd.a.a(true));
                  wg $$5 = wg.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fei.a(a.this.m, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fel.a<foc.a.b> {
         private final wg b;
         private final wg c;
         private final fei d;

         b(wg $$0, wg $$1, fei $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.j.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", wf.a(this.b, this.c));
         }
      }
   }
}
