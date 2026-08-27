import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfu extends cys implements dfs {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dmh<dmr> b = dlz.bh;
   public static final dma c = dlz.C;
   protected static final eos d = cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eos e = cys.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dfu> a() {
      return a;
   }

   public dfu(dli.d $$0) {
      super($$0);
      this.k(this.o().a(b, dmr.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlj $$0) {
      return $$0.c(b) != dmr.c;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      dmr $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eop.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      hz $$1 = $$0.a();
      dlj $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dmr.c).a(c, Boolean.valueOf(false));
      } else {
         egw $$3 = $$0.q().b_($$1);
         dlj $$4 = this.o().a(b, dmr.b).a(c, Boolean.valueOf($$3.a() == egx.c));
         ie $$5 = $$0.k();
         return $$5 != ie.a && ($$5 == ie.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dmr.a);
      }
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      cpd $$2 = $$1.n();
      dmr $$3 = $$0.c(b);
      if ($$3 == dmr.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ie $$5 = $$1.k();
         return $$3 == dmr.b ? $$5 == ie.b || $$4 && $$5.o().d() : $$5 == ie.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      return $$2.c(b) != dmr.c ? dfs.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return $$3.c(b) != dmr.c ? dfs.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(auf.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
