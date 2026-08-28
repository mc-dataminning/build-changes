import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends diq {
   public static final MapCodec<dqn> a = b(dqn::new);
   private static final xj d = xj.c("container.stonecutter");
   public static final dws<jm> b = dml.aF;
   protected static final fas c = diq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   public dqn(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.ay);
      }

      return bsk.a;
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new cuc($$2x, $$3, csm.a($$1, $$2)), d);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
