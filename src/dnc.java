import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends dfy implements dna {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final dua<duk> b = dts.bh;
   public static final dtt c = dts.C;
   protected static final exv d = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final exv e = dfy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dnc> a() {
      return a;
   }

   public dnc(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(b, duk.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dtc $$0) {
      return $$0.c(b) != duk.c;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      duk $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return exs.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      jd $$1 = $$0.a();
      dtc $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, duk.c).a(c, Boolean.valueOf(false));
      } else {
         epe $$3 = $$0.q().b_($$1);
         dtc $$4 = this.o().a(b, duk.b).a(c, Boolean.valueOf($$3.a() == epf.c));
         ji $$5 = $$0.k();
         return $$5 != ji.a && ($$5 == ji.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, duk.a);
      }
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      cuq $$2 = $$1.n();
      duk $$3 = $$0.c(b);
      if ($$3 == duk.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ji $$5 = $$1.k();
         return $$3 == duk.b ? $$5 == ji.b || $$4 && $$5.o().d() : $$5 == ji.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epe $$3) {
      return $$2.c(b) != duk.c ? dna.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epd $$4) {
      return $$3.c(b) != duk.c ? dna.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awk.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
