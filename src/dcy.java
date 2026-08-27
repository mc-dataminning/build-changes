import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dcy extends cvl implements dcz {
   public static final djg f = djf.C;
   protected static final float g = 4.0F;
   protected static final elu h = cvz.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dkc a;

   protected dcy(dkc $$0, dio.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dcy> a();

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return h;
   }

   @Override
   public boolean a(dip $$0) {
      return true;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhm($$0, $$1);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      cmc $$7 = $$6.d();
      cng $$9 = $$6.d() instanceof cng $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof dhm $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dhn $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.aB_(), $$11.f(), ard.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dmz.c, $$11.aB_(), dmz.a.a($$3, $$11.r()));
               $$3.b(arm.c.b($$7));
               return bjl.a;
            } else if ($$14) {
               return bjl.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bjl.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bjl.b : bjl.a;
         }
      } else {
         return bjl.d;
      }
   }

   private bjl a(boolean $$0) {
      return $$0 ? bjl.d : bjl.a;
   }

   private boolean b(cer $$0, dhm $$1, boolean $$2) {
      dhn $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(va.a) || $$0x.b() instanceof wi);
   }

   public abstract float g(dip var1);

   public elb h(dip $$0) {
      return new elb(0.5, 0.5, 0.5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(f) ? eea.c.a(false) : super.c_($$0);
   }

   public dkc d() {
      return this.a;
   }

   public static dkc a(cvz $$0) {
      dkc $$1;
      if ($$0 instanceof dcy) {
         $$1 = ((dcy)$$0).d();
      } else {
         $$1 = dkc.b;
      }

      return $$1;
   }

   public void a(cer $$0, dhm $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cer $$0, dhm $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.h, dhm::a);
   }
}
