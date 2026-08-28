import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgy extends dhj implements dol {
   protected static final ezm a = dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dvf c = dve.C;
   private final boolean d;

   public static boolean a(deg $$0, je $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(duo $$0) {
      return $$0.a(awt.O) && $$0.b() instanceof dgy;
   }

   protected dgy(boolean $$0, dun.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgy> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      dvs $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected duo a(duo $$0, deg $$1, je $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dvs $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(je $$0, deg $$1, dvs $$2) {
      if (!c($$1, $$0.e())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.i());
            case d:
               return !c($$1, $$0.h());
            case e:
               return !c($$1, $$0.f());
            case f:
               return !c($$1, $$0.g());
            default:
               return false;
         }
      }
   }

   protected void a(duo $$0, deg $$1, je $$2, dhj $$3) {
   }

   protected duo a(deg $$0, je $$1, duo $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dvs $$4 = $$2.c(this.c());
         return new dnk($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
         }
      }
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqq.c;
      duo $$3 = super.o();
      jj $$4 = $$0.g();
      boolean $$5 = $$4 == jj.f || $$4 == jj.e;
      return $$3.b(this.c(), $$5 ? dvs.b : dvs.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dvr<dvs> c();

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }
}
