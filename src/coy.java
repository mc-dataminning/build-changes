import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class coy extends cre implements cql {
   private static final EnumMap<coy.a, UUID> j = ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(coy.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(coy.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(coy.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(coy.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final jx a = new jw() {
      @Override
      protected crj a(ju $$0, crj $$1) {
         return coy.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final coy.a b;
   protected final il<coz> c;
   private final Supplier<Multimap<il<brq>, brt>> k;

   public static boolean a(ju $$0, crj $$1) {
      ib $$2 = $$0.c().a($$0.d().c(ded.b));
      List<bqo> $$3 = $$0.b().a(bqo.class, new erv($$2), bqa.f.and(new bqa.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bqo $$4 = $$3.get(0);
         bqc $$5 = bqq.h($$1);
         crj $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bqq) {
            ((bqq)$$4).a($$5, 2.0F);
            ((bqq)$$4).fS();
         }

         return true;
      }
   }

   public coy(il<coz> $$0, coy.a $$1, cre.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      ded.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<il<brq>, brt> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(brv.a, new brt($$5, "Armor modifier", (double)$$2x, brt.a.a));
         $$4.put(brv.b, new brt($$5, "Armor toughness", (double)$$3, brt.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(brv.n, new brt($$5, "Armor knockback resistance", (double)$$6, brt.a.a));
         }

         return $$4.build();
      });
   }

   public coy.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public il<coz> h() {
      return this.c;
   }

   @Override
   public boolean a(crj $$0, crj $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<il<brq>, brt> a(bqc $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int i() {
      return this.c.a().a(this.b);
   }

   public float j() {
      return this.c.a().f();
   }

   @Override
   public bqc k() {
      return this.b.a();
   }

   @Override
   public il<aul> aq_() {
      return this.h().a().c();
   }

   public static enum a implements aye {
      a(bqc.f, 11, "helmet"),
      b(bqc.e, 16, "chestplate"),
      c(bqc.d, 15, "leggings"),
      d(bqc.c, 13, "boots"),
      e(bqc.g, 16, "body");

      public static final Codec<coy.a> f = aye.b(coy.a::values);
      private final bqc g;
      private final String h;
      private final int i;

      private a(bqc $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bqc a() {
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
