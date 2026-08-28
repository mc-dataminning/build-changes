import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dat(boolean d, Optional<jm<brl>> e, Optional<dah> f, Optional<jq<dfw>> g, eww h, dah i, boolean j, dcu.a k, lk l, lk m, jm<avn> n) implements daq {
   public static final MapCodec<dat> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dat::b),
               brl.b.optionalFieldOf("damage_type").forGetter(dat::c),
               dah.b.optionalFieldOf("knockback_multiplier").forGetter(dat::d),
               kb.a(lu.f).optionalFieldOf("immune_blocks").forGetter(dat::e),
               eww.a.optionalFieldOf("offset", eww.b).forGetter(dat::f),
               dah.b.fieldOf("radius").forGetter(dat::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dat::h),
               dcu.a.f.fieldOf("block_interaction").forGetter(dat::i),
               lm.bf.fieldOf("small_particle").forGetter(dat::j),
               lm.bf.fieldOf("large_particle").forGetter(dat::k),
               avn.b.fieldOf("sound").forGetter(dat::l)
            )
            .apply($$0, dat::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      eww $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new ddl(this.k != dcu.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private brj a(bsq $$0, eww $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new brj(this.e.get(), $$0) : new brj(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jm<brl>> c() {
      return this.e;
   }

   public Optional<dah> d() {
      return this.f;
   }

   public Optional<jq<dfw>> e() {
      return this.g;
   }

   public eww f() {
      return this.h;
   }

   public dah g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dcu.a i() {
      return this.k;
   }

   public lk j() {
      return this.l;
   }

   public lk k() {
      return this.m;
   }

   public jm<avn> l() {
      return this.n;
   }
}
