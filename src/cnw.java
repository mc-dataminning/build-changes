import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cnw extends cqf implements cpm {
   private static final EnumMap<cnw.a, UUID> d = ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cnw.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cnw.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cnw.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cnw.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final jo a = new jn() {
      @Override
      protected cqk a(jl $$0, cqk $$1) {
         return cnw.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cnw.a b;
   protected final il<cnx> c;
   private final Supplier<Multimap<il<bqq>, bqt>> e;

   public static boolean a(jl $$0, cqk $$1) {
      ib $$2 = $$0.c().a($$0.d().c(dcf.b));
      List<bpo> $$3 = $$0.b().a(bpo.class, new epm($$2), bpb.f.and(new bpb.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bpo $$4 = $$3.get(0);
         bpd $$5 = bpq.h($$1);
         cqk $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bpq) {
            ((bpq)$$4).a($$5, 2.0F);
            ((bpq)$$4).fS();
         }

         return true;
      }
   }

   public cnw(il<cnx> $$0, cnw.a $$1, cqf.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dcf.a(this, a);
      this.e = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<il<bqq>, bqt> $$4 = ImmutableMultimap.builder();
         UUID $$5 = d.get($$1);
         $$4.put(bqv.a, new bqt($$5, "Armor modifier", (double)$$2x, bqt.a.a));
         $$4.put(bqv.b, new bqt($$5, "Armor toughness", (double)$$3, bqt.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bqv.n, new bqt($$5, "Armor knockback resistance", (double)$$6, bqt.a.a));
         }

         return $$4.build();
      });
   }

   public cnw.a d() {
      return this.b;
   }

   @Override
   public int e() {
      return this.c.a().b();
   }

   public il<cnx> f() {
      return this.c;
   }

   @Override
   public boolean a(cqk $$0, cqk $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<il<bqq>, bqt> a(bpd $$0) {
      return $$0 == this.b.a() ? this.e.get() : super.a($$0);
   }

   public int g() {
      return this.c.a().a(this.b);
   }

   public float h() {
      return this.c.a().f();
   }

   @Override
   public bpd i() {
      return this.b.a();
   }

   @Override
   public il<atx> as_() {
      return this.f().a().c();
   }

   public static enum a implements axq {
      a(bpd.f, "helmet"),
      b(bpd.e, "chestplate"),
      c(bpd.d, "leggings"),
      d(bpd.c, "boots"),
      e(bpd.g, "body");

      public static final Codec<cnw.a> f = axq.b(cnw.a::values);
      private final bpd g;
      private final String h;

      private a(bpd $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a(int $$0) {
         return switch (this) {
            case a -> 11;
            case b -> 16;
            case c -> 15;
            case d -> 13;
            case e -> 20;
         } * $$0;
      }

      public bpd a() {
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
