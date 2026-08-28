import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dro extends djx implements drp {
   public static final dyl f = dyk.D;
   protected static final float g = 4.0F;
   protected static final fcr h = dkl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dzg a;

   protected dro(dzg $$0, dxt.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dro> a();

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return h;
   }

   @Override
   public boolean a(dxu $$0) {
      return true;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwj($$0, $$1);
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwj $$7) {
         cys $$10 = $$0.h() instanceof cys $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axp.c.b($$0.h()));
                  $$2.a(ecq.c, $$7.aB_(), ecq.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bti.a;
               } else {
                  return bti.f;
               }
            } else {
               return bti.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bti.c : bti.a;
         }
      } else {
         return bti.e;
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1.c_($$2) instanceof dwj $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), axg.e);
            return bti.b;
         } else if ($$8) {
            return bti.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bti.b;
         } else {
            return bti.e;
         }
      } else {
         return bti.e;
      }
   }

   private boolean b(cpw $$0, dwj $$1, boolean $$2) {
      dwk $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xu.a) || $$0x.b() instanceof zc);
   }

   public abstract float h(dxu var1);

   public fbx o(dxu $$0) {
      return new fbx(0.5, 0.5, 0.5);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(f) ? etx.c.a(false) : super.b_($$0);
   }

   public dzg d() {
      return this.a;
   }

   public static dzg a(dkl $$0) {
      dzg $$1;
      if ($$0 instanceof dro) {
         $$1 = ((dro)$$0).d();
      } else {
         $$1 = dzg.b;
      }

      return $$1;
   }

   public void a(cpw $$0, dwj $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cpw $$0, dwj $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.h, dwj::a);
   }
}
