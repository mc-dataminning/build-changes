import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drp extends djn {
   public static final MapCodec<drp> a = b(drp::new);
   private static final wp d = wp.c("container.stonecutter");
   public static final dxv<jn> b = dnl.aF;
   protected static final fbv c = djn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   public drp(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ay);
      }

      return bsl.a;
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new cug($$2x, $$3, csq.a($$1, $$2)), d);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
