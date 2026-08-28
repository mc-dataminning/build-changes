import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eaj extends dwp {
   public static final MapCodec<eaj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejj.a.fieldOf("settings").forGetter(eaj::h)).apply($$0, $$0.stable(eaj::new))
   );
   private final ejj d;

   public eaj(ejj $$0) {
      super(new dfv($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dwq a(jq<elm> $$0, ebc $$1, long $$2) {
      Stream<jo<elm>> $$3 = this.d.c().map(js::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dwq.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dwp> b() {
      return c;
   }

   public ejj h() {
      return this.d;
   }

   @Override
   public void a(arq $$0, dfe $$1, ebc $$2, dwo $$3) {
   }

   @Override
   public int a(del $$0) {
      return $$0.H_() + Math.min($$0.I_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dwo> a(ebq $$0, ebc $$1, dfe $$2, dwo $$3) {
      List<dus> $$4 = this.d.f();
      jf.a $$5 = new jf.a();
      eao $$6 = $$3.a(eao.a.c);
      eao $$7 = $$3.a(eao.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.I_(), $$4.size()); $$8++) {
         dus $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.H_() + $$8;

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
   public int a(int $$0, int $$1, eao.a $$2, del $$3, ebc $$4) {
      List<dus> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dus $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.H_() + $$6 + 1;
         }
      }

      return $$3.H_();
   }

   @Override
   public dev a(int $$0, int $$1, del $$2, ebc $$3) {
      return new dev($$2.H_(), this.d.f().stream().limit((long)$$2.I_()).map($$0x -> $$0x == null ? dho.a.n() : $$0x).toArray(dus[]::new));
   }

   @Override
   public void a(List<String> $$0, ebc $$1, jf $$2) {
   }

   @Override
   public void a(arq $$0, long $$1, ebc $$2, dfm $$3, dfe $$4, dwo $$5) {
   }

   @Override
   public void a(arq $$0) {
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
