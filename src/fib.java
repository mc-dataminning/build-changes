import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fib extends fdm {
   private static final vg a = vg.c("selectWorld.experimental.title");
   private static final vg b = vg.c("selectWorld.experimental.message");
   private static final vg c = vg.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<apr> n;
   private final fba o = new fba().a(10).b(20);

   public fib(Collection<apr> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vg i() {
      return vf.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      fba.b $$0 = this.o.d(2);
      fbe $$1 = $$0.b().b();
      $$0.a(new eyy(this.e, this.i), 2, $$1);
      eyl $$2 = $$0.a(new eyl(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(exr.a(c, $$0x -> this.f.a(new fib.a())).a(100).a(), 2, $$1);
      $$0.a(exr.a(vf.i, $$0x -> this.m.accept(true)).a());
      $$0.a(exr.a(vf.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      faz.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends fdm {
      private fib.a.a b;

      a() {
         super(vg.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(fib.this);
      }

      @Override
      protected void aP_() {
         super.aP_();
         this.d(exr.a(vf.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.d(new fib.a.a(this.f, fib.this.n));
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends eyn<fib.a.b> {
         public a(evr $$0, Collection<apr> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (apr $$2 : $$1) {
               String $$3 = cic.a(cic.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vg $$4 = vj.a($$2.a().f(), wd.a.a(true));
                  vg $$5 = vg.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, eyk.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends eyn.a<fib.a.b> {
         private final vg b;
         private final vg c;
         private final eyk d;

         b(vg $$0, vg $$1, eyk $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vg a() {
            return vg.a("narrator.select", vf.a(this.b, this.c));
         }
      }
   }
}
