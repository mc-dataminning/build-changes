import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dks implements djh {
   public static final MapCodec<dlk> a = b(dlk::new);
   public static final dpz c = dpy.C;

   @Override
   protected MapCodec<? extends dlk> a() {
      return a;
   }

   protected dlk(dph.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(elc.c)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }
}
