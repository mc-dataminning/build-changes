import com.mojang.serialization.MapCodec;

public class dpc extends diq {
   public static final MapCodec<dpc> h = b(dpc::new);
   public static final dws<jm.a> i = dwl.I;

   @Override
   public MapCodec<? extends dpc> a() {
      return h;
   }

   public dpc(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return b($$0, $$1);
   }

   public static dvv b(dvv $$0, dpd $$1) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(i);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
