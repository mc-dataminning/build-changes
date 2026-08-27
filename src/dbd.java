import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbd extends cwy implements ddy {
   public static final MapCodec<dbd> a = b(dbd::new);
   public static final dkj b = dat.aE;
   public static final dkg c = dkf.C;
   protected static final float d = 3.0F;
   protected static final emv e = cwy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emv f = cwy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emv g = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emv h = cwy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   protected dbd(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic)$$0.c(b)) {
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

   private boolean a(ctd $$0, hx $$1, ic $$2) {
      djp $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      if (!$$0.c()) {
         djp $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      djp $$2 = this.o();
      cua $$3 = $$0.q();
      hx $$4 = $$0.a();
      eez $$5 = $$0.q().b_($$0.a());

      for (ic $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == efa.c));
            }
         }
      }

      return null;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }
}
