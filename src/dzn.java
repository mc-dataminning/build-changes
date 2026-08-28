import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dzn extends dvx {
   public static final MapCodec<dzn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akz.d(dfa.b)).apply($$0, $$0.stable(dzn::new)));
   private static final int h = 2;
   private static final List<dua> i = StreamSupport.stream(lu.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azc.f(azc.c((float)i.size()));
   private static final int k = azc.f((float)i.size() / (float)j);
   protected static final dua d = dgx.a.o();
   protected static final dua e = dgx.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dzn(jn.c<det> $$0) {
      super(new dfe($$0));
   }

   @Override
   protected MapCodec<? extends dvx> b() {
      return c;
   }

   @Override
   public void a(arn $$0, den $$1, eak $$2, dvw $$3) {
   }

   @Override
   public void a(dep $$0, dvw $$1, den $$2) {
      je.a $$3 = new je.a();
      dcy $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kg.a($$5, $$7);
            int $$10 = kg.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dua $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dvw> a(eay $$0, eak $$1, den $$2, dvw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, dzw.a $$2, ddu $$3, eak $$4) {
      return 0;
   }

   @Override
   public dee a(int $$0, int $$1, ddu $$2, eak $$3) {
      return new dee(0, new dua[0]);
   }

   @Override
   public void a(List<String> $$0, eak $$1, je $$2) {
   }

   public static dua a(int $$0, int $$1) {
      dua $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azc.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arn $$0, long $$1, eak $$2, dev $$3, den $$4, dvw $$5) {
   }

   @Override
   public void a(arn $$0) {
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
