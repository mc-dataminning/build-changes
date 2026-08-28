import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends djk implements dqq {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final dxm b = dxl.n;
   public static final dxm c = dxl.J;
   protected static final fbs d = fbp.a(djk.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), djk.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fbs e = fbp.a(djk.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), djk.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());

      for (jn $$2 : $$0.f()) {
         if ($$2.o() == jn.a.b) {
            dwv $$3 = this.m().b(b, Boolean.valueOf($$2 == jn.b));
            if ($$3.a((dgj)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == esy.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = o($$0).g();
      return djk.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jn o(dwv $$0) {
      return $$0.c(b) ? jn.a : jn.b;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
