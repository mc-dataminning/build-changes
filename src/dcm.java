import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dcm(boolean d, Optional<jq<bsw>> e, Optional<dbz> f, Optional<ju<die>> g, ezn h, dbz i, boolean j, dfb.a k, lp l, lp m, jq<awk> n) implements dcj {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dcm::b),
               bsw.b.optionalFieldOf("damage_type").forGetter(dcm::c),
               dbz.b.optionalFieldOf("knockback_multiplier").forGetter(dcm::d),
               kf.a(lz.f).optionalFieldOf("immune_blocks").forGetter(dcm::e),
               ezn.a.optionalFieldOf("offset", ezn.c).forGetter(dcm::f),
               dbz.b.fieldOf("radius").forGetter(dcm::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dcm::h),
               dfb.a.f.fieldOf("block_interaction").forGetter(dcm::i),
               lr.bf.fieldOf("small_particle").forGetter(dcm::j),
               lr.bf.fieldOf("large_particle").forGetter(dcm::k),
               awk.b.fieldOf("sound").forGetter(dcm::l)
            )
            .apply($$0, dcm::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      ezn $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dft(this.k != dfb.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsu a(bue $$0, ezn $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsu(this.e.get(), $$0) : new bsu(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<bsw>> c() {
      return this.e;
   }

   public Optional<dbz> d() {
      return this.f;
   }

   public Optional<ju<die>> e() {
      return this.g;
   }

   public ezn f() {
      return this.h;
   }

   public dbz g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dfb.a i() {
      return this.k;
   }

   public lp j() {
      return this.l;
   }

   public lp k() {
      return this.m;
   }

   public jq<awk> l() {
      return this.n;
   }
}
