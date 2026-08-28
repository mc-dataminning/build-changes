import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ecz extends dzj {
   public static final MapCodec<ecz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alx.d(dij.b)).apply($$0, $$0.stable(ecz::new)));
   private static final int h = 2;
   private static final List<dxn> i = StreamSupport.stream(ma.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = bae.f(bae.c((float)i.size()));
   private static final int k = bae.f((float)i.size() / (float)j);
   protected static final dxn d = dkg.a.m();
   protected static final dxn e = dkg.in.m();
   public static final int f = 70;
   public static final int g = 60;

   public ecz(jq.c<dic> $$0) {
      super(new din($$0));
   }

   @Override
   protected MapCodec<? extends dzj> b() {
      return c;
   }

   @Override
   public void a(asp $$0, dhw $$1, edw $$2, dzi $$3) {
   }

   @Override
   public void a(dhy $$0, dzi $$1, dhw $$2) {
      jh.a $$3 = new jh.a();
      dgg $$4 = $$1.f();
      int $$5 = $$4.g;
      int $$6 = $$4.h;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kj.a($$5, $$7);
            int $$10 = kj.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dxn $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dzi> a(eek $$0, edw $$1, dhw $$2, dzi $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edi.a $$2, dhc $$3, edw $$4) {
      return 0;
   }

   @Override
   public dhm a(int $$0, int $$1, dhc $$2, edw $$3) {
      return new dhm(0, new dxn[0]);
   }

   @Override
   public void a(List<String> $$0, edw $$1, jh $$2) {
   }

   public static dxn a(int $$0, int $$1) {
      dxn $$2 = d;
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
   public void a(asp $$0, long $$1, edw $$2, die $$3, dhw $$4, dzi $$5) {
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
