import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ech extends dyr {
   public static final MapCodec<ech> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aks.d(dhp.b)).apply($$0, $$0.stable(ech::new)));
   private static final int h = 2;
   private static final List<dwv> i = StreamSupport.stream(mb.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayy.f(ayy.c((float)i.size()));
   private static final int k = ayy.f((float)i.size() / (float)j);
   protected static final dwv d = djm.a.m();
   protected static final dwv e = djm.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public ech(jr.c<dhi> $$0) {
      super(new dht($$0));
   }

   @Override
   protected MapCodec<? extends dyr> b() {
      return c;
   }

   @Override
   public void a(ark $$0, dhc $$1, ede $$2, dyq $$3) {
   }

   @Override
   public void a(dhe $$0, dyq $$1, dhc $$2) {
      ji.a $$3 = new ji.a();
      dfm $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kk.a($$5, $$7);
            int $$10 = kk.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dwv $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dyq> a(eds $$0, ede $$1, dhc $$2, dyq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ecq.a $$2, dgi $$3, ede $$4) {
      return 0;
   }

   @Override
   public dgs a(int $$0, int $$1, dgi $$2, ede $$3) {
      return new dgs(0, new dwv[0]);
   }

   @Override
   public void a(List<String> $$0, ede $$1, ji $$2) {
   }

   public static dwv a(int $$0, int $$1) {
      dwv $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayy.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ark $$0, long $$1, ede $$2, dhk $$3, dhc $$4, dyq $$5) {
   }

   @Override
   public void a(ark $$0) {
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
