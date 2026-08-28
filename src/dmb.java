import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends dey implements dlz {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final dsz<dtj> b = dsr.bh;
   public static final dss c = dsr.C;
   protected static final ewj d = dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewj e = dey.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dmb> a() {
      return a;
   }

   public dmb(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtj.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsb $$0) {
      return $$0.c(b) != dtj.c;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      dtj $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewg.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      iz $$1 = $$0.a();
      dsb $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtj.c).a(c, Boolean.valueOf(false));
      } else {
         enu $$3 = $$0.q().b_($$1);
         dsb $$4 = this.o().a(b, dtj.b).a(c, Boolean.valueOf($$3.a() == env.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtj.a);
      }
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      cuo $$2 = $$1.n();
      dtj $$3 = $$0.c(b);
      if ($$3 == dtj.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dtj.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      return $$2.c(b) != dtj.c ? dlz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return $$3.c(b) != dtj.c ? dlz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awu.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
