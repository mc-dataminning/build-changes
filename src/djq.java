import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djq extends diw implements dmg {
   public static final MapCodec<djq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mb.e.q().fieldOf("turns_into").forGetter(djq::b),
               mb.b.q().fieldOf("brush_sound").forGetter(djq::c),
               mb.b.q().fieldOf("brush_completed_sound").forGetter(djq::d),
               t()
            )
            .apply($$0, djq::new)
   );
   private static final dxu c = dxl.by;
   public static final int b = 2;
   private final djk d;
   private final avy e;
   private final avy f;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(djk $$0, avy $$1, avy $$2, dwu.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   public void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.c_($$2) instanceof dub $$4) {
         $$4.a($$1);
      }

      if (dmh.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         ckz $$5 = ckz.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, ckz $$2) {
      fay $$3 = $$2.cR().f();
      $$0.c(2001, ji.a((kb)$$3), djk.j($$2.p()));
      $$0.a($$2, ebr.f, $$3);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (dmh.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ll(lt.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dub($$0, $$1);
   }

   public djk b() {
      return this.d;
   }

   public avy c() {
      return this.e;
   }

   public avy d() {
      return this.f;
   }
}
