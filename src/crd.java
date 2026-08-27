import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crd extends ctj implements csq {
   private static final EnumMap<crd.a, UUID> j = ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crd.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crd.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crd.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crd.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ki a = new kh() {
      @Override
      protected cto a(kf $$0, cto $$1) {
         return crd.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crd.a b;
   protected final ix<cre> c;
   private final Supplier<Multimap<ix<btr>, btu>> k;

   public static boolean a(kf $$0, cto $$1) {
      io $$2 = $$0.c().a($$0.d().c(dgd.b));
      List<bso> $$3 = $$0.b().a(bso.class, new euf($$2), brz.f.and(new brz.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bso $$4 = $$3.get(0);
         bsb $$5 = bsq.h($$1);
         cto $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bsq) {
            ((bsq)$$4).a($$5, 2.0F);
            ((bsq)$$4).fT();
         }

         return true;
      }
   }

   public crd(ix<cre> $$0, crd.a $$1, ctj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dgd.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<ix<btr>, btu> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(btw.a, new btu($$5, "Armor modifier", (double)$$2x, btu.a.a));
         $$4.put(btw.b, new btu($$5, "Armor toughness", (double)$$3, btu.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(btw.n, new btu($$5, "Armor knockback resistance", (double)$$6, btu.a.a));
         }

         return $$4.build();
      });
   }

   public crd.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ix<cre> h() {
      return this.c;
   }

   @Override
   public boolean a(cto $$0, cto $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<ix<btr>, btu> a(bsb $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int j() {
      return this.c.a().a(this.b);
   }

   public float k() {
      return this.c.a().f();
   }

   @Override
   public bsb l() {
      return this.b.a();
   }

   @Override
   public ix<avg> ap_() {
      return this.h().a().c();
   }

   public static enum a implements ayx {
      a(bsb.f, 11, "helmet"),
      b(bsb.e, 16, "chestplate"),
      c(bsb.d, 15, "leggings"),
      d(bsb.c, 13, "boots"),
      e(bsb.g, 16, "body");

      public static final Codec<crd.a> f = ayx.b(crd.a::values);
      private final bsb g;
      private final String h;
      private final int i;

      private a(bsb $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsb a() {
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
