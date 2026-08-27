import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class die extends ddy implements dkz {
   public static final MapCodec<die> a = b(die::new);
   public static final drv b = dhu.aE;
   public static final drs c = drr.C;
   protected static final float d = 3.0F;
   protected static final evd e = ddy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final evd f = ddy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evd g = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final evd h = ddy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dad $$0, io $$1, it $$2) {
      drb $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      it $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dea.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      if (!$$0.c()) {
         drb $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      drb $$2 = this.n();
      dba $$3 = $$0.q();
      io $$4 = $$0.a();
      emu $$5 = $$0.q().b_($$0.a());

      for (it $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == emv.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }
}
