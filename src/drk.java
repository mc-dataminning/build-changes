import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class drk extends djq implements drl {
   public static final dyh d = dyg.I;
   private static final fcr a = dke.b(8.0, 0.0, 16.0);
   private final dzd b;

   protected drk(dzd $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends drk> a();

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   public boolean a(dxq $$0) {
      return true;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwf($$0, $$1);
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwf $$7) {
         cyk $$10 = $$0.h() instanceof cyk $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gy();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awk.c.b($$0.h()));
                  $$2.a(ecp.c, $$7.aA_(), ecp.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bsy.a;
               } else {
                  return bsy.f;
               }
            } else {
               return bsy.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bsy.c : bsy.a;
         }
      } else {
         return bsy.e;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.c_($$2) instanceof dwf $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aA_(), $$5.d(), awb.e);
            return bsy.b;
         } else if ($$8) {
            return bsy.b;
         } else if (!this.a($$3, $$5) && $$3.gy() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bsy.b;
         } else {
            return bsy.e;
         }
      } else {
         return bsy.e;
      }
   }

   private boolean b(cpr $$0, dwf $$1, boolean $$2) {
      dwg $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wo.a) || $$0x.b() instanceof xw);
   }

   public abstract float h(dxq var1);

   public fbx o(dxq $$0) {
      return new fbx(0.5, 0.5, 0.5);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   public dzd d() {
      return this.b;
   }

   public static dzd a(dke $$0) {
      dzd $$1;
      if ($$0 instanceof drk) {
         $$1 = ((drk)$$0).d();
      } else {
         $$1 = dzd.b;
      }

      return $$1;
   }

   public void a(cpr $$0, dwf $$1, boolean $$2) {
      $$1.a($$0.cF());
      $$0.a($$1, $$2);
   }

   private boolean a(cpr $$0, dwf $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cF());
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.h, dwf::a);
   }
}
