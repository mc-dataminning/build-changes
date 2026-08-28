import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxm extends dua {
   public static final MapCodec<dxm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.d(ddf.b)).apply($$0, $$0.stable(dxm::new)));
   private static final int h = 2;
   private static final List<dsd> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dsd d = dfc.a.o();
   protected static final dsd e = dfc.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxm(ji.c<dcy> $$0) {
      super(new ddj($$0));
   }

   @Override
   protected MapCodec<? extends dua> b() {
      return c;
   }

   @Override
   public void a(arm $$0, dcs $$1, dyj $$2, dtz $$3) {
   }

   @Override
   public void a(dcu $$0, dtz $$1, dcs $$2) {
      iz.a $$3 = new iz.a();
      dbg $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsd $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dtz> a(Executor $$0, dyx $$1, dyj $$2, dcs $$3, dtz $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxv.a $$2, dcb $$3, dyj $$4) {
      return 0;
   }

   @Override
   public dcl a(int $$0, int $$1, dcb $$2, dyj $$3) {
      return new dcl(0, new dsd[0]);
   }

   @Override
   public void a(List<String> $$0, dyj $$1, iz $$2) {
   }

   public static dsd a(int $$0, int $$1) {
      dsd $$2 = d;
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
   public void a(arm $$0, long $$1, dyj $$2, dda $$3, dcs $$4, dtz $$5, dxr.a $$6) {
   }

   @Override
   public void a(arm $$0) {
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
