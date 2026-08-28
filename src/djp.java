import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class djp extends djm {
   public static final MapCodec<djp> c = b(djp::new);
   public static final dyo<jn> d = dod.e;
   private static final Map<jn, fcr> e = fco.c(dke.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends djp> a() {
      return c;
   }

   protected djp(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, jn.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dkg.a.m() : $$0;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = $$0.c(d);
      ji $$4 = $$2.a($$3.g());
      dxq $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      dhc $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
