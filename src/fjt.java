import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fjt extends ffe {
   private static final vq a = vq.c("selectWorld.experimental.title");
   private static final vq b = vq.c("selectWorld.experimental.message");
   private static final vq c = vq.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<ari> n;
   private final fcs o = new fcs().a(10).b(20);

   public fjt(Collection<ari> $$0, BooleanConsumer $$1) {
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
      fcs.b $$0 = this.o.d(2);
      fcw $$1 = $$0.b().b();
      $$0.a(new fao(this.e, this.i), 2, $$1);
      fab $$2 = $$0.a(new fab(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(ezh.a(c, $$0x -> this.f.a(new fjt.a())).a(100).a(), 2, $$1);
      $$0.a(ezh.a(vp.i, $$0x -> this.m.accept(true)).a());
      $$0.a(ezh.a(vp.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fcr.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends ffe {
      private fjt.a.a b;

      a() {
         super(vq.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(fjt.this);
      }

      @Override
      protected void aQ_() {
         super.aQ_();
         this.d(ezh.a(vp.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.d(new fjt.a.a(this.f, fjt.this.n));
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends fad<fjt.a.b> {
         public a(exh $$0, Collection<ari> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (ari $$2 : $$1) {
               String $$3 = cju.a(cju.g, $$2.d());
               if (!$$3.isEmpty()) {
                  vq $$4 = vt.a($$2.a().f(), wn.a.a(true));
                  vq $$5 = vq.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, faa.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fad.a<fjt.a.b> {
         private final vq b;
         private final vq c;
         private final faa d;

         b(vq $$0, vq $$1, faa $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
