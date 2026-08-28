import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlr extends dpp {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final ebr<jb> b = dqs.e;
   private static final Map<jb.a, ffw> c = fft.a(
      fft.a(dmr.b(12.0, 0.0, 4.0), dmr.a(8.0, 10.0, 4.0, 5.0), dmr.a(4.0, 8.0, 5.0, 10.0), dmr.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wy d = wy.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aC);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvi($$2x, $$3, cvs.a($$1, $$2)), d);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cnq $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, eat $$3, cnq $$4) {
      if (!$$4.aZ()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(djm $$0, iv $$1, cnq $$2) {
      if (!$$2.aZ()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bux a(bwi $$0) {
      return $$0.dV().b($$0);
   }

   @Nullable
   public static eat e(eat $$0) {
      if ($$0.a(dmt.ht)) {
         return dmt.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dmt.hu) ? dmt.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   public int b(eat $$0, diq $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
