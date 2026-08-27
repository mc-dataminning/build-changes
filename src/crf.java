import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class crf extends ctl implements css {
   private static final EnumMap<crf.a, UUID> j = ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(crf.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(crf.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(crf.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
      $$0.put(crf.a.e, UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"));
   });
   public static final ki a = new kh() {
      @Override
      protected ctq a(kf $$0, ctq $$1) {
         return crf.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final crf.a b;
   protected final ix<crg> c;
   private final Supplier<cwl> k;

   public static boolean a(kf $$0, ctq $$1) {
      io $$2 = $$0.c().a($$0.d().c(dgf.b));
      List<bsq> $$3 = $$0.b().a(bsq.class, new euh($$2), bsb.f.and(new bsb.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bsq $$4 = $$3.get(0);
         bsd $$5 = bss.h($$1);
         ctq $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bss) {
            ((bss)$$4).a($$5, 2.0F);
            ((bss)$$4).fT();
         }

         return true;
      }
   }

   public crf(ix<crg> $$0, crf.a $$1, ctl.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
      dgf.a(this, a);
      this.k = Suppliers.memoize(() -> {
         int $$2x = $$0.a().a($$1);
         float $$3 = $$0.a().f();
         cwl.a $$4 = cwl.a();
         bse $$5 = bse.a($$1.a());
         UUID $$6 = j.get($$1);
         $$4.a(bty.a, new btw($$6, "Armor modifier", (double)$$2x, btw.a.a), $$5);
         $$4.a(bty.b, new btw($$6, "Armor toughness", (double)$$3, btw.a.a), $$5);
         float $$7 = $$0.a().g();
         if ($$7 > 0.0F) {
            $$4.a(bty.n, new btw($$6, "Armor knockback resistance", (double)$$7, btw.a.a), $$5);
         }

         return $$4.a();
      });
   }

   public crf.a f() {
      return this.b;
   }

   @Override
   public int g() {
      return this.c.a().b();
   }

   public ix<crg> h() {
      return this.c;
   }

   @Override
   public boolean a(ctq $$0, ctq $$1) {
      return this.c.a().d().get().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public cwl j() {
      return this.k.get();
   }

   public int k() {
      return this.c.a().a(this.b);
   }

   public float l() {
      return this.c.a().f();
   }

   @Override
   public bsd m() {
      return this.b.a();
   }

   @Override
   public ix<avh> aq_() {
      return this.h().a().c();
   }

   public static enum a implements ayz {
      a(bsd.f, 11, "helmet"),
      b(bsd.e, 16, "chestplate"),
      c(bsd.d, 15, "leggings"),
      d(bsd.c, 13, "boots"),
      e(bsd.g, 16, "body");

      public static final Codec<crf.a> f = ayz.b(crf.a::values);
      private final bsd g;
      private final String h;
      private final int i;

      private a(bsd $$0, int $$1, String $$2) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$1;
      }

      public int a(int $$0) {
         return this.i * $$0;
      }

      public bsd a() {
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
