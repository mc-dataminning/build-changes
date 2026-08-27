import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgh extends cis implements chy {
   private static final EnumMap<cgh.a, UUID> e = ac.a(new EnumMap<>(cgh.a.class), $$0 -> {
      $$0.put(cgh.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgh.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgh.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgh.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ih a = new ig() {
      @Override
      protected cix a(gv $$0, cix $$1) {
         return cgh.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgh.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgi d;
   private final Multimap<bjz, bkc> h;

   public static boolean a(gv $$0, cix $$1) {
      gu $$2 = $$0.d().a($$0.e().c(cum.a));
      List<biy> $$3 = $$0.g().a(biy.class, new egy($$2), bil.f.and(new bil.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         biy $$4 = $$3.get(0);
         bin $$5 = bja.h($$1);
         cix $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bja) {
            ((bja)$$4).a($$5, 2.0F);
            ((bja)$$4).fF();
         }

         return true;
      }
   }

   public cgh(cgi $$0, cgh.a $$1, cis.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cum.a(this, a);
      Builder<bjz, bkc> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bke.i, new bkc($$4, "Armor modifier", (double)this.f, bkc.a.a));
      $$3.put(bke.j, new bkc($$4, "Armor toughness", (double)this.g, bkc.a.a));
      if ($$0 == cgj.g) {
         $$3.put(bke.c, new bkc($$4, "Armor knockback resistance", (double)this.c, bkc.a.a));
      }

      this.h = $$3.build();
   }

   public cgh.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgi d() {
      return this.d;
   }

   @Override
   public boolean a(cix $$0, cix $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bjz, bkc> a(bin $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bin g() {
      return this.b.a();
   }

   @Override
   public aov aj_() {
      return this.d().b();
   }

   public static enum a {
      a(bin.f, "helmet"),
      b(bin.e, "chestplate"),
      c(bin.d, "leggings"),
      d(bin.c, "boots");

      private final bin e;
      private final String f;

      private a(bin $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bin a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
