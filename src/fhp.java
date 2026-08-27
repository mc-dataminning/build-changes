import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fhp extends fda {
   private static final vf a = vf.c("selectWorld.experimental.title");
   private static final vf b = vf.c("selectWorld.experimental.message");
   private static final vf c = vf.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<app> n;
   private final fao o = new fao().a(10).b(20);

   public fhp(Collection<app> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fao.b $$0 = this.o.d(2);
      fas $$1 = $$0.b().b();
      $$0.a(new eym(this.e, this.i), 2, $$1);
      exz $$2 = $$0.a(new exz(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(exf.a(c, $$0x -> this.f.a(new fhp.a())).a(100).a(), 2, $$1);
      $$0.a(exf.a(ve.i, $$0x -> this.m.accept(true)).a());
      $$0.a(exf.a(ve.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fan.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aE_() {
      this.m.accept(false);
   }

   class a extends fda {
      private fhp.a.a b;

      a() {
         super(vf.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aE_() {
         this.f.a(fhp.this);
      }

      @Override
      protected void aN_() {
         super.aN_();
         this.d(exf.a(ve.k, $$0 -> this.aE_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.d(new fhp.a.a(this.f, fhp.this.n));
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends eyb<fhp.a.b> {
         public a(evh $$0, Collection<app> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (app $$2 : $$1) {
               String $$3 = cht.a(cht.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vf $$4 = vi.a($$2.a().f(), wc.a.a(true));
                  vf $$5 = vf.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, exy.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends eyb.a<fhp.a.b> {
         private final vf b;
         private final vf c;
         private final exy d;

         b(vf $$0, vf $$1, exy $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", ve.a(this.b, this.c));
         }
      }
   }
}
