import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ebe extends dxk {
   public static final MapCodec<ebe> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eke.a.fieldOf("settings").forGetter(ebe::h)).apply($$0, $$0.stable(ebe::new))
   );
   private final eke d;

   public ebe(eke $$0) {
      super(new dgs($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dxl a(js<emh> $$0, ebx $$1, long $$2) {
      Stream<jq<emh>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dxl.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dxk> b() {
      return c;
   }

   public eke h() {
      return this.d;
   }

   @Override
   public void a(ary $$0, dgb $$1, ebx $$2, dxj $$3) {
   }

   @Override
   public int a(dfh $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dxj> a(ecl $$0, ebx $$1, dgb $$2, dxj $$3) {
      List<dvo> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      ebj $$6 = $$3.a(ebj.a.c);
      ebj $$7 = $$3.a(ebj.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.J_(), $$4.size()); $$8++) {
         dvo $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, ebj.a $$2, dfh $$3, ebx $$4) {
      List<dvo> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.al()); $$6 >= 0; $$6--) {
         dvo $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dfr a(int $$0, int $$1, dfh $$2, ebx $$3) {
      return new dfr($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dil.a.m() : $$0x).toArray(dvo[]::new));
   }

   @Override
   public void a(List<String> $$0, ebx $$1, jh $$2) {
   }

   @Override
   public void a(ary $$0, long $$1, ebx $$2, dgj $$3, dgb $$4, dxj $$5) {
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
