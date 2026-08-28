import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ecl extends dyr {
   public static final MapCodec<ecl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eln.a.fieldOf("settings").forGetter(ecl::h)).apply($$0, $$0.stable(ecl::new))
   );
   private final eln d;

   public ecl(eln $$0) {
      super(new dht($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dys a(jt<enq> $$0, ede $$1, long $$2) {
      Stream<jr<enq>> $$3 = this.d.c().map(jv::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dys.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dyr> b() {
      return c;
   }

   public eln h() {
      return this.d;
   }

   @Override
   public void a(ark $$0, dhc $$1, ede $$2, dyq $$3) {
   }

   @Override
   public int a(dgi $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dyq> a(eds $$0, ede $$1, dhc $$2, dyq $$3) {
      List<dwv> $$4 = this.d.f();
      ji.a $$5 = new ji.a();
      ecq $$6 = $$3.a(ecq.a.c);
      ecq $$7 = $$3.a(ecq.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dwv $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, ecq.a $$2, dgi $$3, ede $$4) {
      List<dwv> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.an()); $$6 >= 0; $$6--) {
         dwv $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dgs a(int $$0, int $$1, dgi $$2, ede $$3) {
      return new dgs($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? djm.a.m() : $$0x).toArray(dwv[]::new));
   }

   @Override
   public void a(List<String> $$0, ede $$1, ji $$2) {
   }

   @Override
   public void a(ark $$0, long $$1, ede $$2, dhk $$3, dhc $$4, dyq $$5) {
   }

   @Override
   public void a(ark $$0) {
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
