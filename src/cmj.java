import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cmj extends cou implements coa {
   private static final EnumMap<cmj.a, UUID> e = ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cmj.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cmj.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cmj.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jl a = new jk() {
      @Override
      protected coz a(ji $$0, coz $$1) {
         return cmj.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cmj.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cmk d;
   private final Multimap<ij<bpg>, bpj> h;

   public static boolean a(ji $$0, coz $$1) {
      hz $$2 = $$0.c().a($$0.d().c(dat.b));
      List<bog> $$3 = $$0.b().a(bog.class, new enn($$2), bnt.f.and(new bnt.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bog $$4 = $$3.get(0);
         bnv $$5 = boi.h($$1);
         coz $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof boi) {
            ((boi)$$4).a($$5, 2.0F);
            ((boi)$$4).fL();
         }

         return true;
      }
   }

   public cmj(cmk $$0, cmj.a $$1, cou.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      dat.a(this, a);
      Builder<ij<bpg>, bpj> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bpl.a, new bpj($$4, "Armor modifier", (double)this.f, bpj.a.a));
      $$3.put(bpl.b, new bpj($$4, "Armor toughness", (double)this.g, bpj.a.a));
      if ($$0 == cml.g) {
         $$3.put(bpl.k, new bpj($$4, "Armor knockback resistance", (double)this.c, bpj.a.a));
      }

      this.h = $$3.build();
   }

   public cmj.a b() {
      return this.b;
   }

   @Override
   public int an_() {
      return this.d.a();
   }

   public cmk d() {
      return this.d;
   }

   @Override
   public boolean a(coz $$0, coz $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bnv g() {
      return this.b.a();
   }

   @Override
   public atj au_() {
      return this.d().b();
   }

   public static enum a {
      a(bnv.f, "helmet"),
      b(bnv.e, "chestplate"),
      c(bnv.d, "leggings"),
      d(bnv.c, "boots");

      private final bnv e;
      private final String f;

      private a(bnv $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bnv a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
