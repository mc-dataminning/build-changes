import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eaf extends dwp {
   public static final MapCodec<eaf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.d(dfr.b)).apply($$0, $$0.stable(eaf::new)));
   private static final int h = 2;
   private static final List<dus> i = StreamSupport.stream(lv.e.spliterator(), false).flatMap($$0 -> $$0.k().a().stream()).collect(Collectors.toList());
   private static final int j = azf.f(azf.c((float)i.size()));
   private static final int k = azf.f((float)i.size() / (float)j);
   protected static final dus d = dho.a.n();
   protected static final dus e = dho.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public eaf(jo.c<dfk> $$0) {
      super(new dfv($$0));
   }

   @Override
   protected MapCodec<? extends dwp> b() {
      return c;
   }

   @Override
   public void a(arq $$0, dfe $$1, ebc $$2, dwo $$3) {
   }

   @Override
   public void a(dfg $$0, dwo $$1, dfe $$2) {
      jf.a $$3 = new jf.a();
      ddp $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kh.a($$5, $$7);
            int $$10 = kh.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dus $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dwo> a(ebq $$0, ebc $$1, dfe $$2, dwo $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eao.a $$2, del $$3, ebc $$4) {
      return 0;
   }

   @Override
   public dev a(int $$0, int $$1, del $$2, ebc $$3) {
      return new dev(0, new dus[0]);
   }

   @Override
   public void a(List<String> $$0, ebc $$1, jf $$2) {
   }

   public static dus a(int $$0, int $$1) {
      dus $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azf.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arq $$0, long $$1, ebc $$2, dfm $$3, dfe $$4, dwo $$5) {
   }

   @Override
   public void a(arq $$0) {
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
