import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fce extends exv {
   private static final te a = te.c("selectWorld.experimental.title");
   private static final te b = te.c("selectWorld.experimental.message");
   private static final te c = te.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<ams> n;
   private final evj o = new evj().a(10).b(20);

   public fce(Collection<ams> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public te e() {
      return td.a(super.e(), b);
   }

   @Override
   protected void aE_() {
      super.aE_();
      evj.b $$0 = this.o.d(2);
      evn $$1 = $$0.b().b();
      $$0.a(new etn(this.e, this.i), 2, $$1);
      etc $$2 = $$0.a(new etc(b, this.i).b(true), 2, $$1);
      $$2.i(310);
      $$0.a(esi.a(c, $$0x -> this.f.a(new fce.a())).a(100).a(), 2, $$1);
      $$0.a(esi.a(td.i, $$0x -> this.m.accept(true)).a());
      $$0.a(esi.a(td.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         esg var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evi.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void au_() {
      this.m.accept(false);
   }

   class a extends exv {
      private fce.a.a b;

      a() {
         super(te.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void au_() {
         this.f.a(fce.this);
      }

      @Override
      protected void aE_() {
         super.aE_();
         this.d(esi.a(td.k, $$0 -> this.au_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fce.a.a(this.f, fce.this.n);
         this.e(this.b);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends ete<fce.a.b> {
         public a(eqn $$0, Collection<ams> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (ams $$2 : $$1) {
               String $$3 = cdv.a(cdv.f, $$2.d());
               if (!$$3.isEmpty()) {
                  te $$4 = tg.a($$2.a().e(), ua.a.a(true));
                  te $$5 = te.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, etb.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.d * 3 / 4;
         }
      }

      class b extends ete.a<fce.a.b> {
         private final te b;
         private final te c;
         private final etb d;

         b(te $$0, te $$1, etb $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public te a() {
            return te.a("narrator.select", td.a(this.b, this.c));
         }
      }
   }
}
