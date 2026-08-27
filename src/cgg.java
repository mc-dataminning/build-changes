import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgg extends cir implements chx {
   private static final EnumMap<cgg.a, UUID> e = ac.a(new EnumMap<>(cgg.a.class), $$0 -> {
      $$0.put(cgg.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgg.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgg.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgg.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ii a = new ih() {
      @Override
      protected ciw a(gw $$0, ciw $$1) {
         return cgg.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgg.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgh d;
   private final Multimap<bjy, bkb> h;

   public static boolean a(gw $$0, ciw $$1) {
      gv $$2 = $$0.d().a($$0.e().c(cul.a));
      List<biw> $$3 = $$0.g().a(biw.class, new eha($$2), bij.f.and(new bij.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         biw $$4 = $$3.get(0);
         bil $$5 = biy.h($$1);
         ciw $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof biy) {
            ((biy)$$4).a($$5, 2.0F);
            ((biy)$$4).fF();
         }

         return true;
      }
   }

   public cgg(cgh $$0, cgg.a $$1, cir.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cul.a(this, a);
      Builder<bjy, bkb> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bkd.i, new bkb($$4, "Armor modifier", (double)this.f, bkb.a.a));
      $$3.put(bkd.j, new bkb($$4, "Armor toughness", (double)this.g, bkb.a.a));
      if ($$0 == cgi.g) {
         $$3.put(bkd.c, new bkb($$4, "Armor knockback resistance", (double)this.c, bkb.a.a));
      }

      this.h = $$3.build();
   }

   public cgg.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgh d() {
      return this.d;
   }

   @Override
   public boolean a(ciw $$0, ciw $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bjy, bkb> a(bil $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bil g() {
      return this.b.a();
   }

   @Override
   public aot ak_() {
      return this.d().b();
   }

   public static enum a {
      a(bil.f, "helmet"),
      b(bil.e, "chestplate"),
      c(bil.d, "leggings"),
      d(bil.c, "boots");

      private final bil e;
      private final String f;

      private a(bil $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bil a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
