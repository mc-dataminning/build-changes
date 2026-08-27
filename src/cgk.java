import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgk extends civ implements cib {
   private static final EnumMap<cgk.a, UUID> e = ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgk.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgk.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgk.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ij a = new ii() {
      @Override
      protected cja a(gx $$0, cja $$1) {
         return cgk.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgk.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgl d;
   private final Multimap<bkc, bkf> h;

   public static boolean a(gx $$0, cja $$1) {
      gw $$2 = $$0.d().a($$0.e().c(cur.a));
      List<bjb> $$3 = $$0.g().a(bjb.class, new ehd($$2), bio.f.and(new bio.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bjb $$4 = $$3.get(0);
         biq $$5 = bjd.h($$1);
         cja $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bjd) {
            ((bjd)$$4).a($$5, 2.0F);
            ((bjd)$$4).fF();
         }

         return true;
      }
   }

   public cgk(cgl $$0, cgk.a $$1, civ.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cur.a(this, a);
      Builder<bkc, bkf> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bkh.i, new bkf($$4, "Armor modifier", (double)this.f, bkf.a.a));
      $$3.put(bkh.j, new bkf($$4, "Armor toughness", (double)this.g, bkf.a.a));
      if ($$0 == cgm.g) {
         $$3.put(bkh.c, new bkf($$4, "Armor knockback resistance", (double)this.c, bkf.a.a));
      }

      this.h = $$3.build();
   }

   public cgk.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgl d() {
      return this.d;
   }

   @Override
   public boolean a(cja $$0, cja $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bkc, bkf> a(biq $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public biq g() {
      return this.b.a();
   }

   @Override
   public aoy aj_() {
      return this.d().b();
   }

   public static enum a {
      a(biq.f, "helmet"),
      b(biq.e, "chestplate"),
      c(biq.d, "leggings"),
      d(biq.c, "boots");

      private final biq e;
      private final String f;

      private a(biq $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public biq a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
