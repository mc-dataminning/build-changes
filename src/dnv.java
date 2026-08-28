import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnv extends dem {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dtg<drq> b = dst.bz;
   public static final dsx c = diw.aE;
   public static final dsu d = dst.bA;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, drq.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$0.e() || $$1.c(b) != drq.b) {
         return bqx.d;
      } else if ($$2 instanceof arf $$7) {
         if ($$7.c_($$3) instanceof drl $$9) {
            drl.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqx.a;
         } else {
            return bqx.d;
         }
      } else {
         return bqx.b;
      }
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new drl($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpk.R, ($$1x, $$2x, $$3x, $$4) -> drl.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpk.R, ($$0x, $$1x, $$2x, $$3x) -> drl.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dlg a_(dsd $$0) {
      return dlg.c;
   }
}
