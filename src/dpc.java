import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dke implements dri {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final dye b = dyd.D;

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dxn $$0, dxn $$1, jm $$2) {
      return $$1.a(dkg.ag) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etq.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }
}
