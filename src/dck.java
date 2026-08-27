import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dck extends dcq {
   public static final MapCodec<dck> a = b(dck::new);
   public static final drb b = dqx.P;
   public static final dqy c = dqx.u;

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   public dck(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dnf) {
            $$3.a((dnf)$$5);
            $$3.a(avm.ar);
            cjy.a($$3, true);
         }

         return bpm.b;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      dnm $$4 = $$1.c_($$2);
      if ($$4 instanceof dnf) {
         ((dnf)$$4).l();
      }
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnf($$0, $$1);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
