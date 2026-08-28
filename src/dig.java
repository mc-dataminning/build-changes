import com.mojang.serialization.MapCodec;

public class dig extends dgw {
   public static final MapCodec<dig> b = b(dig::new);
   public static final int c = 5;
   private static final jl[] d = jl.values();

   @Override
   public MapCodec<dig> a() {
      return b;
   }

   public dig(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$3.a(5) == 0) {
         jl $$4 = d[$$3.a(d.length)];
         jg $$5 = $$2.a($$4);
         dvd $$6 = $$1.a_($$5);
         dhy $$7 = null;
         if (h($$6)) {
            $$7 = dia.qy;
         } else if ($$6.a(dia.qy) && $$6.c(dgx.d) == $$4) {
            $$7 = dia.qx;
         } else if ($$6.a(dia.qx) && $$6.c(dgx.d) == $$4) {
            $$7 = dia.qw;
         } else if ($$6.a(dia.qw) && $$6.c(dgx.d) == $$4) {
            $$7 = dia.qv;
         }

         if ($$7 != null) {
            dvd $$8 = $$7.m().b(dgx.d, $$4).b(dgx.c, Boolean.valueOf($$6.y().a() == erf.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dvd $$0) {
      return $$0.l() || $$0.a(dia.G) && $$0.y().e() == 8;
   }
}
