import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fhq extends fdb {
   private static final vf a = vf.c("selectWorld.experimental.title");
   private static final vf b = vf.c("selectWorld.experimental.message");
   private static final vf c = vf.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<apq> n;
   private final fap o = new fap().a(10).b(20);

   public fhq(Collection<apq> $$0, BooleanConsumer $$1) {
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
      fap.b $$0 = this.o.d(2);
      fat $$1 = $$0.b().b();
      $$0.a(new eyn(this.e, this.i), 2, $$1);
      eya $$2 = $$0.a(new eya(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(exg.a(c, $$0x -> this.f.a(new fhq.a())).a(100).a(), 2, $$1);
      $$0.a(exg.a(ve.i, $$0x -> this.m.accept(true)).a());
      $$0.a(exg.a(ve.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fao.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aE_() {
      this.m.accept(false);
   }

   class a extends fdb {
      private fhq.a.a b;

      a() {
         super(vf.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aE_() {
         this.f.a(fhq.this);
      }

      @Override
      protected void aN_() {
         super.aN_();
         this.d(exg.a(ve.k, $$0 -> this.aE_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.d(new fhq.a.a(this.f, fhq.this.n));
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends eyc<fhq.a.b> {
         public a(evi $$0, Collection<apq> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (apq $$2 : $$1) {
               String $$3 = chu.a(chu.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vf $$4 = vi.a($$2.a().f(), wc.a.a(true));
                  vf $$5 = vf.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, exz.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends eyc.a<fhq.a.b> {
         private final vf b;
         private final vf c;
         private final exz d;

         b(vf $$0, vf $$1, exz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
