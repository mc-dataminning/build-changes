import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dcg(boolean d, Optional<jp<bsr>> e, Optional<dbt> f, Optional<jt<dhy>> g, ezh h, dbt i, boolean j, dev.a k, lo l, lo m, jp<awj> n) implements dcd {
   public static final MapCodec<dcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dcg::b),
               bsr.b.optionalFieldOf("damage_type").forGetter(dcg::c),
               dbt.b.optionalFieldOf("knockback_multiplier").forGetter(dcg::d),
               ke.a(ly.f).optionalFieldOf("immune_blocks").forGetter(dcg::e),
               ezh.a.optionalFieldOf("offset", ezh.c).forGetter(dcg::f),
               dbt.b.fieldOf("radius").forGetter(dcg::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dcg::h),
               dev.a.f.fieldOf("block_interaction").forGetter(dcg::i),
               lq.bf.fieldOf("small_particle").forGetter(dcg::j),
               lq.bf.fieldOf("large_particle").forGetter(dcg::k),
               awj.b.fieldOf("sound").forGetter(dcg::l)
            )
            .apply($$0, dcg::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      ezh $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dfn(this.k != dev.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsp a(btz $$0, ezh $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsp(this.e.get(), $$0) : new bsp(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jp<bsr>> c() {
      return this.e;
   }

   public Optional<dbt> d() {
      return this.f;
   }

   public Optional<jt<dhy>> e() {
      return this.g;
   }

   public ezh f() {
      return this.h;
   }

   public dbt g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dev.a i() {
      return this.k;
   }

   public lo j() {
      return this.l;
   }

   public lo k() {
      return this.m;
   }

   public jp<awj> l() {
      return this.n;
   }
}
