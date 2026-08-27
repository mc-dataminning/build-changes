import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cth extends cso implements cvv {
   public static final MapCodec<cth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jb.f.q().fieldOf("turns_into").forGetter(cth::b),
               jb.c.q().fieldOf("brush_sound").forGetter(cth::c),
               jb.c.q().fieldOf("brush_comleted_sound").forGetter(cth::d),
               t()
            )
            .apply($$0, cth::new)
   );
   private static final dgd c = dft.bv;
   public static final int b = 2;
   private final ctc d;
   private final apf e;
   private final apf f;

   @Override
   public MapCodec<cth> a() {
      return a;
   }

   public cth(ctc $$0, apf $$1, apf $$2, dfc.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.c_($$2) instanceof ddd $$4) {
         $$4.c();
      }

      if (cvw.h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         bys $$5 = bys.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, bys $$2) {
      ehh $$3 = $$2.cG().f();
      $$0.c(2001, gw.a($$3), ctc.i($$2.t()));
      $$0.a($$2, djn.f, $$3);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (cvw.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new in(iv.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddd($$0, $$1);
   }

   public ctc b() {
      return this.d;
   }

   public apf c() {
      return this.e;
   }

   public apf d() {
      return this.f;
   }
}
