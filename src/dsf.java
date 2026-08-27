import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dsf extends doy {
   public static final Codec<dsf> c = RecordCodecBuilder.create($$0 -> $$0.group(ajf.d(cyh.b)).apply($$0, $$0.stable(dsf::new)));
   private static final int h = 2;
   private static final List<dnb> i = StreamSupport.stream(ki.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aww.f(aww.c((float)i.size()));
   private static final int k = aww.f((float)i.size() / (float)j);
   protected static final dnb d = dae.a.o();
   protected static final dnb e = dae.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dsf(il.c<cya> $$0) {
      super(new cyl($$0));
   }

   @Override
   protected Codec<? extends doy> a() {
      return c;
   }

   @Override
   public void a(apm $$0, cxu $$1, dtc $$2, dox $$3) {
   }

   @Override
   public void a(cxw $$0, dox $$1, cxu $$2) {
      ib.a $$3 = new ib.a();
      cwi $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = je.a($$5, $$7);
            int $$10 = je.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dnb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dox> a(Executor $$0, dtq $$1, dtc $$2, cxu $$3, dox $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dso.a $$2, cxd $$3, dtc $$4) {
      return 0;
   }

   @Override
   public cxn a(int $$0, int $$1, cxd $$2, dtc $$3) {
      return new cxn(0, new dnb[0]);
   }

   @Override
   public void a(List<String> $$0, dtc $$1, ib $$2) {
   }

   public static dnb a(int $$0, int $$1) {
      dnb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aww.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(apm $$0, long $$1, dtc $$2, cyc $$3, cxu $$4, dox $$5, dsk.a $$6) {
   }

   @Override
   public void a(apm $$0) {
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
