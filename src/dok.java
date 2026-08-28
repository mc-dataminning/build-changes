import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dok extends djq {
   public static final MapCodec<dok> a = b(dok::new);
   public static final dyh b = dyg.q;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czo $$5 = $$4.a(kv.aa, czo.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvw $$5) {
         $$5.s();
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$1.c(b)) {
         return bsy.f;
      } else {
         cxh $$7 = $$4.b($$5);
         bsy $$8 = cxm.a($$2, $$3, $$7, $$4);
         return (bsy)(!$$8.a() ? bsy.f : $$8);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvw($$0, $$1);
   }

   @Override
   public boolean f_(dxq $$0) {
      return true;
   }

   @Override
   public int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if ($$1.c_($$2) instanceof dvw $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return $$1.c_($$2) instanceof dvw $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$1.c(b) ? a($$2, duu.e, dvw::a) : null;
   }
}
