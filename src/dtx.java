import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtx extends dlu {
   public static final MapCodec<dtx> a = b(dtx::new);
   private static final ww c = ww.c("container.stonecutter");
   public static final eam<ja> b = dpt.e;
   private static final feq d = dlu.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   public dtx(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.ay);
      }

      return bty.a;
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cwn($$2x, $$3, cux.a($$1, $$2)), c);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
