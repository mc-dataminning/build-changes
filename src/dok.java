import com.mojang.serialization.MapCodec;

public class dok extends dhy {
   public static final MapCodec<dok> h = b(dok::new);
   public static final dwb<jl.a> i = dvt.I;

   @Override
   public MapCodec<? extends dok> a() {
      return h;
   }

   public dok(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(i, jl.a.b));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return b($$0, $$1);
   }

   public static dvd b(dvd $$0, dol $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jl.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jl.a.c);
               case c:
                  return $$0.b(i, jl.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(i);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
