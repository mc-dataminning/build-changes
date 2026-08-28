import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class edh extends dzr {
   public static final MapCodec<edh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alx.d(dir.b)).apply($$0, $$0.stable(edh::new)));
   private static final int h = 2;
   private static final List<dxv> i = StreamSupport.stream(ma.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = bae.f(bae.c((float)i.size()));
   private static final int k = bae.f((float)i.size() / (float)j);
   protected static final dxv d = dko.a.m();
   protected static final dxv e = dko.in.m();
   public static final int f = 70;
   public static final int g = 60;

   public edh(jq.c<dik> $$0) {
      super(new div($$0));
   }

   @Override
   protected MapCodec<? extends dzr> b() {
      return c;
   }

   @Override
   public void a(asp $$0, die $$1, eee $$2, dzq $$3) {
   }

   @Override
   public void a(dig $$0, dzq $$1, die $$2) {
      jh.a $$3 = new jh.a();
      dgo $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dxv $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dzq> a(ees $$0, eee $$1, die $$2, dzq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edq.a $$2, dhk $$3, eee $$4) {
      return 0;
   }

   @Override
   public dhu a(int $$0, int $$1, dhk $$2, eee $$3) {
      return new dhu(0, new dxv[0]);
   }

   @Override
   public void a(List<String> $$0, eee $$1, jh $$2) {
   }

   public static dxv a(int $$0, int $$1) {
      dxv $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = bae.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(asp $$0, long $$1, eee $$2, dim $$3, die $$4, dzq $$5) {
   }

   @Override
   public void a(asp $$0) {
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
