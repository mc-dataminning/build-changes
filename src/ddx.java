import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddx extends dde {
   public static final MapCodec<ddx> a = b(ddx::new);
   private static final wu b = wu.c("container.cartography_table");

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.aw);
         return bpm.b;
      }
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new coj($$2x, $$3, cop.a($$1, $$2)), b);
   }
}
