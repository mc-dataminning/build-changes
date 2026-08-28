import com.mojang.serialization.MapCodec;

public class dqt extends dke {
   public static final MapCodec<dqt> h = b(dqt::new);
   public static final dyk<jm.a> i = dyd.J;

   @Override
   public MapCodec<? extends dqt> a() {
      return h;
   }

   public dqt(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return b($$0, $$1);
   }

   public static dxn b(dxn $$0, dqu $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jm.a.c);
               case c:
                  return $$0.b(i, jm.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(i);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
