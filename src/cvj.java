import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvj extends czf {
   public static final MapCodec<cvj> a = b(cvj::new);
   public static final dju b = dae.aE;
   private static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final emf d = cwj.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final emf e = cwj.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final emf f = cwj.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final emf g = cwj.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final emf h = cwj.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final emf i = cwj.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final emf j = emc.a(c, d, e, f);
   private static final emf k = emc.a(c, g, h, i);
   private static final vd l = vd.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cvj> a() {
      return a;
   }

   public cvj(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.aC);
         return bjv.b;
      }
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new chw($$2x, $$3, cif.a($$1, $$2)), l);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      ic $$4 = $$0.c(b);
      return $$4.o() == ic.a.a ? j : k;
   }

   @Override
   protected void a(cbn $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, dja $$3, cbn $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cti $$0, hx $$1, cbn $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bkn a(blp $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dja e(dja $$0) {
      if ($$0.a(cwl.gS)) {
         return cwl.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cwl.gT) ? cwl.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
