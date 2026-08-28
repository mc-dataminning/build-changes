import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxo extends dty {
   public static final MapCodec<dxo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egm.a.fieldOf("settings").forGetter(dxo::h)).apply($$0, $$0.stable(dxo::new))
   );
   private final egm d;

   public dxo(egm $$0) {
      super(new ddh($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dtz a(jk<eip> $$0, dyh $$1, long $$2) {
      Stream<ji<eip>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dtz.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dty> b() {
      return c;
   }

   public egm h() {
      return this.d;
   }

   @Override
   public void a(arl $$0, dcq $$1, dyh $$2, dtx $$3) {
   }

   @Override
   public int a(dbz $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dtx> a(Executor $$0, dyv $$1, dyh $$2, dcq $$3, dtx $$4) {
      List<dsb> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxt $$7 = $$4.a(dxt.a.c);
      dxt $$8 = $$4.a(dxt.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dsb $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxt.a $$2, dbz $$3, dyh $$4) {
      List<dsb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcj a(int $$0, int $$1, dbz $$2, dyh $$3) {
      return new dcj($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfa.a.o() : $$0x).toArray(dsb[]::new));
   }

   @Override
   public void a(List<String> $$0, dyh $$1, iz $$2) {
   }

   @Override
   public void a(arl $$0, long $$1, dyh $$2, dcy $$3, dcq $$4, dtx $$5, dxp.a $$6) {
   }

   @Override
   public void a(arl $$0) {
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
