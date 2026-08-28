import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class eba extends dxg {
   public static final MapCodec<eba> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eka.a.fieldOf("settings").forGetter(eba::h)).apply($$0, $$0.stable(eba::new))
   );
   private final eka d;

   public eba(eka $$0) {
      super(new dgn($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dxh a(js<emd> $$0, ebt $$1, long $$2) {
      Stream<jq<emd>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dxh.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dxg> b() {
      return c;
   }

   public eka h() {
      return this.d;
   }

   @Override
   public void a(arv $$0, dfw $$1, ebt $$2, dxf $$3) {
   }

   @Override
   public int a(dfd $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dxf> a(ech $$0, ebt $$1, dfw $$2, dxf $$3) {
      List<dvj> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      ebf $$6 = $$3.a(ebf.a.c);
      ebf $$7 = $$3.a(ebf.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dvj $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, ebf.a $$2, dfd $$3, ebt $$4) {
      List<dvj> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.al()); $$6 >= 0; $$6--) {
         dvj $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dfn a(int $$0, int $$1, dfd $$2, ebt $$3) {
      return new dfn($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dig.a.m() : $$0x).toArray(dvj[]::new));
   }

   @Override
   public void a(List<String> $$0, ebt $$1, jh $$2) {
   }

   @Override
   public void a(arv $$0, long $$1, ebt $$2, dge $$3, dfw $$4, dxf $$5) {
   }

   @Override
   public void a(arv $$0) {
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
