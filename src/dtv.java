import com.mojang.serialization.MapCodec;

public class dtv extends dnc {
   public static final MapCodec<dtv> c = b(dtv::new);
   public static final ecc<jb.a> d = ebu.K;

   @Override
   public MapCodec<? extends dtv> a() {
      return c;
   }

   public dtv(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(d, jb.a.b));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return b($$0, $$1);
   }

   public static ebe b(ebe $$0, dtw $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jb.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jb.a.c);
               case c:
                  return $$0.b(d, jb.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
