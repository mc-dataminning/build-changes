import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcu extends cye {
   public static final MapCodec<dcu> a = b(dcu::new);
   public static final dma b = dlz.n;

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   protected dcu(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sw $$5 = cmw.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof djy $$5) {
         $$5.k();
         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof djy $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djy($$0, $$1);
   }

   @Override
   public boolean f_(dlj $$0) {
      return true;
   }

   @Override
   public int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      if ($$1.c_($$2) instanceof djy $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djy $$3 && $$3.x().d() instanceof cpv $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$1.c(b) ? a($$2, diz.e, djy::a) : null;
   }
}
