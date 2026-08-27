import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkh extends dde implements dkf {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final drf<drp> b = dqx.bh;
   public static final dqy c = dqx.C;
   protected static final eui d = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eui e = dde.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dkh> a() {
      return a;
   }

   public dkh(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, drp.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dqh $$0) {
      return $$0.c(b) != drp.c;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      drp $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return euf.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      in $$1 = $$0.a();
      dqh $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, drp.c).a(c, Boolean.valueOf(false));
      } else {
         ema $$3 = $$0.q().b_($$1);
         dqh $$4 = this.n().a(b, drp.b).a(c, Boolean.valueOf($$3.a() == emb.c));
         is $$5 = $$0.k();
         return $$5 != is.a && ($$5 == is.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, drp.a);
      }
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      csz $$2 = $$1.n();
      drp $$3 = $$0.c(b);
      if ($$3 == drp.c || !$$2.a(this.q())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         is $$5 = $$1.k();
         return $$3 == drp.b ? $$5 == is.b || $$4 && $$5.o().d() : $$5 == is.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      return $$2.c(b) != drp.c ? dkf.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return $$3.c(b) != drp.c ? dkf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(avw.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
