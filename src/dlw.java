import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dlw extends cyr {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final dmy b = dly.a;
   public static final dnc<dng> c = dly.c;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dng.a));
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return null;
   }

   public static djl a(ib $$0, dme $$1, dme $$2, ih $$3, boolean $$4, boolean $$5) {
      return new dma($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.k, dma::a);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dma) {
            ((dma)$$5).k();
         }
      }
   }

   @Override
   public void a(cwf $$0, ib $$1, dme $$2) {
      ib $$3 = $$1.a($$2.c(b).g());
      dme $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dlx && $$4.c(dlx.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bml.b;
      } else {
         return bml.d;
      }
   }

   @Override
   protected List<cpq> a(dme $$0, eke.a $$1) {
      dma $$2 = this.a($$1.a(), ib.a($$1.a(emj.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return epl.a();
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      dma $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : epl.a();
   }

   @Nullable
   private dma a(cvk $$0, ib $$1) {
      djl $$2 = $$0.c_($$1);
      return $$2 instanceof dma ? (dma)$$2 : null;
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return cpq.h;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
