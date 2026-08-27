import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgr extends cjc implements cii {
   private static final EnumMap<cgr.a, UUID> e = ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgr.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgr.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgr.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ij a = new ii() {
      @Override
      protected cjh a(gx $$0, cjh $$1) {
         return cgr.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgr.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgs d;
   private final Multimap<bkj, bkm> h;

   public static boolean a(gx $$0, cjh $$1) {
      gw $$2 = $$0.d().a($$0.e().c(cuy.a));
      List<bji> $$3 = $$0.g().a(bji.class, new ehk($$2), biv.f.and(new biv.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bji $$4 = $$3.get(0);
         bix $$5 = bjk.h($$1);
         cjh $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bjk) {
            ((bjk)$$4).a($$5, 2.0F);
            ((bjk)$$4).fI();
         }

         return true;
      }
   }

   public cgr(cgs $$0, cgr.a $$1, cjc.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cuy.a(this, a);
      Builder<bkj, bkm> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bko.i, new bkm($$4, "Armor modifier", (double)this.f, bkm.a.a));
      $$3.put(bko.j, new bkm($$4, "Armor toughness", (double)this.g, bkm.a.a));
      if ($$0 == cgt.g) {
         $$3.put(bko.c, new bkm($$4, "Armor knockback resistance", (double)this.c, bkm.a.a));
      }

      this.h = $$3.build();
   }

   public cgr.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgs d() {
      return this.d;
   }

   @Override
   public boolean a(cjh $$0, cjh $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bkj, bkm> a(bix $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bix g() {
      return this.b.a();
   }

   @Override
   public ape ao_() {
      return this.d().b();
   }

   public static enum a {
      a(bix.f, "helmet"),
      b(bix.e, "chestplate"),
      c(bix.d, "leggings"),
      d(bix.c, "boots");

      private final bix e;
      private final String f;

      private a(bix $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bix a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
