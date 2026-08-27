import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dfr extends cye implements dfs {
   public static final dma f = dlz.C;
   protected static final float g = 4.0F;
   protected static final eos h = cys.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dmw a;

   protected dfr(dmw $$0, dli.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dfr> a();

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return h;
   }

   @Override
   public boolean a(dlj $$0) {
      return true;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkg($$0, $$1);
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof dkg $$7) {
         cqc $$10 = $$0.d() instanceof cqc $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gf();
         if (!$$2.B) {
            if ($$11 && !$$7.x() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(atv.c.b($$0.d()));
                  $$2.a(dpw.c, $$7.aE_(), dpw.a.a($$4, $$7.r()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bly.a;
               } else {
                  return bly.d;
               }
            } else {
               return bly.d;
            }
         } else {
            return !$$11 && !$$7.x() ? bly.b : bly.a;
         }
      } else {
         return bly.e;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.c_($$2) instanceof dkg $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.x()) {
            $$1.a(null, $$5.aE_(), $$5.f(), atm.e);
            return blw.a;
         } else if ($$8) {
            return blw.a;
         } else if (!this.a($$3, $$5) && $$3.gf() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return blw.a;
         } else {
            return blw.d;
         }
      } else {
         return blw.d;
      }
   }

   private boolean b(chl $$0, dkg $$1, boolean $$2) {
      dkh $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vp.a) || $$0x.b() instanceof wx);
   }

   public abstract float g(dlj var1);

   public enz m(dlj $$0) {
      return new enz(0.5, 0.5, 0.5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(f) ? egx.c.a(false) : super.c_($$0);
   }

   public dmw d() {
      return this.a;
   }

   public static dmw a(cys $$0) {
      dmw $$1;
      if ($$0 instanceof dfr) {
         $$1 = ((dfr)$$0).d();
      } else {
         $$1 = dmw.b;
      }

      return $$1;
   }

   public void a(chl $$0, dkg $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(chl $$0, dkg $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.h, dkg::a);
   }
}
