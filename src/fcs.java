import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fcs extends eyf {
   private static final ti a = ti.c("selectWorld.experimental.title");
   private static final ti b = ti.c("selectWorld.experimental.message");
   private static final ti c = ti.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<amx> n;
   private final evt o = new evt().a(10).b(20);

   public fcs(Collection<amx> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public ti g() {
      return th.a(super.g(), b);
   }

   @Override
   protected void aD_() {
      super.aD_();
      evt.b $$0 = this.o.d(2);
      evx $$1 = $$0.b().b();
      $$0.a(new etr(this.e, this.i), 2, $$1);
      etf $$2 = $$0.a(new etf(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(esl.a(c, $$0x -> this.f.a(new fcs.a())).a(100).a(), 2, $$1);
      $$0.a(esl.a(th.i, $$0x -> this.m.accept(true)).a());
      $$0.a(esl.a(th.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         esj var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evs.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void au_() {
      this.m.accept(false);
   }

   class a extends eyf {
      private fcs.a.a b;

      a() {
         super(ti.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void au_() {
         this.f.a(fcs.this);
      }

      @Override
      protected void aD_() {
         super.aD_();
         this.d(esl.a(th.k, $$0 -> this.au_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fcs.a.a(this.f, fcs.this.n);
         this.e(this.b);
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends eth<fcs.a.b> {
         public a(eqq $$0, Collection<amx> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (amx $$2 : $$1) {
               String $$3 = cdz.a(cdz.f, $$2.d());
               if (!$$3.isEmpty()) {
                  ti $$4 = tk.a($$2.a().e(), ue.a.a(true));
                  ti $$5 = ti.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, ete.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends eth.a<fcs.a.b> {
         private final ti b;
         private final ti c;
         private final ete d;

         b(ti $$0, ti $$1, ete $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public ti a() {
            return ti.a("narrator.select", th.a(this.b, this.c));
         }
      }
   }
}
