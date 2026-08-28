import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtn extends doj implements dmd, dtj {
   public static final MapCodec<dtn> c = b(dtn::new);
   private static final eaq e = eap.I;
   public static final eax<ja> d = eap.T;
   private static final ffc f = dma.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dtn> a() {
      return c;
   }

   public dtn(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eav.b).b(e, Boolean.valueOf(false)).b(d, ja.c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(axc.bz) || $$1.b_($$2.d()).a(ewh.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bxc $$3, cyy $$4) {
      if (!$$0.w_()) {
         iu $$5 = $$1.d();
         dzz $$6 = doj.b($$0, $$5, this.m().b(b, eav.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(e) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      if ($$0.c(b) == eav.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iu $$3 = $$2.e();
         dzz $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return true;
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      if ($$3.c(doj.b) == eav.b) {
         iu $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dlx.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iu $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ap_() {
      return 0.1F;
   }
}
