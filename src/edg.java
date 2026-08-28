import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class edg extends dzq {
   public static final MapCodec<edg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alx.d(diq.b)).apply($$0, $$0.stable(edg::new)));
   private static final int h = 2;
   private static final List<dxu> i = StreamSupport.stream(ma.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = bae.f(bae.c((float)i.size()));
   private static final int k = bae.f((float)i.size() / (float)j);
   protected static final dxu d = dkn.a.m();
   protected static final dxu e = dkn.in.m();
   public static final int f = 70;
   public static final int g = 60;

   public edg(jq.c<dij> $$0) {
      super(new diu($$0));
   }

   @Override
   protected MapCodec<? extends dzq> b() {
      return c;
   }

   @Override
   public void a(asp $$0, did $$1, eed $$2, dzp $$3) {
   }

   @Override
   public void a(dif $$0, dzp $$1, did $$2) {
      jh.a $$3 = new jh.a();
      dgn $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dxu $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dzp> a(eer $$0, eed $$1, did $$2, dzp $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edp.a $$2, dhj $$3, eed $$4) {
      return 0;
   }

   @Override
   public dht a(int $$0, int $$1, dhj $$2, eed $$3) {
      return new dht(0, new dxu[0]);
   }

   @Override
   public void a(List<String> $$0, eed $$1, jh $$2) {
   }

   public static dxu a(int $$0, int $$1) {
      dxu $$2 = d;
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
   public void a(asp $$0, long $$1, eed $$2, dil $$3, did $$4, dzp $$5) {
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
