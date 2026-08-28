import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmg extends dmr implements duc {
   public static final ebk a = ebj.I;
   private static final ffw b = dmr.b(16.0, 0.0, 2.0);
   private static final ffw c = dmr.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(djm $$0, iv $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(eat $$0) {
      return $$0.a(axc.P) && $$0.b() instanceof dmg;
   }

   protected dmg(boolean $$0, eas.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmg> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected eat a(eat $$0, djm $$1, iv $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         ebx $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iv $$0, djm $$1, ebx $$2) {
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

   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3) {
   }

   protected eat a(djm $$0, iv $$1, eat $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         ebx $$4 = $$2.c(this.c());
         return new dsy($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
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
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exb.c;
      eat $$3 = super.m();
      jb $$4 = $$0.g();
      boolean $$5 = $$4 == jb.f || $$4 == jb.e;
      return $$3.b(this.c(), $$5 ? ebx.b : ebx.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ebw<ebx> c();

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(a) ? exb.c.a(false) : super.b_($$0);
   }
}
