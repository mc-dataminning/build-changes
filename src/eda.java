import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eda extends dzk {
   public static final MapCodec<eda> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aln.d(dii.b)).apply($$0, $$0.stable(eda::new)));
   private static final int h = 2;
   private static final List<dxo> i = StreamSupport.stream(ma.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azu.f(azu.c((float)i.size()));
   private static final int k = azu.f((float)i.size() / (float)j);
   protected static final dxo d = dkf.a.m();
   protected static final dxo e = dkf.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public eda(jq.c<dib> $$0) {
      super(new dim($$0));
   }

   @Override
   protected MapCodec<? extends dzk> b() {
      return c;
   }

   @Override
   public void a(asf $$0, dhv $$1, edx $$2, dzj $$3) {
   }

   @Override
   public void a(dhx $$0, dzj $$1, dhv $$2) {
      jh.a $$3 = new jh.a();
      dgf $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dxo $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dzj> a(eel $$0, edx $$1, dhv $$2, dzj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edj.a $$2, dhb $$3, edx $$4) {
      return 0;
   }

   @Override
   public dhl a(int $$0, int $$1, dhb $$2, edx $$3) {
      return new dhl(0, new dxo[0]);
   }

   @Override
   public void a(List<String> $$0, edx $$1, jh $$2) {
   }

   public static dxo a(int $$0, int $$1) {
      dxo $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azu.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(asf $$0, long $$1, edx $$2, did $$3, dhv $$4, dzj $$5) {
   }

   @Override
   public void a(asf $$0) {
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
