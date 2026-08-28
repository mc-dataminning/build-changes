import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class egj extends ecr {
   public static final MapCodec<egj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.d(dkw.b)).apply($$0, $$0.stable(egj::new)));
   private static final int h = 2;
   private static final List<eat> i = StreamSupport.stream(mg.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azm.f(azm.c((float)i.size()));
   private static final int k = azm.f((float)i.size() / (float)j);
   protected static final eat d = dmt.a.m();
   protected static final eat e = dmt.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public egj(jf.c<dkp> $$0) {
      super(new dla($$0));
   }

   @Override
   protected MapCodec<? extends ecr> b() {
      return c;
   }

   @Override
   public void a(ary $$0, dki $$1, ehg $$2, ecq $$3) {
   }

   @Override
   public void a(dkl $$0, ecq $$1, dki $$2) {
      iv.a $$3 = new iv.a();
      dir $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jy.a($$5, $$7);
            int $$10 = jy.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            eat $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ecq> a(ehu $$0, ehg $$1, dki $$2, ecq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, egs.a $$2, djo $$3, ehg $$4) {
      return 0;
   }

   @Override
   public djy a(int $$0, int $$1, djo $$2, ehg $$3) {
      return new djy(0, new eat[0]);
   }

   @Override
   public void a(List<String> $$0, ehg $$1, iv $$2) {
   }

   public static eat a(int $$0, int $$1) {
      eat $$2 = d;
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
   public void a(ary $$0, long $$1, ehg $$2, dkr $$3, dki $$4, ecq $$5) {
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
