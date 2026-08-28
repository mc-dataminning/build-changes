import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxq extends due {
   public static final MapCodec<dxq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aki.d(ddk.b)).apply($$0, $$0.stable(dxq::new)));
   private static final int h = 2;
   private static final List<dsh> i = StreamSupport.stream(lq.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = aye.f(aye.c((float)i.size()));
   private static final int k = aye.f((float)i.size() / (float)j);
   protected static final dsh d = dfh.a.o();
   protected static final dsh e = dfh.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxq(jj.c<ddd> $$0) {
      super(new ddo($$0));
   }

   @Override
   protected MapCodec<? extends due> b() {
      return c;
   }

   @Override
   public void a(aqr $$0, dcx $$1, dyn $$2, dud $$3) {
   }

   @Override
   public void a(dcz $$0, dud $$1, dcx $$2) {
      ja.a $$3 = new ja.a();
      dbk $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kc.a($$5, $$7);
            int $$10 = kc.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsh $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dud> a(Executor $$0, dzb $$1, dyn $$2, dcx $$3, dud $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxz.a $$2, dcf $$3, dyn $$4) {
      return 0;
   }

   @Override
   public dcp a(int $$0, int $$1, dcf $$2, dyn $$3) {
      return new dcp(0, new dsh[0]);
   }

   @Override
   public void a(List<String> $$0, dyn $$1, ja $$2) {
   }

   public static dsh a(int $$0, int $$1) {
      dsh $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aye.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqr $$0, long $$1, dyn $$2, ddf $$3, dcx $$4, dud $$5, dxv.a $$6) {
   }

   @Override
   public void a(aqr $$0) {
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
