import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crp extends ctv implements ctc {
   private static final EnumMap<crp.a, UUID> j = ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crp.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crp.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crp.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crp.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ku a = new kt() {
      @Override
      protected cua a(kr $$0, cua $$1) {
         return crp.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crp.a b;
   protected final jj<crq> c;
   private final Supplier<cwu> k;

   public static boolean a(kr $$0, cua $$1) {
      ja $$2 = $$0.c().a($$0.d().c(dhk.b));
      List<bsy> $$3 = $$0.b().a(bsy.class, new evu($$2), bsi.f.and(new bsi.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bsy $$4 = $$3.get(0);
         bsk $$5 = bta.h($$1);
         cua $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bta) {
            ((bta)$$4).a($$5, 2.0F);
            ((bta)$$4).fQ();
         }

         return true;
      }
   }

   public crp(jj<crq> $$0, crp.a $$1, ctv.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhk.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cwu.a $$4 = cwu.a();
         bsl $$5 = bsl.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(bug.a, new bue($$6, "Armor modifier", (double)$$2x, bue.a.a), $$5);
         $$4.a(bug.b, new bue($$6, "Armor toughness", (double)$$3, bue.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(bug.p, new bue($$6, "Armor knockback resistance", (double)$$7, bue.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public crp.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public jj<crq> h() {
      return this.c;
   }

   @Override
   public boolean a(cua $$0, cua $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cwu j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsk m() {
      return this.b.a();
   }

   @Override
   public jj<ave> n() {
      return this.h().a().c();
   }

   public static enum a implements ayz {
      a(bsk.f, 11, "helmet"),
      b(bsk.e, 16, "chestplate"),
      c(bsk.d, 15, "leggings"),
      d(bsk.c, 13, "boots"),
      e(bsk.g, 16, "body");

      public static final Codec<crp.a> f = ayz.b(crp.a::values);
      private final bsk g;
      private final String h;
      private final int i;

      private a(final bsk $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsk a() {
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
