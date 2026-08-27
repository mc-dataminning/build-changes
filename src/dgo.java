import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dgo extends die implements ddh, dkf {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final dqy c = dqx.C;
   private final dif d = new dif(this);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dqh> b(int $$0) {
      return $$1 -> die.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return !$$1.n().a(ctc.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return is.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return $$0.u().c();
   }

   @Override
   public dif c() {
      return this.d;
   }
}
