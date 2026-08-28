import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends djm implements dqs {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final dxu<dye> b = dxn.bk;
   public static final dxo c = dxn.J;
   protected static final fbu d = djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fbu e = djm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dqu> a() {
      return a;
   }

   public dqu(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, dye.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwx $$0) {
      return $$0.c(b) != dye.c;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      dye $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fbr.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      ji $$1 = $$0.a();
      dwx $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dye.c).b(c, Boolean.valueOf(false));
      } else {
         esz $$3 = $$0.q().b_($$1);
         dwx $$4 = this.m().b(b, dye.b).b(c, Boolean.valueOf($$3.a() == eta.c));
         jn $$5 = $$0.k();
         return $$5 != jn.a && ($$5 == jn.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dye.a);
      }
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      cwp $$2 = $$1.n();
      dye $$3 = $$0.c(b);
      if ($$3 == dye.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jn $$5 = $$1.k();
         return $$3 == dye.b ? $$5 == jn.b || $$4 && $$5.o().d() : $$5 == jn.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      return $$2.c(b) != dye.c ? dqs.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return $$3.c(b) != dye.c ? dqs.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
