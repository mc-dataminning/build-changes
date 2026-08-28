import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnd extends dno implements duz {
   public static final ech a = ecg.I;
   private static final fgw b = dno.b(16.0, 0.0, 2.0);
   private static final fgw c = dno.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dkj $$0, iw $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(ebq $$0) {
      return $$0.a(axn.P) && $$0.b() instanceof dnd;
   }

   protected dnd(boolean $$0, ebp.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dnd> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected ebq a(ebq $$0, dkj $$1, iw $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         ecu $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iw $$0, dkj $$1, ecu $$2) {
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

   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3) {
   }

   protected ebq a(dkj $$0, iw $$1, ebq $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         ecu $$4 = $$2.c(this.c());
         return new dtv($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
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
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eyb.c;
      ebq $$3 = super.m();
      jc $$4 = $$0.g();
      boolean $$5 = $$4 == jc.f || $$4 == jc.e;
      return $$3.b(this.c(), $$5 ? ecu.b : ecu.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ect<ecu> c();

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(a) ? eyb.c.a(false) : super.b_($$0);
   }
}
