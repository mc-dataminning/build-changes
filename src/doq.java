import com.mojang.serialization.MapCodec;

public class doq extends die {
   public static final MapCodec<doq> h = b(doq::new);
   public static final dwh<jm.a> i = dvz.I;

   @Override
   public MapCodec<? extends doq> a() {
      return h;
   }

   public doq(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return b($$0, $$1);
   }

   public static dvj b(dvj $$0, dor $$1) {
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
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(i);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
