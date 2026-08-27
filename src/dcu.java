import com.mojang.serialization.MapCodec;

public class dcu extends cwj {
   public static final MapCodec<dcu> h = b(dcu::new);
   public static final djy<ic.a> i = djq.I;

   @Override
   public MapCodec<? extends dcu> a() {
      return h;
   }

   public dcu(diz.d $$0) {
      super($$0);
      this.k(this.o().a(i, ic.a.b));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return b($$0, $$1);
   }

   public static dja b(dja $$0, dcv $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ic.a.c);
               case c:
                  return $$0.a(i, ic.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(i);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
