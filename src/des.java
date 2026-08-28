import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record des(boolean d, Optional<jq<bub>> e, Optional<def> f, Optional<ju<dkl>> g, fbx h, def i, boolean j, dhh.a k, lq l, lq m, jq<axe> n) implements dep {
   public static final MapCodec<des> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(des::b),
               bub.b.optionalFieldOf("damage_type").forGetter(des::c),
               def.b.optionalFieldOf("knockback_multiplier").forGetter(des::d),
               kf.a(mb.f).optionalFieldOf("immune_blocks").forGetter(des::e),
               fbx.a.optionalFieldOf("offset", fbx.c).forGetter(des::f),
               def.b.fieldOf("radius").forGetter(des::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(des::h),
               dhh.a.f.fieldOf("block_interaction").forGetter(des::i),
               ls.bh.fieldOf("small_particle").forGetter(des::j),
               ls.bh.fieldOf("large_particle").forGetter(des::k),
               axe.b.fieldOf("sound").forGetter(des::l)
            )
            .apply($$0, des::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      fbx $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dia(this.k != dhh.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private btz a(bvj $$0, fbx $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btz(this.e.get(), $$0) : new btz(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<bub>> c() {
      return this.e;
   }

   public Optional<def> d() {
      return this.f;
   }

   public Optional<ju<dkl>> e() {
      return this.g;
   }

   public fbx f() {
      return this.h;
   }

   public def g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dhh.a i() {
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
