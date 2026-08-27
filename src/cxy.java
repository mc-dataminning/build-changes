import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxy extends ddj implements ddy {
   public static final MapCodec<cxy> a = b(cxy::new);
   public static final dkg b = dkf.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final emv e = cwy.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final emv f = cwy.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final emv g = cwy.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   public cxy(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ic.a.b));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((ic.a)$$0.c(i)) {
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
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == efa.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(b) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
