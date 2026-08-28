import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class div extends dic implements dlk {
   public static final MapCodec<div> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lz.e.q().fieldOf("turns_into").forGetter(div::b),
               lz.b.q().fieldOf("brush_sound").forGetter(div::c),
               lz.b.q().fieldOf("brush_completed_sound").forGetter(div::d),
               t()
            )
            .apply($$0, div::new)
   );
   private static final dwu c = dwl.bv;
   public static final int b = 2;
   private final diq d;
   private final awm e;
   private final awm f;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(diq $$0, awm $$1, awm $$2, dvu.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c);
   }

   @Override
   public dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   public void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.c_($$2) instanceof dtc $$4) {
         $$4.a($$1);
      }

      if (dll.n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         clb $$5 = clb.a($$1, $$2, $$0);
         $$5.l();
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, clb $$2) {
      ezy $$3 = $$2.cR().f();
      $$0.c(2001, jh.a((ka)$$3), diq.j($$2.n()));
      $$0.a($$2, ear.f, $$3);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dll.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtc($$0, $$1);
   }

   public diq b() {
      return this.d;
   }

   public awm c() {
      return this.e;
   }

   public awm d() {
      return this.f;
   }
}
