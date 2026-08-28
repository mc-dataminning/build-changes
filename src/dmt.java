import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmt extends dne implements dup {
   public static final ebx a = ebw.I;
   private static final fgm b = dne.b(16.0, 0.0, 2.0);
   private static final fgm c = dne.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(djz $$0, iw $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(ebg $$0) {
      return $$0.a(axg.P) && $$0.b() instanceof dmt;
   }

   protected dmt(boolean $$0, ebf.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmt> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected ebg a(ebg $$0, djz $$1, iw $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         eck $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iw $$0, djz $$1, eck $$2) {
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

   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3) {
   }

   protected ebg a(djz $$0, iw $$1, ebg $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         eck $$4 = $$2.c(this.c());
         return new dtl($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
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
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exr.c;
      ebg $$3 = super.m();
      jc $$4 = $$0.g();
      boolean $$5 = $$4 == jc.f || $$4 == jc.e;
      return $$3.b(this.c(), $$5 ? eck.b : eck.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ecj<eck> c();

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(a) ? exr.c.a(false) : super.b_($$0);
   }
}
