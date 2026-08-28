import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dds(boolean d, Optional<jr<btc>> e, Optional<ddf> f, Optional<jv<djl>> g, faz h, ddf i, boolean j, dgh.a k, lr l, lr m, jr<avz> n) implements ddp {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dds::b),
               btc.b.optionalFieldOf("damage_type").forGetter(dds::c),
               ddf.b.optionalFieldOf("knockback_multiplier").forGetter(dds::d),
               kg.a(mc.f).optionalFieldOf("immune_blocks").forGetter(dds::e),
               faz.a.optionalFieldOf("offset", faz.c).forGetter(dds::f),
               ddf.b.fieldOf("radius").forGetter(dds::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dds::h),
               dgh.a.f.fieldOf("block_interaction").forGetter(dds::i),
               lt.bi.fieldOf("small_particle").forGetter(dds::j),
               lt.bi.fieldOf("large_particle").forGetter(dds::k),
               avz.b.fieldOf("sound").forGetter(dds::l)
            )
            .apply($$0, dds::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      faz $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dha(this.k != dgh.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bta a(buk $$0, faz $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bta(this.e.get(), $$0) : new bta(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jr<btc>> c() {
      return this.e;
   }

   public Optional<ddf> d() {
      return this.f;
   }

   public Optional<jv<djl>> e() {
      return this.g;
   }

   public faz f() {
      return this.h;
   }

   public ddf g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgh.a i() {
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
