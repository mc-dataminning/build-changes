import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dcx(boolean d, Optional<jq<btd>> e, Optional<dck> f, Optional<ju<diq>> g, ezy h, dck i, boolean j, dfm.a k, lq l, lq m, jq<awm> n) implements dcu {
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dcx::b),
               btd.b.optionalFieldOf("damage_type").forGetter(dcx::c),
               dck.b.optionalFieldOf("knockback_multiplier").forGetter(dcx::d),
               kf.a(ma.f).optionalFieldOf("immune_blocks").forGetter(dcx::e),
               ezy.a.optionalFieldOf("offset", ezy.c).forGetter(dcx::f),
               dck.b.fieldOf("radius").forGetter(dcx::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dcx::h),
               dfm.a.f.fieldOf("block_interaction").forGetter(dcx::i),
               ls.bf.fieldOf("small_particle").forGetter(dcx::j),
               ls.bf.fieldOf("large_particle").forGetter(dcx::k),
               awm.b.fieldOf("sound").forGetter(dcx::l)
            )
            .apply($$0, dcx::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      ezy $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dgf(this.k != dfm.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private btb a(bul $$0, ezy $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btb(this.e.get(), $$0) : new btb(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<btd>> c() {
      return this.e;
   }

   public Optional<dck> d() {
      return this.f;
   }

   public Optional<ju<diq>> e() {
      return this.g;
   }

   public ezy f() {
      return this.h;
   }

   public dck g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dfm.a i() {
      return this.k;
   }

   public lq j() {
      return this.l;
   }

   public lq k() {
      return this.m;
   }

   public jq<awm> l() {
      return this.n;
   }
}
