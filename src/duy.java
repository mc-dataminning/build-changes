import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duy extends dmr {
   public static final MapCodec<duy> a = b(duy::new);
   private static final wy c = wy.c("container.stonecutter");
   public static final ebr<jb> b = dqs.e;
   private static final ffw d = dmr.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<duy> a() {
      return a;
   }

   public duy(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ay);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cxi($$2x, $$3, cvs.a($$1, $$2)), c);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
