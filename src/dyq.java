import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class dyq extends dux {
   public static final MapCodec<dyq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehp.a.fieldOf("settings").forGetter(dyq::h)).apply($$0, $$0.stable(dyq::new))
   );
   private final ehp d;

   public dyq(ehp $$0) {
      super(new def($$0.d()), ad.b($$0::a));
      this.d = $$0;
   }

   @Override
   public duy a(jo<ejs> $$0, dzj $$1, long $$2) {
      Stream<jm<ejs>> $$3 = this.d.c().map(jq::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return duy.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dux> b() {
      return c;
   }

   public ehp h() {
      return this.d;
   }

   @Override
   public void a(ara $$0, ddo $$1, dzj $$2, duw $$3) {
   }

   @Override
   public int a(dcw $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<duw> a(dzx $$0, dzj $$1, ddo $$2, duw $$3) {
      List<dta> $$4 = this.d.f();
      jd.a $$5 = new jd.a();
      dyv $$6 = $$3.a(dyv.a.c);
      dyv $$7 = $$3.a(dyv.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dta $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, dyv.a $$2, dcw $$3, dzj $$4) {
      List<dta> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dta $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public ddg a(int $$0, int $$1, dcw $$2, dzj $$3) {
      return new ddg($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfy.a.o() : $$0x).toArray(dta[]::new));
   }

   @Override
   public void a(List<String> $$0, dzj $$1, jd $$2) {
   }

   @Override
   public void a(ara $$0, long $$1, dzj $$2, ddw $$3, ddo $$4, duw $$5, dyr.a $$6) {
   }

   @Override
   public void a(ara $$0) {
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
