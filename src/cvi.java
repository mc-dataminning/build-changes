import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cvi extends cvk {
   private final axj<cvh> a;

   public cvi(cvk.a $$0, axj<cvh> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      jp.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jn<cvh>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xr $$6 = $$5.get().a().d().f();
            xg.a($$6, ya.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cvp a(cvk $$0, jn<cvh> $$1) {
      cvp $$2 = new cvp($$0);
      $$2.b(kr.U, $$1);
      return $$2;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      Optional<? extends jn<cvh>> $$4 = this.a($$3, $$1.dU());
      if ($$4.isPresent()) {
         cvh $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a($$3, azd.d($$5.b() * 20.0F));
         $$1.b(awo.c.b(this));
         return brp.c;
      } else {
         return brp.d;
      }
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      Optional<jn<cvh>> $$2 = this.a($$0, $$1.dU());
      return $$2.<Integer>map($$0x -> azd.d(((cvh)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jn<cvh>> a(cvp $$0, jp.a $$1) {
      jn<cvh> $$2 = $$0.a(kr.U);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jr.c<cvh>> $$3 = $$1.b(lv.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jn<cvh>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cvr a(cvp $$0) {
      return cvr.i;
   }

   private static void a(deg $$0, cnu $$1, cvh $$2) {
      awd $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awf.c, $$4, 1.0F);
      $$0.a(dzl.B, $$1.dq(), dzl.a.a($$1));
   }
}
