import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dke extends dcq implements dkf {
   public static final dqy f = dqx.C;
   protected static final float g = 4.0F;
   protected static final eui h = dde.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dru a;

   protected dke(dru $$0, dqg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dke> a();

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return h;
   }

   @Override
   public boolean a(dqh $$0) {
      return true;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dow($$0, $$1);
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof dow $$7) {
         ctz $$10 = $$0.f() instanceof ctz $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gm();
         if (!$$2.B) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avm.c.b($$0.f()));
                  $$2.a(dva.c, $$7.az_(), dva.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bpo.a;
               } else {
                  return bpo.d;
               }
            } else {
               return bpo.d;
            }
         } else {
            return !$$11 && !$$7.u() ? bpo.b : bpo.a;
         }
      } else {
         return bpo.e;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.c_($$2) instanceof dow $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.az_(), $$5.d(), avd.e);
            return bpm.a;
         } else if ($$8) {
            return bpm.a;
         } else if (!this.a($$3, $$5) && $$3.gm() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bpm.a;
         } else {
            return bpm.d;
         }
      } else {
         return bpm.d;
      }
   }

   private boolean b(clh $$0, dow $$1, boolean $$2) {
      dox $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wt.a) || $$0x.b() instanceof yb);
   }

   public abstract float g(dqh var1);

   public etp m(dqh $$0) {
      return new etp(0.5, 0.5, 0.5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(f) ? emb.c.a(false) : super.b_($$0);
   }

   public dru d() {
      return this.a;
   }

   public static dru a(dde $$0) {
      dru $$1;
      if ($$0 instanceof dke) {
         $$1 = ((dke)$$0).d();
      } else {
         $$1 = dru.b;
      }

      return $$1;
   }

   public void a(clh $$0, dow $$1, boolean $$2) {
      $$1.a($$0.cx());
      $$0.a($$1, $$2);
   }

   private boolean a(clh $$0, dow $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cx());
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.h, dow::a);
   }
}
