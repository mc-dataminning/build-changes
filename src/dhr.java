import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhr extends der {
   public static final MapCodec<dhr> a = b(dhr::new);
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ja> c = ja.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ja::i).toList();

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(dsg.d $$0) {
      super($$0);
   }

   public static boolean a(dcd $$0, ja $$1, ja $$2) {
      return $$0.a_($$1.a((ke)$$2)).a(avu.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avu.cw);
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ja $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lj.s,
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
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? a($$2, dpp.m, dqh::a) : null;
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqd.c;
      }
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      dpn $$3 = $$1.c_($$2);
      if ($$3 instanceof dqh) {
         wu $$4 = ((bqi)$$3).O_();
         return new bqn(($$2x, $$3x, $$4x) -> new cpz($$2x, $$3x, cpq.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
