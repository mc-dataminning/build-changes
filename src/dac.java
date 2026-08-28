import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dac(boolean d, Optional<jj<bqy>> e, Optional<czq> f, Optional<jn<dff>> g, evz h, czq i, boolean j, dcd.a k, lh l, lh m, jj<ave> n) implements czz {
   public static final MapCodec<dac> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dac::b),
               bqy.b.optionalFieldOf("damage_type").forGetter(dac::c),
               czq.b.optionalFieldOf("knockback_multiplier").forGetter(dac::d),
               jy.a(lr.f).optionalFieldOf("immune_blocks").forGetter(dac::e),
               evz.a.optionalFieldOf("offset", evz.b).forGetter(dac::f),
               czq.b.fieldOf("radius").forGetter(dac::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dac::h),
               dcd.a.f.fieldOf("block_interaction").forGetter(dac::i),
               lj.bf.fieldOf("small_particle").forGetter(dac::j),
               lj.bf.fieldOf("large_particle").forGetter(dac::k),
               ave.b.fieldOf("sound").forGetter(dac::l)
            )
            .apply($$0, dac::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      evz $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dcu(this.k != dcd.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bqw a(bsd $$0, evz $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bqw(this.e.get(), $$0) : new bqw(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jj<bqy>> c() {
      return this.e;
   }

   public Optional<czq> d() {
      return this.f;
   }

   public Optional<jn<dff>> e() {
      return this.g;
   }

   public evz f() {
      return this.h;
   }

   public czq g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dcd.a i() {
      return this.k;
   }

   public lh j() {
      return this.l;
   }

   public lh k() {
      return this.m;
   }

   public jj<ave> l() {
      return this.n;
   }
}
