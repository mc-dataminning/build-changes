import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eec extends eak {
   public static final MapCodec<eec> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.d(diz.b)).apply($$0, $$0.stable(eec::new)));
   private static final int h = 2;
   private static final List<dym> i = StreamSupport.stream(md.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azk.f(azk.c((float)i.size()));
   private static final int k = azk.f((float)i.size() / (float)j);
   protected static final dym d = dkw.a.m();
   protected static final dym e = dkw.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public eec(js.c<dis> $$0) {
      super(new djd($$0));
   }

   @Override
   protected MapCodec<? extends eak> b() {
      return c;
   }

   @Override
   public void a(arv $$0, dil $$1, eez $$2, eaj $$3) {
   }

   @Override
   public void a(dio $$0, eaj $$1, dil $$2) {
      jj.a $$3 = new jj.a();
      dgw $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kl.a($$5, $$7);
            int $$10 = kl.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dym $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<eaj> a(efn $$0, eez $$1, dil $$2, eaj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eel.a $$2, dhr $$3, eez $$4) {
      return 0;
   }

   @Override
   public dib a(int $$0, int $$1, dhr $$2, eez $$3) {
      return new dib(0, new dym[0]);
   }

   @Override
   public void a(List<String> $$0, eez $$1, jj $$2) {
   }

   public static dym a(int $$0, int $$1) {
      dym $$2 = d;
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
   public void a(arv $$0, long $$1, eez $$2, diu $$3, dil $$4, eaj $$5) {
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
