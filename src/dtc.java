import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtc extends djq {
   public static final MapCodec<dtc> a = b(dtc::new);
   public static final dyp<dxa> b = dyd.bA;
   public static final dyk<jm> c = doc.aF;
   public static final dye d = dyd.bC;

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   public dtc(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dxa.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if (!$$0.f() && $$1.c(b) == dxa.b) {
         if ($$2 instanceof ash $$7) {
            if (!($$7.c_($$3) instanceof dwv $$8)) {
               return bte.f;
            }

            dwv.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bte.b;
      } else {
         return bte.f;
      }
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwv($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, dur.S, ($$1x, $$2x, $$3x, $$4) -> dwv.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dur.S, ($$0x, $$1x, $$2x, $$3x) -> dwv.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dqn a_(dxn $$0) {
      return dqn.c;
   }
}
