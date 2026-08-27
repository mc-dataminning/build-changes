import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cqo extends csu implements csb {
   private static final EnumMap<cqo.a, UUID> j = ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cqo.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cqo.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cqo.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cqo.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ki a = new kh() {
      @Override
      protected csz a(kf $$0, csz $$1) {
         return cqo.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cqo.a b;
   protected final iw<cqp> c;
   private final Supplier<Multimap<iw<btc>, btf>> k;

   public static boolean a(kf $$0, csz $$1) {
      in $$2 = $$0.c().a($$0.d().c(dfj.b));
      List<bsa> $$3 = $$0.b().a(bsa.class, new etk($$2), brm.f.and(new brm.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bsa $$4 = $$3.get(0);
         bro $$5 = bsc.h($$1);
         csz $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bsc) {
            ((bsc)$$4).a($$5, 2.0F);
            ((bsc)$$4).fT();
         }

         return true;
      }
   }

   public cqo(iw<cqp> $$0, cqo.a $$1, csu.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dfj.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<iw<btc>, btf> $$4 = ImmutableMultimap.builder();
         UUID $$5 = j.get($$1);
         $$4.put(bth.a, new btf($$5, "Armor modifier", (double)$$2x, btf.a.a));
         $$4.put(bth.b, new btf($$5, "Armor toughness", (double)$$3, btf.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bth.n, new btf($$5, "Armor knockback resistance", (double)$$6, btf.a.a));
         }

         return $$4.build();
      });
   }

   public cqo.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public iw<cqp> h() {
      return this.c;
   }

   @Override
   public boolean a(csz $$0, csz $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<iw<btc>, btf> a(bro $$0) {
      return $$0 == this.b.a() ? this.k.get() : super.a($$0);
   }

   public int i() {
      return this.c.a().a(this.b);
   }

   public float j() {
      return this.c.a().f();
   }

   @Override
   public bro k() {
      return this.b.a();
   }

   @Override
   public iw<avb> ap_() {
      return this.h().a().c();
   }

   public static enum a implements ayt {
      a(bro.f, 11, "helmet"),
      b(bro.e, 16, "chestplate"),
      c(bro.d, 15, "leggings"),
      d(bro.c, 13, "boots"),
      e(bro.g, 16, "body");

      public static final Codec<cqo.a> f = ayt.b(cqo.a::values);
      private final bro g;
      private final String h;
      private final int i;

      private a(bro $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bro a() {
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
