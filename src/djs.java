import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends die {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dwa b = dvz.w;
   public static final dwa c = dvz.r;

   @Override
   protected MapCodec<? extends djs> a() {
      return a;
   }

   public djs(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arn $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$1 instanceof arn $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dvj $$0, arn $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dvj $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awl.fH : awl.fI, awm.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
