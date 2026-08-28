import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class csf extends cul implements cts {
   public static final kx a = new kw() {
      @Override
      protected cuq a(ku $$0, cuq $$1) {
         return csf.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csf.a b;
   protected final jm<csg> c;
   private final Supplier<cxn> j;

   public static boolean a(ku $$0, cuq $$1) {
      jd $$2 = $$0.c().a($$0.d().c(did.b));
      List<btn> $$3 = $$0.b().a(btn.class, new ewv($$2), bsw.f.and(new bsw.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btn $$4 = $$3.get(0);
         bsy $$5 = $$4.h($$1);
         cuq $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btp) {
            ((btp)$$4).a($$5, 2.0F);
            ((btp)$$4).fS();
         }

         return true;
      }
   }

   public csf(jm<csg> $$0, csf.a $$1, cul.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      did.a(this, a);
      this.j = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxn.a $$4 = cxn.a();
         bsz $$5 = bsz.a($$1.a());
         akr $$6 = akr.b("armor." + $$1.b());
         $$4.a(buw.a, new buu($$6, (double)$$2x, buu.a.a), $$5);
         $$4.a(buw.b, new buu($$6, (double)$$3, buu.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buw.p, new buu($$6, (double)$$7, buu.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public csf.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jm<csg> h() {
      return this.c;
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxn j() {
      return this.j.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsy m() {
      return this.b.a();
   }

   @Override
   public jm<avo> n() {
      return this.h().a().c();
   }

   public static enum a implements azk {
      a(bsy.f, 11, "helmet"),
      b(bsy.e, 16, "chestplate"),
      c(bsy.d, 15, "leggings"),
      d(bsy.c, 13, "boots"),
      e(bsy.g, 16, "body");

      public static final Codec<csf.a> f = azk.b(csf.a::values);
      private final bsy g;
      private final String h;
      private final int i;

      private a(final bsy $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsy a() {
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
