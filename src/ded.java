import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ded extends ddk implements dgt {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               le.e.q().fieldOf("turns_into").forGetter(ded::b),
               le.b.q().fieldOf("brush_sound").forGetter(ded::c),
               le.b.q().fieldOf("brush_comleted_sound").forGetter(ded::d),
               u()
            )
            .apply($$0, ded::new)
   );
   private static final dsb c = drr.bv;
   public static final int b = 2;
   private final ddy d;
   private final avg e;
   private final avg f;

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ded(ddy $$0, avg $$1, avg $$2, dra.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   public dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   public void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.c_($$2) instanceof dok $$4) {
         $$4.b();
      }

      if (dgu.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cif $$5 = cif.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dax $$0, io $$1, cif $$2) {
      euk $$3 = $$2.cK().f();
      $$0.c(2001, io.a($$3), ddy.i($$2.u()));
      $$0.a($$2, dvu.f, $$3);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$3.a(16) == 0) {
         io $$4 = $$2.d();
         if (dgu.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new kp(ky.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dok($$0, $$1);
   }

   public ddy b() {
      return this.d;
   }

   public avg c() {
      return this.e;
   }

   public avg d() {
      return this.f;
   }
}
