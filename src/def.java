import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends del {
   public static final MapCodec<def> a = b(def::new);
   public static final dsw b = dss.P;
   public static final dst c = dss.u;

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dpa) {
            $$3.a((dpa)$$5);
            $$3.a(awk.ar);
            clo.a($$3, true);
         }

         return bqu.c;
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      bqq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dph $$4 = $$1.c_($$2);
      if ($$4 instanceof dpa) {
         ((dpa)$$4).l();
      }
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpa($$0, $$1);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
