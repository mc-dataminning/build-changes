import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dho extends dgv implements dke {
   public static final MapCodec<dho> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lu.e.q().fieldOf("turns_into").forGetter(dho::b),
               lu.b.q().fieldOf("brush_sound").forGetter(dho::c),
               lu.b.q().fieldOf("brush_completed_sound").forGetter(dho::d),
               u()
            )
            .apply($$0, dho::new)
   );
   private static final dvo c = dve.bv;
   public static final int b = 2;
   private final dhj d;
   private final awd e;
   private final awd f;

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public dho(dhj $$0, awd $$1, awd $$2, dun.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   public dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   public void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.c_($$2) instanceof drw $$4) {
         $$4.b();
      }

      if (dkf.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         ckd $$5 = ckd.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(deg $$0, je $$1, ckd $$2) {
      eys $$3 = $$2.cO().f();
      $$0.c(2001, je.a((jx)$$3), dhj.j($$2.q()));
      $$0.a($$2, dzl.f, $$3);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$3.a(16) == 0) {
         je $$4 = $$2.e();
         if (dkf.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lf(ln.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new drw($$0, $$1);
   }

   public dhj b() {
      return this.d;
   }

   public awd c() {
      return this.e;
   }

   public awd d() {
      return this.f;
   }
}
