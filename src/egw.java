import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class egw extends ede {
   public static final MapCodec<egw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.d(dlj.b)).apply($$0, $$0.stable(egw::new)));
   private static final int h = 2;
   private static final List<ebg> i = StreamSupport.stream(mh.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azq.f(azq.c((float)i.size()));
   private static final int k = azq.f((float)i.size() / (float)j);
   protected static final ebg d = dng.a.m();
   protected static final ebg e = dng.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public egw(jg.c<dlc> $$0) {
      super(new dln($$0));
   }

   @Override
   protected MapCodec<? extends ede> b() {
      return c;
   }

   @Override
   public void a(asc $$0, dkv $$1, eht $$2, edd $$3) {
   }

   @Override
   public void a(dky $$0, edd $$1, dkv $$2) {
      iw.a $$3 = new iw.a();
      dje $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jz.a($$5, $$7);
            int $$10 = jz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            ebg $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<edd> a(eih $$0, eht $$1, dkv $$2, edd $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ehf.a $$2, dkb $$3, eht $$4) {
      return 0;
   }

   @Override
   public dkl a(int $$0, int $$1, dkb $$2, eht $$3) {
      return new dkl(0, new ebg[0]);
   }

   @Override
   public void a(List<String> $$0, eht $$1, iw $$2) {
   }

   public static ebg a(int $$0, int $$1) {
      ebg $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azq.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(asc $$0, long $$1, eht $$2, dle $$3, dkv $$4, edd $$5) {
   }

   @Override
   public void a(asc $$0) {
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
