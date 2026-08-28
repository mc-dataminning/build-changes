import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eaf extends dwl {
   public static final MapCodec<eaf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejf.a.fieldOf("settings").forGetter(eaf::h)).apply($$0, $$0.stable(eaf::new))
   );
   private final ejf d;

   public eaf(ejf $$0) {
      super(new dfs($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dwm a(jp<eli> $$0, eay $$1, long $$2) {
      Stream<jn<eli>> $$3 = this.d.c().map(jr::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dwm.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dwl> b() {
      return c;
   }

   public ejf h() {
      return this.d;
   }

   @Override
   public void a(aro $$0, dfb $$1, eay $$2, dwk $$3) {
   }

   @Override
   public int a(dei $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dwk> a(ebm $$0, eay $$1, dfb $$2, dwk $$3) {
      List<duo> $$4 = this.d.f();
      je.a $$5 = new je.a();
      eak $$6 = $$3.a(eak.a.c);
      eak $$7 = $$3.a(eak.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         duo $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.G_() + $$8;

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
   public int a(int $$0, int $$1, eak.a $$2, dei $$3, eay $$4) {
      List<duo> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         duo $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public des a(int $$0, int $$1, dei $$2, eay $$3) {
      return new des($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dhl.a.o() : $$0x).toArray(duo[]::new));
   }

   @Override
   public void a(List<String> $$0, eay $$1, je $$2) {
   }

   @Override
   public void a(aro $$0, long $$1, eay $$2, dfj $$3, dfb $$4, dwk $$5) {
   }

   @Override
   public void a(aro $$0) {
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
