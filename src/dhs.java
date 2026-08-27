import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dhs extends dde implements dkf {
   public static final MapCodec<dhs> a = b(dhs::new);
   public static final int b = 15;
   public static final drh c = dqx.aP;
   public static final dqy d = dqx.C;
   public static final ToIntFunction<dqh> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public dhs(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!$$1.B && $$3.gx()) {
         $$1.a($$2, $$0.a(c), 2);
         return bpm.a;
      } else {
         return bpm.b;
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$3.a(ctc.hC) ? euf.b() : euf.a();
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return true;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return 1.0F;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static csz a(csz $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ka.Y, cvi.a.a(c, $$1));
      }

      return $$0;
   }
}
