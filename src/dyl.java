import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dyl extends duz {
   public static final Codec<dyl> c = RecordCodecBuilder.create($$0 -> $$0.group(akr.d(ddg.b)).apply($$0, $$0.stable(dyl::new)));
   private static final int h = 2;
   private static final List<dtc> i = StreamSupport.stream(lh.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = aym.f(aym.c((float)i.size()));
   private static final int k = aym.f((float)i.size() / (float)j);
   protected static final dtc d = dfe.a.n();
   protected static final dtc e = dfe.iQ.n();
   public static final int f = 70;
   public static final int g = 60;

   public dyl(ja.c<dcz> $$0) {
      super(new ddk($$0));
   }

   @Override
   protected Codec<? extends duz> a() {
      return c;
   }

   @Override
   public void a(ara $$0, dct $$1, dzi $$2, duy $$3) {
   }

   @Override
   public void a(dcv $$0, duy $$1, dct $$2) {
      ir.a $$3 = new ir.a();
      dbh $$4 = $$1.g();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jt.a($$5, $$7);
            int $$10 = jt.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dtc $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<duy> a(Executor $$0, dzw $$1, dzi $$2, dct $$3, duy $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dyu.a $$2, dcc $$3, dzi $$4) {
      return 0;
   }

   @Override
   public dcm a(int $$0, int $$1, dcc $$2, dzi $$3) {
      return new dcm(0, new dtc[0]);
   }

   @Override
   public void a(List<String> $$0, dzi $$1, ir $$2) {
   }

   public static dtc a(int $$0, int $$1) {
      dtc $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aym.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ara $$0, long $$1, dzi $$2, ddb $$3, dct $$4, duy $$5, dyq.a $$6) {
   }

   @Override
   public void a(ara $$0) {
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
