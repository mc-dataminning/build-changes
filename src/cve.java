import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cve extends cvg {
   private final axi<cvd> a;

   public cve(cvg.a $$0, axi<cvd> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      jp.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jn<cvd>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xr $$6 = $$5.get().a().d().f();
            xg.a($$6, ya.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cvl a(cvg $$0, jn<cvd> $$1) {
      cvl $$2 = new cvl($$0);
      $$2.b(kr.R, $$1);
      return $$2;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      Optional<? extends jn<cvd>> $$4 = this.a($$3, $$1.dU());
      if ($$4.isPresent()) {
         cvd $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, azc.d($$5.b() * 20.0F));
         $$1.b(awn.c.b(this));
         return brk.c;
      } else {
         return brk.d;
      }
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      Optional<jn<cvd>> $$2 = this.a($$0, $$1.dU());
      return $$2.<Integer>map($$0x -> azc.d(((cvd)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jn<cvd>> a(cvl $$0, jp.a $$1) {
      jn<cvd> $$2 = $$0.a(kr.R);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jr.c<cvd>> $$3 = $$1.b(lv.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jn<cvd>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.i;
   }

   private static void a(dds $$0, cnp $$1, cvd $$2) {
      awc $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awe.c, $$4, 1.0F);
      $$0.a(dyx.B, $$1.dq(), dyx.a.a($$1));
   }
}
