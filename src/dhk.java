import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhk extends dde implements dkf {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final drb b = dha.aE;
   public static final dqy c = dqx.C;
   protected static final float d = 3.0F;
   protected static final eui e = dde.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eui f = dde.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eui g = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eui h = dde.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(b)) {
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

   private boolean a(czj $$0, in $$1, is $$2) {
      dqh $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      if (!$$0.c()) {
         dqh $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dqh $$2 = this.n();
      dag $$3 = $$0.q();
      in $$4 = $$0.a();
      ema $$5 = $$0.q().b_($$0.a());

      for (is $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == emb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }
}
