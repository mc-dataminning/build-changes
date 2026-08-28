import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class dzr extends dvx {
   public static final MapCodec<dzr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eir.a.fieldOf("settings").forGetter(dzr::h)).apply($$0, $$0.stable(dzr::new))
   );
   private final eir d;

   public dzr(eir $$0) {
      super(new dfe($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dvy a(jp<eku> $$0, eak $$1, long $$2) {
      Stream<jn<eku>> $$3 = this.d.c().map(jr::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dvy.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dvx> b() {
      return c;
   }

   public eir h() {
      return this.d;
   }

   @Override
   public void a(arn $$0, den $$1, eak $$2, dvw $$3) {
   }

   @Override
   public int a(ddu $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dvw> a(eay $$0, eak $$1, den $$2, dvw $$3) {
      List<dua> $$4 = this.d.f();
      je.a $$5 = new je.a();
      dzw $$6 = $$3.a(dzw.a.c);
      dzw $$7 = $$3.a(dzw.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         dua $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.G_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9, false);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, dzw.a $$2, ddu $$3, eak $$4) {
      List<dua> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.an()) - 1; $$6 >= 0; $$6--) {
         dua $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public dee a(int $$0, int $$1, ddu $$2, eak $$3) {
      return new dee($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dgx.a.o() : $$0x).toArray(dua[]::new));
   }

   @Override
   public void a(List<String> $$0, eak $$1, je $$2) {
   }

   @Override
   public void a(arn $$0, long $$1, eak $$2, dev $$3, den $$4, dvw $$5) {
   }

   @Override
   public void a(arn $$0) {
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
      return -63;
   }
}
