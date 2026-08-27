import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class eyz extends euq {
   private static final sw a = sw.c("selectWorld.experimental.title");
   private static final sw b = sw.c("selectWorld.experimental.message");
   private static final sw c = sw.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<akg> n;
   private final esf o = new esf().a(10).b(20);

   public eyz(Collection<akg> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public sw au_() {
      return sv.a(super.au_(), b);
   }

   @Override
   protected void b() {
      super.b();
      esf.b $$0 = this.o.d(2);
      esj $$1 = $$0.b().b();
      $$0.a(new eqk(this.e, this.i), 2, $$1);
      eqa $$2 = $$0.a(new eqa(b, this.i).b(true), 2, $$1);
      $$2.i(310);
      $$0.a(epi.a(c, $$0x -> this.f.a(new eyz.a())).a(100).a(), 2, $$1);
      $$0.a(epi.a(sv.i, $$0x -> this.m.accept(true)).a());
      $$0.a(epi.a(sv.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         epf var10000 = this.d($$1x);
      });
      this.o.c();
      this.aG_();
   }

   @Override
   protected void aG_() {
      ese.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void aw_() {
      this.m.accept(false);
   }

   class a extends euq {
      private eyz.a.a b;

      a() {
         super(sw.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aw_() {
         this.f.a(eyz.this);
      }

      @Override
      protected void b() {
         super.b();
         this.d(epi.a(sv.k, $$0 -> this.aw_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new eyz.a.a(this.f, eyz.this.n);
         this.e(this.b);
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
         super.a($$0, $$1, $$2, $$3);
      }

      class a extends eqc<eyz.a.b> {
         public a(enn $$0, Collection<akg> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (akg $$2 : $$1) {
               String $$3 = cay.a(cay.e, $$2.d());
               if (!$$3.isEmpty()) {
                  sw $$4 = sy.a($$2.a().e(), ts.a.a(true));
                  sw $$5 = sw.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, epz.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.d * 3 / 4;
         }
      }

      class b extends eqc.a<eyz.a.b> {
         private final sw b;
         private final sw c;
         private final epz d;

         b(sw $$0, sw $$1, epz $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", sv.a(this.b, this.c));
         }
      }
   }
}
