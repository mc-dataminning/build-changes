import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class efi extends ebm {
   public static final MapCodec<efi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eol.a.fieldOf("settings").forGetter(efi::h)).apply($$0, $$0.stable(efi::new))
   );
   private final eol d;

   public efi(eol $$0) {
      super(new dkd($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ebn a(jg<eqo> $$0, egb $$1, long $$2) {
      Stream<je<eqo>> $$3 = this.d.c().map(ji::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return ebn.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ebm> b() {
      return c;
   }

   public eol h() {
      return this.d;
   }

   @Override
   public void a(arw $$0, djl $$1, egb $$2, ebl $$3) {
   }

   @Override
   public int a(dir $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ebl> a(egp $$0, egb $$1, djl $$2, ebl $$3) {
      List<dzo> $$4 = this.d.f();
      iu.a $$5 = new iu.a();
      efn $$6 = $$3.a(efn.a.c);
      efn $$7 = $$3.a(efn.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         dzo $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, efn.a $$2, dir $$3, egb $$4) {
      List<dzo> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         dzo $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public djb a(int $$0, int $$1, dir $$2, egb $$3) {
      return new djb($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dlw.a.m() : $$0x).toArray(dzo[]::new));
   }

   @Override
   public void a(List<String> $$0, egb $$1, iu $$2) {
   }

   @Override
   public void a(arw $$0, long $$1, egb $$2, dju $$3, djl $$4, ebl $$5) {
   }

   @Override
   public void a(arw $$0) {
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
