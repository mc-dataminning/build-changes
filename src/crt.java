import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crt extends cuc implements cth {
   private static final EnumMap<crt.a, UUID> j = ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crt.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crt.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crt.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crt.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final km a = new kl() {
      @Override
      protected cuh a(kj $$0, cuh $$1) {
         return crt.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crt.a b;
   protected final ja<cru> c;
   private final Supplier<Multimap<ja<btq>, btt>> k;

   public static boolean a(kj $$0, cuh $$1) {
      ir $$2 = $$0.c().a($$0.d().c(dhi.b));
      List<bso> $$3 = $$0.b().a(bso.class, new ewp($$2), bsa.f.and(new bsa.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bso $$4 = $$3.get(0);
         bsc $$5 = bsq.h($$1);
         cuh $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bsq) {
            ((bsq)$$4).a($$5, 2.0F);
            ((bsq)$$4).gc();
         }

         return true;
      }
   }

   public crt(ja<cru> $$0, crt.a $$1, cuc.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhi.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<ja<btq>, btt> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(btv.a, new btt($$5, "Armor modifier", (double)$$2x, btt.a.a));
         $$4.put(btv.b, new btt($$5, "Armor toughness", (double)$$3, btt.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(btv.n, new btt($$5, "Armor knockback resistance", (double)$$6, btt.a.a));
         }

         return $$4.build();
      });
   }

   public crt.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ja<cru> h() {
      return this.c;
   }

   @Override
   public boolean a(cuh $$0, cuh $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<ja<btq>, btt> a(bsc $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int i() {
      return this.c.a().a(this.b);
   }

   public float j() {
      return this.c.a().f();
   }

   @Override
   public bsc k() {
      return this.b.a();
   }

   @Override
   public ja<avn> ap_() {
      return this.h().a().c();
   }

   public static enum a implements azg {
      a(bsc.f, 11, "helmet"),
      b(bsc.e, 16, "chestplate"),
      c(bsc.d, 15, "leggings"),
      d(bsc.c, 13, "boots"),
      e(bsc.g, 16, "body");

      public static final Codec<crt.a> f = azg.b(crt.a::values);
      private final bsc g;
      private final String h;
      private final int i;

      private a(bsc $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsc a() {
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
