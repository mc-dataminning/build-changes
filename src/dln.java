import com.mojang.serialization.MapCodec;

public class dln extends dfb {
   public static final MapCodec<dln> h = b(dln::new);
   public static final dtc<je.a> i = dsu.I;

   @Override
   public MapCodec<? extends dln> a() {
      return h;
   }

   public dln(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(i, je.a.b));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return b($$0, $$1);
   }

   public static dse b(dse $$0, dlo $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((je.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, je.a.c);
               case c:
                  return $$0.a(i, je.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(i);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
