import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drd extends djq implements drl {
   public static final MapCodec<drd> a = b(drd::new);
   public static final dyh b = dyg.C;
   public static final dyh c = dyg.I;
   public static final dyh d = dyg.e;
   private static final fcr f = dke.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jn.a.b);

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      if ($$0 instanceof ard $$4) {
         are $$5 = dwd.a($$3);
         if ($$5 != null) {
            $$4.a($$1, duu.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, duu.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f;
   }

   @Override
   protected fcr d_(dxq $$0) {
      return f;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwd($$0, $$1);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == etx.c));
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsa.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return !$$0.C ? djq.a($$2, duu.M, ($$0x, $$1x, $$2x, $$3) -> ecy.c.a($$0x, $$3.x(), $$3.gs())) : null;
   }
}
