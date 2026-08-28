import com.mojang.serialization.MapCodec;

public class dlu extends dfi {
   public static final MapCodec<dlu> h = b(dlu::new);
   public static final dtj<jf.a> i = dtb.I;

   @Override
   public MapCodec<? extends dlu> a() {
      return h;
   }

   public dlu(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(i, jf.a.b));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return b($$0, $$1);
   }

   public static dsl b(dsl $$0, dlv $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jf.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, jf.a.c);
               case c:
                  return $$0.a(i, jf.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(i);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
