import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgk extends dgv implements dnx {
   protected static final eyx a = dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eyx b = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dur c = duq.C;
   private final boolean d;

   public static boolean a(dds $$0, je $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dua $$0) {
      return $$0.a(aws.O) && $$0.b() instanceof dgk;
   }

   protected dgk(boolean $$0, dtz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgk> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      dve $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dua a(dua $$0, dds $$1, je $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dve $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(je $$0, dds $$1, dve $$2) {
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

   protected void a(dua $$0, dds $$1, je $$2, dgv $$3) {
   }

   protected dua a(dds $$0, je $$1, dua $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dve $$4 = $$2.c(this.c());
         return new dmw($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
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
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqc.c;
      dua $$3 = super.o();
      jj $$4 = $$0.g();
      boolean $$5 = $$4 == jj.f || $$4 == jj.e;
      return $$3.b(this.c(), $$5 ? dve.b : dve.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dvd<dve> c();

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }
}
