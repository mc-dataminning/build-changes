import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dhf(boolean d, Optional<jf<bvk>> e, Optional<dgs> f, Optional<jj<dnc>> g, ffq h, dgs i, boolean j, djx.a k, lw l, lw m, jf<awo> n) implements dhc {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dhf::b),
               bvk.b.optionalFieldOf("damage_type").forGetter(dhf::c),
               dgs.b.optionalFieldOf("knockback_multiplier").forGetter(dhf::d),
               ju.a(mh.i).optionalFieldOf("immune_blocks").forGetter(dhf::e),
               ffq.a.optionalFieldOf("offset", ffq.c).forGetter(dhf::f),
               dgs.b.fieldOf("radius").forGetter(dhf::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dhf::h),
               djx.a.f.fieldOf("block_interaction").forGetter(dhf::i),
               ly.bk.fieldOf("small_particle").forGetter(dhf::j),
               ly.bk.fieldOf("large_particle").forGetter(dhf::k),
               awo.b.fieldOf("sound").forGetter(dhf::l)
            )
            .apply($$0, dhf::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      ffq $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dkq(this.k != djx.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bvi a(bwt $$0, ffq $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bvi(this.e.get(), $$0) : new bvi(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jf<bvk>> c() {
      return this.e;
   }

   public Optional<dgs> d() {
      return this.f;
   }

   public Optional<jj<dnc>> e() {
      return this.g;
   }

   public ffq f() {
      return this.h;
   }

   public dgs g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public djx.a i() {
      return this.k;
   }

   public lw j() {
      return this.l;
   }

   public lw k() {
      return this.m;
   }

   public jf<awo> l() {
      return this.n;
   }
}
