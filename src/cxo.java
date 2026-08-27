import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxo extends dbk {
   public static final MapCodec<cxo> a = b(cxo::new);
   public static final dlz b = dcj.aE;
   private static final eol c = cyo.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eol d = cyo.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eol e = cyo.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eol f = cyo.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eol g = cyo.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eol h = cyo.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eol i = cyo.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eol j = eoi.a(c, d, e, f);
   private static final eol k = eoi.a(c, g, h, i);
   private static final vq l = vq.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cxo> a() {
      return a;
   }

   public cxo(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.aC);
         return blu.b;
      }
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new ckd($$2x, $$3, ckm.a($$1, $$2)), l);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ie $$4 = $$0.c(b);
      return $$4.o() == ie.a.a ? j : k;
   }

   @Override
   protected void a(cdr $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, dlf $$3, cdr $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, cdr $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bmn a(bno $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dlf e(dlf $$0) {
      if ($$0.a(cyq.gS)) {
         return cyq.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cyq.gT) ? cyq.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   public int b(dlf $$0, cut $$1, hz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
