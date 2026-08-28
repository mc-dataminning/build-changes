import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class edf extends dzn {
   public static final MapCodec<edf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aks.d(dij.b)).apply($$0, $$0.stable(edf::new)));
   private static final int h = 2;
   private static final List<dxq> i = StreamSupport.stream(mb.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dxq d = dkg.a.m();
   protected static final dxq e = dkg.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public edf(jr.c<dic> $$0) {
      super(new din($$0));
   }

   @Override
   protected MapCodec<? extends dzn> b() {
      return c;
   }

   @Override
   public void a(arl $$0, dhv $$1, eec $$2, dzm $$3) {
   }

   @Override
   public void a(dhy $$0, dzm $$1, dhv $$2) {
      ji.a $$3 = new ji.a();
      dgg $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kk.a($$5, $$7);
            int $$10 = kk.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dxq $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dzm> a(eeq $$0, eec $$1, dhv $$2, dzm $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edo.a $$2, dhb $$3, eec $$4) {
      return 0;
   }

   @Override
   public dhl a(int $$0, int $$1, dhb $$2, eec $$3) {
      return new dhl(0, new dxq[0]);
   }

   @Override
   public void a(List<String> $$0, eec $$1, ji $$2) {
   }

   public static dxq a(int $$0, int $$1) {
      dxq $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayz.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arl $$0, long $$1, eec $$2, die $$3, dhv $$4, dzm $$5) {
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
