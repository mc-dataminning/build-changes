import com.mojang.serialization.MapCodec;

public class dqc extends djl {
   public static final MapCodec<dqc> h = b(dqc::new);
   public static final dxt<jn.a> i = dxm.L;

   @Override
   public MapCodec<? extends dqc> a() {
      return h;
   }

   public dqc(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(i, jn.a.b));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return b($$0, $$1);
   }

   public static dww b(dww $$0, dqd $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jn.a.c);
               case c:
                  return $$0.b(i, jn.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(i);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
