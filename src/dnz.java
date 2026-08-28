import com.mojang.serialization.MapCodec;

public class dnz extends dhm {
   public static final MapCodec<dnz> h = b(dnz::new);
   public static final dvq<jk.a> i = dvi.I;

   @Override
   public MapCodec<? extends dnz> a() {
      return h;
   }

   public dnz(dur.d $$0) {
      super($$0);
      this.l(this.n().b(i, jk.a.b));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return b($$0, $$1);
   }

   public static dus b(dus $$0, doa $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jk.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jk.a.c);
               case c:
                  return $$0.b(i, jk.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(i);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(i, $$0.k().o());
   }
}
