import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dsd extends dow {
   public static final Codec<dsd> c = RecordCodecBuilder.create($$0 -> $$0.group(ajf.d(cyf.b)).apply($$0, $$0.stable(dsd::new)));
   private static final int h = 2;
   private static final List<dmz> i = StreamSupport.stream(ki.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aww.f(aww.c((float)i.size()));
   private static final int k = aww.f((float)i.size() / (float)j);
   protected static final dmz d = dac.a.o();
   protected static final dmz e = dac.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dsd(il.c<cxy> $$0) {
      super(new cyj($$0));
   }

   @Override
   protected Codec<? extends dow> a() {
      return c;
   }

   @Override
   public void a(apm $$0, cxs $$1, dta $$2, dov $$3) {
   }

   @Override
   public void a(cxu $$0, dov $$1, cxs $$2) {
      ib.a $$3 = new ib.a();
      cwg $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = je.a($$5, $$7);
            int $$10 = je.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dmz $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dov> a(Executor $$0, dto $$1, dta $$2, cxs $$3, dov $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dsm.a $$2, cxb $$3, dta $$4) {
      return 0;
   }

   @Override
   public cxl a(int $$0, int $$1, cxb $$2, dta $$3) {
      return new cxl(0, new dmz[0]);
   }

   @Override
   public void a(List<String> $$0, dta $$1, ib $$2) {
   }

   public static dmz a(int $$0, int $$1) {
      dmz $$2 = d;
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
   public void a(apm $$0, long $$1, dta $$2, cya $$3, cxs $$4, dov $$5, dsi.a $$6) {
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
