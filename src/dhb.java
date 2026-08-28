import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhb extends dhm implements doo {
   protected static final ezq a = dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dvj c = dvi.C;
   private final boolean d;

   public static boolean a(dej $$0, jf $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dus $$0) {
      return $$0.a(awv.O) && $$0.b() instanceof dhb;
   }

   protected dhb(boolean $$0, dur.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dhb> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      dvw $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dus a(dus $$0, dej $$1, jf $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dvw $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jf $$0, dej $$1, dvw $$2) {
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

   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3) {
   }

   protected dus a(dej $$0, jf $$1, dus $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dvw $$4 = $$2.c(this.c());
         return new dnn($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
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
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == equ.c;
      dus $$3 = super.n();
      jk $$4 = $$0.g();
      boolean $$5 = $$4 == jk.f || $$4 == jk.e;
      return $$3.b(this.c(), $$5 ? dvw.b : dvw.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dvv<dvw> c();

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }
}
