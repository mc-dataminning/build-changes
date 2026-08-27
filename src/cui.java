import com.mojang.serialization.MapCodec;

public abstract class cui extends cut implements dbt {
   protected static final ekb a = cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dhn c = dhm.C;
   private final boolean d;

   public static boolean a(crs $$0, ht $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dgw $$0) {
      return $$0.a(arc.N) && $$0.b() instanceof cui;
   }

   protected cui(boolean $$0, dgv.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cui> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      dia $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dgw a(dgw $$0, crs $$1, ht $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dia $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ht $$0, crs $$1, dia $$2) {
      if (!c($$1, $$0.d())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.h());
            case d:
               return !c($$1, $$0.g());
            case e:
               return !c($$1, $$0.e());
            case f:
               return !c($$1, $$0.f());
            default:
               return false;
         }
      }
   }

   protected void a(dgw $$0, crs $$1, ht $$2, cut $$3) {
   }

   protected dgw a(crs $$0, ht $$1, dgw $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dia $$4 = $$2.c(this.c());
         return new das($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.c(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ech.c;
      dgw $$3 = super.o();
      hx $$4 = $$0.g();
      boolean $$5 = $$4 == hx.f || $$4 == hx.e;
      return $$3.a(this.c(), $$5 ? dia.b : dia.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dhz<dia> c();

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }
}
