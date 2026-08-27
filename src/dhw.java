import com.mojang.serialization.MapCodec;

public class dhw extends dha {
   public static final MapCodec<dhw> a = b(dhw::new);
   private static final wu b = wu.c("container.loom");

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avm.ax);
         return bpm.b;
      }
   }

   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      return new bpw(($$2x, $$3, $$4) -> new cpj($$2x, $$3, cop.a($$1, $$2)), b);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE);
   }
}
