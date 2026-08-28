import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class drw extends dnc implements dun {
   public static final MapCodec<drw> a = b(drw::new);
   public static final int b = 15;
   public static final ece c = ebu.aS;
   public static final ebv d = ebu.I;
   public static final ToIntFunction<ebe> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bur.b;
      } else {
         return bur.c;
      }
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$3.a(dac.ig) ? fgh.b() : fgh.a();
   }

   @Override
   protected boolean e_(ebe $$0) {
      return $$0.y().c();
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static czy a(czy $$0, int $$1) {
      $$0.b(kk.aq, dby.a.a(c, $$1));
      return $$0;
   }
}
