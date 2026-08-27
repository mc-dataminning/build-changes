import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class doa extends dkx {
   public static final Codec<doa> c = RecordCodecBuilder.create($$0 -> $$0.group(ahb.d(cuo.b)).apply($$0, $$0.stable(doa::new)));
   private static final int h = 2;
   private static final List<dja> i = StreamSupport.stream(kd.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aui.f(aui.c((float)i.size()));
   private static final int k = aui.f((float)i.size() / (float)j);
   protected static final dja d = cwl.a.o();
   protected static final dja e = cwl.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public doa(ih.c<cuh> $$0) {
      super(new cus($$0));
   }

   @Override
   protected Codec<? extends dkx> a() {
      return c;
   }

   @Override
   public void a(ang $$0, cub $$1, dox $$2, dkw $$3) {
   }

   @Override
   public void a(cud $$0, dkw $$1, cub $$2) {
      hx.a $$3 = new hx.a();
      csp $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iz.a($$5, $$7);
            int $$10 = iz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dja $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dkw> a(Executor $$0, dpl $$1, dox $$2, cub $$3, dkw $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, doj.a $$2, ctk $$3, dox $$4) {
      return 0;
   }

   @Override
   public ctu a(int $$0, int $$1, ctk $$2, dox $$3) {
      return new ctu(0, new dja[0]);
   }

   @Override
   public void a(List<String> $$0, dox $$1, hx $$2) {
   }

   public static dja a(int $$0, int $$1) {
      dja $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aui.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ang $$0, long $$1, dox $$2, cuj $$3, cub $$4, dkw $$5, dof.a $$6) {
   }

   @Override
   public void a(ang $$0) {
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
