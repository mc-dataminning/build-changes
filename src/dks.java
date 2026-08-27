import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends ddk implements dkz {
   public static final MapCodec<dks> a = b(dks::new);
   public static final drs b = drr.F;
   public static final drs c = drr.C;
   public static final drs d = drr.G;
   protected static final evd e = ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(it.a.b);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      if ($$0 instanceof aqm $$4) {
         aqn $$5 = dpo.a($$3);
         if ($$5 != null) {
            $$4.a($$1, doi.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if ($$1 instanceof aqm $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, doi.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, doi.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return e;
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      return e;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dpo($$0, $$1);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == emv.c));
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bow.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return !$$0.B ? ddk.a($$2, doi.L, ($$0x, $$1x, $$2x, $$3) -> dwd.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }
}
