import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmg extends dlm implements dow {
   public static final MapCodec<dmg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mf.e.q().fieldOf("turns_into").forGetter(dmg::b),
               mf.b.q().fieldOf("brush_sound").forGetter(dmg::c),
               mf.b.q().fieldOf("brush_completed_sound").forGetter(dmg::d),
               t()
            )
            .apply($$0, dmg::new)
   );
   private static final eaz c = eap.by;
   public static final int b = 2;
   private final dma d;
   private final awm e;
   private final awm f;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(dma $$0, awm $$1, awm $$2, dzy.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxc $$4) {
         $$4.a($$1);
      }

      if (dox.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cnc $$5 = cnc.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(div $$0, iu $$1, cnc $$2) {
      fei $$3 = $$2.cR().f();
      $$0.c(2001, iu.a((jo)$$3), dma.j($$2.j()));
      $$0.a($$2, eez.f, $$3);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iu $$4 = $$2.e();
         if (dox.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lp(lx.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxc($$0, $$1);
   }

   public dma b() {
      return this.d;
   }

   public awm c() {
      return this.e;
   }

   public awm d() {
      return this.f;
   }
}
