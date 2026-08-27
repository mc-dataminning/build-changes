import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dmn extends djk {
   public static final Codec<dmn> c = RecordCodecBuilder.create($$0 -> $$0.group(agk.d(ctk.b)).apply($$0, $$0.stable(dmn::new)));
   private static final int h = 2;
   private static final List<dhn> i = StreamSupport.stream(kc.f.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = atq.f(atq.c((float)i.size()));
   private static final int k = atq.f((float)i.size() / (float)j);
   protected static final dhn d = cvh.a.o();
   protected static final dhn e = cvh.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dmn(ig.c<ctd> $$0) {
      super(new cto($$0));
   }

   @Override
   protected Codec<? extends djk> a() {
      return c;
   }

   @Override
   public void a(amp $$0, csx $$1, dnk $$2, djj $$3) {
   }

   @Override
   public void a(csz $$0, djj $$1, csx $$2) {
      hx.a $$3 = new hx.a();
      crm $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iy.a($$5, $$7);
            int $$10 = iy.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dhn $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<djj> a(Executor $$0, dny $$1, dnk $$2, csx $$3, djj $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dmw.a $$2, csh $$3, dnk $$4) {
      return 0;
   }

   @Override
   public csr a(int $$0, int $$1, csh $$2, dnk $$3) {
      return new csr(0, new dhn[0]);
   }

   @Override
   public void a(List<String> $$0, dnk $$1, hx $$2) {
   }

   public static dhn a(int $$0, int $$1) {
      dhn $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = atq.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(amp $$0, long $$1, dnk $$2, ctf $$3, csx $$4, djj $$5, dms.a $$6) {
   }

   @Override
   public void a(amp $$0) {
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
