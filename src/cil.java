import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cil extends ckw implements ckc {
   private static final EnumMap<cil.a, UUID> e = ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cil.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cil.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cil.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final je a = new jd() {
      @Override
      protected clb a(jb $$0, clb $$1) {
         return cil.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cil.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cim d;
   private final Multimap<blz, bmc> h;

   public static boolean a(jb $$0, clb $$1) {
      ht $$2 = $$0.c().a($$0.d().c(cwx.b));
      List<bky> $$3 = $$0.b().a(bky.class, new ejd($$2), bkl.f.and(new bkl.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bky $$4 = $$3.get(0);
         bkn $$5 = bla.h($$1);
         clb $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bla) {
            ((bla)$$4).a($$5, 2.0F);
            ((bla)$$4).fJ();
         }

         return true;
      }
   }

   public cil(cim $$0, cil.a $$1, ckw.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cwx.a(this, a);
      Builder<blz, bmc> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bme.a, new bmc($$4, "Armor modifier", (double)this.f, bmc.a.a));
      $$3.put(bme.b, new bmc($$4, "Armor toughness", (double)this.g, bmc.a.a));
      if ($$0 == cin.g) {
         $$3.put(bme.i, new bmc($$4, "Armor knockback resistance", (double)this.c, bmc.a.a));
      }

      this.h = $$3.build();
   }

   public cil.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cim d() {
      return this.d;
   }

   @Override
   public boolean a(clb $$0, clb $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<blz, bmc> a(bkn $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bkn g() {
      return this.b.a();
   }

   @Override
   public aqm ar_() {
      return this.d().b();
   }

   public static enum a {
      a(bkn.f, "helmet"),
      b(bkn.e, "chestplate"),
      c(bkn.d, "leggings"),
      d(bkn.c, "boots");

      private final bkn e;
      private final String f;

      private a(bkn $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bkn a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
