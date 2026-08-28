import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dum extends dmo implements dun {
   public static final ebv d = ebu.I;
   private static final fgk a = dnc.b(8.0, 0.0, 16.0);
   private final ecs b;

   protected dum(ecs $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dum> a();

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   public boolean a(ebe $$0) {
      return true;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzq($$0, $$1);
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dzq $$7) {
         dba $$10 = $$0.h() instanceof dba $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awz.c.b($$0.h()));
                  $$2.a(ege.c, $$7.aB_(), ege.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bur.a;
               } else {
                  return bur.f;
               }
            } else {
               return bur.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bur.c : bur.a;
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.c_($$2) instanceof dzq $$5) {
         if ($$1.C) {
            ag.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aB_(), $$5.d(), awq.e);
            return bur.b;
         } else if ($$8) {
            return bur.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bur.b;
         } else {
            return bur.e;
         }
      } else {
         return bur.e;
      }
   }

   private boolean b(crx $$0, dzq $$1, boolean $$2) {
      dzr $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(wz.a) || $$0x.b() instanceof yh);
   }

   public abstract float h(ebe var1);

   public ffq o(ebe $$0) {
      return new ffq(0.5, 0.5, 0.5);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   public ecs d() {
      return this.b;
   }

   public static ecs a(dnc $$0) {
      ecs $$1;
      if ($$0 instanceof dum) {
         $$1 = ((dum)$$0).d();
      } else {
         $$1 = ecs.b;
      }

      return $$1;
   }

   public void a(crx $$0, dzq $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(crx $$0, dzq $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.h, dzq::a);
   }
}
