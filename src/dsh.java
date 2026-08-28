import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsh extends dke {
   public static final MapCodec<dsh> a = b(dsh::new);
   private static final wp c = wp.c("container.stonecutter");
   public static final dyo<jn> b = dod.e;
   private static final fcr d = dke.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c));
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ay);
      }

      return bsy.a;
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new cuz($$2x, $$3, ctj.a($$1, $$2)), c);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
