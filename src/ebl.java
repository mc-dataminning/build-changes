import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ebl extends dxr {
   public static final MapCodec<ebl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekl.a.fieldOf("settings").forGetter(ebl::h)).apply($$0, $$0.stable(ebl::new))
   );
   private final ekl d;

   public ebl(ekl $$0) {
      super(new dgz($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dxs a(js<emo> $$0, ece $$1, long $$2) {
      Stream<jq<emo>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dxs.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dxr> b() {
      return c;
   }

   public ekl h() {
      return this.d;
   }

   @Override
   public void a(arx $$0, dgi $$1, ece $$2, dxq $$3) {
   }

   @Override
   public int a(dfo $$0) {
      return $$0.K_() + Math.min($$0.L_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dxq> a(ecs $$0, ece $$1, dgi $$2, dxq $$3) {
      List<dvv> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      ebq $$6 = $$3.a(ebq.a.c);
      ebq $$7 = $$3.a(ebq.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.L_(), $$4.size()); $$8++) {
         dvv $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.K_() + $$8;

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
   public int a(int $$0, int $$1, ebq.a $$2, dfo $$3, ece $$4) {
      List<dvv> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.al()); $$6 >= 0; $$6--) {
         dvv $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.K_() + $$6 + 1;
         }
      }

      return $$3.K_();
   }

   @Override
   public dfy a(int $$0, int $$1, dfo $$2, ece $$3) {
      return new dfy($$2.K_(), this.d.f().stream().limit((long)$$2.L_()).map($$0x -> $$0x == null ? dis.a.m() : $$0x).toArray(dvv[]::new));
   }

   @Override
   public void a(List<String> $$0, ece $$1, jh $$2) {
   }

   @Override
   public void a(arx $$0, long $$1, ece $$2, dgq $$3, dgi $$4, dxq $$5) {
   }

   @Override
   public void a(arx $$0) {
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
