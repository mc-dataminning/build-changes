import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eab extends dwl {
   public static final MapCodec<eab> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ala.d(dfo.b)).apply($$0, $$0.stable(eab::new)));
   private static final int h = 2;
   private static final List<duo> i = StreamSupport.stream(lu.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = azd.f(azd.c((float)i.size()));
   private static final int k = azd.f((float)i.size() / (float)j);
   protected static final duo d = dhl.a.o();
   protected static final duo e = dhl.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public eab(jn.c<dfh> $$0) {
      super(new dfs($$0));
   }

   @Override
   protected MapCodec<? extends dwl> b() {
      return c;
   }

   @Override
   public void a(aro $$0, dfb $$1, eay $$2, dwk $$3) {
   }

   @Override
   public void a(dfd $$0, dwk $$1, dfb $$2) {
      je.a $$3 = new je.a();
      ddm $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kg.a($$5, $$7);
            int $$10 = kg.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            duo $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dwk> a(ebm $$0, eay $$1, dfb $$2, dwk $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eak.a $$2, dei $$3, eay $$4) {
      return 0;
   }

   @Override
   public des a(int $$0, int $$1, dei $$2, eay $$3) {
      return new des(0, new duo[0]);
   }

   @Override
   public void a(List<String> $$0, eay $$1, je $$2) {
   }

   public static duo a(int $$0, int $$1) {
      duo $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azd.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aro $$0, long $$1, eay $$2, dfj $$3, dfb $$4, dwk $$5) {
   }

   @Override
   public void a(aro $$0) {
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
