import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class ctc extends cvg implements cun {
   public static final ky a = new kx() {
      @Override
      protected cvl a(kv $$0, cvl $$1) {
         return ctc.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ctc.a b;
   protected final jn<ctd> c;
   private final Supplier<cyg> d;

   public static boolean a(kv $$0, cvl $$1) {
      je $$2 = $$0.c().a($$0.d().c(dja.b));
      List<buf> $$3 = $$0.b().a(buf.class, new exz($$2), bto.f.and(new bto.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         buf $$4 = $$3.get(0);
         btr $$5 = $$4.i($$1);
         cvl $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof buh) {
            ((buh)$$4).a($$5, 2.0F);
            ((buh)$$4).fV();
         }

         return true;
      }
   }

   public ctc(jn<ctd> $$0, ctc.a $$1, cvg.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dja.a(this, a);
      this.d = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cyg.a $$4 = cyg.a();
         bts $$5 = bts.a($$1.a());
         alb $$6 = alb.b("armor." + $$1.b());
         $$4.a(bvm.a, new bvk($$6, (double)$$2x, bvk.a.a), $$5);
         $$4.a(bvm.b, new bvk($$6, (double)$$3, bvk.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(bvm.p, new bvk($$6, (double)$$7, bvk.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public ctc.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jn<ctd> h() {
      return this.c;
   }

   @Override
   public boolean a(cvl $$0, cvl $$1) {
      return this.c.a().d().test($$1) || super.a($$0, $$1);
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cyg j() {
      return this.d.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public btr m() {
      return this.b.a();
   }

   @Override
   public jn<awc> n() {
      return this.h().a().c();
   }

   public static enum a implements azy {
      a(btr.f, 11, "helmet"),
      b(btr.e, 16, "chestplate"),
      c(btr.d, 15, "leggings"),
      d(btr.c, 13, "boots"),
      e(btr.g, 16, "body");

      public static final Codec<ctc.a> f = azy.b(ctc.a::values);
      private final btr g;
      private final String h;
      private final int i;

      private a(final btr $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btr a() {
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
