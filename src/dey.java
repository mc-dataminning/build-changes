import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends dkk implements dkz {
   public static final MapCodec<dey> a = b(dey::new);
   public static final drs b = drr.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final evd e = ddy.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final evd f = ddy.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final evd g = ddy.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, it.a.b));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emv.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(b) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
