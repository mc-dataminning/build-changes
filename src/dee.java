import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends djq implements dkf {
   public static final MapCodec<dee> a = b(dee::new);
   public static final dqy b = dqx.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eui e = dde.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eui f = dde.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eui g = dde.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, is.a.b));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is.a)$$0.c(i)) {
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
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emb.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(b) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
