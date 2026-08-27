import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dmr extends djk {
   public static final Codec<dmr> c = RecordCodecBuilder.create($$0 -> $$0.group(dvp.a.fieldOf("settings").forGetter(dmr::g)).apply($$0, $$0.stable(dmr::new)));
   private final dvp d;

   public dmr(dvp $$0) {
      super(new cto($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public djl a(ii<dxs> $$0, dnk $$1, long $$2) {
      Stream<ig<dxs>> $$3 = this.d.c().map(ik::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return djl.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends djk> a() {
      return c;
   }

   public dvp g() {
      return this.d;
   }

   @Override
   public void a(amp $$0, csx $$1, dnk $$2, djj $$3) {
   }

   @Override
   public int a(csh $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<djj> a(Executor $$0, dny $$1, dnk $$2, csx $$3, djj $$4) {
      List<dhn> $$5 = this.d.f();
      hx.a $$6 = new hx.a();
      dmw $$7 = $$4.a(dmw.a.c);
      dmw $$8 = $$4.a(dmw.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dhn $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dmw.a $$2, csh $$3, dnk $$4) {
      List<dhn> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dhn $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public csr a(int $$0, int $$1, csh $$2, dnk $$3) {
      return new csr($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cvh.a.o() : $$0x).toArray(dhn[]::new));
   }

   @Override
   public void a(List<String> $$0, dnk $$1, hx $$2) {
   }

   @Override
   public void a(amp $$0, long $$1, dnk $$2, ctf $$3, csx $$4, djj $$5, dms.a $$6) {
   }

   @Override
   public void a(amp $$0) {
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
