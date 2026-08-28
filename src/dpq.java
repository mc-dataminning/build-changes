import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dpq extends dic implements dpr {
   public static final dwm f = dwl.C;
   protected static final float g = 4.0F;
   protected static final fas h = diq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dxh a;

   protected dpq(dxh $$0, dvu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dpq> a();

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return h;
   }

   @Override
   public boolean a(dvv $$0) {
      return true;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duk($$0, $$1);
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.c_($$3) instanceof duk $$7) {
         cxq $$10 = $$0.h() instanceof cxq $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gt();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awx.c.b($$0.h()));
                  $$2.a(ear.c, $$7.aA_(), ear.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsk.a;
               } else {
                  return bsk.f;
               }
            } else {
               return bsk.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bsk.c : bsk.a;
         }
      } else {
         return bsk.e;
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1.c_($$2) instanceof duk $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aA_(), $$5.d(), awo.e);
            return bsk.b;
         } else if ($$8) {
            return bsk.b;
         } else if (!this.a($$3, $$5) && $$3.gt() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsk.b;
         } else {
            return bsk.e;
         }
      } else {
         return bsk.e;
      }
   }

   private boolean b(cou $$0, duk $$1, boolean $$2) {
      dul $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xi.a) || $$0x.b() instanceof yq);
   }

   public abstract float h(dvv var1);

   public ezy o(dvv $$0) {
      return new ezy(0.5, 0.5, 0.5);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(f) ? erw.c.a(false) : super.b_($$0);
   }

   public dxh d() {
      return this.a;
   }

   public static dxh a(diq $$0) {
      dxh $$1;
      if ($$0 instanceof dpq) {
         $$1 = ((dpq)$$0).d();
      } else {
         $$1 = dxh.b;
      }

      return $$1;
   }

   public void a(cou $$0, duk $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cou $$0, duk $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.h, duk::a);
   }
}
