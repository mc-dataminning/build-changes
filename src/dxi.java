import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dxi extends djq {
   public static final MapCodec<dxi> a = b(dxi::new);
   public static final dyo<jn> b = dxk.a;
   public static final dyo<dys> c = dxk.c;

   @Override
   public MapCodec<dxi> a() {
      return a;
   }

   public dxi(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, dys.a));
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return null;
   }

   public static dus a(ji $$0, dxq $$1, dxq $$2, jn $$3, boolean $$4, boolean $$5) {
      return new dxm($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.l, dxm::a);
   }

   @Override
   public void a(dha $$0, ji $$1, dxq $$2) {
      ji $$3 = $$1.a($$2.c(b).g());
      dxq $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dxj && $$4.c(dxj.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsy.c;
      } else {
         return bsy.e;
      }
   }

   @Override
   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      dxm $$2 = this.a($$1.a(), ji.a($$1.a(ezi.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      dxm $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fco.a();
   }

   @Nullable
   private dxm a(dgf $$0, ji $$1) {
      dus $$2 = $$0.c_($$1);
      return $$2 instanceof dxm ? (dxm)$$2 : null;
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return cxh.k;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
