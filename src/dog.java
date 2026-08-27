import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dog extends dld {
   public static final Codec<dog> c = RecordCodecBuilder.create($$0 -> $$0.group(ahe.d(cuu.b)).apply($$0, $$0.stable(dog::new)));
   private static final int h = 2;
   private static final List<djg> i = StreamSupport.stream(kd.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aun.f(aun.c((float)i.size()));
   private static final int k = aun.f((float)i.size() / (float)j);
   protected static final djg d = cwr.a.o();
   protected static final djg e = cwr.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dog(ih.c<cun> $$0) {
      super(new cuy($$0));
   }

   @Override
   protected Codec<? extends dld> a() {
      return c;
   }

   @Override
   public void a(ank $$0, cuh $$1, dpd $$2, dlc $$3) {
   }

   @Override
   public void a(cuj $$0, dlc $$1, cuh $$2) {
      hx.a $$3 = new hx.a();
      csv $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iz.a($$5, $$7);
            int $$10 = iz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            djg $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dlc> a(Executor $$0, dpr $$1, dpd $$2, cuh $$3, dlc $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dop.a $$2, ctq $$3, dpd $$4) {
      return 0;
   }

   @Override
   public cua a(int $$0, int $$1, ctq $$2, dpd $$3) {
      return new cua(0, new djg[0]);
   }

   @Override
   public void a(List<String> $$0, dpd $$1, hx $$2) {
   }

   public static djg a(int $$0, int $$1) {
      djg $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aun.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ank $$0, long $$1, dpd $$2, cup $$3, cuh $$4, dlc $$5, dol.a $$6) {
   }

   @Override
   public void a(ank $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return 63;
   }
}
