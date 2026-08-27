import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dop extends dlm {
   public static final Codec<dop> c = RecordCodecBuilder.create($$0 -> $$0.group(ahf.d(cvd.b)).apply($$0, $$0.stable(dop::new)));
   private static final int h = 2;
   private static final List<djp> i = StreamSupport.stream(kd.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aup.f(aup.c((float)i.size()));
   private static final int k = aup.f((float)i.size() / (float)j);
   protected static final djp d = cxa.a.o();
   protected static final djp e = cxa.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dop(ih.c<cuw> $$0) {
      super(new cvh($$0));
   }

   @Override
   protected Codec<? extends dlm> a() {
      return c;
   }

   @Override
   public void a(anl $$0, cuq $$1, dpm $$2, dll $$3) {
   }

   @Override
   public void a(cus $$0, dll $$1, cuq $$2) {
      hx.a $$3 = new hx.a();
      cte $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iz.a($$5, $$7);
            int $$10 = iz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            djp $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dll> a(Executor $$0, dqa $$1, dpm $$2, cuq $$3, dll $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, doy.a $$2, ctz $$3, dpm $$4) {
      return 0;
   }

   @Override
   public cuj a(int $$0, int $$1, ctz $$2, dpm $$3) {
      return new cuj(0, new djp[0]);
   }

   @Override
   public void a(List<String> $$0, dpm $$1, hx $$2) {
   }

   public static djp a(int $$0, int $$1) {
      djp $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aup.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(anl $$0, long $$1, dpm $$2, cuy $$3, cuq $$4, dll $$5, dou.a $$6) {
   }

   @Override
   public void a(anl $$0) {
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
