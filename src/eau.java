import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eau extends dxa {
   public static final MapCodec<eau> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eju.a.fieldOf("settings").forGetter(eau::h)).apply($$0, $$0.stable(eau::new))
   );
   private final eju d;

   public eau(eju $$0) {
      super(new dgh($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dxb a(jr<elx> $$0, ebn $$1, long $$2) {
      Stream<jp<elx>> $$3 = this.d.c().map(jt::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dxb.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dxa> b() {
      return c;
   }

   public eju h() {
      return this.d;
   }

   @Override
   public void a(aru $$0, dfq $$1, ebn $$2, dwz $$3) {
   }

   @Override
   public int a(dex $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dwz> a(ecb $$0, ebn $$1, dfq $$2, dwz $$3) {
      List<dvd> $$4 = this.d.f();
      jg.a $$5 = new jg.a();
      eaz $$6 = $$3.a(eaz.a.c);
      eaz $$7 = $$3.a(eaz.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dvd $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.I_() + $$8;

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
   public int a(int $$0, int $$1, eaz.a $$2, dex $$3, ebn $$4) {
      List<dvd> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dvd $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dfh a(int $$0, int $$1, dex $$2, ebn $$3) {
      return new dfh($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dia.a.m() : $$0x).toArray(dvd[]::new));
   }

   @Override
   public void a(List<String> $$0, ebn $$1, jg $$2) {
   }

   @Override
   public void a(aru $$0, long $$1, ebn $$2, dfy $$3, dfq $$4, dwz $$5) {
   }

   @Override
   public void a(aru $$0) {
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
