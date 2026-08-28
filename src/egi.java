import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class egi extends ecm {
   public static final MapCodec<egi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epl.a.fieldOf("settings").forGetter(egi::h)).apply($$0, $$0.stable(egi::new))
   );
   private final epl d;

   public egi(epl $$0) {
      super(new dkv($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ecn a(jh<ero> $$0, ehb $$1, long $$2) {
      Stream<jf<ero>> $$3 = this.d.c().map(jj::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return ecn.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ecm> b() {
      return c;
   }

   public epl h() {
      return this.d;
   }

   @Override
   public void a(ary $$0, dkd $$1, ehb $$2, ecl $$3) {
   }

   @Override
   public int a(djj $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ecl> a(ehp $$0, ehb $$1, dkd $$2, ecl $$3) {
      List<eao> $$4 = this.d.f();
      iv.a $$5 = new iv.a();
      egn $$6 = $$3.a(egn.a.c);
      egn $$7 = $$3.a(egn.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         eao $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.G_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, egn.a $$2, djj $$3, ehb $$4) {
      List<eao> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         eao $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public djt a(int $$0, int $$1, djj $$2, ehb $$3) {
      return new djt($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dmo.a.m() : $$0x).toArray(eao[]::new));
   }

   @Override
   public void a(List<String> $$0, ehb $$1, iv $$2) {
   }

   @Override
   public void a(ary $$0, long $$1, ehb $$2, dkm $$3, dkd $$4, ecl $$5) {
   }

   @Override
   public void a(ary $$0) {
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
