import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crs extends ctx implements cte {
   private static final EnumMap<crs.a, UUID> j = ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crs.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crs.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crs.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crs.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ku a = new kt() {
      @Override
      protected cuc a(kr $$0, cuc $$1) {
         return crs.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crs.a b;
   protected final jj<crt> c;
   private final Supplier<cww> k;

   public static boolean a(kr $$0, cuc $$1) {
      ja $$2 = $$0.c().a($$0.d().c(dhm.b));
      List<btb> $$3 = $$0.b().a(btb.class, new ewa($$2), bsl.f.and(new bsl.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btb $$4 = $$3.get(0);
         bsn $$5 = btd.h($$1);
         cuc $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btd) {
            ((btd)$$4).a($$5, 2.0F);
            ((btd)$$4).fR();
         }

         return true;
      }
   }

   public crs(jj<crt> $$0, crs.a $$1, ctx.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhm.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cww.a $$4 = cww.a();
         bso $$5 = bso.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buj.a, new buh($$6, "Armor modifier", (double)$$2x, buh.a.a), $$5);
         $$4.a(buj.b, new buh($$6, "Armor toughness", (double)$$3, buh.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buj.p, new buh($$6, "Armor knockback resistance", (double)$$7, buh.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public crs.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jj<crt> h() {
      return this.c;
   }

   @Override
   public boolean a(cuc $$0, cuc $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cww j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsn m() {
      return this.b.a();
   }

   @Override
   public jj<avg> n() {
      return this.h().a().c();
   }

   public static enum a implements azc {
      a(bsn.f, 11, "helmet"),
      b(bsn.e, 16, "chestplate"),
      c(bsn.d, 15, "leggings"),
      d(bsn.c, 13, "boots"),
      e(bsn.g, 16, "body");

      public static final Codec<crs.a> f = azc.b(crs.a::values);
      private final bsn g;
      private final String h;
      private final int i;

      private a(final bsn $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsn a() {
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
