import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class csd extends cuj implements ctq {
   public static final kx a = new kw() {
      @Override
      protected cuo a(ku $$0, cuo $$1) {
         return csd.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csd.a b;
   protected final jm<cse> c;
   private final Supplier<cxl> j;

   public static boolean a(ku $$0, cuo $$1) {
      jd $$2 = $$0.c().a($$0.d().c(dib.b));
      List<btl> $$3 = $$0.b().a(btl.class, new ewr($$2), bsv.f.and(new bsv.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btl $$4 = $$3.get(0);
         bsx $$5 = $$4.h($$1);
         cuo $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btn) {
            ((btn)$$4).a($$5, 2.0F);
            ((btn)$$4).fP();
         }

         return true;
      }
   }

   public csd(jm<cse> $$0, csd.a $$1, cuj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dib.a(this, a);
      this.j = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxl.a $$4 = cxl.a();
         bsy $$5 = bsy.a($$1.a());
         akq $$6 = akq.b("armor." + $$1.b());
         $$4.a(buu.a, new bus($$6, (double)$$2x, bus.a.a), $$5);
         $$4.a(buu.b, new bus($$6, (double)$$3, bus.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buu.p, new bus($$6, (double)$$7, bus.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public csd.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jm<cse> h() {
      return this.c;
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxl j() {
      return this.j.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsx m() {
      return this.b.a();
   }

   @Override
   public jm<avn> n() {
      return this.h().a().c();
   }

   public static enum a implements azj {
      a(bsx.f, 11, "helmet"),
      b(bsx.e, 16, "chestplate"),
      c(bsx.d, 15, "leggings"),
      d(bsx.c, 13, "boots"),
      e(bsx.g, 16, "body");

      public static final Codec<csd.a> f = azj.b(csd.a::values);
      private final bsx g;
      private final String h;
      private final int i;

      private a(final bsx $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsx a() {
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
