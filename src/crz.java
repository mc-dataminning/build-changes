import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crz extends cuf implements ctm {
   private static final EnumMap<crz.a, UUID> j = ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crz.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crz.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crz.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crz.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cuk a(kq $$0, cuk $$1) {
         return crz.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crz.a b;
   protected final ji<csa> c;
   private final Supplier<cxf> k;

   public static boolean a(kq $$0, cuk $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dgz.b));
      List<btk> $$3 = $$0.b().a(btk.class, new evh($$2), bsu.f.and(new bsu.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btk $$4 = $$3.get(0);
         bsw $$5 = btm.h($$1);
         cuk $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btm) {
            ((btm)$$4).a($$5, 2.0F);
            ((btm)$$4).fU();
         }

         return true;
      }
   }

   public crz(ji<csa> $$0, crz.a $$1, cuf.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dgz.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxf.a $$4 = cxf.a();
         bsx $$5 = bsx.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(bus.a, new buq($$6, "Armor modifier", (double)$$2x, buq.a.a), $$5);
         $$4.a(bus.b, new buq($$6, "Armor toughness", (double)$$3, buq.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(bus.n, new buq($$6, "Armor knockback resistance", (double)$$7, buq.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public crz.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ji<csa> h() {
      return this.c;
   }

   @Override
   public boolean a(cuk $$0, cuk $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxf j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsw m() {
      return this.b.a();
   }

   @Override
   public ji<avv> aq_() {
      return this.h().a().c();
   }

   public static enum a implements azp {
      a(bsw.f, 11, "helmet"),
      b(bsw.e, 16, "chestplate"),
      c(bsw.d, 15, "leggings"),
      d(bsw.c, 13, "boots"),
      e(bsw.g, 16, "body");

      public static final Codec<crz.a> f = azp.b(crz.a::values);
      private final bsw g;
      private final String h;
      private final int i;

      private a(final bsw $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsw a() {
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
