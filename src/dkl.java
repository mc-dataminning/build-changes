import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkl extends dqb implements dqq {
   public static final MapCodec<dkl> a = b(dkl::new);
   public static final dxm b = dxl.J;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fbs e = djk.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fbs f = djk.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fbs g = djk.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jn.a.b));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn.a)$$0.c(i)) {
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
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esy.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(b) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
