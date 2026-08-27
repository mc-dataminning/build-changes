import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cnc extends cpl implements cos {
   private static final EnumMap<cnc.a, UUID> d = ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cnc.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cnc.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cnc.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cnc.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final jn a = new jm() {
      @Override
      protected cpq a(jk $$0, cpq $$1) {
         return cnc.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cnc.a b;
   protected final il<cnd> c;
   private final Supplier<Multimap<il<bpz>, bqc>> e;

   public static boolean a(jk $$0, cpq $$1) {
      ib $$2 = $$0.c().a($$0.d().c(dbk.b));
      List<box> $$3 = $$0.b().a(box.class, new eoq($$2), bok.f.and(new bok.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         box $$4 = $$3.get(0);
         bom $$5 = boz.h($$1);
         cpq $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof boz) {
            ((boz)$$4).a($$5, 2.0F);
            ((boz)$$4).fQ();
         }

         return true;
      }
   }

   public cnc(il<cnd> $$0, cnc.a $$1, cpl.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dbk.a(this, a);
      this.e = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         Builder<il<bpz>, bqc> $$4 = ImmutableMultimap.builder();
         UUID $$5 = d.get($$1);
         $$4.put(bqe.a, new bqc($$5, "Armor modifier", (double)$$2x, bqc.a.a));
         $$4.put(bqe.b, new bqc($$5, "Armor toughness", (double)$$3, bqc.a.a));
         float $$6 = $$0.a().g();
         if ($$6 > 0.0F) {
            $$4.put(bqe.k, new bqc($$5, "Armor knockback resistance", (double)$$6, bqc.a.a));
         }

         return $$4.build();
      });
   }

   public cnc.a d() {
      return this.b;
   }

   @Override
   public int e() {
      return this.c.a().b();
   }

   public il<cnd> f() {
      return this.c;
   }

   @Override
   public boolean a(cpq $$0, cpq $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<il<bpz>, bqc> a(bom $$0) {
      return $$0 == this.b.a() ? this.e.get() : super.a($$0);
   }

   public int g() {
      return this.c.a().a(this.b);
   }

   public float h() {
      return this.c.a().f();
   }

   @Override
   public bom i() {
      return this.b.a();
   }

   @Override
   public il<ato> at_() {
      return this.f().a().c();
   }

   public static enum a implements axg {
      a(bom.f, "helmet"),
      b(bom.e, "chestplate"),
      c(bom.d, "leggings"),
      d(bom.c, "boots"),
      e(bom.g, "body");

      public static final Codec<cnc.a> f = axg.b(cnc.a::values);
      private final bom g;
      private final String h;

      private a(bom $$0, String $$1) {
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

      public bom a() {
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
