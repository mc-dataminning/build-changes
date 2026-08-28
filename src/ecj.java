import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ecj extends dyt {
   public static final MapCodec<ecj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akt.d(dhr.b)).apply($$0, $$0.stable(ecj::new)));
   private static final int h = 2;
   private static final List<dwx> i = StreamSupport.stream(mb.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayz.f(ayz.c((float)i.size()));
   private static final int k = ayz.f((float)i.size() / (float)j);
   protected static final dwx d = djo.a.m();
   protected static final dwx e = djo.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public ecj(jr.c<dhk> $$0) {
      super(new dhv($$0));
   }

   @Override
   protected MapCodec<? extends dyt> b() {
      return c;
   }

   @Override
   public void a(arl $$0, dhe $$1, edg $$2, dys $$3) {
   }

   @Override
   public void a(dhg $$0, dys $$1, dhe $$2) {
      ji.a $$3 = new ji.a();
      dfo $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kk.a($$5, $$7);
            int $$10 = kk.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dwx $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dys> a(edu $$0, edg $$1, dhe $$2, dys $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, ecs.a $$2, dgk $$3, edg $$4) {
      return 0;
   }

   @Override
   public dgu a(int $$0, int $$1, dgk $$2, edg $$3) {
      return new dgu(0, new dwx[0]);
   }

   @Override
   public void a(List<String> $$0, edg $$1, ji $$2) {
   }

   public static dwx a(int $$0, int $$1) {
      dwx $$2 = d;
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
   public void a(arl $$0, long $$1, edg $$2, dhm $$3, dhe $$4, dys $$5) {
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
