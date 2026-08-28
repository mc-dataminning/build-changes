import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dae(boolean d, Optional<jj<brb>> e, Optional<czs> f, Optional<jn<dfh>> g, ewf h, czs i, boolean j, dcf.a k, lh l, lh m, jj<avg> n) implements dab {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dae::b),
               brb.b.optionalFieldOf("damage_type").forGetter(dae::c),
               czs.b.optionalFieldOf("knockback_multiplier").forGetter(dae::d),
               jy.a(lr.f).optionalFieldOf("immune_blocks").forGetter(dae::e),
               ewf.a.optionalFieldOf("offset", ewf.b).forGetter(dae::f),
               czs.b.fieldOf("radius").forGetter(dae::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dae::h),
               dcf.a.f.fieldOf("block_interaction").forGetter(dae::i),
               lj.bf.fieldOf("small_particle").forGetter(dae::j),
               lj.bf.fieldOf("large_particle").forGetter(dae::k),
               avg.b.fieldOf("sound").forGetter(dae::l)
            )
            .apply($$0, dae::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ewf $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dcw(this.k != dcf.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bqz a(bsg $$0, ewf $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bqz(this.e.get(), $$0) : new bqz(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jj<brb>> c() {
      return this.e;
   }

   public Optional<czs> d() {
      return this.f;
   }

   public Optional<jn<dfh>> e() {
      return this.g;
   }

   public ewf f() {
      return this.h;
   }

   public czs g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dcf.a i() {
      return this.k;
   }

   public lh j() {
      return this.l;
   }

   public lh k() {
      return this.m;
   }

   public jj<avg> l() {
      return this.n;
   }
}
