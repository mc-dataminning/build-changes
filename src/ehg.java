import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ehg extends edo {
   public static final MapCodec<ehg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alp.d(dlt.b)).apply($$0, $$0.stable(ehg::new)));
   private static final int h = 2;
   private static final List<ebq> i = StreamSupport.stream(mh.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azz.f(azz.c((float)i.size()));
   private static final int k = azz.f((float)i.size() / (float)j);
   protected static final ebq d = dnq.a.m();
   protected static final ebq e = dnq.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public ehg(jg.c<dlm> $$0) {
      super(new dlx($$0));
   }

   @Override
   protected MapCodec<? extends edo> b() {
      return c;
   }

   @Override
   public void a(asj $$0, dlf $$1, eid $$2, edn $$3) {
   }

   @Override
   public void a(dli $$0, edn $$1, dlf $$2) {
      iw.a $$3 = new iw.a();
      djo $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jz.a($$5, $$7);
            int $$10 = jz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            ebq $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<edn> a(eir $$0, eid $$1, dlf $$2, edn $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ehp.a $$2, dkl $$3, eid $$4) {
      return 0;
   }

   @Override
   public dkv a(int $$0, int $$1, dkl $$2, eid $$3) {
      return new dkv(0, new ebq[0]);
   }

   @Override
   public void a(List<String> $$0, eid $$1, iw $$2) {
   }

   public static ebq a(int $$0, int $$1) {
      ebq $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azz.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(asj $$0, long $$1, eid $$2, dlo $$3, dlf $$4, edn $$5) {
   }

   @Override
   public void a(asj $$0) {
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
