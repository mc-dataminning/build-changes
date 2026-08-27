import com.mojang.serialization.MapCodec;

public abstract class ctp extends cua implements daz {
   protected static final eiy a = cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dgs c = dgr.C;
   private final boolean d;

   public static boolean a(cqz $$0, ht $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dgb $$0) {
      return $$0.a(aqs.N) && $$0.b() instanceof ctp;
   }

   protected ctp(boolean $$0, dga.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ctp> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      dhf $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dgb a(dgb $$0, cqz $$1, ht $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dhf $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ht $$0, cqz $$1, dhf $$2) {
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

   protected void a(dgb $$0, cqz $$1, ht $$2, cua $$3) {
   }

   protected dgb a(cqz $$0, ht $$1, dgb $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dhf $$4 = $$2.c(this.c());
         return new czy($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
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
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ebf.c;
      dgb $$3 = super.o();
      hx $$4 = $$0.g();
      boolean $$5 = $$4 == hx.f || $$4 == hx.e;
      return $$3.a(this.c(), $$5 ? dhf.b : dhf.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dhe<dhf> c();

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }
}
