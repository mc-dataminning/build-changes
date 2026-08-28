import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class eci extends dys {
   public static final MapCodec<eci> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akt.d(dhq.b)).apply($$0, $$0.stable(eci::new)));
   private static final int h = 2;
   private static final List<dww> i = StreamSupport.stream(mb.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dww d = djn.a.m();
   protected static final dww e = djn.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public eci(jr.c<dhj> $$0) {
      super(new dhu($$0));
   }

   @Override
   protected MapCodec<? extends dys> b() {
      return c;
   }

   @Override
   public void a(arl $$0, dhd $$1, edf $$2, dyr $$3) {
   }

   @Override
   public void a(dhf $$0, dyr $$1, dhd $$2) {
      ji.a $$3 = new ji.a();
      dfn $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kk.a($$5, $$7);
            int $$10 = kk.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dww $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dyr> a(edt $$0, edf $$1, dhd $$2, dyr $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ecr.a $$2, dgj $$3, edf $$4) {
      return 0;
   }

   @Override
   public dgt a(int $$0, int $$1, dgj $$2, edf $$3) {
      return new dgt(0, new dww[0]);
   }

   @Override
   public void a(List<String> $$0, edf $$1, ji $$2) {
   }

   public static dww a(int $$0, int $$1) {
      dww $$2 = d;
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
   public void a(arl $$0, long $$1, edf $$2, dhl $$3, dhd $$4, dyr $$5) {
   }

   @Override
   public void a(arl $$0) {
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
