import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvv extends dno {
   public static final MapCodec<dvv> a = b(dvv::new);
   private static final xg c = xg.c("container.stonecutter");
   public static final eco<jc> b = drp.e;
   private static final fgw d = dno.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dvv> a() {
      return a;
   }

   public dvv(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.ay);
      }

      return bvc.a;
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cyf($$2x, $$3, cwo.a($$1, $$2)), c);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
