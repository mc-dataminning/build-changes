import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class ckr extends cnb implements cmi {
   private static final EnumMap<ckr.a, UUID> e = ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(ckr.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(ckr.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(ckr.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jj a = new ji() {
      @Override
      protected cng a(jg $$0, cng $$1) {
         return ckr.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ckr.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cks d;
   private final Multimap<ih<bnp>, bns> h;

   public static boolean a(jg $$0, cng $$1) {
      hx $$2 = $$0.c().a($$0.d().c(czd.b));
      List<bmo> $$3 = $$0.b().a(bmo.class, new elx($$2), bmb.f.and(new bmb.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bmo $$4 = $$3.get(0);
         bmd $$5 = bmq.h($$1);
         cng $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bmq) {
            ((bmq)$$4).a($$5, 2.0F);
            ((bmq)$$4).fK();
         }

         return true;
      }
   }

   public ckr(cks $$0, ckr.a $$1, cnb.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      czd.a(this, a);
      Builder<ih<bnp>, bns> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bnu.a, new bns($$4, "Armor modifier", (double)this.f, bns.a.a));
      $$3.put(bnu.b, new bns($$4, "Armor toughness", (double)this.g, bns.a.a));
      if ($$0 == ckt.g) {
         $$3.put(bnu.k, new bns($$4, "Armor knockback resistance", (double)this.c, bns.a.a));
      }

      this.h = $$3.build();
   }

   public ckr.a b() {
      return this.b;
   }

   @Override
   public int an_() {
      return this.d.a();
   }

   public cks d() {
      return this.d;
   }

   @Override
   public boolean a(cng $$0, cng $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bmd g() {
      return this.b.a();
   }

   @Override
   public ars au_() {
      return this.d().b();
   }

   public static enum a {
      a(bmd.f, "helmet"),
      b(bmd.e, "chestplate"),
      c(bmd.d, "leggings"),
      d(bmd.c, "boots");

      private final bmd e;
      private final String f;

      private a(bmd $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bmd a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
