import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class drh extends dob {
   public static final Codec<drh> c = RecordCodecBuilder.create($$0 -> $$0.group(aja.d(cxk.b)).apply($$0, $$0.stable(drh::new)));
   private static final int h = 2;
   private static final List<dme> i = StreamSupport.stream(kh.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = awm.f(awm.c((float)i.size()));
   private static final int k = awm.f((float)i.size() / (float)j);
   protected static final dme d = czh.a.o();
   protected static final dme e = czh.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public drh(il.c<cxd> $$0) {
      super(new cxo($$0));
   }

   @Override
   protected Codec<? extends dob> a() {
      return c;
   }

   @Override
   public void a(aph $$0, cwx $$1, dse $$2, doa $$3) {
   }

   @Override
   public void a(cwz $$0, doa $$1, cwx $$2) {
      ib.a $$3 = new ib.a();
      cvl $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jd.a($$5, $$7);
            int $$10 = jd.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dme $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<doa> a(Executor $$0, dss $$1, dse $$2, cwx $$3, doa $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, drq.a $$2, cwg $$3, dse $$4) {
      return 0;
   }

   @Override
   public cwq a(int $$0, int $$1, cwg $$2, dse $$3) {
      return new cwq(0, new dme[0]);
   }

   @Override
   public void a(List<String> $$0, dse $$1, ib $$2) {
   }

   public static dme a(int $$0, int $$1) {
      dme $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = awm.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aph $$0, long $$1, dse $$2, cxf $$3, cwx $$4, doa $$5, drm.a $$6) {
   }

   @Override
   public void a(aph $$0) {
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
