import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class der extends dcq implements dkf {
   public static final MapCodec<der> a = b(der::new);
   public static final dqy b = dqx.C;
   private static final int d = 3;
   protected static final eui c = dde.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dny($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.z, $$0.B ? dny::a : dny::b);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.b;
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(b) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(avw.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
