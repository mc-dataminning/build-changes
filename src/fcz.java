import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fcz extends eym {
   private static final tn a = tn.c("selectWorld.experimental.title");
   private static final tn b = tn.c("selectWorld.experimental.message");
   private static final tn c = tn.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<and> n;
   private final ewa o = new ewa().a(10).b(20);

   public fcz(Collection<and> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public tn g() {
      return tm.a(super.g(), b);
   }

   @Override
   protected void aH_() {
      super.aH_();
      ewa.b $$0 = this.o.d(2);
      ewe $$1 = $$0.b().b();
      $$0.a(new ety(this.e, this.i), 2, $$1);
      etm $$2 = $$0.a(new etm(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(ess.a(c, $$0x -> this.f.a(new fcz.a())).a(100).a(), 2, $$1);
      $$0.a(ess.a(tm.i, $$0x -> this.m.accept(true)).a());
      $$0.a(ess.a(tm.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evz.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void az_() {
      this.m.accept(false);
   }

   class a extends eym {
      private fcz.a.a b;

      a() {
         super(tn.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void az_() {
         this.f.a(fcz.this);
      }

      @Override
      protected void aH_() {
         super.aH_();
         this.d(ess.a(tm.k, $$0 -> this.az_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fcz.a.a(this.f, fcz.this.n);
         this.e(this.b);
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends eto<fcz.a.b> {
         public a(eqx $$0, Collection<and> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (and $$2 : $$1) {
               String $$3 = ceg.a(ceg.f, $$2.d());
               if (!$$3.isEmpty()) {
                  tn $$4 = tp.a($$2.a().e(), uj.a.a(true));
                  tn $$5 = tn.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, etl.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends eto.a<fcz.a.b> {
         private final tn b;
         private final tn c;
         private final etl d;

         b(tn $$0, tn $$1, etl $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", tm.a(this.b, this.c));
         }
      }
   }
}
