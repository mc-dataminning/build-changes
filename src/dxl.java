import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxl extends dtz {
   public static final MapCodec<dxl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.d(dde.b)).apply($$0, $$0.stable(dxl::new)));
   private static final int h = 2;
   private static final List<dsc> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dsc d = dfb.a.o();
   protected static final dsc e = dfb.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxl(ji.c<dcx> $$0) {
      super(new ddi($$0));
   }

   @Override
   protected MapCodec<? extends dtz> b() {
      return c;
   }

   @Override
   public void a(arm $$0, dcr $$1, dyi $$2, dty $$3) {
   }

   @Override
   public void a(dct $$0, dty $$1, dcr $$2) {
      iz.a $$3 = new iz.a();
      dbf $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsc $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dty> a(Executor $$0, dyw $$1, dyi $$2, dcr $$3, dty $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxu.a $$2, dca $$3, dyi $$4) {
      return 0;
   }

   @Override
   public dck a(int $$0, int $$1, dca $$2, dyi $$3) {
      return new dck(0, new dsc[0]);
   }

   @Override
   public void a(List<String> $$0, dyi $$1, iz $$2) {
   }

   public static dsc a(int $$0, int $$1) {
      dsc $$2 = d;
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
   public void a(arm $$0, long $$1, dyi $$2, dcz $$3, dcr $$4, dty $$5, dxq.a $$6) {
   }

   @Override
   public void a(arm $$0) {
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
