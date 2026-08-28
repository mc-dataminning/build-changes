import com.mojang.serialization.MapCodec;

public class dqq extends dpt {
   public static final MapCodec<dqq> a = b(dqq::new);
   private static final ww b = ww.c("container.loom");

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.ax);
      }

      return bty.a;
   }

   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cvr($$2x, $$3, cux.a($$1, $$2)), b);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e);
   }
}
