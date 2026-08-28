import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crt extends cty implements ctf {
   private static final EnumMap<crt.a, UUID> j = ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crt.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crt.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crt.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crt.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ku a = new kt() {
      @Override
      protected cud a(kr $$0, cud $$1) {
         return crt.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crt.a b;
   protected final jj<cru> c;
   private final Supplier<cwx> k;

   public static boolean a(kr $$0, cud $$1) {
      ja $$2 = $$0.c().a($$0.d().c(dhn.b));
      List<btc> $$3 = $$0.b().a(btc.class, new ewc($$2), bsm.f.and(new bsm.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btc $$4 = $$3.get(0);
         bso $$5 = $$4.h($$1);
         cud $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bte) {
            ((bte)$$4).a($$5, 2.0F);
            ((bte)$$4).fQ();
         }

         return true;
      }
   }

   public crt(jj<cru> $$0, crt.a $$1, cty.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhn.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cwx.a $$4 = cwx.a();
         bsp $$5 = bsp.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buk.a, new bui($$6, "Armor modifier", (double)$$2x, bui.a.a), $$5);
         $$4.a(buk.b, new bui($$6, "Armor toughness", (double)$$3, bui.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buk.p, new bui($$6, "Armor knockback resistance", (double)$$7, bui.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public crt.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jj<cru> h() {
      return this.c;
   }

   @Override
   public boolean a(cud $$0, cud $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cwx j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bso m() {
      return this.b.a();
   }

   @Override
   public jj<avg> n() {
      return this.h().a().c();
   }

   public static enum a implements azc {
      a(bso.f, 11, "helmet"),
      b(bso.e, 16, "chestplate"),
      c(bso.d, 15, "leggings"),
      d(bso.c, 13, "boots"),
      e(bso.g, 16, "body");

      public static final Codec<crt.a> f = azc.b(crt.a::values);
      private final bso g;
      private final String h;
      private final int i;

      private a(final bso $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bso a() {
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
