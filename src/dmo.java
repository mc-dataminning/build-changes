import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dmo extends dqm {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final eco<jc> b = drp.e;
   private static final Map<jc.a, fgw> c = fgt.a(
      fgt.a(dno.b(12.0, 0.0, 4.0), dno.a(8.0, 10.0, 4.0, 5.0), dno.a(4.0, 8.0, 5.0, 10.0), dno.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final xg d = xg.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.aC);
      }

      return bvc.a;
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cwe($$2x, $$3, cwo.a($$1, $$2)), d);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(com $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, ebq $$3, com $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, com $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bvt a(bxe $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static ebq e(ebq $$0) {
      if ($$0.a(dnq.ht)) {
         return dnq.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dnq.hu) ? dnq.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   public int b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
