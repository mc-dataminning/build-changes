import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class ckb extends cmm implements cls {
   private static final EnumMap<ckb.a, UUID> e = ac.a(new EnumMap<>(ckb.a.class), $$0 -> {
      $$0.put(ckb.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(ckb.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(ckb.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(ckb.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jj a = new ji() {
      @Override
      protected cmr a(jg $$0, cmr $$1) {
         return ckb.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ckb.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final ckc d;
   private final Multimap<bng, bnj> h;

   public static boolean a(jg $$0, cmr $$1) {
      hx $$2 = $$0.c().a($$0.d().c(cyo.b));
      List<bmf> $$3 = $$0.b().a(bmf.class, new elh($$2), bls.f.and(new bls.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bmf $$4 = $$3.get(0);
         blu $$5 = bmh.h($$1);
         cmr $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bmh) {
            ((bmh)$$4).a($$5, 2.0F);
            ((bmh)$$4).fJ();
         }

         return true;
      }
   }

   public ckb(ckc $$0, ckb.a $$1, cmm.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cyo.a(this, a);
      Builder<bng, bnj> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bnl.a, new bnj($$4, "Armor modifier", (double)this.f, bnj.a.a));
      $$3.put(bnl.b, new bnj($$4, "Armor toughness", (double)this.g, bnj.a.a));
      if ($$0 == ckd.g) {
         $$3.put(bnl.i, new bnj($$4, "Armor knockback resistance", (double)this.c, bnj.a.a));
      }

      this.h = $$3.build();
   }

   public ckb.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public ckc d() {
      return this.d;
   }

   @Override
   public boolean a(cmr $$0, cmr $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bng, bnj> a(blu $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public blu g() {
      return this.b.a();
   }

   @Override
   public arl as_() {
      return this.d().b();
   }

   public static enum a {
      a(blu.f, "helmet"),
      b(blu.e, "chestplate"),
      c(blu.d, "leggings"),
      d(blu.c, "boots");

      private final blu e;
      private final String f;

      private a(blu $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public blu a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
