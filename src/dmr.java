import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmr extends dnc implements dun {
   public static final ebv a = ebu.I;
   private static final fgk b = dnc.b(16.0, 0.0, 2.0);
   private static final fgk c = dnc.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(djx $$0, iv $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(ebe $$0) {
      return $$0.a(axe.P) && $$0.b() instanceof dmr;
   }

   protected dmr(boolean $$0, ebd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmr> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected ebe a(ebe $$0, djx $$1, iv $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         eci $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iv $$0, djx $$1, eci $$2) {
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

   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3) {
   }

   protected ebe a(djx $$0, iv $$1, ebe $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         eci $$4 = $$2.c(this.c());
         return new dtj($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3) {
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
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exp.c;
      ebe $$3 = super.m();
      jb $$4 = $$0.g();
      boolean $$5 = $$4 == jb.f || $$4 == jb.e;
      return $$3.b(this.c(), $$5 ? eci.b : eci.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ech<eci> c();

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(a) ? exp.c.a(false) : super.b_($$0);
   }
}
