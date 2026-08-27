import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fdr extends ezd {
   private static final ui a = ui.c("selectWorld.experimental.title");
   private static final ui b = ui.c("selectWorld.experimental.message");
   private static final ui c = ui.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<aob> n;
   private final ews o = new ews().a(10).b(20);

   public fdr(Collection<aob> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public ui h() {
      return uh.a(super.h(), b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      ews.b $$0 = this.o.d(2);
      eww $$1 = $$0.b().b();
      $$0.a(new euq(this.e, this.i), 2, $$1);
      eud $$2 = $$0.a(new eud(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(etj.a(c, $$0x -> this.f.a(new fdr.a())).a(100).a(), 2, $$1);
      $$0.a(etj.a(uh.i, $$0x -> this.m.accept(true)).a());
      $$0.a(etj.a(uh.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      ewr.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aC_() {
      this.m.accept(false);
   }

   class a extends ezd {
      private fdr.a.a b;

      a() {
         super(ui.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aC_() {
         this.f.a(fdr.this);
      }

      @Override
      protected void aM_() {
         super.aM_();
         this.d(etj.a(uh.k, $$0 -> this.aC_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fdr.a.a(this.f, fdr.this.n);
         this.e(this.b);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends euf<fdr.a.b> {
         public a(ero $$0, Collection<aob> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (aob $$2 : $$1) {
               String $$3 = cfi.a(cfi.f, $$2.d());
               if (!$$3.isEmpty()) {
                  ui $$4 = ul.a($$2.a().f(), vf.a.a(true));
                  ui $$5 = ui.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, euc.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends euf.a<fdr.a.b> {
         private final ui b;
         private final ui c;
         private final euc d;

         b(ui $$0, ui $$1, euc $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", uh.a(this.b, this.c));
         }
      }
   }
}
