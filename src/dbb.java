import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbb extends cua implements daz {
   public static final MapCodec<dbb> a = b(dbb::new);
   public static final dgz<dhj> b = dgr.bh;
   public static final dgs c = dgr.C;
   protected static final eiy d = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eiy e = cua.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dbb> a() {
      return a;
   }

   public dbb(dga.d $$0) {
      super($$0);
      this.k(this.o().a(b, dhj.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgb $$0) {
      return $$0.c(b) != dhj.c;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      dhj $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eiv.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ht $$1 = $$0.a();
      dgb $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dhj.c).a(c, Boolean.valueOf(false));
      } else {
         ebe $$3 = $$0.q().b_($$1);
         dgb $$4 = this.o().a(b, dhj.b).a(c, Boolean.valueOf($$3.a() == ebf.c));
         hx $$5 = $$0.k();
         return $$5 != hx.a && ($$5 == hx.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dhj.a);
      }
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      ckj $$2 = $$1.n();
      dhj $$3 = $$0.c(b);
      if ($$3 == dhj.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hx $$5 = $$1.k();
         return $$3 == dhj.b ? $$5 == hx.b || $$4 && $$5.o().d() : $$5 == hx.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      return $$2.c(b) != dhj.c ? daz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return $$3.c(b) != dhj.c ? daz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(aqx.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
