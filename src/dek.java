import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dek(boolean d, Optional<jq<btt>> e, Optional<ddx> f, Optional<ju<dkd>> g, fbr h, ddx i, boolean j, dgz.a k, lq l, lq m, jq<awu> n) implements deh {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dek::b),
               btt.b.optionalFieldOf("damage_type").forGetter(dek::c),
               ddx.b.optionalFieldOf("knockback_multiplier").forGetter(dek::d),
               kf.a(mb.f).optionalFieldOf("immune_blocks").forGetter(dek::e),
               fbr.a.optionalFieldOf("offset", fbr.c).forGetter(dek::f),
               ddx.b.fieldOf("radius").forGetter(dek::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dek::h),
               dgz.a.f.fieldOf("block_interaction").forGetter(dek::i),
               ls.bi.fieldOf("small_particle").forGetter(dek::j),
               ls.bi.fieldOf("large_particle").forGetter(dek::k),
               awu.b.fieldOf("sound").forGetter(dek::l)
            )
            .apply($$0, dek::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      fbr $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dhs(this.k != dgz.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private btr a(bvb $$0, fbr $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btr(this.e.get(), $$0) : new btr(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<btt>> c() {
      return this.e;
   }

   public Optional<ddx> d() {
      return this.f;
   }

   public Optional<ju<dkd>> e() {
      return this.g;
   }

   public fbr f() {
      return this.h;
   }

   public ddx g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgz.a i() {
      return this.k;
   }

   public lq j() {
      return this.l;
   }

   public lq k() {
      return this.m;
   }

   public jq<awu> l() {
      return this.n;
   }
}
