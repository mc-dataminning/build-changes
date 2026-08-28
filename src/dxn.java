import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxn extends dub {
   public static final MapCodec<dxn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.d(ddg.b)).apply($$0, $$0.stable(dxn::new)));
   private static final int h = 2;
   private static final List<dse> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dse d = dfd.a.o();
   protected static final dse e = dfd.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxn(ji.c<dcz> $$0) {
      super(new ddk($$0));
   }

   @Override
   protected MapCodec<? extends dub> b() {
      return c;
   }

   @Override
   public void a(arm $$0, dct $$1, dyk $$2, dua $$3) {
   }

   @Override
   public void a(dcv $$0, dua $$1, dct $$2) {
      iz.a $$3 = new iz.a();
      dbh $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dse $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dua> a(Executor $$0, dyy $$1, dyk $$2, dct $$3, dua $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxw.a $$2, dcc $$3, dyk $$4) {
      return 0;
   }

   @Override
   public dcm a(int $$0, int $$1, dcc $$2, dyk $$3) {
      return new dcm(0, new dse[0]);
   }

   @Override
   public void a(List<String> $$0, dyk $$1, iz $$2) {
   }

   public static dse a(int $$0, int $$1) {
      dse $$2 = d;
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
   public void a(arm $$0, long $$1, dyk $$2, ddb $$3, dct $$4, dua $$5, dxs.a $$6) {
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
