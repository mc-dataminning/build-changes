import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfq extends cyo implements dfo {
   public static final MapCodec<dfq> a = b(dfq::new);
   public static final dmd<dmn> b = dlv.bh;
   public static final dlw c = dlv.C;
   protected static final eol d = cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eol e = cyo.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dfq> a() {
      return a;
   }

   public dfq(dle.d $$0) {
      super($$0);
      this.k(this.o().a(b, dmn.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlf $$0) {
      return $$0.c(b) != dmn.c;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      dmn $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eoi.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      hz $$1 = $$0.a();
      dlf $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dmn.c).a(c, Boolean.valueOf(false));
      } else {
         egp $$3 = $$0.q().b_($$1);
         dlf $$4 = this.o().a(b, dmn.b).a(c, Boolean.valueOf($$3.a() == egq.c));
         ie $$5 = $$0.k();
         return $$5 != ie.a && ($$5 == ie.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dmn.a);
      }
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      coz $$2 = $$1.n();
      dmn $$3 = $$0.c(b);
      if ($$3 == dmn.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ie $$5 = $$1.k();
         return $$3 == dmn.b ? $$5 == ie.b || $$4 && $$5.o().d() : $$5 == ie.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      return $$2.c(b) != dmn.c ? dfo.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return $$3.c(b) != dmn.c ? dfo.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(aue.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
