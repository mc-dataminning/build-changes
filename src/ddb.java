import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddb extends cvz implements dcz {
   public static final MapCodec<ddb> a = b(ddb::new);
   public static final djn<djx> b = djf.bh;
   public static final djg c = djf.C;
   protected static final elu d = cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final elu e = cvz.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends ddb> a() {
      return a;
   }

   public ddb(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, djx.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dip $$0) {
      return $$0.c(b) != djx.c;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      djx $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return elr.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      hv $$1 = $$0.a();
      dip $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, djx.c).a(c, Boolean.valueOf(false));
      } else {
         edz $$3 = $$0.q().b_($$1);
         dip $$4 = this.o().a(b, djx.b).a(c, Boolean.valueOf($$3.a() == eea.c));
         ia $$5 = $$0.k();
         return $$5 != ia.a && ($$5 == ia.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, djx.a);
      }
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      cmh $$2 = $$1.n();
      djx $$3 = $$0.c(b);
      if ($$3 == djx.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ia $$5 = $$1.k();
         return $$3 == djx.b ? $$5 == ia.b || $$4 && $$5.o().d() : $$5 == ia.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      return $$2.c(b) != djx.c ? dcz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return $$3.c(b) != djx.c ? dcz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(arw.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
