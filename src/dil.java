import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dil extends dmi {
   public static final MapCodec<dil> a = b(dil::new);
   public static final dxt<jn> b = dnj.aF;
   private static final fbt c = djl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fbt d = djl.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fbt e = djl.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fbt f = djl.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fbt g = djl.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fbt h = djl.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fbt i = djl.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fbt j = fbq.a(c, d, e, f);
   private static final fbt k = fbq.a(c, g, h, i);
   private static final wp l = wp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aC);
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new cse($$2x, $$3, cso.a($$1, $$2)), l);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      jn $$4 = $$0.c(b);
      return $$4.o() == jn.a.a ? j : k;
   }

   @Override
   protected void a(cla $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, dww $$3, cla $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, cla $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bta a(buk $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dww e(dww $$0) {
      if ($$0.a(djn.hp)) {
         return djn.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(djn.hq) ? djn.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   public int b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
