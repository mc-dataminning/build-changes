import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxr extends dub {
   public static final MapCodec<dxr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egp.a.fieldOf("settings").forGetter(dxr::h)).apply($$0, $$0.stable(dxr::new))
   );
   private final egp d;

   public dxr(egp $$0) {
      super(new ddk($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public duc a(jk<eis> $$0, dyk $$1, long $$2) {
      Stream<ji<eis>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return duc.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dub> b() {
      return c;
   }

   public egp h() {
      return this.d;
   }

   @Override
   public void a(arm $$0, dct $$1, dyk $$2, dua $$3) {
   }

   @Override
   public int a(dcc $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dua> a(Executor $$0, dyy $$1, dyk $$2, dct $$3, dua $$4) {
      List<dse> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxw $$7 = $$4.a(dxw.a.c);
      dxw $$8 = $$4.a(dxw.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dse $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxw.a $$2, dcc $$3, dyk $$4) {
      List<dse> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dse $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcm a(int $$0, int $$1, dcc $$2, dyk $$3) {
      return new dcm($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfd.a.o() : $$0x).toArray(dse[]::new));
   }

   @Override
   public void a(List<String> $$0, dyk $$1, iz $$2) {
   }

   @Override
   public void a(arm $$0, long $$1, dyk $$2, ddb $$3, dct $$4, dua $$5, dxs.a $$6) {
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
