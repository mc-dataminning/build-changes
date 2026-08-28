import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class egb extends ecf {
   public static final MapCodec<egb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epe.a.fieldOf("settings").forGetter(egb::h)).apply($$0, $$0.stable(egb::new))
   );
   private final epe d;

   public egb(epe $$0) {
      super(new dko($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ecg a(jg<erh> $$0, egu $$1, long $$2) {
      Stream<je<erh>> $$3 = this.d.c().map(ji::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return ecg.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends ecf> b() {
      return c;
   }

   public epe h() {
      return this.d;
   }

   @Override
   public void a(ary $$0, djw $$1, egu $$2, ece $$3) {
   }

   @Override
   public int a(djc $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ece> a(ehi $$0, egu $$1, djw $$2, ece $$3) {
      List<eah> $$4 = this.d.f();
      iu.a $$5 = new iu.a();
      egg $$6 = $$3.a(egg.a.c);
      egg $$7 = $$3.a(egg.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         eah $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, egg.a $$2, djc $$3, egu $$4) {
      List<eah> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         eah $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public djm a(int $$0, int $$1, djc $$2, egu $$3) {
      return new djm($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dmh.a.m() : $$0x).toArray(eah[]::new));
   }

   @Override
   public void a(List<String> $$0, egu $$1, iu $$2) {
   }

   @Override
   public void a(ary $$0, long $$1, egu $$2, dkf $$3, djw $$4, ece $$5) {
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
