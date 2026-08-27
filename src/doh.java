import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class doh extends dle {
   public static final Codec<doh> c = RecordCodecBuilder.create($$0 -> $$0.group(ahe.d(cuv.b)).apply($$0, $$0.stable(doh::new)));
   private static final int h = 2;
   private static final List<djh> i = StreamSupport.stream(kd.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = auo.f(auo.c((float)i.size()));
   private static final int k = auo.f((float)i.size() / (float)j);
   protected static final djh d = cws.a.o();
   protected static final djh e = cws.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public doh(ih.c<cuo> $$0) {
      super(new cuz($$0));
   }

   @Override
   protected Codec<? extends dle> a() {
      return c;
   }

   @Override
   public void a(ank $$0, cui $$1, dpe $$2, dld $$3) {
   }

   @Override
   public void a(cuk $$0, dld $$1, cui $$2) {
      hx.a $$3 = new hx.a();
      csw $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iz.a($$5, $$7);
            int $$10 = iz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            djh $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dld> a(Executor $$0, dps $$1, dpe $$2, cui $$3, dld $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, doq.a $$2, ctr $$3, dpe $$4) {
      return 0;
   }

   @Override
   public cub a(int $$0, int $$1, ctr $$2, dpe $$3) {
      return new cub(0, new djh[0]);
   }

   @Override
   public void a(List<String> $$0, dpe $$1, hx $$2) {
   }

   public static djh a(int $$0, int $$1) {
      djh $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = auo.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ank $$0, long $$1, dpe $$2, cuq $$3, cui $$4, dld $$5, dom.a $$6) {
   }

   @Override
   public void a(ank $$0) {
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
