import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfa extends dkm implements dlb {
   public static final MapCodec<dfa> a = b(dfa::new);
   public static final dru b = drt.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final evf e = dea.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final evf f = dea.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final evf g = dea.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, it.a.b));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
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
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emx.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(b) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
