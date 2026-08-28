import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dhr(boolean d, Optional<jg<bvv>> e, Optional<dhe> f, Optional<jk<dno>> g, fgc h, dhe i, boolean j, dkj.a k, lx l, lx m, jg<awx> n) implements dho {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dhr::b),
               bvv.b.optionalFieldOf("damage_type").forGetter(dhr::c),
               dhe.b.optionalFieldOf("knockback_multiplier").forGetter(dhr::d),
               jv.a(mi.i).optionalFieldOf("immune_blocks").forGetter(dhr::e),
               fgc.a.optionalFieldOf("offset", fgc.c).forGetter(dhr::f),
               dhe.b.fieldOf("radius").forGetter(dhr::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dhr::h),
               dkj.a.f.fieldOf("block_interaction").forGetter(dhr::i),
               lz.bk.fieldOf("small_particle").forGetter(dhr::j),
               lz.bk.fieldOf("large_particle").forGetter(dhr::k),
               awx.b.fieldOf("sound").forGetter(dhr::l)
            )
            .apply($$0, dhr::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      fgc $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dlc(this.k != dkj.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bvt a(bxe $$0, fgc $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bvt(this.e.get(), $$0) : new bvt(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jg<bvv>> c() {
      return this.e;
   }

   public Optional<dhe> d() {
      return this.f;
   }

   public Optional<jk<dno>> e() {
      return this.g;
   }

   public fgc f() {
      return this.h;
   }

   public dhe g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dkj.a i() {
      return this.k;
   }

   public lx j() {
      return this.l;
   }

   public lx k() {
      return this.m;
   }

   public jg<awx> l() {
      return this.n;
   }
}
