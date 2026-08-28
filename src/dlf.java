import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dqt implements dri {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dye b = dyd.D;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final fcm e = dke.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final fcm f = dke.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final fcm g = dke.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jm.a.b));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      switch ((jm.a)$$0.c(i)) {
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
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etq.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
