import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends ddy implements dkz {
   public static final MapCodec<dhp> a = b(dhp::new);
   private static final drs c = drr.C;
   protected static final evd b = ddy.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      if ($$1 != null) {
         emu $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == emv.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.c();
      drb $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, it.a);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.b && !this.a($$0, $$3, $$4)) {
         return dea.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
