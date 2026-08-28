import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djt extends dke implements dri {
   protected static final fcm a = dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dye c = dyd.D;
   private final boolean d;

   public static boolean a(dha $$0, jh $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dxn $$0) {
      return $$0.a(axu.P) && $$0.b() instanceof djt;
   }

   protected djt(boolean $$0, dxm.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djt> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      dyq $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dxn a(dxn $$0, dha $$1, jh $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dyq $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jh $$0, dha $$1, dyq $$2) {
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

   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3) {
   }

   protected dxn a(dha $$0, jh $$1, dxn $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dyq $$4 = $$2.c(this.c());
         return new dqh($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
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
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etq.c;
      dxn $$3 = super.m();
      jm $$4 = $$0.g();
      boolean $$5 = $$4 == jm.f || $$4 == jm.e;
      return $$3.b(this.c(), $$5 ? dyq.b : dyq.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dyp<dyq> c();

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }
}
