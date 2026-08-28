import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eeg extends eak {
   public static final MapCodec<eeg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(enj.a.fieldOf("settings").forGetter(eeg::h)).apply($$0, $$0.stable(eeg::new))
   );
   private final enj d;

   public eeg(enj $$0) {
      super(new djd($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public eal a(ju<epm> $$0, eez $$1, long $$2) {
      Stream<js<epm>> $$3 = this.d.c().map(jw::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return eal.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends eak> b() {
      return c;
   }

   public enj h() {
      return this.d;
   }

   @Override
   public void a(arv $$0, dil $$1, eez $$2, eaj $$3) {
   }

   @Override
   public int a(dhr $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<eaj> a(efn $$0, eez $$1, dil $$2, eaj $$3) {
      List<dym> $$4 = this.d.f();
      jj.a $$5 = new jj.a();
      eel $$6 = $$3.a(eel.a.c);
      eel $$7 = $$3.a(eel.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         dym $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, eel.a $$2, dhr $$3, eez $$4) {
      List<dym> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         dym $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public dib a(int $$0, int $$1, dhr $$2, eez $$3) {
      return new dib($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dkw.a.m() : $$0x).toArray(dym[]::new));
   }

   @Override
   public void a(List<String> $$0, eez $$1, jj $$2) {
   }

   @Override
   public void a(arv $$0, long $$1, eez $$2, diu $$3, dil $$4, eaj $$5) {
   }

   @Override
   public void a(arv $$0) {
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
