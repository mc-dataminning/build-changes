import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dwm extends dta {
   public static final MapCodec<dwm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akl.d(dcf.b)).apply($$0, $$0.stable(dwm::new)));
   private static final int h = 2;
   private static final List<drd> i = StreamSupport.stream(le.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayf.f(ayf.c((float)i.size()));
   private static final int k = ayf.f((float)i.size() / (float)j);
   protected static final drd d = dec.a.n();
   protected static final drd e = dec.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dwm(ix.c<dby> $$0) {
      super(new dcj($$0));
   }

   @Override
   protected MapCodec<? extends dta> a() {
      return c;
   }

   @Override
   public void a(aqu $$0, dbs $$1, dxj $$2, dsz $$3) {
   }

   @Override
   public void a(dbu $$0, dsz $$1, dbs $$2) {
      io.a $$3 = new io.a();
      dag $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jq.a($$5, $$7);
            int $$10 = jq.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            drd $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dsz> a(Executor $$0, dxx $$1, dxj $$2, dbs $$3, dsz $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dwv.a $$2, dbb $$3, dxj $$4) {
      return 0;
   }

   @Override
   public dbl a(int $$0, int $$1, dbb $$2, dxj $$3) {
      return new dbl(0, new drd[0]);
   }

   @Override
   public void a(List<String> $$0, dxj $$1, io $$2) {
   }

   public static drd a(int $$0, int $$1) {
      drd $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayf.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqu $$0, long $$1, dxj $$2, dca $$3, dbs $$4, dsz $$5, dwr.a $$6) {
   }

   @Override
   public void a(aqu $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return 63;
   }
}
