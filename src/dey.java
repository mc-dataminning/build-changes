import com.mojang.serialization.MapCodec;

public class dey extends dde {
   public static final MapCodec<dey> a = b(dey::new);
   private static final wu b = wu.c("container.crafting");

   @Override
   public MapCodec<? extends dey> a() {
      return a;
   }

   protected dey(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.an);
         return bpm.b;
      }
   }

   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new cov($$2x, $$3, cop.a($$1, $$2)), b);
   }
}
