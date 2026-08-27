import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czo extends dez implements dfo {
   public static final MapCodec<czo> a = b(czo::new);
   public static final dlw b = dlv.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eol e = cyo.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eol f = cyo.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eol g = cyo.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<czo> a() {
      return a;
   }

   public czo(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ie.a.b));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie.a)$$0.c(i)) {
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
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egq.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(b) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
