import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class ffo extends faz {
   private static final uv a = uv.c("selectWorld.experimental.title");
   private static final uv b = uv.c("selectWorld.experimental.message");
   private static final uv c = uv.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<aot> n;
   private final eyn o = new eyn().a(10).b(20);

   public ffo(Collection<aot> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public uv h() {
      return uu.a(super.h(), b);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      eyn.b $$0 = this.o.d(2);
      eyr $$1 = $$0.b().b();
      $$0.a(new ewl(this.e, this.i), 2, $$1);
      evy $$2 = $$0.a(new evy(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(eve.a(c, $$0x -> this.f.a(new ffo.a())).a(100).a(), 2, $$1);
      $$0.a(eve.a(uu.i, $$0x -> this.m.accept(true)).a());
      $$0.a(eve.a(uu.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      eym.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aG_() {
      this.m.accept(false);
   }

   class a extends faz {
      private ffo.a.a b;

      a() {
         super(uv.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aG_() {
         this.f.a(ffo.this);
      }

      @Override
      protected void aQ_() {
         super.aQ_();
         this.d(eve.a(uu.k, $$0 -> this.aG_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new ffo.a.a(this.f, ffo.this.n);
         this.e(this.b);
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends ewa<ffo.a.b> {
         public a(eti $$0, Collection<aot> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (aot $$2 : $$1) {
               String $$3 = cgk.a(cgk.g, $$2.d());
               if (!$$3.isEmpty()) {
                  uv $$4 = uy.a($$2.a().f(), vs.a.a(true));
                  uv $$5 = uv.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, evx.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends ewa.a<ffo.a.b> {
         private final uv b;
         private final uv c;
         private final evx d;

         b(uv $$0, uv $$1, evx $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", uu.a(this.b, this.c));
         }
      }
   }
}
