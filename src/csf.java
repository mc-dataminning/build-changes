import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class csf extends cul implements cts {
   private static final EnumMap<csf.a, UUID> j = ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(csf.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(csf.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(csf.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(csf.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cuq a(kq $$0, cuq $$1) {
         return csf.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csf.a b;
   protected final ji<csg> c;
   private final Supplier<cxl> k;

   public static boolean a(kq $$0, cuq $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dhf.b));
      List<btq> $$3 = $$0.b().a(btq.class, new evn($$2), bta.f.and(new bta.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btq $$4 = $$3.get(0);
         btc $$5 = bts.h($$1);
         cuq $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bts) {
            ((bts)$$4).a($$5, 2.0F);
            ((bts)$$4).fU();
         }

         return true;
      }
   }

   public csf(ji<csg> $$0, csf.a $$1, cul.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhf.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxl.a $$4 = cxl.a();
         btd $$5 = btd.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buy.a, new buw($$6, "Armor modifier", (double)$$2x, buw.a.a), $$5);
         $$4.a(buy.b, new buw($$6, "Armor toughness", (double)$$3, buw.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buy.n, new buw($$6, "Armor knockback resistance", (double)$$7, buw.a.a), $$5);
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

   public ji<csg> h() {
      return this.c;
   }

   @Override
   public boolean a(cuq $$0, cuq $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxl j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public btc m() {
      return this.b.a();
   }

   @Override
   public ji<avz> n() {
      return this.h().a().c();
   }

   public static enum a implements azu {
      a(btc.f, 11, "helmet"),
      b(btc.e, 16, "chestplate"),
      c(btc.d, 15, "leggings"),
      d(btc.c, 13, "boots"),
      e(btc.g, 16, "body");

      public static final Codec<csf.a> f = azu.b(csf.a::values);
      private final btc g;
      private final String h;
      private final int i;

      private a(final btc $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btc a() {
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
