import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class egu extends edc {
   public static final MapCodec<egu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.d(dlh.b)).apply($$0, $$0.stable(egu::new)));
   private static final int h = 2;
   private static final List<ebe> i = StreamSupport.stream(mg.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azo.f(azo.c((float)i.size()));
   private static final int k = azo.f((float)i.size() / (float)j);
   protected static final ebe d = dne.a.m();
   protected static final ebe e = dne.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public egu(jf.c<dla> $$0) {
      super(new dll($$0));
   }

   @Override
   protected MapCodec<? extends edc> b() {
      return c;
   }

   @Override
   public void a(asa $$0, dkt $$1, ehr $$2, edb $$3) {
   }

   @Override
   public void a(dkw $$0, edb $$1, dkt $$2) {
      iv.a $$3 = new iv.a();
      djc $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jy.a($$5, $$7);
            int $$10 = jy.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            ebe $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<edb> a(eif $$0, ehr $$1, dkt $$2, edb $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ehd.a $$2, djz $$3, ehr $$4) {
      return 0;
   }

   @Override
   public dkj a(int $$0, int $$1, djz $$2, ehr $$3) {
      return new dkj(0, new ebe[0]);
   }

   @Override
   public void a(List<String> $$0, ehr $$1, iv $$2) {
   }

   public static ebe a(int $$0, int $$1) {
      ebe $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azo.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(asa $$0, long $$1, ehr $$2, dlc $$3, dkt $$4, edb $$5) {
   }

   @Override
   public void a(asa $$0) {
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
