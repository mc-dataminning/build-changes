import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxp extends dtz {
   public static final MapCodec<dxp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egn.a.fieldOf("settings").forGetter(dxp::h)).apply($$0, $$0.stable(dxp::new))
   );
   private final egn d;

   public dxp(egn $$0) {
      super(new ddi($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dua a(jk<eiq> $$0, dyi $$1, long $$2) {
      Stream<ji<eiq>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dua.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dtz> b() {
      return c;
   }

   public egn h() {
      return this.d;
   }

   @Override
   public void a(arm $$0, dcr $$1, dyi $$2, dty $$3) {
   }

   @Override
   public int a(dca $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dty> a(Executor $$0, dyw $$1, dyi $$2, dcr $$3, dty $$4) {
      List<dsc> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxu $$7 = $$4.a(dxu.a.c);
      dxu $$8 = $$4.a(dxu.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dsc $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxu.a $$2, dca $$3, dyi $$4) {
      List<dsc> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsc $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dck a(int $$0, int $$1, dca $$2, dyi $$3) {
      return new dck($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfb.a.o() : $$0x).toArray(dsc[]::new));
   }

   @Override
   public void a(List<String> $$0, dyi $$1, iz $$2) {
   }

   @Override
   public void a(arm $$0, long $$1, dyi $$2, dcz $$3, dcr $$4, dty $$5, dxq.a $$6) {
   }

   @Override
   public void a(arm $$0) {
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
