import com.mojang.serialization.MapCodec;

public class dnw extends dhj {
   public static final MapCodec<dnw> h = b(dnw::new);
   public static final dvm<jj.a> i = dve.I;

   @Override
   public MapCodec<? extends dnw> a() {
      return h;
   }

   public dnw(dun.d $$0) {
      super($$0);
      this.l(this.o().b(i, jj.a.b));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return b($$0, $$1);
   }

   public static duo b(duo $$0, dnx $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jj.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jj.a.c);
               case c:
                  return $$0.b(i, jj.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(i);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(i, $$0.k().o());
   }
}
