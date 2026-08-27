import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dqq extends dng {
   public static final Codec<dqq> c = RecordCodecBuilder.create($$0 -> $$0.group(dzo.a.fieldOf("settings").forGetter(dqq::g)).apply($$0, $$0.stable(dqq::new)));
   private final dzo d;

   public dqq(dzo $$0) {
      super(new cxb($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dnh a(il<ebr> $$0, drj $$1, long $$2) {
      Stream<ij<ebr>> $$3 = this.d.c().map(in::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dnh.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dng> a() {
      return c;
   }

   public dzo g() {
      return this.d;
   }

   @Override
   public void a(apd $$0, cwk $$1, drj $$2, dnf $$3) {
   }

   @Override
   public int a(cvt $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dnf> a(Executor $$0, drx $$1, drj $$2, cwk $$3, dnf $$4) {
      List<dlj> $$5 = this.d.f();
      hz.a $$6 = new hz.a();
      dqv $$7 = $$4.a(dqv.a.c);
      dqv $$8 = $$4.a(dqv.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dlj $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.J_() + $$9;

            for (int $$12 = 0; $$12 < 16; $$12++) {
               for (int $$13 = 0; $$13 < 16; $$13++) {
                  $$4.a($$6.d($$12, $$11, $$13), $$10, false);
                  $$7.a($$12, $$11, $$13, $$10);
                  $$8.a($$12, $$11, $$13, $$10);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dqv.a $$2, cvt $$3, drj $$4) {
      List<dlj> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dlj $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cwd a(int $$0, int $$1, cvt $$2, drj $$3) {
      return new cwd($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cyu.a.o() : $$0x).toArray(dlj[]::new));
   }

   @Override
   public void a(List<String> $$0, drj $$1, hz $$2) {
   }

   @Override
   public void a(apd $$0, long $$1, drj $$2, cws $$3, cwk $$4, dnf $$5, dqr.a $$6) {
   }

   @Override
   public void a(apd $$0) {
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
      return -63;
   }
}
