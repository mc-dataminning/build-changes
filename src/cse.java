import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class cse extends cuk implements ctr {
   private static final EnumMap<cse.a, UUID> j = ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cse.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cse.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cse.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(cse.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final kt a = new ks() {
      @Override
      protected cup a(kq $$0, cup $$1) {
         return cse.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cse.a b;
   protected final ji<csf> c;
   private final Supplier<cxk> k;

   public static boolean a(kq $$0, cup $$1) {
      iz $$2 = $$0.c().a($$0.d().c(dhe.b));
      List<btp> $$3 = $$0.b().a(btp.class, new evm($$2), bsz.f.and(new bsz.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         btp $$4 = $$3.get(0);
         btb $$5 = btr.h($$1);
         cup $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof btr) {
            ((btr)$$4).a($$5, 2.0F);
            ((btr)$$4).fU();
         }

         return true;
      }
   }

   public cse(ji<csf> $$0, cse.a $$1, cuk.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dhe.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cxk.a $$4 = cxk.a();
         btc $$5 = btc.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(bux.a, new buv($$6, "Armor modifier", (double)$$2x, buv.a.a), $$5);
         $$4.a(bux.b, new buv($$6, "Armor toughness", (double)$$3, buv.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(bux.n, new buv($$6, "Armor knockback resistance", (double)$$7, buv.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public cse.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ji<csf> h() {
      return this.c;
   }

   @Override
   public boolean a(cup $$0, cup $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cxk j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public btb m() {
      return this.b.a();
   }

   @Override
   public ji<avz> n() {
      return this.h().a().c();
   }

   public static enum a implements azu {
      a(btb.f, 11, "helmet"),
      b(btb.e, 16, "chestplate"),
      c(btb.d, 15, "leggings"),
      d(btb.c, 13, "boots"),
      e(btb.g, 16, "body");

      public static final Codec<cse.a> f = azu.b(cse.a::values);
      private final btb g;
      private final String h;
      private final int i;

      private a(final btb $$0, final int $$1, final String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public btb a() {
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
