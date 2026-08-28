import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class edk extends dzq {
   public static final MapCodec<edk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emm.a.fieldOf("settings").forGetter(edk::h)).apply($$0, $$0.stable(edk::new))
   );
   private final emm d;

   public edk(emm $$0) {
      super(new diu($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dzr a(js<eop> $$0, eed $$1, long $$2) {
      Stream<jq<eop>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dzr.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dzq> b() {
      return c;
   }

   public emm h() {
      return this.d;
   }

   @Override
   public void a(asp $$0, did $$1, eed $$2, dzp $$3) {
   }

   @Override
   public int a(dhj $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dzp> a(eer $$0, eed $$1, did $$2, dzp $$3) {
      List<dxu> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      edp $$6 = $$3.a(edp.a.c);
      edp $$7 = $$3.a(edp.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dxu $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, edp.a $$2, dhj $$3, eed $$4) {
      List<dxu> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.am()); $$6 >= 0; $$6--) {
         dxu $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dht a(int $$0, int $$1, dhj $$2, eed $$3) {
      return new dht($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? dkn.a.m() : $$0x).toArray(dxu[]::new));
   }

   @Override
   public void a(List<String> $$0, eed $$1, jh $$2) {
   }

   @Override
   public void a(asp $$0, long $$1, eed $$2, dil $$3, did $$4, dzp $$5) {
   }

   @Override
   public void a(asp $$0) {
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
