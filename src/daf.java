import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record daf(boolean d, Optional<jj<brc>> e, Optional<czt> f, Optional<jn<dfi>> g, ewh h, czt i, boolean j, dcg.a k, lh l, lh m, jj<avg> n) implements dac {
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(daf::b),
               brc.b.optionalFieldOf("damage_type").forGetter(daf::c),
               czt.b.optionalFieldOf("knockback_multiplier").forGetter(daf::d),
               jy.a(lr.f).optionalFieldOf("immune_blocks").forGetter(daf::e),
               ewh.a.optionalFieldOf("offset", ewh.b).forGetter(daf::f),
               czt.b.fieldOf("radius").forGetter(daf::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(daf::h),
               dcg.a.f.fieldOf("block_interaction").forGetter(daf::i),
               lj.bf.fieldOf("small_particle").forGetter(daf::j),
               lj.bf.fieldOf("large_particle").forGetter(daf::k),
               avg.b.fieldOf("sound").forGetter(daf::l)
            )
            .apply($$0, daf::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ewh $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dcx(this.k != dcg.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bra a(bsh $$0, ewh $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bra(this.e.get(), $$0) : new bra(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jj<brc>> c() {
      return this.e;
   }

   public Optional<czt> d() {
      return this.f;
   }

   public Optional<jn<dfi>> e() {
      return this.g;
   }

   public ewh f() {
      return this.h;
   }

   public czt g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dcg.a i() {
      return this.k;
   }

   public lh j() {
      return this.l;
   }

   public lh k() {
      return this.m;
   }

   public jj<avg> l() {
      return this.n;
   }
}
