import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dxa {
   public static final MapCodec<dpx> a = b(dpx::new);
   public static final eco<ecm> b = ecg.ah;

   @Override
   public MapCodec<? extends dpx> a() {
      return a;
   }

   public dpx(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecm.b));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      ecm $$8 = $$0.c(b);
      if ($$4.o() != jc.a.b || $$8 == ecm.b != ($$4 == jc.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == ecm.b && $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dnq.a.m();
      }
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      iw $$1 = $$0.a();
      dkj $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      iw $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, ecm.a)), 3);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      if ($$0.c(b) != ecm.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ebq $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == ecm.b;
      }
   }

   public static void a(dkk $$0, ebq $$1, iw $$2, int $$3) {
      iw $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, ecm.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, ecm.a)), $$3);
   }

   public static ebq b(dkm $$0, iw $$1, ebq $$2) {
      return $$2.b(ecg.I) ? $$2.b(ecg.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
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
   public void a(dkj $$0, csi $$1, iw $$2, ebq $$3, @Nullable dyo $$4, dak $$5) {
      super.a($$0, $$1, $$2, dnq.a.m(), $$4, $$5);
   }

   protected static void b(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      ecm $$4 = $$2.c(b);
      if ($$4 == ecm.a) {
         iw $$5 = $$1.e();
         ebq $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == ecm.b) {
            ebq $$7 = $$6.y().b(eyb.c) ? dnq.J.m() : dnq.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dno.j($$6));
         }
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(ebq $$0, iw $$1) {
      return azz.b($$1.u(), $$1.c($$0.c(b) == ecm.b ? 0 : 1).v(), $$1.w());
   }
}
