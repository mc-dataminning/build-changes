import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eft extends ebx {
   public static final MapCodec<eft> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eow.a.fieldOf("settings").forGetter(eft::h)).apply($$0, $$0.stable(eft::new))
   );
   private final eow d;

   public eft(eow $$0) {
      super(new dkj($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public eby a(jg<eqz> $$0, egm $$1, long $$2) {
      Stream<je<eqz>> $$3 = this.d.c().map(ji::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return eby.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ebx> b() {
      return c;
   }

   public eow h() {
      return this.d;
   }

   @Override
   public void a(ary $$0, djr $$1, egm $$2, ebw $$3) {
   }

   @Override
   public int a(dix $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ebw> a(eha $$0, egm $$1, djr $$2, ebw $$3) {
      List<dzz> $$4 = this.d.f();
      iu.a $$5 = new iu.a();
      efy $$6 = $$3.a(efy.a.c);
      efy $$7 = $$3.a(efy.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         dzz $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, efy.a $$2, dix $$3, egm $$4) {
      List<dzz> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         dzz $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public djh a(int $$0, int $$1, dix $$2, egm $$3) {
      return new djh($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dmc.a.m() : $$0x).toArray(dzz[]::new));
   }

   @Override
   public void a(List<String> $$0, egm $$1, iu $$2) {
   }

   @Override
   public void a(ary $$0, long $$1, egm $$2, dka $$3, djr $$4, ebw $$5) {
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
