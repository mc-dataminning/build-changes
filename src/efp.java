import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class efp extends ebx {
   public static final MapCodec<efp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.d(dkf.b)).apply($$0, $$0.stable(efp::new)));
   private static final int h = 2;
   private static final List<dzz> i = StreamSupport.stream(mf.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azm.f(azm.c((float)i.size()));
   private static final int k = azm.f((float)i.size() / (float)j);
   protected static final dzz d = dmc.a.m();
   protected static final dzz e = dmc.iv.m();
   public static final int f = 70;
   public static final int g = 60;

   public efp(je.c<djy> $$0) {
      super(new dkj($$0));
   }

   @Override
   protected MapCodec<? extends ebx> b() {
      return c;
   }

   @Override
   public void a(ary $$0, djr $$1, egm $$2, ebw $$3) {
   }

   @Override
   public void a(dju $$0, ebw $$1, djr $$2) {
      iu.a $$3 = new iu.a();
      dic $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jx.a($$5, $$7);
            int $$10 = jx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dzz $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ebw> a(eha $$0, egm $$1, djr $$2, ebw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, efy.a $$2, dix $$3, egm $$4) {
      return 0;
   }

   @Override
   public djh a(int $$0, int $$1, dix $$2, egm $$3) {
      return new djh(0, new dzz[0]);
   }

   @Override
   public void a(List<String> $$0, egm $$1, iu $$2) {
   }

   public static dzz a(int $$0, int $$1) {
      dzz $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azm.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ary $$0, long $$1, egm $$2, dka $$3, djr $$4, ebw $$5) {
   }

   @Override
   public void a(ary $$0) {
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
