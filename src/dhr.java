import com.mojang.serialization.MapCodec;

public class dhr extends ddy implements dkz {
   public static final MapCodec<dhr> a = b(dhr::new);
   private static final evd b = ddy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dhr(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(drr.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(drr.C);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(drr.C)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(drr.C) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(drr.C, Boolean.valueOf($$1.b(emv.c)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
