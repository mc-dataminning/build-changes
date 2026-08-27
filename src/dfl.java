import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends cye implements dfs {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dma b = dlz.F;
   public static final dma c = dlz.C;
   public static final dma d = dlz.G;
   protected static final eos e = cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ie.a.b);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
      if ($$0 instanceof aow $$4) {
         aox $$5 = dke.a($$3);
         if ($$5 != null) {
            $$4.a($$1, diz.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if ($$1 instanceof aow $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, diz.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, diz.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return e;
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return e;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dke($$0, $$1);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == egx.c));
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bky.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return !$$0.B ? cye.a($$2, diz.L, ($$0x, $$1x, $$2x, $$3) -> dqf.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }
}
