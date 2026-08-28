import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class csg extends cum implements ctt {
   private static final EnumMap<csg.a, UUID> j = ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(csg.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(csg.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(csg.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(csg.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cur a(kq $$0, cur $$1) {
         return csg.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final csg.a b;
   protected final ji<csh> c;
   private final Supplier<cxm> k;

   public static boolean a(kq $$0, cur $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dhg.b));
      List<btr> $$3 = $$0.b().a(btr.class, new evo($$2), btb.f.and(new btb.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btr $$4 = $$3.get(0);
         btd $$5 = btt.h($$1);
         cur $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btt) {
            ((btt)$$4).a($$5, 2.0F);
            ((btt)$$4).fU();
         }

         return true;
      }
   }

   public csg(ji<csh> $$0, csg.a $$1, cum.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhg.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxm.a $$4 = cxm.a();
         bte $$5 = bte.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(buz.a, new bux($$6, "Armor modifier", (double)$$2x, bux.a.a), $$5);
         $$4.a(buz.b, new bux($$6, "Armor toughness", (double)$$3, bux.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(buz.n, new bux($$6, "Armor knockback resistance", (double)$$7, bux.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public csg.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ji<csh> h() {
      return this.c;
   }

   @Override
   public boolean a(cur $$0, cur $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxm j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public btd m() {
      return this.b.a();
   }

   @Override
   public ji<avz> n() {
      return this.h().a().c();
   }

   public static enum a implements azu {
      a(btd.f, 11, "helmet"),
      b(btd.e, 16, "chestplate"),
      c(btd.d, 15, "leggings"),
      d(btd.c, 13, "boots"),
      e(btd.g, 16, "body");

      public static final Codec<csg.a> f = azu.b(csg.a::values);
      private final btd g;
      private final String h;
      private final int i;

      private a(final btd $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btd a() {
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
