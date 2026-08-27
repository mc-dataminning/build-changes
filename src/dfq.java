import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfq extends dcq {
   public static final MapCodec<dfq> a = b(dfq::new);
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<in> c = in.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(in::i).toList();

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   protected dfq(dqg.d $$0) {
      super($$0);
   }

   public static boolean a(dad $$0, in $$1, in $$2) {
      return $$0.a_($$1.a((jr)$$2)).a(avr.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avr.cw);
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (in $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kx.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dog($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? a($$2, dno.m, dog::a) : null;
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bpm.b;
      }
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      dnm $$3 = $$1.c_($$2);
      if ($$3 instanceof dog) {
         wu $$4 = ((bpr)$$3).O_();
         return new bpw(($$2x, $$3x, $$4x) -> new coy($$2x, $$3x, cop.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
