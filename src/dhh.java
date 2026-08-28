import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dhh(boolean d, Optional<jg<bvm>> e, Optional<dgu> f, Optional<jk<dne>> g, ffs h, dgu i, boolean j, djz.a k, lx l, lx m, jg<awq> n) implements dhe {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dhh::b),
               bvm.b.optionalFieldOf("damage_type").forGetter(dhh::c),
               dgu.b.optionalFieldOf("knockback_multiplier").forGetter(dhh::d),
               jv.a(mi.i).optionalFieldOf("immune_blocks").forGetter(dhh::e),
               ffs.a.optionalFieldOf("offset", ffs.c).forGetter(dhh::f),
               dgu.b.fieldOf("radius").forGetter(dhh::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dhh::h),
               djz.a.f.fieldOf("block_interaction").forGetter(dhh::i),
               lz.bk.fieldOf("small_particle").forGetter(dhh::j),
               lz.bk.fieldOf("large_particle").forGetter(dhh::k),
               awq.b.fieldOf("sound").forGetter(dhh::l)
            )
            .apply($$0, dhh::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      ffs $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dks(this.k != djz.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bvk a(bwv $$0, ffs $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bvk(this.e.get(), $$0) : new bvk(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jg<bvm>> c() {
      return this.e;
   }

   public Optional<dgu> d() {
      return this.f;
   }

   public Optional<jk<dne>> e() {
      return this.g;
   }

   public ffs f() {
      return this.h;
   }

   public dgu g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public djz.a i() {
      return this.k;
   }

   public lx j() {
      return this.l;
   }

   public lx k() {
      return this.m;
   }

   public jg<awq> l() {
      return this.n;
   }
}
