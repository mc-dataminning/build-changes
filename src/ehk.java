import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ehk extends edo {
   public static final MapCodec<ehk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqq.a.fieldOf("settings").forGetter(ehk::h)).apply($$0, $$0.stable(ehk::new))
   );
   private final eqq d;

   public ehk(eqq $$0) {
      super(new dlx($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public edp a(ji<est> $$0, eid $$1, long $$2) {
      Stream<jg<est>> $$3 = this.d.c().map(jk::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return edp.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends edo> b() {
      return c;
   }

   public eqq h() {
      return this.d;
   }

   @Override
   public void a(asj $$0, dlf $$1, eid $$2, edn $$3) {
   }

   @Override
   public int a(dkl $$0) {
      return $$0.K_() + Math.min($$0.L_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<edn> a(eir $$0, eid $$1, dlf $$2, edn $$3) {
      List<ebq> $$4 = this.d.f();
      iw.a $$5 = new iw.a();
      ehp $$6 = $$3.a(ehp.a.c);
      ehp $$7 = $$3.a(ehp.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.L_(), $$4.size()); $$8++) {
         ebq $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, ehp.a $$2, dkl $$3, eid $$4) {
      List<ebq> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         ebq $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.K_() + $$6 + 1;
         }
      }

      return $$3.K_();
   }

   @Override
   public dkv a(int $$0, int $$1, dkl $$2, eid $$3) {
      return new dkv($$2.K_(), this.d.f().stream().limit((long)$$2.L_()).map($$0x -> $$0x == null ? dnq.a.m() : $$0x).toArray(ebq[]::new));
   }

   @Override
   public void a(List<String> $$0, eid $$1, iw $$2) {
   }

   @Override
   public void a(asj $$0, long $$1, eid $$2, dlo $$3, dlf $$4, edn $$5) {
   }

   @Override
   public void a(asj $$0) {
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
