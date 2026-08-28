import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ddu(boolean d, Optional<jr<bte>> e, Optional<ddh> f, Optional<jv<djn>> g, fbb h, ddh i, boolean j, dgj.a k, lr l, lr m, jr<avz> n) implements ddr {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(ddu::b),
               bte.b.optionalFieldOf("damage_type").forGetter(ddu::c),
               ddh.b.optionalFieldOf("knockback_multiplier").forGetter(ddu::d),
               kg.a(mc.f).optionalFieldOf("immune_blocks").forGetter(ddu::e),
               fbb.a.optionalFieldOf("offset", fbb.c).forGetter(ddu::f),
               ddh.b.fieldOf("radius").forGetter(ddu::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(ddu::h),
               dgj.a.f.fieldOf("block_interaction").forGetter(ddu::i),
               lt.bi.fieldOf("small_particle").forGetter(ddu::j),
               lt.bi.fieldOf("large_particle").forGetter(ddu::k),
               avz.b.fieldOf("sound").forGetter(ddu::l)
            )
            .apply($$0, ddu::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      fbb $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dhc(this.k != dgj.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private btc a(bum $$0, fbb $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btc(this.e.get(), $$0) : new btc(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jr<bte>> c() {
      return this.e;
   }

   public Optional<ddh> d() {
      return this.f;
   }

   public Optional<jv<djn>> e() {
      return this.g;
   }

   public fbb f() {
      return this.h;
   }

   public ddh g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgj.a i() {
      return this.k;
   }

   public lr j() {
      return this.l;
   }

   public lr k() {
      return this.m;
   }

   public jr<avz> l() {
      return this.n;
   }
}
