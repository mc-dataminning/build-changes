import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dda extends dgw {
   public static final MapCodec<dda> a = b(dda::new);
   public static final drx b = dhw.aE;
   private static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final evf d = dea.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final evf e = dea.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final evf f = dea.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final evf g = dea.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final evf h = dea.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final evf i = dea.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final evf j = evc.a(c, d, e, f);
   private static final evf k = evc.a(c, g, h, i);
   private static final wx l = wx.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public dda(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.aC);
         return bpw.b;
      }
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cox($$2x, $$3, cpg.a($$1, $$2)), l);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      it $$4 = $$0.c(b);
      return $$4.o() == it.a.a ? j : k;
   }

   @Override
   protected void a(cih $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, drd $$3, cih $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(daz $$0, io $$1, cih $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqp a(brw $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static drd e(drd $$0) {
      if ($$0.a(dec.gS)) {
         return dec.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dec.gT) ? dec.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   public int b(drd $$0, daf $$1, io $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
