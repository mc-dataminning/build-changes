import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dql extends diy implements dqs {
   public static final MapCodec<dql> a = b(dql::new);
   public static final dxo b = dxn.D;
   public static final dxo c = dxn.J;
   public static final dxo d = dxn.f;
   protected static final fbu e = djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jn.a.b);

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bul $$3) {
      if ($$0 instanceof ard $$4) {
         are $$5 = dvk.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dub.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if ($$1 instanceof ard $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dub.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dub.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return e;
   }

   @Override
   protected fbu d_(dwx $$0) {
      return e;
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvk($$0, $$1);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eta.c));
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brm.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return !$$0.C ? diy.a($$2, dub.M, ($$0x, $$1x, $$2x, $$3) -> ecc.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }
}
