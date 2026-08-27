import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dum extends dqw {
   public static final Codec<dum> c = RecordCodecBuilder.create($$0 -> $$0.group(edk.a.fieldOf("settings").forGetter(dum::g)).apply($$0, $$0.stable(dum::new)));
   private final edk d;

   public dum(edk $$0) {
      super(new dah($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dqx a(in<efn> $$0, dvf $$1, long $$2) {
      Stream<il<efn>> $$3 = this.d.c().map(ip::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dqx.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dqw> a() {
      return c;
   }

   public edk g() {
      return this.d;
   }

   @Override
   public void a(apz $$0, czq $$1, dvf $$2, dqv $$3) {
   }

   @Override
   public int a(cyz $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dqv> a(Executor $$0, dvt $$1, dvf $$2, czq $$3, dqv $$4) {
      List<doz> $$5 = this.d.f();
      ib.a $$6 = new ib.a();
      dur $$7 = $$4.a(dur.a.c);
      dur $$8 = $$4.a(dur.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         doz $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.I_() + $$9;

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
   public int a(int $$0, int $$1, dur.a $$2, cyz $$3, dvf $$4) {
      List<doz> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         doz $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public czj a(int $$0, int $$1, cyz $$2, dvf $$3) {
      return new czj($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dca.a.n() : $$0x).toArray(doz[]::new));
   }

   @Override
   public void a(List<String> $$0, dvf $$1, ib $$2) {
   }

   @Override
   public void a(apz $$0, long $$1, dvf $$2, czy $$3, czq $$4, dqv $$5, dun.a $$6) {
   }

   @Override
   public void a(apz $$0) {
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
