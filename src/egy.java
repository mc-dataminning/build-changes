import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class egy extends edc {
   public static final MapCodec<egy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqe.a.fieldOf("settings").forGetter(egy::h)).apply($$0, $$0.stable(egy::new))
   );
   private final eqe d;

   public egy(eqe $$0) {
      super(new dll($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public edd a(jh<esh> $$0, ehr $$1, long $$2) {
      Stream<jf<esh>> $$3 = this.d.c().map(jj::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return edd.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends edc> b() {
      return c;
   }

   public eqe h() {
      return this.d;
   }

   @Override
   public void a(asa $$0, dkt $$1, ehr $$2, edb $$3) {
   }

   @Override
   public int a(djz $$0) {
      return $$0.K_() + Math.min($$0.L_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<edb> a(eif $$0, ehr $$1, dkt $$2, edb $$3) {
      List<ebe> $$4 = this.d.f();
      iv.a $$5 = new iv.a();
      ehd $$6 = $$3.a(ehd.a.c);
      ehd $$7 = $$3.a(ehd.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.L_(), $$4.size()); $$8++) {
         ebe $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, ehd.a $$2, djz $$3, ehr $$4) {
      List<ebe> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         ebe $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.K_() + $$6 + 1;
         }
      }

      return $$3.K_();
   }

   @Override
   public dkj a(int $$0, int $$1, djz $$2, ehr $$3) {
      return new dkj($$2.K_(), this.d.f().stream().limit((long)$$2.L_()).map($$0x -> $$0x == null ? dne.a.m() : $$0x).toArray(ebe[]::new));
   }

   @Override
   public void a(List<String> $$0, ehr $$1, iv $$2) {
   }

   @Override
   public void a(asa $$0, long $$1, ehr $$2, dlc $$3, dkt $$4, edb $$5) {
   }

   @Override
   public void a(asa $$0) {
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
