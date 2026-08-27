import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends dbk implements diy {
   public static final MapCodec<dir> a = b(dir::new);
   public static final dpq b = dpp.F;
   public static final dpq c = dpp.C;
   public static final dpq d = dpp.G;
   protected static final est e = dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ih.a.b);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      if ($$0 instanceof aps $$4) {
         apt $$5 = dnn.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dmh.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if ($$1 instanceof aps $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dmh.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dmh.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e;
   }

   @Override
   protected est f(doz $$0, cyd $$1, ib $$2) {
      return e;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnn($$0, $$1);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ekt.c));
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bnc.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return !$$0.B ? dbk.a($$2, dmh.L, ($$0x, $$1x, $$2x, $$3) -> dub.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
