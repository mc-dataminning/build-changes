import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgp extends cja implements cig {
   private static final EnumMap<cgp.a, UUID> e = ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgp.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgp.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgp.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ij a = new ii() {
      @Override
      protected cjf a(gx $$0, cjf $$1) {
         return cgp.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgp.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgq d;
   private final Multimap<bkh, bkk> h;

   public static boolean a(gx $$0, cjf $$1) {
      gw $$2 = $$0.d().a($$0.e().c(cuw.a));
      List<bjg> $$3 = $$0.g().a(bjg.class, new ehi($$2), bit.f.and(new bit.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bjg $$4 = $$3.get(0);
         biv $$5 = bji.h($$1);
         cjf $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bji) {
            ((bji)$$4).a($$5, 2.0F);
            ((bji)$$4).fI();
         }

         return true;
      }
   }

   public cgp(cgq $$0, cgp.a $$1, cja.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cuw.a(this, a);
      Builder<bkh, bkk> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bkm.i, new bkk($$4, "Armor modifier", (double)this.f, bkk.a.a));
      $$3.put(bkm.j, new bkk($$4, "Armor toughness", (double)this.g, bkk.a.a));
      if ($$0 == cgr.g) {
         $$3.put(bkm.c, new bkk($$4, "Armor knockback resistance", (double)this.c, bkk.a.a));
      }

      this.h = $$3.build();
   }

   public cgp.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgq d() {
      return this.d;
   }

   @Override
   public boolean a(cjf $$0, cjf $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bkh, bkk> a(biv $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public biv g() {
      return this.b.a();
   }

   @Override
   public apd ao_() {
      return this.d().b();
   }

   public static enum a {
      a(biv.f, "helmet"),
      b(biv.e, "chestplate"),
      c(biv.d, "leggings"),
      d(biv.c, "boots");

      private final biv e;
      private final String f;

      private a(biv $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public biv a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
