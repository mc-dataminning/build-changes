import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cps extends cry implements crf {
   private static final EnumMap<cps.a, UUID> j = ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cps.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cps.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cps.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cps.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kh a = new kg() {
      @Override
      protected csd a(ke $$0, csd $$1) {
         return cps.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cps.a b;
   protected final iv<cpt> c;
   private final Supplier<Multimap<iv<bsg>, bsj>> k;

   public static boolean a(ke $$0, csd $$1) {
      im $$2 = $$0.c().a($$0.d().c(dfa.b));
      List<bre> $$3 = $$0.b().a(bre.class, new eta($$2), bqq.f.and(new bqq.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bre $$4 = $$3.get(0);
         bqs $$5 = brg.h($$1);
         csd $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof brg) {
            ((brg)$$4).a($$5, 2.0F);
            ((brg)$$4).fT();
         }

         return true;
      }
   }

   public cps(iv<cpt> $$0, cps.a $$1, cry.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dfa.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<iv<bsg>, bsj> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(bsl.a, new bsj($$5, "Armor modifier", (double)$$2x, bsj.a.a));
         $$4.put(bsl.b, new bsj($$5, "Armor toughness", (double)$$3, bsj.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bsl.n, new bsj($$5, "Armor knockback resistance", (double)$$6, bsj.a.a));
         }

         return $$4.build();
      });
   }

   public cps.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public iv<cpt> h() {
      return this.c;
   }

   @Override
   public boolean a(csd $$0, csd $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<iv<bsg>, bsj> a(bqs $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int i() {
      return this.c.a().a(this.b);
   }

   public float j() {
      return this.c.a().f();
   }

   @Override
   public bqs k() {
      return this.b.a();
   }

   @Override
   public iv<auy> ap_() {
      return this.h().a().c();
   }

   public static enum a implements ayq {
      a(bqs.f, 11, "helmet"),
      b(bqs.e, 16, "chestplate"),
      c(bqs.d, 15, "leggings"),
      d(bqs.c, 13, "boots"),
      e(bqs.g, 16, "body");

      public static final Codec<cps.a> f = ayq.b(cps.a::values);
      private final bqs g;
      private final String h;
      private final int i;

      private a(bqs $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bqs a() {
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
