import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dcq(boolean d, Optional<jq<bta>> e, Optional<dcd> f, Optional<ju<dij>> g, ezr h, dcd i, boolean j, dff.a k, lq l, lq m, jq<awn> n) implements dcn {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dcq::b),
               bta.b.optionalFieldOf("damage_type").forGetter(dcq::c),
               dcd.b.optionalFieldOf("knockback_multiplier").forGetter(dcq::d),
               kf.a(ma.f).optionalFieldOf("immune_blocks").forGetter(dcq::e),
               ezr.a.optionalFieldOf("offset", ezr.c).forGetter(dcq::f),
               dcd.b.fieldOf("radius").forGetter(dcq::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dcq::h),
               dff.a.f.fieldOf("block_interaction").forGetter(dcq::i),
               ls.bf.fieldOf("small_particle").forGetter(dcq::j),
               ls.bf.fieldOf("large_particle").forGetter(dcq::k),
               awn.b.fieldOf("sound").forGetter(dcq::l)
            )
            .apply($$0, dcq::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      ezr $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dfy(this.k != dff.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsy a(bui $$0, ezr $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsy(this.e.get(), $$0) : new bsy(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<bta>> c() {
      return this.e;
   }

   public Optional<dcd> d() {
      return this.f;
   }

   public Optional<ju<dij>> e() {
      return this.g;
   }

   public ezr f() {
      return this.h;
   }

   public dcd g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dff.a i() {
      return this.k;
   }

   public lq j() {
      return this.l;
   }

   public lq k() {
      return this.m;
   }

   public jq<awn> l() {
      return this.n;
   }
}
