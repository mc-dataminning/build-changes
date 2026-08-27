import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcc extends cva implements dca {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final dig<diq> b = dhy.bh;
   public static final dhz c = dhy.C;
   protected static final ekn d = cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ekn e = cva.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dcc> a() {
      return a;
   }

   public dcc(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(b, diq.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhi $$0) {
      return $$0.c(b) != diq.c;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      diq $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ekk.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ht $$1 = $$0.a();
      dhi $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, diq.c).a(c, Boolean.valueOf(false));
      } else {
         ecs $$3 = $$0.q().b_($$1);
         dhi $$4 = this.o().a(b, diq.b).a(c, Boolean.valueOf($$3.a() == ect.c));
         hx $$5 = $$0.k();
         return $$5 != hx.a && ($$5 == hx.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, diq.a);
      }
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      clj $$2 = $$1.n();
      diq $$3 = $$0.c(b);
      if ($$3 == diq.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hx $$5 = $$1.k();
         return $$3 == diq.b ? $$5 == hx.b || $$4 && $$5.o().d() : $$5 == hx.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      return $$2.c(b) != diq.c ? dca.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return $$3.c(b) != diq.c ? dca.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(arl.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
