import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fci extends exz {
   private static final tf a = tf.c("selectWorld.experimental.title");
   private static final tf b = tf.c("selectWorld.experimental.message");
   private static final tf c = tf.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<amu> n;
   private final evn o = new evn().a(10).b(20);

   public fci(Collection<amu> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public tf e() {
      return te.a(super.e(), b);
   }

   @Override
   protected void aE_() {
      super.aE_();
      evn.b $$0 = this.o.d(2);
      evr $$1 = $$0.b().b();
      $$0.a(new etm(this.e, this.i), 2, $$1);
      etb $$2 = $$0.a(new etb(b, this.i).b(true), 2, $$1);
      $$2.i(310);
      $$0.a(esh.a(c, $$0x -> this.f.a(new fci.a())).a(100).a(), 2, $$1);
      $$0.a(esh.a(te.i, $$0x -> this.m.accept(true)).a());
      $$0.a(esh.a(te.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         esf var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evm.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void au_() {
      this.m.accept(false);
   }

   class a extends exz {
      private fci.a.a b;

      a() {
         super(tf.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void au_() {
         this.f.a(fci.this);
      }

      @Override
      protected void aE_() {
         super.aE_();
         this.d(esh.a(te.k, $$0 -> this.au_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fci.a.a(this.f, fci.this.n);
         this.e(this.b);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends etd<fci.a.b> {
         public a(eqm $$0, Collection<amu> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (amu $$2 : $$1) {
               String $$3 = cdx.a(cdx.f, $$2.d());
               if (!$$3.isEmpty()) {
                  tf $$4 = th.a($$2.a().e(), ub.a.a(true));
                  tf $$5 = tf.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, eta.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends etd.a<fci.a.b> {
         private final tf b;
         private final tf c;
         private final eta d;

         b(tf $$0, tf $$1, eta $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", te.a(this.b, this.c));
         }
      }
   }
}
