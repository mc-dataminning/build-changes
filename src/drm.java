import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drm extends dmq {
   public static final MapCodec<drm> a = b(drm::new);
   public static final ebx b = ebw.q;

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   protected drm(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dci $$5 = $$4.a(kl.aa, dci.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dzj $$5) {
         $$5.s();
         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$1.c(b)) {
         return but.f;
      } else {
         daa $$7 = $$4.b($$5);
         but $$8 = daf.a($$2, $$3, $$7, $$4);
         return (but)(!$$8.a() ? but.f : $$8);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzj($$0, $$1);
   }

   @Override
   public boolean f_(ebg $$0) {
      return true;
   }

   @Override
   public int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if ($$1.c_($$2) instanceof dzj $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$1.c_($$2) instanceof dzj $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$1.c(b) ? a($$2, dyg.e, dzj::a) : null;
   }
}
