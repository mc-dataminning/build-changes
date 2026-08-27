import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dur extends drf {
   public static final Codec<dur> c = RecordCodecBuilder.create($$0 -> $$0.group(ajt.d(dam.b)).apply($$0, $$0.stable(dur::new)));
   private static final int h = 2;
   private static final List<dpi> i = StreamSupport.stream(kt.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = axm.f(axm.c((float)i.size()));
   private static final int k = axm.f((float)i.size() / (float)j);
   protected static final dpi d = dcj.a.n();
   protected static final dpi e = dcj.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dur(in.c<daf> $$0) {
      super(new daq($$0));
   }

   @Override
   protected Codec<? extends drf> a() {
      return c;
   }

   @Override
   public void a(aqb $$0, czz $$1, dvo $$2, dre $$3) {
   }

   @Override
   public void a(dab $$0, dre $$1, czz $$2) {
      id.a $$3 = new id.a();
      cyn $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jg.a($$5, $$7);
            int $$10 = jg.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dpi $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dre> a(Executor $$0, dwc $$1, dvo $$2, czz $$3, dre $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dva.a $$2, czi $$3, dvo $$4) {
      return 0;
   }

   @Override
   public czs a(int $$0, int $$1, czi $$2, dvo $$3) {
      return new czs(0, new dpi[0]);
   }

   @Override
   public void a(List<String> $$0, dvo $$1, id $$2) {
   }

   public static dpi a(int $$0, int $$1) {
      dpi $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = axm.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqb $$0, long $$1, dvo $$2, dah $$3, czz $$4, dre $$5, duw.a $$6) {
   }

   @Override
   public void a(aqb $$0) {
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
