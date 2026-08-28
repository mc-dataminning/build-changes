import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxx extends dui {
   public static final MapCodec<dxx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aki.d(ddn.b)).apply($$0, $$0.stable(dxx::new)));
   private static final int h = 2;
   private static final List<dsl> i = StreamSupport.stream(lq.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayg.f(ayg.c((float)i.size()));
   private static final int k = ayg.f((float)i.size() / (float)j);
   protected static final dsl d = dfk.a.o();
   protected static final dsl e = dfk.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxx(jj.c<ddg> $$0) {
      super(new ddr($$0));
   }

   @Override
   protected MapCodec<? extends dui> b() {
      return c;
   }

   @Override
   public void a(aqt $$0, dda $$1, dyu $$2, duh $$3) {
   }

   @Override
   public void a(ddc $$0, duh $$1, dda $$2) {
      ja.a $$3 = new ja.a();
      dbn $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kc.a($$5, $$7);
            int $$10 = kc.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsl $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<duh> a(dzi $$0, dyu $$1, dda $$2, duh $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, dyg.a $$2, dci $$3, dyu $$4) {
      return 0;
   }

   @Override
   public dcs a(int $$0, int $$1, dci $$2, dyu $$3) {
      return new dcs(0, new dsl[0]);
   }

   @Override
   public void a(List<String> $$0, dyu $$1, ja $$2) {
   }

   public static dsl a(int $$0, int $$1) {
      dsl $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayg.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqt $$0, long $$1, dyu $$2, ddi $$3, dda $$4, duh $$5, dyc.a $$6) {
   }

   @Override
   public void a(aqt $$0) {
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
