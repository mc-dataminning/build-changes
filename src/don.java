import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class don extends dke implements drl {
   public static final MapCodec<don> a = b(don::new);
   public static final dyo<jn> b = dod.e;
   public static final dyh c = dyg.I;
   public static final Map<jn, fcr> d = fco.c(dke.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<don> a() {
      return a;
   }

   protected don(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dgf $$0, ji $$1, jn $$2) {
      dxq $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      if (!$$0.c()) {
         dxq $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dxq $$2 = this.m();
      dhc $$3 = $$0.q();
      ji $$4 = $$0.a();
      etw $$5 = $$0.q().b_($$0.a());

      for (jn $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }
}
