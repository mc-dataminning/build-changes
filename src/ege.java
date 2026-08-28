import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ege extends ecm {
   public static final MapCodec<ege> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.d(dkr.b)).apply($$0, $$0.stable(ege::new)));
   private static final int h = 2;
   private static final List<eao> i = StreamSupport.stream(mg.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azm.f(azm.c((float)i.size()));
   private static final int k = azm.f((float)i.size() / (float)j);
   protected static final eao d = dmo.a.m();
   protected static final eao e = dmo.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public ege(jf.c<dkk> $$0) {
      super(new dkv($$0));
   }

   @Override
   protected MapCodec<? extends ecm> b() {
      return c;
   }

   @Override
   public void a(ary $$0, dkd $$1, ehb $$2, ecl $$3) {
   }

   @Override
   public void a(dkg $$0, ecl $$1, dkd $$2) {
      iv.a $$3 = new iv.a();
      dio $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jy.a($$5, $$7);
            int $$10 = jy.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            eao $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ecl> a(ehp $$0, ehb $$1, dkd $$2, ecl $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, egn.a $$2, djj $$3, ehb $$4) {
      return 0;
   }

   @Override
   public djt a(int $$0, int $$1, djj $$2, ehb $$3) {
      return new djt(0, new eao[0]);
   }

   @Override
   public void a(List<String> $$0, ehb $$1, iv $$2) {
   }

   public static eao a(int $$0, int $$1) {
      eao $$2 = d;
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
   public void a(ary $$0, long $$1, ehb $$2, dkm $$3, dkd $$4, ecl $$5) {
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
