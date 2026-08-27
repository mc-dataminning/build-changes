import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ddo extends cwb implements ddp {
   public static final djx f = djw.C;
   protected static final float g = 4.0F;
   protected static final eml h = cwp.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dkt a;

   protected ddo(dkt $$0, djf.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddo> a();

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return h;
   }

   @Override
   public boolean a(djg $$0) {
      return true;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new did($$0, $$1);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      cms $$7 = $$6.d();
      cnw $$9 = $$6.d() instanceof cnw $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof did $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            die $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.aB_(), $$11.f(), ars.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dnq.c, $$11.aB_(), dnq.a.a($$3, $$11.r()));
               $$3.b(asb.c.b($$7));
               return bka.a;
            } else if ($$14) {
               return bka.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bka.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bka.b : bka.a;
         }
      } else {
         return bka.d;
      }
   }

   private bka a(boolean $$0) {
      return $$0 ? bka.d : bka.a;
   }

   private boolean b(cfh $$0, did $$1, boolean $$2) {
      die $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(ve.a) || $$0x.b() instanceof wm);
   }

   public abstract float g(djg var1);

   public els h(djg $$0) {
      return new els(0.5, 0.5, 0.5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(f) ? eer.c.a(false) : super.c_($$0);
   }

   public dkt d() {
      return this.a;
   }

   public static dkt a(cwp $$0) {
      dkt $$1;
      if ($$0 instanceof ddo) {
         $$1 = ((ddo)$$0).d();
      } else {
         $$1 = dkt.b;
      }

      return $$1;
   }

   public void a(cfh $$0, did $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cfh $$0, did $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.h, did::a);
   }
}
