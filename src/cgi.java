import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgi extends cit implements chz {
   private static final EnumMap<cgi.a, UUID> e = ac.a(new EnumMap<>(cgi.a.class), $$0 -> {
      $$0.put(cgi.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgi.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgi.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgi.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ih a = new ig() {
      @Override
      protected ciy a(gv $$0, ciy $$1) {
         return cgi.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgi.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgj d;
   private final Multimap<bka, bkd> h;

   public static boolean a(gv $$0, ciy $$1) {
      gu $$2 = $$0.d().a($$0.e().c(cun.a));
      List<biy> $$3 = $$0.g().a(biy.class, new egz($$2), bil.f.and(new bil.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         biy $$4 = $$3.get(0);
         bin $$5 = bja.h($$1);
         ciy $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bja) {
            ((bja)$$4).a($$5, 2.0F);
            ((bja)$$4).fF();
         }

         return true;
      }
   }

   public cgi(cgj $$0, cgi.a $$1, cit.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cun.a(this, a);
      Builder<bka, bkd> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bkf.i, new bkd($$4, "Armor modifier", (double)this.f, bkd.a.a));
      $$3.put(bkf.j, new bkd($$4, "Armor toughness", (double)this.g, bkd.a.a));
      if ($$0 == cgk.g) {
         $$3.put(bkf.c, new bkd($$4, "Armor knockback resistance", (double)this.c, bkd.a.a));
      }

      this.h = $$3.build();
   }

   public cgi.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgj d() {
      return this.d;
   }

   @Override
   public boolean a(ciy $$0, ciy $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bka, bkd> a(bin $$0) {
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
   public aov ak_() {
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
