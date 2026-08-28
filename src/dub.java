import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dub extends dmd implements duc {
   public static final ebk d = ebj.I;
   private static final ffw a = dmr.b(8.0, 0.0, 16.0);
   private final ech b;

   protected dub(ech $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dub> a();

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a;
   }

   @Override
   public boolean a(eat $$0) {
      return true;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzf($$0, $$1);
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$2.c_($$3) instanceof dzf $$7) {
         dap $$10 = $$0.h() instanceof dap $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awx.c.b($$0.h()));
                  $$2.a(eft.c, $$7.ax_(), eft.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bug.a;
               } else {
                  return bug.f;
               }
            } else {
               return bug.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bug.c : bug.a;
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.c_($$2) instanceof dzf $$5) {
         if ($$1.C) {
            ag.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.ax_(), $$5.d(), awo.e);
            return bug.b;
         } else if ($$8) {
            return bug.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bug.b;
         } else {
            return bug.e;
         }
      } else {
         return bug.e;
      }
   }

   private boolean b(crm $$0, dzf $$1, boolean $$2) {
      dzg $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(wx.a) || $$0x.b() instanceof yf);
   }

   public abstract float h(eat var1);

   public ffc o(eat $$0) {
      return new ffc(0.5, 0.5, 0.5);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   public ech d() {
      return this.b;
   }

   public static ech a(dmr $$0) {
      ech $$1;
      if ($$0 instanceof dub) {
         $$1 = ((dub)$$0).d();
      } else {
         $$1 = ech.b;
      }

      return $$1;
   }

   public void a(crm $$0, dzf $$1, boolean $$2) {
      $$1.a($$0.cF());
      $$0.a($$1, $$2);
   }

   private boolean a(crm $$0, dzf $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cF());
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.h, dzf::a);
   }
}
