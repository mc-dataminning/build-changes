import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends ddk implements dkz {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final drs b = drr.C;
   private static final int d = 3;
   protected static final evd c = ddy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dos($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.z, $$0.B ? dos::a : dos::b);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.b;
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(b) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(awb.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
