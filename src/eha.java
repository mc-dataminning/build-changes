import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eha extends ede {
   public static final MapCodec<eha> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqg.a.fieldOf("settings").forGetter(eha::h)).apply($$0, $$0.stable(eha::new))
   );
   private final eqg d;

   public eha(eqg $$0) {
      super(new dln($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public edf a(ji<esj> $$0, eht $$1, long $$2) {
      Stream<jg<esj>> $$3 = this.d.c().map(jk::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return edf.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ede> b() {
      return c;
   }

   public eqg h() {
      return this.d;
   }

   @Override
   public void a(asc $$0, dkv $$1, eht $$2, edd $$3) {
   }

   @Override
   public int a(dkb $$0) {
      return $$0.K_() + Math.min($$0.L_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<edd> a(eih $$0, eht $$1, dkv $$2, edd $$3) {
      List<ebg> $$4 = this.d.f();
      iw.a $$5 = new iw.a();
      ehf $$6 = $$3.a(ehf.a.c);
      ehf $$7 = $$3.a(ehf.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.L_(), $$4.size()); $$8++) {
         ebg $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.K_() + $$8;

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
   public int a(int $$0, int $$1, ehf.a $$2, dkb $$3, eht $$4) {
      List<ebg> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         ebg $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.K_() + $$6 + 1;
         }
      }

      return $$3.K_();
   }

   @Override
   public dkl a(int $$0, int $$1, dkb $$2, eht $$3) {
      return new dkl($$2.K_(), this.d.f().stream().limit((long)$$2.L_()).map($$0x -> $$0x == null ? dng.a.m() : $$0x).toArray(ebg[]::new));
   }

   @Override
   public void a(List<String> $$0, eht $$1, iw $$2) {
   }

   @Override
   public void a(asc $$0, long $$1, eht $$2, dle $$3, dkv $$4, edd $$5) {
   }

   @Override
   public void a(asc $$0) {
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
