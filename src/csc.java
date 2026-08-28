import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class csc extends cui implements ctp {
   private static final EnumMap<csc.a, UUID> j = ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(csc.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(csc.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(csc.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(csc.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cun a(kq $$0, cun $$1) {
         return csc.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csc.a b;
   protected final ji<csd> c;
   private final Supplier<cxi> k;

   public static boolean a(kq $$0, cun $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dhc.b));
      List<btn> $$3 = $$0.b().a(btn.class, new evk($$2), bsx.f.and(new bsx.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btn $$4 = $$3.get(0);
         bsz $$5 = btp.h($$1);
         cun $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btp) {
            ((btp)$$4).a($$5, 2.0F);
            ((btp)$$4).fU();
         }

         return true;
      }
   }

   public csc(ji<csd> $$0, csc.a $$1, cui.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhc.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxi.a $$4 = cxi.a();
         bta $$5 = bta.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buv.a, new but($$6, "Armor modifier", (double)$$2x, but.a.a), $$5);
         $$4.a(buv.b, new but($$6, "Armor toughness", (double)$$3, but.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buv.n, new but($$6, "Armor knockback resistance", (double)$$7, but.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public csc.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ji<csd> h() {
      return this.c;
   }

   @Override
   public boolean a(cun $$0, cun $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxi j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsz m() {
      return this.b.a();
   }

   @Override
   public ji<avy> n() {
      return this.h().a().c();
   }

   public static enum a implements azs {
      a(bsz.f, 11, "helmet"),
      b(bsz.e, 16, "chestplate"),
      c(bsz.d, 15, "leggings"),
      d(bsz.c, 13, "boots"),
      e(bsz.g, 16, "body");

      public static final Codec<csc.a> f = azs.b(csc.a::values);
      private final bsz g;
      private final String h;
      private final int i;

      private a(final bsz $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsz a() {
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
