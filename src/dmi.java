import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dff implements dmg {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dtf<dtp> b = dsx.bh;
   public static final dsy c = dsx.C;
   protected static final ews d = dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ews e = dff.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dmi> a() {
      return a;
   }

   public dmi(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtp.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsh $$0) {
      return $$0.c(b) != dtp.c;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      dtp $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewp.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      ja $$1 = $$0.a();
      dsh $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtp.c).a(c, Boolean.valueOf(false));
      } else {
         eob $$3 = $$0.q().b_($$1);
         dsh $$4 = this.o().a(b, dtp.b).a(c, Boolean.valueOf($$3.a() == eoc.c));
         jf $$5 = $$0.k();
         return $$5 != jf.a && ($$5 == jf.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtp.a);
      }
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      cua $$2 = $$1.n();
      dtp $$3 = $$0.c(b);
      if ($$3 == dtp.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         jf $$5 = $$1.k();
         return $$3 == dtp.b ? $$5 == jf.b || $$4 && $$5.o().d() : $$5 == jf.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      return $$2.c(b) != dtp.c ? dmg.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return $$3.c(b) != dtp.c ? dmg.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awa.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
