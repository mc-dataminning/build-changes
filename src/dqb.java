import com.mojang.serialization.MapCodec;

public class dqb extends djk {
   public static final MapCodec<dqb> h = b(dqb::new);
   public static final dxs<jn.a> i = dxl.L;

   @Override
   public MapCodec<? extends dqb> a() {
      return h;
   }

   public dqb(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(i, jn.a.b));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return b($$0, $$1);
   }

   public static dwv b(dwv $$0, dqc $$1) {
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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(i);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
