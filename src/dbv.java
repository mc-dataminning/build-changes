import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbv extends cut implements dbt {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final dhu<die> b = dhm.bh;
   public static final dhn c = dhm.C;
   protected static final ekb d = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ekb e = cut.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dbv> a() {
      return a;
   }

   public dbv(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(b, die.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgw $$0) {
      return $$0.c(b) != die.c;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      die $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ejy.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ht $$1 = $$0.a();
      dgw $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, die.c).a(c, Boolean.valueOf(false));
      } else {
         ecg $$3 = $$0.q().b_($$1);
         dgw $$4 = this.o().a(b, die.b).a(c, Boolean.valueOf($$3.a() == ech.c));
         hx $$5 = $$0.k();
         return $$5 != hx.a && ($$5 == hx.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, die.a);
      }
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      clb $$2 = $$1.n();
      die $$3 = $$0.c(b);
      if ($$3 == die.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hx $$5 = $$1.k();
         return $$3 == die.b ? $$5 == hx.b || $$4 && $$5.o().d() : $$5 == hx.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      return $$2.c(b) != die.c ? dbt.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return $$3.c(b) != die.c ? dbt.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(arh.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
