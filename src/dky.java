import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dky extends ddk implements dkz {
   public static final drs f = drr.C;
   protected static final float g = 4.0F;
   protected static final evd h = ddy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dso a;

   protected dky(dso $$0, dra.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dky> a();

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return h;
   }

   @Override
   public boolean a(drb $$0) {
      return true;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpq($$0, $$1);
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dpq $$7) {
         cuq $$10 = $$0.g() instanceof cuq $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avr.c.b($$0.g()));
                  $$2.a(dvu.c, $$7.az_(), dvu.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bpw.a;
               } else {
                  return bpw.d;
               }
            } else {
               return bpw.d;
            }
         } else {
            return !$$11 && !$$7.v() ? bpw.b : bpw.a;
         }
      } else {
         return bpw.e;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.c_($$2) instanceof dpq $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.az_(), $$5.d(), avi.e);
            return bpu.a;
         } else if ($$8) {
            return bpu.a;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bpu.a;
         } else {
            return bpu.d;
         }
      } else {
         return bpu.d;
      }
   }

   private boolean b(clw $$0, dpq $$1, boolean $$2) {
      dpr $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(ww.a) || $$0x.b() instanceof ye);
   }

   public abstract float g(drb var1);

   public euk m(drb $$0) {
      return new euk(0.5, 0.5, 0.5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(f) ? emv.c.a(false) : super.b_($$0);
   }

   public dso d() {
      return this.a;
   }

   public static dso a(ddy $$0) {
      dso $$1;
      if ($$0 instanceof dky) {
         $$1 = ((dky)$$0).d();
      } else {
         $$1 = dso.b;
      }

      return $$1;
   }

   public void a(clw $$0, dpq $$1, boolean $$2) {
      $$1.a($$0.cz());
      $$0.a($$1, $$2);
   }

   private boolean a(clw $$0, dpq $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cz());
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.h, dpq::a);
   }
}
