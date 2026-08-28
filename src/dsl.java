import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsl extends dkl {
   public static final MapCodec<dsl> a = b(dsl::new);
   private static final xv d = xv.c("container.stonecutter");
   public static final dyr<jm> b = doj.aF;
   protected static final fcr c = dkl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dsl> a() {
      return a;
   }

   public dsl(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ay);
      }

      return bti.a;
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new cve($$2x, $$3, cto.a($$1, $$2)), d);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
