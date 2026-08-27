import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgv extends dde implements dkf {
   public static final MapCodec<dgv> a = b(dgv::new);
   private static final dqy c = dqx.C;
   protected static final eui b = dde.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   protected dgv(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      if ($$1 != null) {
         ema $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == emb.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.c();
      dqh $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, is.a);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.b && !this.a($$0, $$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
