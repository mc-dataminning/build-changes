import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dix {
   public static final MapCodec<dlk> a = b(dlk::new);
   public static final dxv b = dxm.aW;
   public static final dxn c = dxm.t;
   protected static final fbt d = djl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d;
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   private static void e(dww $$0, dgh $$1, ji $$2) {
      int $$3 = $$1.a(dgq.a, $$2) - $$1.E_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayz.b($$4));
      }

      $$3 = ayz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dww $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ebs.c, $$2, ebs.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsj.a;
      }
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, dua.r, dlk::a) : null;
   }

   private static void a(dgh $$0, ji $$1, dww $$2, duo $$3) {
      if ($$0.ad() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }
}
