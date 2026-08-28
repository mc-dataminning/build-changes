import com.mojang.serialization.MapCodec;

public class dlk extends dey {
   public static final MapCodec<dlk> h = b(dlk::new);
   public static final dsz<je.a> i = dsr.I;

   @Override
   public MapCodec<? extends dlk> a() {
      return h;
   }

   public dlk(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(i, je.a.b));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return b($$0, $$1);
   }

   public static dsb b(dsb $$0, dll $$1) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(i);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
