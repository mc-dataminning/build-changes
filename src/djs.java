import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djs extends dkd implements drj {
   protected static final fcl a = dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dyf c = dye.J;
   private final boolean d;

   public static boolean a(dgz $$0, jh $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dxo $$0) {
      return $$0.a(axk.P) && $$0.b() instanceof djs;
   }

   protected djs(boolean $$0, dxn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djs> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      dyr $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dxo a(dxo $$0, dgz $$1, jh $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dyr $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jh $$0, dgz $$1, dyr $$2) {
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

   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3) {
   }

   protected dxo a(dgz $$0, jh $$1, dxo $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dyr $$4 = $$2.c(this.c());
         return new dqi($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
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
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etr.c;
      dxo $$3 = super.m();
      jm $$4 = $$0.g();
      boolean $$5 = $$4 == jm.f || $$4 == jm.e;
      return $$3.b(this.c(), $$5 ? dyr.b : dyr.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dyq<dyr> c();

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }
}
