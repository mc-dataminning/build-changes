import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cmn extends coy implements coe {
   private static final EnumMap<cmn.a, UUID> e = ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cmn.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cmn.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cmn.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jl a = new jk() {
      @Override
      protected cpd a(ji $$0, cpd $$1) {
         return cmn.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cmn.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cmo d;
   private final Multimap<ij<bpk>, bpn> h;

   public static boolean a(ji $$0, cpd $$1) {
      hz $$2 = $$0.c().a($$0.d().c(dax.b));
      List<boi> $$3 = $$0.b().a(boi.class, new enu($$2), bnv.f.and(new bnv.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         boi $$4 = $$3.get(0);
         bnx $$5 = bok.h($$1);
         cpd $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bok) {
            ((bok)$$4).a($$5, 2.0F);
            ((bok)$$4).fL();
         }

         return true;
      }
   }

   public cmn(cmo $$0, cmn.a $$1, coy.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      dax.a(this, a);
      Builder<ij<bpk>, bpn> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bpp.a, new bpn($$4, "Armor modifier", (double)this.f, bpn.a.a));
      $$3.put(bpp.b, new bpn($$4, "Armor toughness", (double)this.g, bpn.a.a));
      if ($$0 == cmp.g) {
         $$3.put(bpp.k, new bpn($$4, "Armor knockback resistance", (double)this.c, bpn.a.a));
      }

      this.h = $$3.build();
   }

   public cmn.a b() {
      return this.b;
   }

   @Override
   public int an_() {
      return this.d.a();
   }

   public cmo d() {
      return this.d;
   }

   @Override
   public boolean a(cpd $$0, cpd $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<ij<bpk>, bpn> a(bnx $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bnx g() {
      return this.b.a();
   }

   @Override
   public atk au_() {
      return this.d().b();
   }

   public static enum a {
      a(bnx.f, "helmet"),
      b(bnx.e, "chestplate"),
      c(bnx.d, "leggings"),
      d(bnx.c, "boots");

      private final bnx e;
      private final String f;

      private a(bnx $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bnx a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
