import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqj extends diw implements dqq {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final dxm b = dxl.D;
   public static final dxm c = dxl.J;
   public static final dxm d = dxl.f;
   protected static final fbs e = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jn.a.b);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      if ($$0 instanceof arc $$4) {
         ard $$5 = dvi.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dtz.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if ($$1 instanceof arc $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dtz.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dtz.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return e;
   }

   @Override
   protected fbs d_(dwv $$0) {
      return e;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvi($$0, $$1);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == esy.c));
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brk.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return !$$0.C ? diw.a($$2, dtz.M, ($$0x, $$1x, $$2x, $$3) -> eca.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }
}
