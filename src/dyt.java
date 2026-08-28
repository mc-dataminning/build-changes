import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class dyt extends duz {
   public static final MapCodec<dyt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehs.a.fieldOf("settings").forGetter(dyt::h)).apply($$0, $$0.stable(dyt::new))
   );
   private final ehs d;

   public dyt(ehs $$0) {
      super(new deh($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dva a(jo<ejv> $$0, dzm $$1, long $$2) {
      Stream<jm<ejv>> $$3 = this.d.c().map(jq::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dva.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends duz> b() {
      return c;
   }

   public ehs h() {
      return this.d;
   }

   @Override
   public void a(arb $$0, ddq $$1, dzm $$2, duy $$3) {
   }

   @Override
   public int a(dcy $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<duy> a(eaa $$0, dzm $$1, ddq $$2, duy $$3) {
      List<dtc> $$4 = this.d.f();
      jd.a $$5 = new jd.a();
      dyy $$6 = $$3.a(dyy.a.c);
      dyy $$7 = $$3.a(dyy.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dtc $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, dyy.a $$2, dcy $$3, dzm $$4) {
      List<dtc> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dtc $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public ddi a(int $$0, int $$1, dcy $$2, dzm $$3) {
      return new ddi($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dga.a.o() : $$0x).toArray(dtc[]::new));
   }

   @Override
   public void a(List<String> $$0, dzm $$1, jd $$2) {
   }

   @Override
   public void a(arb $$0, long $$1, dzm $$2, ddy $$3, ddq $$4, duy $$5, dyu.a $$6) {
   }

   @Override
   public void a(arb $$0) {
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
