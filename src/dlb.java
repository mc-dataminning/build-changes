import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends ddy implements dkz {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final drz<dsj> b = drr.bh;
   public static final drs c = drr.C;
   protected static final evd d = ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final evd e = ddy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dlb> a() {
      return a;
   }

   public dlb(dra.d $$0) {
      super($$0);
      this.k(this.n().a(b, dsj.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drb $$0) {
      return $$0.c(b) != dsj.c;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      dsj $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eva.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      io $$1 = $$0.a();
      drb $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dsj.c).a(c, Boolean.valueOf(false));
      } else {
         emu $$3 = $$0.q().b_($$1);
         drb $$4 = this.n().a(b, dsj.b).a(c, Boolean.valueOf($$3.a() == emv.c));
         it $$5 = $$0.k();
         return $$5 != it.a && ($$5 == it.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dsj.a);
      }
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      cto $$2 = $$1.n();
      dsj $$3 = $$0.c(b);
      if ($$3 == dsj.c || !$$2.a(this.q())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         it $$5 = $$1.k();
         return $$3 == dsj.b ? $$5 == it.b || $$4 && $$5.o().d() : $$5 == it.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      return $$2.c(b) != dsj.c ? dkz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return $$3.c(b) != dsj.c ? dkz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awb.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
