import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxn extends dtx {
   public static final MapCodec<dxn> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egl.a.fieldOf("settings").forGetter(dxn::h)).apply($$0, $$0.stable(dxn::new))
   );
   private final egl d;

   public dxn(egl $$0) {
      super(new ddg($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dty a(jk<eio> $$0, dyg $$1, long $$2) {
      Stream<ji<eio>> $$3 = this.d.c().map(jm::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dty.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dtx> b() {
      return c;
   }

   public egl h() {
      return this.d;
   }

   @Override
   public void a(arl $$0, dcp $$1, dyg $$2, dtw $$3) {
   }

   @Override
   public int a(dby $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dtw> a(Executor $$0, dyu $$1, dyg $$2, dcp $$3, dtw $$4) {
      List<dsa> $$5 = this.d.f();
      iz.a $$6 = new iz.a();
      dxs $$7 = $$4.a(dxs.a.c);
      dxs $$8 = $$4.a(dxs.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dsa $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxs.a $$2, dby $$3, dyg $$4) {
      List<dsa> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsa $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dci a(int $$0, int $$1, dby $$2, dyg $$3) {
      return new dci($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dez.a.o() : $$0x).toArray(dsa[]::new));
   }

   @Override
   public void a(List<String> $$0, dyg $$1, iz $$2) {
   }

   @Override
   public void a(arl $$0, long $$1, dyg $$2, dcx $$3, dcp $$4, dtw $$5, dxo.a $$6) {
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
