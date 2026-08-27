import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cjr extends cmc implements cli {
   private static final EnumMap<cjr.a, UUID> e = ac.a(new EnumMap<>(cjr.a.class), $$0 -> {
      $$0.put(cjr.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cjr.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cjr.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cjr.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jh a = new jg() {
      @Override
      protected cmh a(je $$0, cmh $$1) {
         return cjr.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cjr.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cjs d;
   private final Multimap<bmw, bmz> h;

   public static boolean a(je $$0, cmh $$1) {
      hv $$2 = $$0.c().a($$0.d().c(cye.b));
      List<blv> $$3 = $$0.b().a(blv.class, new ekw($$2), bli.f.and(new bli.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         blv $$4 = $$3.get(0);
         blk $$5 = blx.h($$1);
         cmh $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof blx) {
            ((blx)$$4).a($$5, 2.0F);
            ((blx)$$4).fJ();
         }

         return true;
      }
   }

   public cjr(cjs $$0, cjr.a $$1, cmc.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cye.a(this, a);
      Builder<bmw, bmz> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bnb.a, new bmz($$4, "Armor modifier", (double)this.f, bmz.a.a));
      $$3.put(bnb.b, new bmz($$4, "Armor toughness", (double)this.g, bmz.a.a));
      if ($$0 == cjt.g) {
         $$3.put(bnb.i, new bmz($$4, "Armor knockback resistance", (double)this.c, bmz.a.a));
      }

      this.h = $$3.build();
   }

   public cjr.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cjs d() {
      return this.d;
   }

   @Override
   public boolean a(cmh $$0, cmh $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bmw, bmz> a(blk $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public blk g() {
      return this.b.a();
   }

   @Override
   public arb as_() {
      return this.d().b();
   }

   public static enum a {
      a(blk.f, "helmet"),
      b(blk.e, "chestplate"),
      c(blk.d, "leggings"),
      d(blk.c, "boots");

      private final blk e;
      private final String f;

      private a(blk $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public blk a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
