import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dph extends die implements dpf {
   public static final MapCodec<dph> a = b(dph::new);
   public static final dwh<dwr> b = dvz.bh;
   public static final dwa c = dvz.C;
   protected static final fah d = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fah e = die.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dph> a() {
      return a;
   }

   public dph(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, dwr.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvj $$0) {
      return $$0.c(b) != dwr.c;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      dwr $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fae.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      jh $$1 = $$0.a();
      dvj $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dwr.c).b(c, Boolean.valueOf(false));
      } else {
         erk $$3 = $$0.q().b_($$1);
         dvj $$4 = this.m().b(b, dwr.b).b(c, Boolean.valueOf($$3.a() == erl.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dwr.a);
      }
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      cwb $$2 = $$1.n();
      dwr $$3 = $$0.c(b);
      if ($$3 == dwr.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dwr.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      return $$2.c(b) != dwr.c ? dpf.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return $$3.c(b) != dwr.c ? dpf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axg.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
