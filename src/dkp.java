import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dkp extends dhi {
   public static final Codec<dkp> c = RecordCodecBuilder.create($$0 -> $$0.group(dtn.a.fieldOf("settings").forGetter(dkp::g)).apply($$0, $$0.stable(dkp::new)));
   private final dtn d;

   public dkp(dtn $$0) {
      super(new crg($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dhj a(hi<dvq> $$0, dli $$1, long $$2) {
      Stream<hg<dvq>> $$3 = this.d.c().map(hk::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dhj.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dhi> a() {
      return c;
   }

   public dtn g() {
      return this.d;
   }

   @Override
   public void a(akz $$0, cqp $$1, dli $$2, dhh $$3) {
   }

   @Override
   public int a(cpz $$0) {
      return $$0.H_() + Math.min($$0.I_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dhh> a(Executor $$0, dlw $$1, dli $$2, cqp $$3, dhh $$4) {
      List<dfl> $$5 = this.d.f();
      gw.a $$6 = new gw.a();
      dku $$7 = $$4.a(dku.a.c);
      dku $$8 = $$4.a(dku.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.I_(), $$5.size()); $$9++) {
         dfl $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.H_() + $$9;

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
   public int a(int $$0, int $$1, dku.a $$2, cpz $$3, dli $$4) {
      List<dfl> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dfl $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.H_() + $$6 + 1;
         }
      }

      return $$3.H_();
   }

   @Override
   public cqj a(int $$0, int $$1, cpz $$2, dli $$3) {
      return new cqj($$2.H_(), this.d.f().stream().limit((long)$$2.I_()).map($$0x -> $$0x == null ? csy.a.n() : $$0x).toArray(dfl[]::new));
   }

   @Override
   public void a(List<String> $$0, dli $$1, gw $$2) {
   }

   @Override
   public void a(akz $$0, long $$1, dli $$2, cqx $$3, cqp $$4, dhh $$5, dkq.a $$6) {
   }

   @Override
   public void a(akz $$0) {
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
