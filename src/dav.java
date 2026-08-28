import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dav(boolean d, Optional<jm<brm>> e, Optional<daj> f, Optional<jq<dfy>> g, exa h, daj i, boolean j, dcw.a k, lk l, lk m, jm<avo> n) implements das {
   public static final MapCodec<dav> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dav::b),
               brm.b.optionalFieldOf("damage_type").forGetter(dav::c),
               daj.b.optionalFieldOf("knockback_multiplier").forGetter(dav::d),
               kb.a(lu.f).optionalFieldOf("immune_blocks").forGetter(dav::e),
               exa.a.optionalFieldOf("offset", exa.b).forGetter(dav::f),
               daj.b.fieldOf("radius").forGetter(dav::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dav::h),
               dcw.a.f.fieldOf("block_interaction").forGetter(dav::i),
               lm.bf.fieldOf("small_particle").forGetter(dav::j),
               lm.bf.fieldOf("large_particle").forGetter(dav::k),
               avo.b.fieldOf("sound").forGetter(dav::l)
            )
            .apply($$0, dav::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4) {
      exa $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new ddn(this.k != dcw.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private brk a(bsr $$0, exa $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new brk(this.e.get(), $$0) : new brk(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jm<brm>> c() {
      return this.e;
   }

   public Optional<daj> d() {
      return this.f;
   }

   public Optional<jq<dfy>> e() {
      return this.g;
   }

   public exa f() {
      return this.h;
   }

   public daj g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dcw.a i() {
      return this.k;
   }

   public lk j() {
      return this.l;
   }

   public lk k() {
      return this.m;
   }

   public jm<avo> l() {
      return this.n;
   }
}
