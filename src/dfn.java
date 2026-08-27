import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dfn extends cya implements dfo {
   public static final dlw f = dlv.C;
   protected static final float g = 4.0F;
   protected static final eol h = cyo.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dms a;

   protected dfn(dms $$0, dle.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dfn> a();

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return h;
   }

   @Override
   public boolean a(dlf $$0) {
      return true;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkc($$0, $$1);
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof dkc $$7) {
         cpy $$10 = $$0.d() instanceof cpy $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gf();
         if (!$$2.B) {
            if ($$11 && !$$7.x() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(atu.c.b($$0.d()));
                  $$2.a(dpp.c, $$7.aE_(), dpp.a.a($$4, $$7.r()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return blw.a;
               } else {
                  return blw.d;
               }
            } else {
               return blw.d;
            }
         } else {
            return !$$11 && !$$7.x() ? blw.b : blw.a;
         }
      } else {
         return blw.e;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.c_($$2) instanceof dkc $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.x()) {
            $$1.a(null, $$5.aE_(), $$5.f(), atl.e);
            return blu.a;
         } else if ($$8) {
            return blu.a;
         } else if (!this.a($$3, $$5) && $$3.gf() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return blu.a;
         } else {
            return blu.d;
         }
      } else {
         return blu.d;
      }
   }

   private boolean b(chh $$0, dkc $$1, boolean $$2) {
      dkd $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vp.a) || $$0x.b() instanceof wx);
   }

   public abstract float g(dlf var1);

   public ens m(dlf $$0) {
      return new ens(0.5, 0.5, 0.5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(f) ? egq.c.a(false) : super.c_($$0);
   }

   public dms d() {
      return this.a;
   }

   public static dms a(cyo $$0) {
      dms $$1;
      if ($$0 instanceof dfn) {
         $$1 = ((dfn)$$0).d();
      } else {
         $$1 = dms.b;
      }

      return $$1;
   }

   public void a(chh $$0, dkc $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(chh $$0, dkc $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.h, dkc::a);
   }
}
