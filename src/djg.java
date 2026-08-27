import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class djg extends dbt implements djh {
   public static final dpz f = dpy.C;
   protected static final float g = 4.0F;
   protected static final etc h = dch.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dqv a;

   protected djg(dqv $$0, dph.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djg> a();

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return h;
   }

   @Override
   public boolean a(dpi $$0) {
      return true;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dny($$0, $$1);
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dny $$7) {
         csr $$10 = $$0.f() instanceof csr $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gl();
         if (!$$2.B) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(auz.c.b($$0.f()));
                  $$2.a(dub.c, $$7.az_(), dub.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.g(1);
                  }

                  return boh.a;
               } else {
                  return boh.d;
               }
            } else {
               return boh.d;
            }
         } else {
            return !$$11 && !$$7.u() ? boh.b : boh.a;
         }
      } else {
         return boh.e;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.c_($$2) instanceof dny $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.az_(), $$5.d(), aup.e);
            return bof.a;
         } else if ($$8) {
            return bof.a;
         } else if (!this.a($$3, $$5) && $$3.gl() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bof.a;
         } else {
            return bof.d;
         }
      } else {
         return bof.d;
      }
   }

   private boolean b(cka $$0, dny $$1, boolean $$2) {
      dnz $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wh.a) || $$0x.b() instanceof xp);
   }

   public abstract float g(dpi var1);

   public esj m(dpi $$0) {
      return new esj(0.5, 0.5, 0.5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(f) ? elc.c.a(false) : super.c_($$0);
   }

   public dqv d() {
      return this.a;
   }

   public static dqv a(dch $$0) {
      dqv $$1;
      if ($$0 instanceof djg) {
         $$1 = ((djg)$$0).d();
      } else {
         $$1 = dqv.b;
      }

      return $$1;
   }

   public void a(cka $$0, dny $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cka $$0, dny $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.h, dny::a);
   }
}
