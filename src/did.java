import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class did extends dhk implements dks {
   public static final MapCodec<did> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lx.e.q().fieldOf("turns_into").forGetter(did::b),
               lx.b.q().fieldOf("brush_sound").forGetter(did::c),
               lx.b.q().fieldOf("brush_completed_sound").forGetter(did::d),
               t()
            )
            .apply($$0, did::new)
   );
   private static final dwd c = dvt.bv;
   public static final int b = 2;
   private final dhy d;
   private final awj e;
   private final awj f;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dhy $$0, awj $$1, awj $$2, dvc.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   public doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   public void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.c_($$2) instanceof dsk $$4) {
         $$4.b();
      }

      if (dkt.n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         ckp $$5 = ckp.a($$1, $$2, $$0);
         $$5.o();
      }
   }

   @Override
   public void a(dev $$0, jg $$1, ckp $$2) {
      ezh $$3 = $$2.cS().f();
      $$0.c(2001, jg.a((jz)$$3), dhy.j($$2.q()));
      $$0.a($$2, eaa.f, $$3);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$3.a(16) == 0) {
         jg $$4 = $$2.e();
         if (dkt.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new li(lq.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsk($$0, $$1);
   }

   public dhy b() {
      return this.d;
   }

   public awj c() {
      return this.e;
   }

   public awj d() {
      return this.f;
   }
}
