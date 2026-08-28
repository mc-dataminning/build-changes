import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class edj extends dzn {
   public static final MapCodec<edj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emm.a.fieldOf("settings").forGetter(edj::h)).apply($$0, $$0.stable(edj::new))
   );
   private final emm d;

   public edj(emm $$0) {
      super(new din($$0.d()), af.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dzo a(jt<eop> $$0, eec $$1, long $$2) {
      Stream<jr<eop>> $$3 = this.d.c().map(jv::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dzo.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dzn> b() {
      return c;
   }

   public emm h() {
      return this.d;
   }

   @Override
   public void a(arl $$0, dhv $$1, eec $$2, dzm $$3) {
   }

   @Override
   public int a(dhb $$0) {
      return $$0.G_() + Math.min($$0.H_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dzm> a(eeq $$0, eec $$1, dhv $$2, dzm $$3) {
      List<dxq> $$4 = this.d.f();
      ji.a $$5 = new ji.a();
      edo $$6 = $$3.a(edo.a.c);
      edo $$7 = $$3.a(edo.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.H_(), $$4.size()); $$8++) {
         dxq $$9 = $$4.get($$8);
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
   public int a(int $$0, int $$1, edo.a $$2, dhb $$3, eec $$4) {
      List<dxq> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         dxq $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.G_() + $$6 + 1;
         }
      }

      return $$3.G_();
   }

   @Override
   public dhl a(int $$0, int $$1, dhb $$2, eec $$3) {
      return new dhl($$2.G_(), this.d.f().stream().limit((long)$$2.H_()).map($$0x -> $$0x == null ? dkg.a.m() : $$0x).toArray(dxq[]::new));
   }

   @Override
   public void a(List<String> $$0, eec $$1, ji $$2) {
   }

   @Override
   public void a(arl $$0, long $$1, eec $$2, die $$3, dhv $$4, dzm $$5) {
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
