import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eba extends dxk {
   public static final MapCodec<eba> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alj.d(dgo.b)).apply($$0, $$0.stable(eba::new)));
   private static final int h = 2;
   private static final List<dvo> i = StreamSupport.stream(lz.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azn.f(azn.c((float)i.size()));
   private static final int k = azn.f((float)i.size() / (float)j);
   protected static final dvo d = dil.a.m();
   protected static final dvo e = dil.hW.m();
   public static final int f = 70;
   public static final int g = 60;

   public eba(jq.c<dgh> $$0) {
      super(new dgs($$0));
   }

   @Override
   protected MapCodec<? extends dxk> b() {
      return c;
   }

   @Override
   public void a(ary $$0, dgb $$1, ebx $$2, dxj $$3) {
   }

   @Override
   public void a(dgd $$0, dxj $$1, dgb $$2) {
      jh.a $$3 = new jh.a();
      del $$4 = $$1.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dvo $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dxj> a(ecl $$0, ebx $$1, dgb $$2, dxj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ebj.a $$2, dfh $$3, ebx $$4) {
      return 0;
   }

   @Override
   public dfr a(int $$0, int $$1, dfh $$2, ebx $$3) {
      return new dfr(0, new dvo[0]);
   }

   @Override
   public void a(List<String> $$0, ebx $$1, jh $$2) {
   }

   public static dvo a(int $$0, int $$1) {
      dvo $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azn.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ary $$0, long $$1, ebx $$2, dgj $$3, dgb $$4, dxj $$5) {
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
