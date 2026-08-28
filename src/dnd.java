import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends djk implements dqq {
   public static final MapCodec<dnd> a = b(dnd::new);
   private static final dxm c = dxl.J;
   protected static final fbs b = djk.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = super.a($$0);
      if ($$1 != null) {
         esx $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == esy.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwv $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jn.a);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.b && !this.a($$0, $$1, $$3)) {
         return djm.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
