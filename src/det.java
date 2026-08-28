import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record det(boolean d, Optional<jq<buc>> e, Optional<deg> f, Optional<ju<dkm>> g, fby h, deg i, boolean j, dhi.a k, lq l, lq m, jq<axe> n) implements deq {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(det::b),
               buc.b.optionalFieldOf("damage_type").forGetter(det::c),
               deg.b.optionalFieldOf("knockback_multiplier").forGetter(det::d),
               kf.a(mb.f).optionalFieldOf("immune_blocks").forGetter(det::e),
               fby.a.optionalFieldOf("offset", fby.c).forGetter(det::f),
               deg.b.fieldOf("radius").forGetter(det::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(det::h),
               dhi.a.f.fieldOf("block_interaction").forGetter(det::i),
               ls.bh.fieldOf("small_particle").forGetter(det::j),
               ls.bh.fieldOf("large_particle").forGetter(det::k),
               axe.b.fieldOf("sound").forGetter(det::l)
            )
            .apply($$0, det::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      fby $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dib(this.k != dhi.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
         $$5.a(),
         $$5.b(),
         $$5.c(),
         Math.max(this.i.a($$1), 0.0F),
         this.j,
         this.k,
         this.l,
         this.m,
         this.n
      );
   }

   @Nullable
   private bua a(bvk $$0, fby $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bua(this.e.get(), $$0) : new bua(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<buc>> c() {
      return this.e;
   }

   public Optional<deg> d() {
      return this.f;
   }

   public Optional<ju<dkm>> e() {
      return this.g;
   }

   public fby f() {
      return this.h;
   }

   public deg g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dhi.a i() {
      return this.k;
   }

   public lq j() {
      return this.l;
   }

   public lq k() {
      return this.m;
   }

   public jq<axe> l() {
      return this.n;
   }
}
