import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dqf extends dnc {
   public static final Codec<dqf> c = RecordCodecBuilder.create($$0 -> $$0.group(aiw.d(cwt.b)).apply($$0, $$0.stable(dqf::new)));
   private static final int h = 2;
   private static final List<dlf> i = StreamSupport.stream(kf.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = awh.f(awh.c((float)i.size()));
   private static final int k = awh.f((float)i.size() / (float)j);
   protected static final dlf d = cyq.a.o();
   protected static final dlf e = cyq.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dqf(ij.c<cwm> $$0) {
      super(new cwx($$0));
   }

   @Override
   protected Codec<? extends dnc> a() {
      return c;
   }

   @Override
   public void a(apc $$0, cwg $$1, drc $$2, dnb $$3) {
   }

   @Override
   public void a(cwi $$0, dnb $$1, cwg $$2) {
      hz.a $$3 = new hz.a();
      cuu $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jb.a($$5, $$7);
            int $$10 = jb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dlf $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dnb> a(Executor $$0, drq $$1, drc $$2, cwg $$3, dnb $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dqo.a $$2, cvp $$3, drc $$4) {
      return 0;
   }

   @Override
   public cvz a(int $$0, int $$1, cvp $$2, drc $$3) {
      return new cvz(0, new dlf[0]);
   }

   @Override
   public void a(List<String> $$0, drc $$1, hz $$2) {
   }

   public static dlf a(int $$0, int $$1) {
      dlf $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = awh.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(apc $$0, long $$1, drc $$2, cwo $$3, cwg $$4, dnb $$5, dqk.a $$6) {
   }

   @Override
   public void a(apc $$0) {
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
