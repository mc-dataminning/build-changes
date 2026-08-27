import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cph extends crn implements cqu {
   private static final EnumMap<cph.a, UUID> j = ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cph.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cph.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cph.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cph.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final jz a = new jy() {
      @Override
      protected crs a(jw $$0, crs $$1) {
         return cph.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cph.a b;
   protected final in<cpi> c;
   private final Supplier<Multimap<in<brv>, bry>> k;

   public static boolean a(jw $$0, crs $$1) {
      id $$2 = $$0.c().a($$0.d().c(dem.b));
      List<bqt> $$3 = $$0.b().a(bqt.class, new ese($$2), bqf.f.and(new bqf.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bqt $$4 = $$3.get(0);
         bqh $$5 = bqv.h($$1);
         crs $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bqv) {
            ((bqv)$$4).a($$5, 2.0F);
            ((bqv)$$4).fS();
         }

         return true;
      }
   }

   public cph(in<cpi> $$0, cph.a $$1, crn.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dem.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<in<brv>, bry> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(bsa.a, new bry($$5, "Armor modifier", (double)$$2x, bry.a.a));
         $$4.put(bsa.b, new bry($$5, "Armor toughness", (double)$$3, bry.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bsa.n, new bry($$5, "Armor knockback resistance", (double)$$6, bry.a.a));
         }

         return $$4.build();
      });
   }

   public cph.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public in<cpi> h() {
      return this.c;
   }

   @Override
   public boolean a(crs $$0, crs $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<in<brv>, bry> a(bqh $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int i() {
      return this.c.a().a(this.b);
   }

   public float j() {
      return this.c.a().f();
   }

   @Override
   public bqh k() {
      return this.b.a();
   }

   @Override
   public in<aun> ap_() {
      return this.h().a().c();
   }

   public static enum a implements ayg {
      a(bqh.f, 11, "helmet"),
      b(bqh.e, 16, "chestplate"),
      c(bqh.d, 15, "leggings"),
      d(bqh.c, 13, "boots"),
      e(bqh.g, 16, "body");

      public static final Codec<cph.a> f = ayg.b(cph.a::values);
      private final bqh g;
      private final String h;
      private final int i;

      private a(bqh $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bqh a() {
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
