import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fcn extends eya {
   private static final tf a = tf.c("selectWorld.experimental.title");
   private static final tf b = tf.c("selectWorld.experimental.message");
   private static final tf c = tf.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<amu> n;
   private final evo o = new evo().a(10).b(20);

   public fcn(Collection<amu> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public tf e() {
      return te.a(super.e(), b);
   }

   @Override
   protected void aC_() {
      super.aC_();
      evo.b $$0 = this.o.d(2);
      evs $$1 = $$0.b().b();
      $$0.a(new etm(this.e, this.i), 2, $$1);
      eta $$2 = $$0.a(new eta(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(esg.a(c, $$0x -> this.f.a(new fcn.a())).a(100).a(), 2, $$1);
      $$0.a(esg.a(te.i, $$0x -> this.m.accept(true)).a());
      $$0.a(esg.a(te.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evn.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void at_() {
      this.m.accept(false);
   }

   class a extends eya {
      private fcn.a.a b;

      a() {
         super(tf.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void at_() {
         this.f.a(fcn.this);
      }

      @Override
      protected void aC_() {
         super.aC_();
         this.d(esg.a(te.k, $$0 -> this.at_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fcn.a.a(this.f, fcn.this.n);
         this.e(this.b);
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends etc<fcn.a.b> {
         public a(eql $$0, Collection<amu> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (amu $$2 : $$1) {
               String $$3 = cdw.a(cdw.f, $$2.d());
               if (!$$3.isEmpty()) {
                  tf $$4 = th.a($$2.a().e(), ub.a.a(true));
                  tf $$5 = tf.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, esz.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends etc.a<fcn.a.b> {
         private final tf b;
         private final tf c;
         private final esz d;

         b(tf $$0, tf $$1, esz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
