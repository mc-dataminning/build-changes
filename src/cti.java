import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class cti extends cvk implements cus {
   public static final ky a = new kx() {
      @Override
      protected cvp a(kv $$0, cvp $$1) {
         return cti.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cti.a b;
   protected final jn<ctj> c;
   private final Supplier<cyk> d;

   public static boolean a(kv $$0, cvp $$1) {
      je $$2 = $$0.c().a($$0.d().c(djo.b));
      List<buk> $$3 = $$0.b().a(buk.class, new eyn($$2), btt.f.and(new btt.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         buk $$4 = $$3.get(0);
         btw $$5 = $$4.g($$1);
         cvp $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bum) {
            ((bum)$$4).a($$5, 2.0F);
            ((bum)$$4).fW();
         }

         return true;
      }
   }

   public cti(jn<ctj> $$0, cti.a $$1, cvk.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      djo.a(this, a);
      this.d = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().e();
         cyk.a $$4 = cyk.a();
         btx $$5 = btx.a($$1.a());
         alc $$6 = alc.b("armor." + $$1.b());
         $$4.a(bvr.a, new bvp($$6, (double)$$2x, bvp.a.a), $$5);
         $$4.a(bvr.b, new bvp($$6, (double)$$3, bvp.a.a), $$5);
         float $$7 = $$0.a().f();
         if ($$7 > 0.0F) {
            $$4.a(bvr.p, new bvp($$6, (double)$$7, bvp.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public cti.a f() {
      return this.b;
   }

   public jn<ctj> g() {
      return this.c;
   }

   @Override
   public boolean a(cvp $$0, cvp $$1) {
      return this.c.a().c().test($$1) || super.a($$0, $$1);
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cyk h() {
      return this.d.get();
   }

   public int j() {
      return this.c.a().a(this.b);
   }

   public float k() {
      return this.c.a().e();
   }

   @Override
   public btw l() {
      return this.b.a();
   }

   @Override
   public jn<awd> m() {
      return this.g().a().b();
   }

   public static enum a implements azz {
      a(btw.f, 11, "helmet"),
      b(btw.e, 16, "chestplate"),
      c(btw.d, 15, "leggings"),
      d(btw.c, 13, "boots"),
      e(btw.g, 16, "body");

      public static final Codec<cti.a> f = azz.b(cti.a::values);
      private final btw g;
      private final String h;
      private final int i;

      private a(final btw $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btw a() {
         return this.g;
      }

      public String b() {
         return this.h;
      }

      public boolean d() {
         return this == a || this == b || this == c || this == d;
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
