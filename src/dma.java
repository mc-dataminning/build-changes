import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dma extends dex implements dly {
   public static final MapCodec<dma> a = b(dma::new);
   public static final dsy<dti> b = dsq.bh;
   public static final dsr c = dsq.C;
   protected static final ewi d = dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewi e = dex.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dma> a() {
      return a;
   }

   public dma(drz.d $$0) {
      super($$0);
      this.k(this.o().a(b, dti.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsa $$0) {
      return $$0.c(b) != dti.c;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      dti $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewf.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      iz $$1 = $$0.a();
      dsa $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dti.c).a(c, Boolean.valueOf(false));
      } else {
         ent $$3 = $$0.q().b_($$1);
         dsa $$4 = this.o().a(b, dti.b).a(c, Boolean.valueOf($$3.a() == enu.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dti.a);
      }
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      cun $$2 = $$1.n();
      dti $$3 = $$0.c(b);
      if ($$3 == dti.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dti.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      return $$2.c(b) != dti.c ? dly.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return $$3.c(b) != dti.c ? dly.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
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
