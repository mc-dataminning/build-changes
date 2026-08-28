import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dry extends dne implements dup {
   public static final MapCodec<dry> a = b(dry::new);
   public static final int b = 15;
   public static final ecg c = ebw.aS;
   public static final ebx d = ebw.I;
   public static final ToIntFunction<ebg> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   public dry(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return but.b;
      } else {
         return but.c;
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$3.a(dae.ig) ? fgj.b() : fgj.a();
   }

   @Override
   protected boolean e_(ebg $$0) {
      return $$0.y().c();
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected float c(ebg $$0, djd $$1, iw $$2) {
      return 1.0F;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static daa a(daa $$0, int $$1) {
      $$0.b(kl.aq, dca.a.a(c, $$1));
      return $$0;
   }
}
