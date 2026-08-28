import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dll extends diy {
   public static final MapCodec<dll> a = b(dll::new);
   public static final dxw b = dxn.aW;
   public static final dxo c = dxn.t;
   protected static final fbu d = djm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return d;
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   private static void e(dwx $$0, dgi $$1, ji $$2) {
      int $$3 = $$1.a(dgr.a, $$2) - $$1.E_();
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
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dwx $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ebt.c, $$2, ebt.a.a($$3, $$5));
            e($$5, $$1, $$2);
         }

         return bsk.a;
      }
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dup($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, dub.r, dll::a) : null;
   }

   private static void a(dgi $$0, ji $$1, dwx $$2, dup $$3) {
      if ($$0.ad() % 20L == 0L) {
         e($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }
}
