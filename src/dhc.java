import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends daa implements dha {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dnx<doh> b = dnp.bh;
   public static final dnq c = dnp.C;
   protected static final eqk d = daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eqk e = daa.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dhc> a() {
      return a;
   }

   public dhc(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, doh.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dmz $$0) {
      return $$0.c(b) != doh.c;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      doh $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eqh.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ib $$1 = $$0.a();
      dmz $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, doh.c).a(c, Boolean.valueOf(false));
      } else {
         ein $$3 = $$0.q().b_($$1);
         dmz $$4 = this.o().a(b, doh.b).a(c, Boolean.valueOf($$3.a() == eio.c));
         ih $$5 = $$0.k();
         return $$5 != ih.a && ($$5 == ih.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, doh.a);
      }
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      cqk $$2 = $$1.n();
      doh $$3 = $$0.c(b);
      if ($$3 == doh.c || !$$2.a(this.l())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ih $$5 = $$1.k();
         return $$3 == doh.b ? $$5 == ih.b || $$4 && $$5.o().d() : $$5 == ih.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      return $$2.c(b) != doh.c ? dha.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return $$3.c(b) != doh.c ? dha.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(aus.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
