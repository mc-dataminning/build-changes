import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends djm {
   public static final MapCodec<dro> a = b(dro::new);
   private static final wo d = wo.c("container.stonecutter");
   public static final dxu<jn> b = dnk.aF;
   protected static final fbu c = djm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ay);
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new cuf($$2x, $$3, csp.a($$1, $$2)), d);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
