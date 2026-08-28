import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dio extends dhv implements dld {
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lz.e.q().fieldOf("turns_into").forGetter(dio::b),
               lz.b.q().fieldOf("brush_sound").forGetter(dio::c),
               lz.b.q().fieldOf("brush_completed_sound").forGetter(dio::d),
               t()
            )
            .apply($$0, dio::new)
   );
   private static final dwn c = dwe.bv;
   public static final int b = 2;
   private final dij d;
   private final awn e;
   private final awn f;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dij $$0, awn $$1, awn $$2, dvn.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   public dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   public void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dsv $$4) {
         $$4.a($$1);
      }

      if (dle.n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cky $$5 = cky.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(dff $$0, jh $$1, cky $$2) {
      ezr $$3 = $$2.cT().f();
      $$0.c(2001, jh.a((ka)$$3), dij.j($$2.q()));
      $$0.a($$2, eak.f, $$3);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dle.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsv($$0, $$1);
   }

   public dij b() {
      return this.d;
   }

   public awn c() {
      return this.e;
   }

   public awn d() {
      return this.f;
   }
}
