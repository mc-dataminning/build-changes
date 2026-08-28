import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class duo extends dmq implements dup {
   public static final ebx d = ebw.I;
   private static final fgm a = dne.b(8.0, 0.0, 16.0);
   private final ecu b;

   protected duo(ecu $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends duo> a();

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   public boolean a(ebg $$0) {
      return true;
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzs($$0, $$1);
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dzs $$7) {
         dbc $$10 = $$0.h() instanceof dbc $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axb.c.b($$0.h()));
                  $$2.a(egg.c, $$7.aB_(), egg.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return but.a;
               } else {
                  return but.f;
               }
            } else {
               return but.f;
            }
         } else {
            return !$$11 && !$$7.u() ? but.c : but.a;
         }
      } else {
         return but.e;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.c_($$2) instanceof dzs $$5) {
         if ($$1.C) {
            ag.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aB_(), $$5.d(), aws.e);
            return but.b;
         } else if ($$8) {
            return but.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return but.b;
         } else {
            return but.e;
         }
      } else {
         return but.e;
      }
   }

   private boolean b(crz $$0, dzs $$1, boolean $$2) {
      dzt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(xb.a) || $$0x.b() instanceof yj);
   }

   public abstract float h(ebg var1);

   public ffs o(ebg $$0) {
      return new ffs(0.5, 0.5, 0.5);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   public ecu d() {
      return this.b;
   }

   public static ecu a(dne $$0) {
      ecu $$1;
      if ($$0 instanceof duo) {
         $$1 = ((duo)$$0).d();
      } else {
         $$1 = ecu.b;
      }

      return $$1;
   }

   public void a(crz $$0, dzs $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(crz $$0, dzs $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.h, dzs::a);
   }
}
