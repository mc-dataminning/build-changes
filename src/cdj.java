import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cdj extends cfu implements cfa {
   private static final EnumMap<cdj.a, UUID> e = ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cdj.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cdj.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cdj.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ih a = new ig() {
      @Override
      protected cfz a(gv $$0, cfz $$1) {
         return cdj.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cdj.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cdk d;
   private final Multimap<bhb, bhe> h;

   public static boolean a(gv $$0, cfz $$1) {
      gu $$2 = $$0.d().a($$0.e().c(cro.a));
      List<bfz> $$3 = $$0.g().a(bfz.class, new eed($$2), bfm.f.and(new bfm.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bfz $$4 = $$3.get(0);
         bfo $$5 = bgb.h($$1);
         cfz $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bgb) {
            ((bgb)$$4).a($$5, 2.0F);
            ((bgb)$$4).fF();
         }

         return true;
      }
   }

   public cdj(cdk $$0, cdj.a $$1, cfu.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cro.a(this, a);
      Builder<bhb, bhe> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bhg.i, new bhe($$4, "Armor modifier", (double)this.f, bhe.a.a));
      $$3.put(bhg.j, new bhe($$4, "Armor toughness", (double)this.g, bhe.a.a));
      if ($$0 == cdl.g) {
         $$3.put(bhg.c, new bhe($$4, "Armor knockback resistance", (double)this.c, bhe.a.a));
      }

      this.h = $$3.build();
   }

   public cdj.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cdk d() {
      return this.d;
   }

   @Override
   public boolean a(cfz $$0, cfz $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bhb, bhe> a(bfo $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bfo g() {
      return this.b.a();
   }

   @Override
   public amg ak_() {
      return this.d().b();
   }

   public static enum a {
      a(bfo.f, "helmet"),
      b(bfo.e, "chestplate"),
      c(bfo.d, "leggings"),
      d(bfo.c, "boots");

      private final bfo e;
      private final String f;

      private a(bfo $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bfo a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
