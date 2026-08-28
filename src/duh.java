import com.mojang.serialization.MapCodec;

public class duh extends dno {
   public static final MapCodec<duh> c = b(duh::new);
   public static final eco<jc.a> d = ecg.K;

   @Override
   public MapCodec<? extends duh> a() {
      return c;
   }

   public duh(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(d, jc.a.b));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return b($$0, $$1);
   }

   public static ebq b(ebq $$0, dui $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jc.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jc.a.c);
               case c:
                  return $$0.b(d, jc.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
