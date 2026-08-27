import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class def extends ddm implements dgv {
   public static final MapCodec<def> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               le.e.q().fieldOf("turns_into").forGetter(def::b),
               le.b.q().fieldOf("brush_sound").forGetter(def::c),
               le.b.q().fieldOf("brush_comleted_sound").forGetter(def::d),
               u()
            )
            .apply($$0, def::new)
   );
   private static final dsd c = drt.bv;
   public static final int b = 2;
   private final dea d;
   private final avh e;
   private final avh f;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dea $$0, avh $$1, avh $$2, drc.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   public dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   public void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.c_($$2) instanceof dom $$4) {
         $$4.b();
      }

      if (dgw.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cih $$5 = cih.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(daz $$0, io $$1, cih $$2) {
      eum $$3 = $$2.cK().f();
      $$0.c(2001, io.a($$3), dea.i($$2.u()));
      $$0.a($$2, dvw.f, $$3);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$3.a(16) == 0) {
         io $$4 = $$2.d();
         if (dgw.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new kp(ky.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dom($$0, $$1);
   }

   public dea b() {
      return this.d;
   }

   public avh c() {
      return this.e;
   }

   public avh d() {
      return this.f;
   }
}
