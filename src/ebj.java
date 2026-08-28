import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class ebj extends dps {
   public static final MapCodec<ebj> b = b(ebj::new);
   public static final eco<ecs> c = ecg.bj;
   public static final ech d = ecg.B;
   public static final int e = 4;
   private static final fgw f = dno.c(16.0, 0.0, 4.0);
   private static final Map<jc, fgw> g = fgt.d(fgt.a(f, dno.c(4.0, 4.0, 16.0)));
   private static final Map<jc, fgw> h = fgt.d(fgt.a(f, dno.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<ebj> a() {
      return b;
   }

   public ebj(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.c).b(c, ecs.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(ebq $$0, ebq $$1) {
      dno $$2 = $$0.c(c) == ecs.a ? dnq.bI : dnq.by;
      return $$1.a($$2) && $$1.c(ebi.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.C && $$3.gl()) {
         iw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      iw $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dnq.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$0.a((dkm)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eze.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak($$2.c(c) == ecs.b ? dnq.by : dnq.bI);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
