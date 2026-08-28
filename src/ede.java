import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ede extends dzk {
   public static final MapCodec<ede> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emg.a.fieldOf("settings").forGetter(ede::h)).apply($$0, $$0.stable(ede::new))
   );
   private final emg d;

   public ede(emg $$0) {
      super(new dim($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dzl a(js<eoj> $$0, edx $$1, long $$2) {
      Stream<jq<eoj>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dzl.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dzk> b() {
      return c;
   }

   public emg h() {
      return this.d;
   }

   @Override
   public void a(asf $$0, dhv $$1, edx $$2, dzj $$3) {
   }

   @Override
   public int a(dhb $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dzj> a(eel $$0, edx $$1, dhv $$2, dzj $$3) {
      List<dxo> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      edj $$6 = $$3.a(edj.a.c);
      edj $$7 = $$3.a(edj.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dxo $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

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
   public int a(int $$0, int $$1, edj.a $$2, dhb $$3, edx $$4) {
      List<dxo> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dxo $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dhl a(int $$0, int $$1, dhb $$2, edx $$3) {
      return new dhl($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? dkf.a.m() : $$0x).toArray(dxo[]::new));
   }

   @Override
   public void a(List<String> $$0, edx $$1, jh $$2) {
   }

   @Override
   public void a(asf $$0, long $$1, edx $$2, did $$3, dhv $$4, dzj $$5) {
   }

   @Override
   public void a(asf $$0) {
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
