import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ddr(boolean d, Optional<jr<btb>> e, Optional<dde> f, Optional<jv<djk>> g, fay h, dde i, boolean j, dgg.a k, lr l, lr m, jr<avy> n) implements ddo {
   public static final MapCodec<ddr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(ddr::b),
               btb.b.optionalFieldOf("damage_type").forGetter(ddr::c),
               dde.b.optionalFieldOf("knockback_multiplier").forGetter(ddr::d),
               kg.a(mc.f).optionalFieldOf("immune_blocks").forGetter(ddr::e),
               fay.a.optionalFieldOf("offset", fay.c).forGetter(ddr::f),
               dde.b.fieldOf("radius").forGetter(ddr::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(ddr::h),
               dgg.a.f.fieldOf("block_interaction").forGetter(ddr::i),
               lt.bi.fieldOf("small_particle").forGetter(ddr::j),
               lt.bi.fieldOf("large_particle").forGetter(ddr::k),
               avy.b.fieldOf("sound").forGetter(ddr::l)
            )
            .apply($$0, ddr::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      fay $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dgz(this.k != dgg.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsz a(buj $$0, fay $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsz(this.e.get(), $$0) : new bsz(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jr<btb>> c() {
      return this.e;
   }

   public Optional<dde> d() {
      return this.f;
   }

   public Optional<jv<djk>> e() {
      return this.g;
   }

   public fay f() {
      return this.h;
   }

   public dde g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgg.a i() {
      return this.k;
   }

   public lr j() {
      return this.l;
   }

   public lr k() {
      return this.m;
   }

   public jr<avy> l() {
      return this.n;
   }
}
