import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhu extends deu {
   public static final MapCodec<dhu> a = b(dhu::new);
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ja> c = ja.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ja::i).toList();

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   protected dhu(dsk.d $$0) {
      super($$0);
   }

   public static boolean a(dcg $$0, ja $$1, ja $$2) {
      return $$0.a_($$1.a((ke)$$2)).a(avw.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avw.cw);
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
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
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dql($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? a($$2, dps.m, dql::a) : null;
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqh.c;
      }
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      dpq $$3 = $$1.c_($$2);
      if ($$3 instanceof dql) {
         wu $$4 = ((bqm)$$3).O_();
         return new bqr(($$2x, $$3x, $$4x) -> new cqd($$2x, $$3x, cpu.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
