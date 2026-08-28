import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxk extends dtu {
   public static final MapCodec<dxk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egi.a.fieldOf("settings").forGetter(dxk::g)).apply($$0, $$0.stable(dxk::new))
   );
   private final egi d;

   public dxk(egi $$0) {
      super(new ddd($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dtv a(jk<eil> $$0, dyd $$1, long $$2) {
      Stream<ji<eil>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dtv.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dtu> a() {
      return c;
   }

   public egi g() {
      return this.d;
   }

   @Override
   public void a(ari $$0, dcm $$1, dyd $$2, dtt $$3) {
   }

   @Override
   public int a(dbv $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dtt> a(Executor $$0, dyr $$1, dyd $$2, dcm $$3, dtt $$4) {
      List<drx> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxp $$7 = $$4.a(dxp.a.c);
      dxp $$8 = $$4.a(dxp.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         drx $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxp.a $$2, dbv $$3, dyd $$4) {
      List<drx> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         drx $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcf a(int $$0, int $$1, dbv $$2, dyd $$3) {
      return new dcf($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dew.a.n() : $$0x).toArray(drx[]::new));
   }

   @Override
   public void a(List<String> $$0, dyd $$1, iz $$2) {
   }

   @Override
   public void a(ari $$0, long $$1, dyd $$2, dcu $$3, dcm $$4, dtt $$5, dxl.a $$6) {
   }

   @Override
   public void a(ari $$0) {
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
