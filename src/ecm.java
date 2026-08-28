import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ecm extends dys {
   public static final MapCodec<ecm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elo.a.fieldOf("settings").forGetter(ecm::h)).apply($$0, $$0.stable(ecm::new))
   );
   private final elo d;

   public ecm(elo $$0) {
      super(new dhu($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dyt a(jt<enr> $$0, edf $$1, long $$2) {
      Stream<jr<enr>> $$3 = this.d.c().map(jv::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dyt.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dys> b() {
      return c;
   }

   public elo h() {
      return this.d;
   }

   @Override
   public void a(arl $$0, dhd $$1, edf $$2, dyr $$3) {
   }

   @Override
   public int a(dgj $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dyr> a(edt $$0, edf $$1, dhd $$2, dyr $$3) {
      List<dww> $$4 = this.d.f();
      ji.a $$5 = new ji.a();
      ecr $$6 = $$3.a(ecr.a.c);
      ecr $$7 = $$3.a(ecr.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dww $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

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
   public int a(int $$0, int $$1, ecr.a $$2, dgj $$3, edf $$4) {
      List<dww> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dww $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dgt a(int $$0, int $$1, dgj $$2, edf $$3) {
      return new dgt($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? djn.a.m() : $$0x).toArray(dww[]::new));
   }

   @Override
   public void a(List<String> $$0, edf $$1, ji $$2) {
   }

   @Override
   public void a(arl $$0, long $$1, edf $$2, dhl $$3, dhd $$4, dyr $$5) {
   }

   @Override
   public void a(arl $$0) {
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
