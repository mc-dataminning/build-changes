import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cki extends cmt implements clz {
   private static final EnumMap<cki.a, UUID> e = ac.a(new EnumMap<>(cki.a.class), $$0 -> {
      $$0.put(cki.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cki.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cki.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cki.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jj a = new ji() {
      @Override
      protected cmy a(jg $$0, cmy $$1) {
         return cki.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cki.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final ckj d;
   private final Multimap<bnm, bnp> h;

   public static boolean a(jg $$0, cmy $$1) {
      hx $$2 = $$0.c().a($$0.d().c(cyv.b));
      List<bml> $$3 = $$0.b().a(bml.class, new elo($$2), bly.f.and(new bly.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bml $$4 = $$3.get(0);
         bma $$5 = bmn.h($$1);
         cmy $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bmn) {
            ((bmn)$$4).a($$5, 2.0F);
            ((bmn)$$4).fJ();
         }

         return true;
      }
   }

   public cki(ckj $$0, cki.a $$1, cmt.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cyv.a(this, a);
      Builder<bnm, bnp> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bnr.a, new bnp($$4, "Armor modifier", (double)this.f, bnp.a.a));
      $$3.put(bnr.b, new bnp($$4, "Armor toughness", (double)this.g, bnp.a.a));
      if ($$0 == ckk.g) {
         $$3.put(bnr.i, new bnp($$4, "Armor knockback resistance", (double)this.c, bnp.a.a));
      }

      this.h = $$3.build();
   }

   public cki.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public ckj d() {
      return this.d;
   }

   @Override
   public boolean a(cmy $$0, cmy $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bnm, bnp> a(bma $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bma g() {
      return this.b.a();
   }

   @Override
   public arr as_() {
      return this.d().b();
   }

   public static enum a {
      a(bma.f, "helmet"),
      b(bma.e, "chestplate"),
      c(bma.d, "leggings"),
      d(bma.c, "boots");

      private final bma e;
      private final String f;

      private a(bma $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bma a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
