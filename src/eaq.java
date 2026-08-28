import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eaq extends dxa {
   public static final MapCodec<eaq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.d(dgd.b)).apply($$0, $$0.stable(eaq::new)));
   private static final int h = 2;
   private static final List<dvd> i = StreamSupport.stream(lx.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azj.f(azj.c((float)i.size()));
   private static final int k = azj.f((float)i.size() / (float)j);
   protected static final dvd d = dia.a.m();
   protected static final dvd e = dia.hW.m();
   public static final int f = 70;
   public static final int g = 60;

   public eaq(jp.c<dfw> $$0) {
      super(new dgh($$0));
   }

   @Override
   protected MapCodec<? extends dxa> b() {
      return c;
   }

   @Override
   public void a(aru $$0, dfq $$1, ebn $$2, dwz $$3) {
   }

   @Override
   public void a(dfs $$0, dwz $$1, dfq $$2) {
      jg.a $$3 = new jg.a();
      deb $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = ki.a($$5, $$7);
            int $$10 = ki.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dvd $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dwz> a(ecb $$0, ebn $$1, dfq $$2, dwz $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eaz.a $$2, dex $$3, ebn $$4) {
      return 0;
   }

   @Override
   public dfh a(int $$0, int $$1, dex $$2, ebn $$3) {
      return new dfh(0, new dvd[0]);
   }

   @Override
   public void a(List<String> $$0, ebn $$1, jg $$2) {
   }

   public static dvd a(int $$0, int $$1) {
      dvd $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azj.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aru $$0, long $$1, ebn $$2, dfy $$3, dfq $$4, dwz $$5) {
   }

   @Override
   public void a(aru $$0) {
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
