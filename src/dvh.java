import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dvh extends drv {
   public static final Codec<dvh> c = RecordCodecBuilder.create($$0 -> $$0.group(akd.d(dba.b)).apply($$0, $$0.stable(dvh::new)));
   private static final int h = 2;
   private static final List<dpy> i = StreamSupport.stream(lc.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = axw.f(axw.c((float)i.size()));
   private static final int k = axw.f((float)i.size() / (float)j);
   protected static final dpy d = dcx.a.n();
   protected static final dpy e = dcx.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dvh(iv.c<dat> $$0) {
      super(new dbe($$0));
   }

   @Override
   protected Codec<? extends drv> a() {
      return c;
   }

   @Override
   public void a(aql $$0, dan $$1, dwe $$2, dru $$3) {
   }

   @Override
   public void a(dap $$0, dru $$1, dan $$2) {
      im.a $$3 = new im.a();
      czb $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jo.a($$5, $$7);
            int $$10 = jo.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dpy $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dru> a(Executor $$0, dws $$1, dwe $$2, dan $$3, dru $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dvq.a $$2, czw $$3, dwe $$4) {
      return 0;
   }

   @Override
   public dag a(int $$0, int $$1, czw $$2, dwe $$3) {
      return new dag(0, new dpy[0]);
   }

   @Override
   public void a(List<String> $$0, dwe $$1, im $$2) {
   }

   public static dpy a(int $$0, int $$1) {
      dpy $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = axw.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aql $$0, long $$1, dwe $$2, dav $$3, dan $$4, dru $$5, dvm.a $$6) {
   }

   @Override
   public void a(aql $$0) {
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
