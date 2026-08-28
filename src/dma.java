import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dma extends dlg implements doq {
   public static final MapCodec<dma> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mf.e.q().fieldOf("turns_into").forGetter(dma::b),
               mf.b.q().fieldOf("brush_sound").forGetter(dma::c),
               mf.b.q().fieldOf("brush_completed_sound").forGetter(dma::d),
               t()
            )
            .apply($$0, dma::new)
   );
   private static final eao c = eae.by;
   public static final int b = 2;
   private final dlu d;
   private final awk e;
   private final awk f;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dlu $$0, awk $$1, awk $$2, dzn.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.c_($$2) instanceof dws $$4) {
         $$4.a($$1);
      }

      if (dor.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cmw $$5 = cmw.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(dip $$0, iu $$1, cmw $$2) {
      fdw $$3 = $$2.cR().f();
      $$0.c(2001, iu.a((jo)$$3), dlu.j($$2.j()));
      $$0.a($$2, eeo.f, $$3);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$3.a(16) == 0) {
         iu $$4 = $$2.e();
         if (dor.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lp(lx.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dws($$0, $$1);
   }

   public dlu b() {
      return this.d;
   }

   public awk c() {
      return this.e;
   }

   public awk d() {
      return this.f;
   }
}
