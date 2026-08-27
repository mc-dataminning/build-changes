import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class few extends fah {
   private static final ur a = ur.c("selectWorld.experimental.title");
   private static final ur b = ur.c("selectWorld.experimental.message");
   private static final ur c = ur.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<aol> n;
   private final exv o = new exv().a(10).b(20);

   public few(Collection<aol> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      exv.b $$0 = this.o.d(2);
      exz $$1 = $$0.b().b();
      $$0.a(new evt(this.e, this.i), 2, $$1);
      evg $$2 = $$0.a(new evg(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(eum.a(c, $$0x -> this.f.a(new few.a())).a(100).a(), 2, $$1);
      $$0.a(eum.a(uq.i, $$0x -> this.m.accept(true)).a());
      $$0.a(eum.a(uq.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      exu.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void aE_() {
      this.m.accept(false);
   }

   class a extends fah {
      private few.a.a b;

      a() {
         super(ur.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void aE_() {
         this.f.a(few.this);
      }

      @Override
      protected void aO_() {
         super.aO_();
         this.d(eum.a(uq.k, $$0 -> this.aE_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new few.a.a(this.f, few.this.n);
         this.e(this.b);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends evi<few.a.b> {
         public a(esr $$0, Collection<aol> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (aol $$2 : $$1) {
               String $$3 = cfx.a(cfx.g, $$2.d());
               if (!$$3.isEmpty()) {
                  ur $$4 = uu.a($$2.a().f(), vo.a.a(true));
                  ur $$5 = ur.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, evf.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends evi.a<few.a.b> {
         private final ur b;
         private final ur c;
         private final evf d;

         b(ur $$0, ur $$1, evf $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", uq.a(this.b, this.c));
         }
      }
   }
}
