import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fhi extends fct {
   private static final vd a = vd.c("selectWorld.experimental.title");
   private static final vd b = vd.c("selectWorld.experimental.message");
   private static final vd c = vd.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<apk> n;
   private final fah o = new fah().a(10).b(20);

   public fhi(Collection<apk> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vd h() {
      return vc.a(super.h(), b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fah.b $$0 = this.o.d(2);
      fal $$1 = $$0.b().b();
      $$0.a(new eyf(this.e, this.i), 2, $$1);
      exs $$2 = $$0.a(new exs(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(ewy.a(c, $$0x -> this.f.a(new fhi.a())).a(100).a(), 2, $$1);
      $$0.a(ewy.a(vc.i, $$0x -> this.m.accept(true)).a());
      $$0.a(ewy.a(vc.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fag.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aE_() {
      this.m.accept(false);
   }

   class a extends fct {
      private fhi.a.a b;

      a() {
         super(vd.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aE_() {
         this.f.a(fhi.this);
      }

      @Override
      protected void aN_() {
         super.aN_();
         this.d(ewy.a(vc.k, $$0 -> this.aE_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.d(new fhi.a.a(this.f, fhi.this.n));
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends exu<fhi.a.b> {
         public a(eva $$0, Collection<apk> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (apk $$2 : $$1) {
               String $$3 = chn.a(chn.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vd $$4 = vg.a($$2.a().f(), wa.a.a(true));
                  vd $$5 = vd.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, exr.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends exu.a<fhi.a.b> {
         private final vd b;
         private final vd c;
         private final exr d;

         b(vd $$0, vd $$1, exr $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vd a() {
            return vd.a("narrator.select", vc.a(this.b, this.c));
         }
      }
   }
}
