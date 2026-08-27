import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cny extends cqh implements cpo {
   private static final EnumMap<cny.a, UUID> d = ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cny.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cny.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cny.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cny.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final jo a = new jn() {
      @Override
      protected cqm a(jl $$0, cqm $$1) {
         return cny.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cny.a b;
   protected final il<cnz> c;
   private final Supplier<Multimap<il<bqr>, bqu>> e;

   public static boolean a(jl $$0, cqm $$1) {
      ib $$2 = $$0.c().a($$0.d().c(dch.b));
      List<bpp> $$3 = $$0.b().a(bpp.class, new epo($$2), bpc.f.and(new bpc.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bpp $$4 = $$3.get(0);
         bpe $$5 = bpr.h($$1);
         cqm $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bpr) {
            ((bpr)$$4).a($$5, 2.0F);
            ((bpr)$$4).fS();
         }

         return true;
      }
   }

   public cny(il<cnz> $$0, cny.a $$1, cqh.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dch.a(this, a);
      this.e = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<il<bqr>, bqu> $$4 = ImmutableMultimap.builder();
         UUID $$5 = d.get($$1);
         $$4.put(bqw.a, new bqu($$5, "Armor modifier", (double)$$2x, bqu.a.a));
         $$4.put(bqw.b, new bqu($$5, "Armor toughness", (double)$$3, bqu.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bqw.n, new bqu($$5, "Armor knockback resistance", (double)$$6, bqu.a.a));
         }

         return $$4.build();
      });
   }

   public cny.a d() {
      return this.b;
   }

   @Override
   public int e() {
      return this.c.a().b();
   }

   public il<cnz> f() {
      return this.c;
   }

   @Override
   public boolean a(cqm $$0, cqm $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<il<bqr>, bqu> a(bpe $$0) {
      return $$0 == this.b.a() ? this.e.get() : super.a($$0);
   }

   public int g() {
      return this.c.a().a(this.b);
   }

   public float h() {
      return this.c.a().f();
   }

   @Override
   public bpe i() {
      return this.b.a();
   }

   @Override
   public il<atx> as_() {
      return this.f().a().c();
   }

   public static enum a implements axq {
      a(bpe.f, "helmet"),
      b(bpe.e, "chestplate"),
      c(bpe.d, "leggings"),
      d(bpe.c, "boots"),
      e(bpe.g, "body");

      public static final Codec<cny.a> f = axq.b(cny.a::values);
      private final bpe g;
      private final String h;

      private a(bpe $$0, String $$1) {
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

      public bpe a() {
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
