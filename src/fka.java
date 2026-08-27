import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fka extends ffl {
   private static final vq a = vq.c("selectWorld.experimental.title");
   private static final vq b = vq.c("selectWorld.experimental.message");
   private static final vq c = vq.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<arj> n;
   private final fcz o = new fcz().a(10).b(20);

   public fka(Collection<arj> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vq i() {
      return vp.a(super.i(), b);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      fcz.b $$0 = this.o.d(2);
      fdd $$1 = $$0.b().b();
      $$0.a(new fav(this.e, this.i), 2, $$1);
      fai $$2 = $$0.a(new fai(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(ezo.a(c, $$0x -> this.f.a(new fka.a())).a(100).a(), 2, $$1);
      $$0.a(ezo.a(vp.i, $$0x -> this.m.accept(true)).a());
      $$0.a(ezo.a(vp.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fcy.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends ffl {
      private fka.a.a b;

      a() {
         super(vq.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(fka.this);
      }

      @Override
      protected void aQ_() {
         super.aQ_();
         this.c(ezo.a(vp.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.c(new fka.a.a(this.f, fka.this.n));
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends fak<fka.a.b> {
         public a(exo $$0, Collection<arj> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (arj $$2 : $$1) {
               String $$3 = cjy.a(cjy.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vq $$4 = vt.a($$2.a().f(), wn.a.a(true));
                  vq $$5 = vq.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fah.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fak.a<fka.a.b> {
         private final vq b;
         private final vq c;
         private final fah d;

         b(vq $$0, vq $$1, fah $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", vp.a(this.b, this.c));
         }
      }
   }
}
