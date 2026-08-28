import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpe extends dke implements drl {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final dyh b = dyg.I;

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   protected dpe(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dxq $$0, dxq $$1, jn $$2) {
      return $$1.a(dkg.ag) && $$2.o() == jn.a.b;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
