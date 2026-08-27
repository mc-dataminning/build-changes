import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dqm extends dng {
   public static final Codec<dqm> c = RecordCodecBuilder.create($$0 -> $$0.group(aiw.d(cwx.b)).apply($$0, $$0.stable(dqm::new)));
   private static final int h = 2;
   private static final List<dlj> i = StreamSupport.stream(kf.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = awi.f(awi.c((float)i.size()));
   private static final int k = awi.f((float)i.size() / (float)j);
   protected static final dlj d = cyu.a.o();
   protected static final dlj e = cyu.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dqm(ij.c<cwq> $$0) {
      super(new cxb($$0));
   }

   @Override
   protected Codec<? extends dng> a() {
      return c;
   }

   @Override
   public void a(apd $$0, cwk $$1, drj $$2, dnf $$3) {
   }

   @Override
   public void a(cwm $$0, dnf $$1, cwk $$2) {
      hz.a $$3 = new hz.a();
      cuy $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jb.a($$5, $$7);
            int $$10 = jb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dlj $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dnf> a(Executor $$0, drx $$1, drj $$2, cwk $$3, dnf $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dqv.a $$2, cvt $$3, drj $$4) {
      return 0;
   }

   @Override
   public cwd a(int $$0, int $$1, cvt $$2, drj $$3) {
      return new cwd(0, new dlj[0]);
   }

   @Override
   public void a(List<String> $$0, drj $$1, hz $$2) {
   }

   public static dlj a(int $$0, int $$1) {
      dlj $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = awi.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(apd $$0, long $$1, drj $$2, cws $$3, cwk $$4, dnf $$5, dqr.a $$6) {
   }

   @Override
   public void a(apd $$0) {
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
