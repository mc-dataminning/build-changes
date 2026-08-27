import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dda extends dch implements dfq {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lc.e.q().fieldOf("turns_into").forGetter(dda::b),
               lc.b.q().fieldOf("brush_sound").forGetter(dda::c),
               lc.b.q().fieldOf("brush_comleted_sound").forGetter(dda::d),
               u()
            )
            .apply($$0, dda::new)
   );
   private static final dqy c = dqo.bv;
   public static final int b = 2;
   private final dcv d;
   private final auy e;
   private final auy f;

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public dda(dcv $$0, auy $$1, auy $$2, dpx.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   public djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   public void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.c_($$2) instanceof dnh $$4) {
         $$4.b();
      }

      if (dfr.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgu $$5 = cgu.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(czu $$0, im $$1, cgu $$2) {
      etf $$3 = $$2.cI().f();
      $$0.c(2001, im.a($$3), dcv.i($$2.u()));
      $$0.a($$2, dur.f, $$3);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$3.a(16) == 0) {
         im $$4 = $$2.d();
         if (dfr.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new kn(kw.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnh($$0, $$1);
   }

   public dcv b() {
      return this.d;
   }

   public auy c() {
      return this.e;
   }

   public auy d() {
      return this.f;
   }
}
