import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends djq {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dyk<jm> b = dyd.Q;
   public static final dye c = dyd.v;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   public djk(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof dui $$6) {
         $$3.a($$6);
         $$3.a(axp.ar);
         coh.a($$5, $$3, true);
      }

      return bte.a;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dup $$4 = $$1.c_($$2);
      if ($$4 instanceof dui) {
         ((dui)$$4).k();
      }
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dui($$0, $$1);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
