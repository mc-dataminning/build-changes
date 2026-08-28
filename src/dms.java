import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dms extends dly implements dpj {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mg.e.q().fieldOf("turns_into").forGetter(dms::b),
               mg.b.q().fieldOf("brush_sound").forGetter(dms::c),
               mg.b.q().fieldOf("brush_completed_sound").forGetter(dms::d),
               t()
            )
            .apply($$0, dms::new)
   );
   private static final ebo c = ebe.by;
   public static final int b = 2;
   private final dmm d;
   private final awm e;
   private final awm f;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dmm $$0, awm $$1, awm $$2, ean.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxr $$4) {
         $$4.a($$1);
      }

      if (dpk.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cnn $$5 = cnn.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(djh $$0, iv $$1, cnn $$2) {
      fex $$3 = $$2.cQ().f();
      $$0.c(2001, iv.a((jp)$$3), dmm.j($$2.j()));
      $$0.a($$2, efo.f, $$3);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iv $$4 = $$2.e();
         if (dpk.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lq(ly.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxr($$0, $$1);
   }

   public dmm b() {
      return this.d;
   }

   public awm c() {
      return this.e;
   }

   public awm d() {
      return this.f;
   }
}
