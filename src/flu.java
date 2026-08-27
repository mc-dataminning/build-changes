import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class flu extends fhf {
   private static final vu a = vu.c("selectWorld.experimental.title");
   private static final vu b = vu.c("selectWorld.experimental.message");
   private static final vu c = vu.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<arw> n;
   private final fes o = new fes().a(10).b(20);

   public flu(Collection<arw> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      fes.b $$0 = this.o.d(2);
      few $$1 = $$0.b().b();
      $$0.a(new fcn(this.e, this.i), 2, $$1);
      fca $$2 = $$0.a(new fca(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(fbg.a(c, $$0x -> this.f.a(new flu.a())).a(100).a(), 2, $$1);
      $$0.a(fbg.a(vt.i, $$0x -> this.m.accept(true)).a());
      $$0.a(fbg.a(vt.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fer.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends fhf {
      private flu.a.a b;

      a() {
         super(vu.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(flu.this);
      }

      @Override
      protected void aO_() {
         super.aO_();
         this.c(fbg.a(vt.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.c(new flu.a.a(this.f, flu.this.n));
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends fcc<flu.a.b> {
         public a(ezg $$0, Collection<arw> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (arw $$2 : $$1) {
               String $$3 = clh.a(clh.g, $$2.e());
               if (!$$3.isEmpty()) {
                  vu $$4 = vx.a($$2.b().f(), wr.a.a(true));
                  vu $$5 = vu.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fbz.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fcc.a<flu.a.b> {
         private final vu b;
         private final vu c;
         private final fbz d;

         b(vu $$0, vu $$1, fbz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", vt.a(this.b, this.c));
         }
      }
   }
}
