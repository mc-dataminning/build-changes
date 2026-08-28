import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends deu implements dlv {
   public static final MapCodec<dlx> a = b(dlx::new);
   public static final dsv<dtf> b = dsn.bh;
   public static final dso c = dsn.C;
   protected static final ewf d = deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewf e = deu.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dlx> a() {
      return a;
   }

   public dlx(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, dtf.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drx $$0) {
      return $$0.c(b) != dtf.c;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      dtf $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewc.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      iz $$1 = $$0.a();
      drx $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtf.c).a(c, Boolean.valueOf(false));
      } else {
         enq $$3 = $$0.q().b_($$1);
         drx $$4 = this.n().a(b, dtf.b).a(c, Boolean.valueOf($$3.a() == enr.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtf.a);
      }
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      cuk $$2 = $$1.n();
      dtf $$3 = $$0.c(b);
      if ($$3 == dtf.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dtf.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      return $$2.c(b) != dtf.c ? dlv.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return $$3.c(b) != dtf.c ? dlv.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awr.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
