import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class don extends dhj implements dol {
   public static final MapCodec<don> a = b(don::new);
   public static final dvm<dvw> b = dve.bh;
   public static final dvf c = dve.C;
   protected static final ezm d = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ezm e = dhj.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends don> a() {
      return a;
   }

   public don(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, dvw.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(duo $$0) {
      return $$0.c(b) != dvw.c;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      dvw $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ezj.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      je $$1 = $$0.a();
      duo $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dvw.c).b(c, Boolean.valueOf(false));
      } else {
         eqp $$3 = $$0.q().b_($$1);
         duo $$4 = this.o().b(b, dvw.b).b(c, Boolean.valueOf($$3.a() == eqq.c));
         jj $$5 = $$0.k();
         return $$5 != jj.a && ($$5 == jj.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dvw.a);
      }
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      cvp $$2 = $$1.n();
      dvw $$3 = $$0.c(b);
      if ($$3 == dvw.c || !$$2.a(this.q())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jj $$5 = $$1.k();
         return $$3 == dvw.b ? $$5 == jj.b || $$4 && $$5.o().d() : $$5 == jj.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      return $$2.c(b) != dvw.c ? dol.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return $$3.c(b) != dvw.c ? dol.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awz.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
