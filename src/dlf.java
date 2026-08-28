import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlf extends dqv implements drl {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dyh b = dyg.I;
   private static final Map<jn.a, fcr> e = fco.b(dke.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(d, jn.a.b));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e.get($$0.c(d));
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
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
