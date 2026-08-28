import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dnc extends drf implements dnh, dup {
   public static final MapCodec<dnc> a = b(dnc::new);
   private static final ebx b = ebw.I;
   private static final Map<jc, fgm> c = fgj.c(dne.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jc.c));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebg $$4 = $$1.a_($$3);
      ebg $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axg.bB)) && ($$5.a(this) || $$5.a(dng.tn));
   }

   protected static boolean a(dka $$0, iw $$1, exq $$2, jc $$3) {
      ebg $$4 = dng.to.m().b(b, Boolean.valueOf($$2.a(exr.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (($$4 == jc.a || $$4 == jc.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      Optional<iw> $$3 = m.a($$0, $$1, $$2.b(), jc.b, dng.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get().d();
         ebg $$5 = $$0.a_($$4);
         return dnb.a((dkb)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      Optional<iw> $$4 = m.a($$0, $$2, $$3.b(), jc.b, dng.tn);
      if (!$$4.isEmpty()) {
         iw $$5 = $$4.get();
         iw $$6 = $$5.d();
         jc $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dnb.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dng.tn);
   }
}
