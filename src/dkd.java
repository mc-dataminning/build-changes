import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dkd extends dha {
   public static final Codec<dkd> c = RecordCodecBuilder.create($$0 -> $$0.group(aex.d(crg.b)).apply($$0, $$0.stable(dkd::new)));
   private static final int h = 2;
   private static final List<dfd> i = StreamSupport.stream(jb.f.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = asb.f(asb.c((float)i.size()));
   private static final int k = asb.f((float)i.size() / (float)j);
   protected static final dfd d = cte.a.o();
   protected static final dfd e = cte.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dkd(he.c<cqz> $$0) {
      super(new crk($$0));
   }

   @Override
   protected Codec<? extends dha> a() {
      return c;
   }

   @Override
   public void a(ala $$0, cqt $$1, dla $$2, dgz $$3) {
   }

   @Override
   public void a(cqv $$0, dgz $$1, cqt $$2) {
      gw.a $$3 = new gw.a();
      cpi $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hw.a($$5, $$7);
            int $$10 = hw.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dfd $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dgz> a(Executor $$0, dlo $$1, dla $$2, cqt $$3, dgz $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dkm.a $$2, cqd $$3, dla $$4) {
      return 0;
   }

   @Override
   public cqn a(int $$0, int $$1, cqd $$2, dla $$3) {
      return new cqn(0, new dfd[0]);
   }

   @Override
   public void a(List<String> $$0, dla $$1, gw $$2) {
   }

   public static dfd a(int $$0, int $$1) {
      dfd $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = asb.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ala $$0, long $$1, dla $$2, crb $$3, cqt $$4, dgz $$5, dki.a $$6) {
   }

   @Override
   public void a(ala $$0) {
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
