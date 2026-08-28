import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfn extends deu implements did {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lq.e.r().fieldOf("turns_into").forGetter(dfn::b),
               lq.b.r().fieldOf("brush_sound").forGetter(dfn::c),
               lq.b.r().fieldOf("brush_comleted_sound").forGetter(dfn::d),
               u()
            )
            .apply($$0, dfn::new)
   );
   private static final dtl c = dtb.bv;
   public static final int b = 2;
   private final dfi d;
   private final avg e;
   private final avg f;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(dfi $$0, avg $$1, avg $$2, dsk.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   public dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   public void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.c_($$2) instanceof dpu $$4) {
         $$4.b();
      }

      if (die.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         ciu $$5 = ciu.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, ciu $$2) {
      ewh $$3 = $$2.cM().f();
      $$0.c(2001, ja.a($$3), dfi.i($$2.t()));
      $$0.a($$2, dxh.f, $$3);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$3.a(16) == 0) {
         ja $$4 = $$2.d();
         if (die.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lb(lj.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpu($$0, $$1);
   }

   public dfi b() {
      return this.d;
   }

   public avg c() {
      return this.e;
   }

   public avg d() {
      return this.f;
   }
}
