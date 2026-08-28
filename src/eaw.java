import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eaw extends dxg {
   public static final MapCodec<eaw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.d(dgj.b)).apply($$0, $$0.stable(eaw::new)));
   private static final int h = 2;
   private static final List<dvj> i = StreamSupport.stream(ly.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azk.f(azk.c((float)i.size()));
   private static final int k = azk.f((float)i.size() / (float)j);
   protected static final dvj d = dig.a.m();
   protected static final dvj e = dig.hW.m();
   public static final int f = 70;
   public static final int g = 60;

   public eaw(jq.c<dgc> $$0) {
      super(new dgn($$0));
   }

   @Override
   protected MapCodec<? extends dxg> b() {
      return c;
   }

   @Override
   public void a(arv $$0, dfw $$1, ebt $$2, dxf $$3) {
   }

   @Override
   public void a(dfy $$0, dxf $$1, dfw $$2) {
      jh.a $$3 = new jh.a();
      deh $$4 = $$1.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dvj $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dxf> a(ech $$0, ebt $$1, dfw $$2, dxf $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ebf.a $$2, dfd $$3, ebt $$4) {
      return 0;
   }

   @Override
   public dfn a(int $$0, int $$1, dfd $$2, ebt $$3) {
      return new dfn(0, new dvj[0]);
   }

   @Override
   public void a(List<String> $$0, ebt $$1, jh $$2) {
   }

   public static dvj a(int $$0, int $$1) {
      dvj $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azk.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arv $$0, long $$1, ebt $$2, dge $$3, dfw $$4, dxf $$5) {
   }

   @Override
   public void a(arv $$0) {
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
