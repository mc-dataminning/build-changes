import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends djy {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dys<jm> b = dyl.Q;
   public static final dym c = dyl.v;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof duq $$6) {
         $$3.a($$6);
         $$3.a(axp.ar);
         com.a($$5, $$3, true);
      }

      return btj.a;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dux $$4 = $$1.c_($$2);
      if ($$4 instanceof duq) {
         ((duq)$$4).k();
      }
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new duq($$0, $$1);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
