import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ebh extends dxr {
   public static final MapCodec<ebh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.d(dgv.b)).apply($$0, $$0.stable(ebh::new)));
   private static final int h = 2;
   private static final List<dvv> i = StreamSupport.stream(lz.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azm.f(azm.c((float)i.size()));
   private static final int k = azm.f((float)i.size() / (float)j);
   protected static final dvv d = dis.a.m();
   protected static final dvv e = dis.hW.m();
   public static final int f = 70;
   public static final int g = 60;

   public ebh(jq.c<dgo> $$0) {
      super(new dgz($$0));
   }

   @Override
   protected MapCodec<? extends dxr> b() {
      return c;
   }

   @Override
   public void a(arx $$0, dgi $$1, ece $$2, dxq $$3) {
   }

   @Override
   public void a(dgk $$0, dxq $$1, dgi $$2) {
      jh.a $$3 = new jh.a();
      des $$4 = $$1.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dvv $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dxq> a(ecs $$0, ece $$1, dgi $$2, dxq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ebq.a $$2, dfo $$3, ece $$4) {
      return 0;
   }

   @Override
   public dfy a(int $$0, int $$1, dfo $$2, ece $$3) {
      return new dfy(0, new dvv[0]);
   }

   @Override
   public void a(List<String> $$0, ece $$1, jh $$2) {
   }

   public static dvv a(int $$0, int $$1) {
      dvv $$2 = d;
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
   public void a(arx $$0, long $$1, ece $$2, dgq $$3, dgi $$4, dxq $$5) {
   }

   @Override
   public void a(arx $$0) {
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
