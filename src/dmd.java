import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dfa implements dmb {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final dtb<dtl> b = dst.bh;
   public static final dsu c = dst.C;
   protected static final ewl d = dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewl e = dfa.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dmd> a() {
      return a;
   }

   public dmd(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtl.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsd $$0) {
      return $$0.c(b) != dtl.c;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      dtl $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewi.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      iz $$1 = $$0.a();
      dsd $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtl.c).a(c, Boolean.valueOf(false));
      } else {
         enw $$3 = $$0.q().b_($$1);
         dsd $$4 = this.o().a(b, dtl.b).a(c, Boolean.valueOf($$3.a() == enx.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtl.a);
      }
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      cuq $$2 = $$1.n();
      dtl $$3 = $$0.c(b);
      if ($$3 == dtl.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dtl.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      return $$2.c(b) != dtl.c ? dmb.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return $$3.c(b) != dtl.c ? dmb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
