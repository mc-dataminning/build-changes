import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxj extends dtx {
   public static final MapCodec<dxj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.d(ddc.b)).apply($$0, $$0.stable(dxj::new)));
   private static final int h = 2;
   private static final List<dsa> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayx.f(ayx.c((float)i.size()));
   private static final int k = ayx.f((float)i.size() / (float)j);
   protected static final dsa d = dez.a.o();
   protected static final dsa e = dez.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxj(ji.c<dcv> $$0) {
      super(new ddg($$0));
   }

   @Override
   protected MapCodec<? extends dtx> b() {
      return c;
   }

   @Override
   public void a(arl $$0, dcp $$1, dyg $$2, dtw $$3) {
   }

   @Override
   public void a(dcr $$0, dtw $$1, dcp $$2) {
      iz.a $$3 = new iz.a();
      dbd $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsa $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dtw> a(Executor $$0, dyu $$1, dyg $$2, dcp $$3, dtw $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxs.a $$2, dby $$3, dyg $$4) {
      return 0;
   }

   @Override
   public dci a(int $$0, int $$1, dby $$2, dyg $$3) {
      return new dci(0, new dsa[0]);
   }

   @Override
   public void a(List<String> $$0, dyg $$1, iz $$2) {
   }

   public static dsa a(int $$0, int $$1) {
      dsa $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayx.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arl $$0, long $$1, dyg $$2, dcx $$3, dcp $$4, dtw $$5, dxo.a $$6) {
   }

   @Override
   public void a(arl $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return 63;
   }
}
