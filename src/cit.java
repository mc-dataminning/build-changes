import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cit extends cle implements ckk {
   private static final EnumMap<cit.a, UUID> e = ac.a(new EnumMap<>(cit.a.class), $$0 -> {
      $$0.put(cit.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cit.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cit.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cit.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final je a = new jd() {
      @Override
      protected clj a(jb $$0, clj $$1) {
         return cit.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cit.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final ciu d;
   private final Multimap<bmh, bmk> h;

   public static boolean a(jb $$0, clj $$1) {
      ht $$2 = $$0.c().a($$0.d().c(cxf.b));
      List<blg> $$3 = $$0.b().a(blg.class, new ejp($$2), bkt.f.and(new bkt.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         blg $$4 = $$3.get(0);
         bkv $$5 = bli.h($$1);
         clj $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bli) {
            ((bli)$$4).a($$5, 2.0F);
            ((bli)$$4).fK();
         }

         return true;
      }
   }

   public cit(ciu $$0, cit.a $$1, cle.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cxf.a(this, a);
      Builder<bmh, bmk> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bmm.a, new bmk($$4, "Armor modifier", (double)this.f, bmk.a.a));
      $$3.put(bmm.b, new bmk($$4, "Armor toughness", (double)this.g, bmk.a.a));
      if ($$0 == civ.g) {
         $$3.put(bmm.i, new bmk($$4, "Armor knockback resistance", (double)this.c, bmk.a.a));
      }

      this.h = $$3.build();
   }

   public cit.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public ciu d() {
      return this.d;
   }

   @Override
   public boolean a(clj $$0, clj $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bmh, bmk> a(bkv $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bkv g() {
      return this.b.a();
   }

   @Override
   public aqq ar_() {
      return this.d().b();
   }

   public static enum a {
      a(bkv.f, "helmet"),
      b(bkv.e, "chestplate"),
      c(bkv.d, "leggings"),
      d(bkv.c, "boots");

      private final bkv e;
      private final String f;

      private a(bkv $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bkv a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
