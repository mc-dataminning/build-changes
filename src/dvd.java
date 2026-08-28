import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvd extends dpx implements dnr, duz {
   public static final MapCodec<dvd> c = b(dvd::new);
   private static final ech e = ecg.I;
   public static final eco<jc> d = ecg.T;
   private static final fgw f = dno.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dvd> a() {
      return c;
   }

   public dvd(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecm.b).b(e, Boolean.valueOf(false)).b(d, jc.c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(axn.bA) || $$1.b_($$2.d()).a(eyb.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      if (!$$0.A_()) {
         iw $$5 = $$1.d();
         ebq $$6 = dpx.b($$0, $$5, this.m().b(b, ecm.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(e) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      if ($$0.c(b) == ecm.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iw $$3 = $$2.e();
         ebq $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      if ($$3.c(dpx.b) == ecm.b) {
         iw $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dnl.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iw $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float av_() {
      return 0.1F;
   }
}
