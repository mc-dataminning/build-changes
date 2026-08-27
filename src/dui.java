import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dui extends dqw {
   public static final Codec<dui> c = RecordCodecBuilder.create($$0 -> $$0.group(ajr.d(dad.b)).apply($$0, $$0.stable(dui::new)));
   private static final int h = 2;
   private static final List<doz> i = StreamSupport.stream(kr.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = axk.f(axk.c((float)i.size()));
   private static final int k = axk.f((float)i.size() / (float)j);
   protected static final doz d = dca.a.n();
   protected static final doz e = dca.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dui(il.c<czw> $$0) {
      super(new dah($$0));
   }

   @Override
   protected Codec<? extends dqw> a() {
      return c;
   }

   @Override
   public void a(apz $$0, czq $$1, dvf $$2, dqv $$3) {
   }

   @Override
   public void a(czs $$0, dqv $$1, czq $$2) {
      ib.a $$3 = new ib.a();
      cye $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = je.a($$5, $$7);
            int $$10 = je.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            doz $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dqv> a(Executor $$0, dvt $$1, dvf $$2, czq $$3, dqv $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dur.a $$2, cyz $$3, dvf $$4) {
      return 0;
   }

   @Override
   public czj a(int $$0, int $$1, cyz $$2, dvf $$3) {
      return new czj(0, new doz[0]);
   }

   @Override
   public void a(List<String> $$0, dvf $$1, ib $$2) {
   }

   public static doz a(int $$0, int $$1) {
      doz $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = axk.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(apz $$0, long $$1, dvf $$2, czy $$3, czq $$4, dqv $$5, dun.a $$6) {
   }

   @Override
   public void a(apz $$0) {
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
