import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djk implements dqq {
   protected static final fbs a = djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dxm c = dxl.J;
   private final boolean d;

   public static boolean a(dgg $$0, ji $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dwv $$0) {
      return $$0.a(awo.P) && $$0.b() instanceof diz;
   }

   protected diz(boolean $$0, dwu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      dxy $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dwv a(dwv $$0, dgg $$1, ji $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dxy $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ji $$0, dgg $$1, dxy $$2) {
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

   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3) {
   }

   protected dwv a(dgg $$0, ji $$1, dwv $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dxy $$4 = $$2.c(this.c());
         return new dpp($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
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
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esy.c;
      dwv $$3 = super.m();
      jn $$4 = $$0.g();
      boolean $$5 = $$4 == jn.f || $$4 == jn.e;
      return $$3.b(this.c(), $$5 ? dxy.b : dxy.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dxx<dxy> c();

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }
}
