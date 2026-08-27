import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dmi extends djf {
   public static final Codec<dmi> c = RecordCodecBuilder.create($$0 -> $$0.group(agg.d(ctf.b)).apply($$0, $$0.stable(dmi::new)));
   private static final int h = 2;
   private static final List<dhi> i = StreamSupport.stream(jy.f.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = atm.f(atm.c((float)i.size()));
   private static final int k = atm.f((float)i.size() / (float)j);
   protected static final dhi d = cvc.a.o();
   protected static final dhi e = cvc.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dmi(ib.c<csy> $$0) {
      super(new ctj($$0));
   }

   @Override
   protected Codec<? extends djf> a() {
      return c;
   }

   @Override
   public void a(aml $$0, css $$1, dnf $$2, dje $$3) {
   }

   @Override
   public void a(csu $$0, dje $$1, css $$2) {
      ht.a $$3 = new ht.a();
      crh $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iu.a($$5, $$7);
            int $$10 = iu.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dhi $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dje> a(Executor $$0, dnt $$1, dnf $$2, css $$3, dje $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dmr.a $$2, csc $$3, dnf $$4) {
      return 0;
   }

   @Override
   public csm a(int $$0, int $$1, csc $$2, dnf $$3) {
      return new csm(0, new dhi[0]);
   }

   @Override
   public void a(List<String> $$0, dnf $$1, ht $$2) {
   }

   public static dhi a(int $$0, int $$1) {
      dhi $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = atm.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aml $$0, long $$1, dnf $$2, cta $$3, css $$4, dje $$5, dmn.a $$6) {
   }

   @Override
   public void a(aml $$0) {
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
