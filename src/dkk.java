import com.mojang.serialization.MapCodec;

public class dkk extends dey {
   public static final MapCodec<dkk> b = b(dkk::new);
   private static final wu c = wu.c("container.upgrade");

   @Override
   public MapCodec<dkk> a() {
      return b;
   }

   protected dkk(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new cqc($$2x, $$3, cop.a($$1, $$2)), c);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.aF);
         return bpm.b;
      }
   }
}
