import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dke extends dhb {
   public static final Codec<dke> c = RecordCodecBuilder.create($$0 -> $$0.group(aes.d(cqv.b)).apply($$0, $$0.stable(dke::new)));
   private static final int h = 2;
   private static final List<dfe> i = StreamSupport.stream(jd.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ars.f(ars.c((float)i.size()));
   private static final int k = ars.f((float)i.size() / (float)j);
   protected static final dfe d = csr.a.n();
   protected static final dfe e = csr.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dke(hg.c<cqo> $$0) {
      super(new cqz($$0));
   }

   @Override
   protected Codec<? extends dhb> a() {
      return c;
   }

   @Override
   public void a(aku $$0, cqi $$1, dlb $$2, dha $$3) {
   }

   @Override
   public void a(cqk $$0, dha $$1, cqi $$2) {
      gw.a $$3 = new gw.a();
      cox $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hz.a($$5, $$7);
            int $$10 = hz.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dfe $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dha> a(Executor $$0, dlp $$1, dlb $$2, cqi $$3, dha $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dkn.a $$2, cps $$3, dlb $$4) {
      return 0;
   }

   @Override
   public cqc a(int $$0, int $$1, cps $$2, dlb $$3) {
      return new cqc(0, new dfe[0]);
   }

   @Override
   public void a(List<String> $$0, dlb $$1, gw $$2) {
   }

   public static dfe a(int $$0, int $$1) {
      dfe $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ars.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aku $$0, long $$1, dlb $$2, cqq $$3, cqi $$4, dha $$5, dkj.a $$6) {
   }

   @Override
   public void a(aku $$0) {
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
