import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dvq extends dse {
   public static final Codec<dvq> c = RecordCodecBuilder.create($$0 -> $$0.group(akf.d(dbj.b)).apply($$0, $$0.stable(dvq::new)));
   private static final int h = 2;
   private static final List<dqh> i = StreamSupport.stream(ld.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = axz.f(axz.c((float)i.size()));
   private static final int k = axz.f((float)i.size() / (float)j);
   protected static final dqh d = ddg.a.n();
   protected static final dqh e = ddg.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dvq(iw.c<dbc> $$0) {
      super(new dbn($$0));
   }

   @Override
   protected Codec<? extends dse> a() {
      return c;
   }

   @Override
   public void a(aqo $$0, daw $$1, dwn $$2, dsd $$3) {
   }

   @Override
   public void a(day $$0, dsd $$1, daw $$2) {
      in.a $$3 = new in.a();
      czk $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jp.a($$5, $$7);
            int $$10 = jp.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dqh $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dsd> a(Executor $$0, dxb $$1, dwn $$2, daw $$3, dsd $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dvz.a $$2, daf $$3, dwn $$4) {
      return 0;
   }

   @Override
   public dap a(int $$0, int $$1, daf $$2, dwn $$3) {
      return new dap(0, new dqh[0]);
   }

   @Override
   public void a(List<String> $$0, dwn $$1, in $$2) {
   }

   public static dqh a(int $$0, int $$1) {
      dqh $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = axz.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqo $$0, long $$1, dwn $$2, dbe $$3, daw $$4, dsd $$5, dvv.a $$6) {
   }

   @Override
   public void a(aqo $$0) {
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
