import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhr extends dgy implements dkh {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lv.e.q().fieldOf("turns_into").forGetter(dhr::b),
               lv.b.q().fieldOf("brush_sound").forGetter(dhr::c),
               lv.b.q().fieldOf("brush_completed_sound").forGetter(dhr::d),
               t()
            )
            .apply($$0, dhr::new)
   );
   private static final dvs c = dvi.bv;
   public static final int b = 2;
   private final dhm d;
   private final awf e;
   private final awf f;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(dhm $$0, awf $$1, awf $$2, dur.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   public dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   public void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.c_($$2) instanceof drz $$4) {
         $$4.b();
      }

      if (dki.n($$1.a_($$2.e())) && $$2.v() >= $$1.H_()) {
         ckg $$5 = ckg.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(dej $$0, jf $$1, ckg $$2) {
      eyw $$3 = $$2.cO().f();
      $$0.c(2001, jf.a((jy)$$3), dhm.j($$2.q()));
      $$0.a($$2, dzp.f, $$3);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$3.a(16) == 0) {
         jf $$4 = $$2.e();
         if (dki.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lg(lo.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new drz($$0, $$1);
   }

   public dhm b() {
      return this.d;
   }

   public awf c() {
      return this.e;
   }

   public awf d() {
      return this.f;
   }
}
