import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmx extends dmd implements dpo {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mg.e.q().fieldOf("turns_into").forGetter(dmx::b),
               mg.b.q().fieldOf("brush_sound").forGetter(dmx::c),
               mg.b.q().fieldOf("brush_completed_sound").forGetter(dmx::d),
               t()
            )
            .apply($$0, dmx::new)
   );
   private static final ebt c = ebj.by;
   public static final int b = 2;
   private final dmr d;
   private final awm e;
   private final awm f;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dmr $$0, awm $$1, awm $$2, eas.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxw $$4) {
         $$4.a($$1);
      }

      if (dpp.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cnq $$5 = cnq.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(djm $$0, iv $$1, cnq $$2) {
      ffc $$3 = $$2.cQ().f();
      $$0.c(2001, iv.a((jp)$$3), dmr.j($$2.j()));
      $$0.a($$2, eft.f, $$3);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iv $$4 = $$2.e();
         if (dpp.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lq(ly.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxw($$0, $$1);
   }

   public dmr b() {
      return this.d;
   }

   public awm c() {
      return this.e;
   }

   public awm d() {
      return this.f;
   }
}
