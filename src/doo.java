import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doo extends dke implements drl {
   public static final MapCodec<doo> a = b(doo::new);
   public static final dyh b = dyg.m;
   public static final dyh c = dyg.I;
   private static final fcr d = fco.a(dke.b(4.0, 7.0, 9.0), dke.b(6.0, 0.0, 7.0));
   private static final fcr e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());

      for (jn $$2 : $$0.f()) {
         if ($$2.o() == jn.a.b) {
            dxq $$3 = this.m().b(b, Boolean.valueOf($$2 == jn.b));
            if ($$3.a((dhc)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = o($$0).g();
      return dke.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jn o(dxq $$0) {
      return $$0.c(b) ? jn.a : jn.b;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
