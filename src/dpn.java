import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpn extends dwq {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final ece<ecc> b = ebw.ah;

   @Override
   public MapCodec<? extends dpn> a() {
      return a;
   }

   public dpn(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecc.b));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      ecc $$8 = $$0.c(b);
      if ($$4.o() != jc.a.b || $$8 == ecc.b != ($$4 == jc.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == ecc.b && $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dng.a.m();
      }
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      iw $$1 = $$0.a();
      djz $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      iw $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, ecc.a)), 3);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      if ($$0.c(b) != ecc.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ebg $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == ecc.b;
      }
   }

   public static void a(dka $$0, ebg $$1, iw $$2, int $$3) {
      iw $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, ecc.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, ecc.a)), $$3);
   }

   public static ebg b(dkc $$0, iw $$1, ebg $$2) {
      return $$2.b(ebw.I) ? $$2.b(ebw.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.C) {
         if ($$3.gl()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fb());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djz $$0, crz $$1, iw $$2, ebg $$3, @Nullable dye $$4, daa $$5) {
      super.a($$0, $$1, $$2, dng.a.m(), $$4, $$5);
   }

   protected static void b(djz $$0, iw $$1, ebg $$2, crz $$3) {
      ecc $$4 = $$2.c(b);
      if ($$4 == ecc.a) {
         iw $$5 = $$1.e();
         ebg $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == ecc.b) {
            ebg $$7 = $$6.y().b(exr.c) ? dng.J.m() : dng.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dne.j($$6));
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(ebg $$0, iw $$1) {
      return azq.b($$1.u(), $$1.c($$0.c(b) == ecc.b ? 0 : 1).v(), $$1.w());
   }
}
