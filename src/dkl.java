import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dkl extends dhi {
   public static final Codec<dkl> c = RecordCodecBuilder.create($$0 -> $$0.group(aew.d(crc.b)).apply($$0, $$0.stable(dkl::new)));
   private static final int h = 2;
   private static final List<dfl> i = StreamSupport.stream(jd.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ary.f(ary.c((float)i.size()));
   private static final int k = ary.f((float)i.size() / (float)j);
   protected static final dfl d = csy.a.n();
   protected static final dfl e = csy.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dkl(hg.c<cqv> $$0) {
      super(new crg($$0));
   }

   @Override
   protected Codec<? extends dhi> a() {
      return c;
   }

   @Override
   public void a(akz $$0, cqp $$1, dli $$2, dhh $$3) {
   }

   @Override
   public void a(cqr $$0, dhh $$1, cqp $$2) {
      gw.a $$3 = new gw.a();
      cpe $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hz.a($$5, $$7);
            int $$10 = hz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dfl $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dhh> a(Executor $$0, dlw $$1, dli $$2, cqp $$3, dhh $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dku.a $$2, cpz $$3, dli $$4) {
      return 0;
   }

   @Override
   public cqj a(int $$0, int $$1, cpz $$2, dli $$3) {
      return new cqj(0, new dfl[0]);
   }

   @Override
   public void a(List<String> $$0, dli $$1, gw $$2) {
   }

   public static dfl a(int $$0, int $$1) {
      dfl $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ary.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(akz $$0, long $$1, dli $$2, cqx $$3, cqp $$4, dhh $$5, dkq.a $$6) {
   }

   @Override
   public void a(akz $$0) {
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
