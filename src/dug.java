import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dug extends dmq implements dup {
   public static final MapCodec<dug> a = b(dug::new);
   public static final ebx b = ebw.C;
   public static final ebx c = ebw.I;
   public static final ebx d = ebw.e;
   private static final fgm f = dne.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jc.a.b);

   @Override
   public MapCodec<dug> a() {
      return a;
   }

   public dug(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      if ($$0 instanceof aru $$4) {
         arv $$5 = dzq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dyg.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dyg.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f;
   }

   @Override
   protected fgm d_(ebg $$0) {
      return f;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzq($$0, $$1);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == exr.c));
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btv.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return !$$0.C ? dmq.a($$2, dyg.M, ($$0x, $$1x, $$2x, $$3) -> egp.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }
}
