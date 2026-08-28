import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfk extends der implements dia {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lq.e.r().fieldOf("turns_into").forGetter(dfk::b),
               lq.b.r().fieldOf("brush_sound").forGetter(dfk::c),
               lq.b.r().fieldOf("brush_comleted_sound").forGetter(dfk::d),
               u()
            )
            .apply($$0, dfk::new)
   );
   private static final dth c = dsx.bv;
   public static final int b = 2;
   private final dff d;
   private final ave e;
   private final ave f;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(dff $$0, ave $$1, ave $$2, dsg.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   public dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   public void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.c_($$2) instanceof dpr $$4) {
         $$4.b();
      }

      if (dib.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         ciq $$5 = ciq.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, ciq $$2) {
      evz $$3 = $$2.cK().f();
      $$0.c(2001, ja.a($$3), dff.i($$2.u()));
      $$0.a($$2, dxa.f, $$3);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$3.a(16) == 0) {
         ja $$4 = $$2.d();
         if (dib.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lb(lj.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpr($$0, $$1);
   }

   public dff b() {
      return this.d;
   }

   public ave c() {
      return this.e;
   }

   public ave d() {
      return this.f;
   }
}
