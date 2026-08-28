import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class csd extends cuj implements ctq {
   private static final EnumMap<csd.a, UUID> j = ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(csd.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(csd.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(csd.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(csd.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cuo a(kq $$0, cuo $$1) {
         return csd.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csd.a b;
   protected final ji<cse> c;
   private final Supplier<cxj> k;

   public static boolean a(kq $$0, cuo $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dhd.b));
      List<bto> $$3 = $$0.b().a(bto.class, new evl($$2), bsy.f.and(new bsy.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bto $$4 = $$3.get(0);
         bta $$5 = btq.h($$1);
         cuo $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btq) {
            ((btq)$$4).a($$5, 2.0F);
            ((btq)$$4).fU();
         }

         return true;
      }
   }

   public csd(ji<cse> $$0, csd.a $$1, cuj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhd.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxj.a $$4 = cxj.a();
         btb $$5 = btb.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buw.a, new buu($$6, "Armor modifier", (double)$$2x, buu.a.a), $$5);
         $$4.a(buw.b, new buu($$6, "Armor toughness", (double)$$3, buu.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buw.n, new buu($$6, "Armor knockback resistance", (double)$$7, buu.a.a), $$5);
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

   public ji<cse> h() {
      return this.c;
   }

   @Override
   public boolean a(cuo $$0, cuo $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxj j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bta m() {
      return this.b.a();
   }

   @Override
   public ji<avy> n() {
      return this.h().a().c();
   }

   public static enum a implements azt {
      a(bta.f, 11, "helmet"),
      b(bta.e, 16, "chestplate"),
      c(bta.d, 15, "leggings"),
      d(bta.c, 13, "boots"),
      e(bta.g, 16, "body");

      public static final Codec<csd.a> f = azt.b(csd.a::values);
      private final bta g;
      private final String h;
      private final int i;

      private a(final bta $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bta a() {
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
