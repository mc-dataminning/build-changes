import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class efx extends ecf {
   public static final MapCodec<efx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.d(dkk.b)).apply($$0, $$0.stable(efx::new)));
   private static final int h = 2;
   private static final List<eah> i = StreamSupport.stream(mf.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azm.f(azm.c((float)i.size()));
   private static final int k = azm.f((float)i.size() / (float)j);
   protected static final eah d = dmh.a.m();
   protected static final eah e = dmh.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public efx(je.c<dkd> $$0) {
      super(new dko($$0));
   }

   @Override
   protected MapCodec<? extends ecf> b() {
      return c;
   }

   @Override
   public void a(ary $$0, djw $$1, egu $$2, ece $$3) {
   }

   @Override
   public void a(djz $$0, ece $$1, djw $$2) {
      iu.a $$3 = new iu.a();
      dih $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jx.a($$5, $$7);
            int $$10 = jx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            eah $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ece> a(ehi $$0, egu $$1, djw $$2, ece $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, egg.a $$2, djc $$3, egu $$4) {
      return 0;
   }

   @Override
   public djm a(int $$0, int $$1, djc $$2, egu $$3) {
      return new djm(0, new eah[0]);
   }

   @Override
   public void a(List<String> $$0, egu $$1, iu $$2) {
   }

   public static eah a(int $$0, int $$1) {
      eah $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azm.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ary $$0, long $$1, egu $$2, dkf $$3, djw $$4, ece $$5) {
   }

   @Override
   public void a(ary $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return 63;
   }
}
