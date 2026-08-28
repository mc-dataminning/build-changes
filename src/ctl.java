import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class ctl extends cvn implements cuv {
   public static final kz a = new ky() {
      @Override
      protected cvs a(kw $$0, cvs $$1) {
         return ctl.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ctl.a b;
   protected final jo<ctm> c;
   private final Supplier<cyn> d;

   public static boolean a(kw $$0, cvs $$1) {
      jf $$2 = $$0.c().a($$0.d().c(djr.b));
      List<bun> $$3 = $$0.b().a(bun.class, new eyr($$2), btw.f.and(new btw.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bun $$4 = $$3.get(0);
         btz $$5 = $$4.g($$1);
         cvs $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bup) {
            ((bup)$$4).a($$5, 2.0F);
            ((bup)$$4).fW();
         }

         return true;
      }
   }

   public ctl(jo<ctm> $$0, ctl.a $$1, cvn.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      djr.a(this, a);
      this.d = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().e();
         cyn.a $$4 = cyn.a();
         bua $$5 = bua.a($$1.a());
         ale $$6 = ale.b("armor." + $$1.b());
         $$4.a(bvu.a, new bvs($$6, (double)$$2x, bvs.a.a), $$5);
         $$4.a(bvu.b, new bvs($$6, (double)$$3, bvs.a.a), $$5);
         float $$7 = $$0.a().f();
         if ($$7 > 0.0F) {
            $$4.a(bvu.p, new bvs($$6, (double)$$7, bvs.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public ctl.a f() {
      return this.b;
   }

   public jo<ctm> g() {
      return this.c;
   }

   @Override
   public boolean a(cvs $$0, cvs $$1) {
      return this.c.a().c().test($$1) || super.a($$0, $$1);
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cyn h() {
      return this.d.get();
   }

   public int j() {
      return this.c.a().a(this.b);
   }

   public float k() {
      return this.c.a().e();
   }

   @Override
   public btz l() {
      return this.b.a();
   }

   @Override
   public jo<awf> m() {
      return this.g().a().b();
   }

   public static enum a implements bab {
      a(btz.f, 11, "helmet"),
      b(btz.e, 16, "chestplate"),
      c(btz.d, 15, "leggings"),
      d(btz.c, 13, "boots"),
      e(btz.g, 16, "body");

      public static final Codec<ctl.a> f = bab.b(ctl.a::values);
      private final btz g;
      private final String h;
      private final int i;

      private a(final btz $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btz a() {
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
