import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class djy extends dgv {
   public static final Codec<djy> c = RecordCodecBuilder.create($$0 -> $$0.group(aen.d(cqp.b)).apply($$0, $$0.stable(djy::new)));
   private static final int h = 2;
   private static final List<dey> i = StreamSupport.stream(jc.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = aro.f(aro.c((float)i.size()));
   private static final int k = aro.f((float)i.size() / (float)j);
   protected static final dey d = csl.a.n();
   protected static final dey e = csl.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public djy(hf.c<cqi> $$0) {
      super(new cqt($$0));
   }

   @Override
   protected Codec<? extends dgv> a() {
      return c;
   }

   @Override
   public void a(akp $$0, cqc $$1, dkv $$2, dgu $$3) {
   }

   @Override
   public void a(cqe $$0, dgu $$1, cqc $$2) {
      gv.a $$3 = new gv.a();
      cor $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hy.a($$5, $$7);
            int $$10 = hy.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dey $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dgu> a(Executor $$0, dlj $$1, dkv $$2, cqc $$3, dgu $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dkh.a $$2, cpm $$3, dkv $$4) {
      return 0;
   }

   @Override
   public cpw a(int $$0, int $$1, cpm $$2, dkv $$3) {
      return new cpw(0, new dey[0]);
   }

   @Override
   public void a(List<String> $$0, dkv $$1, gv $$2) {
   }

   public static dey a(int $$0, int $$1) {
      dey $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aro.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(akp $$0, long $$1, dkv $$2, cqk $$3, cqc $$4, dgu $$5, dkd.a $$6) {
   }

   @Override
   public void a(akp $$0) {
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
