import com.mojang.serialization.MapCodec;

public class dqd extends djm {
   public static final MapCodec<dqd> h = b(dqd::new);
   public static final dxu<jn.a> i = dxn.L;

   @Override
   public MapCodec<? extends dqd> a() {
      return h;
   }

   public dqd(dww.d $$0) {
      super($$0);
      this.l(this.m().b(i, jn.a.b));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return b($$0, $$1);
   }

   public static dwx b(dwx $$0, dqe $$1) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(i);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
