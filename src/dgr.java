import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dgr(boolean d, Optional<jf<buz>> e, Optional<dge> f, Optional<jj<dmm>> g, fex h, dge i, boolean j, djh.a k, lw l, lw m, jf<awm> n) implements dgo {
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dgr::b),
               buz.b.optionalFieldOf("damage_type").forGetter(dgr::c),
               dge.b.optionalFieldOf("knockback_multiplier").forGetter(dgr::d),
               ju.a(mh.i).optionalFieldOf("immune_blocks").forGetter(dgr::e),
               fex.a.optionalFieldOf("offset", fex.c).forGetter(dgr::f),
               dge.b.fieldOf("radius").forGetter(dgr::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dgr::h),
               djh.a.f.fieldOf("block_interaction").forGetter(dgr::i),
               ly.bk.fieldOf("small_particle").forGetter(dgr::j),
               ly.bk.fieldOf("large_particle").forGetter(dgr::k),
               awm.b.fieldOf("sound").forGetter(dgr::l)
            )
            .apply($$0, dgr::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      fex $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dka(this.k != djh.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bux a(bwi $$0, fex $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bux(this.e.get(), $$0) : new bux(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jf<buz>> c() {
      return this.e;
   }

   public Optional<dge> d() {
      return this.f;
   }

   public Optional<jj<dmm>> e() {
      return this.g;
   }

   public fex f() {
      return this.h;
   }

   public dge g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public djh.a i() {
      return this.k;
   }

   public lw j() {
      return this.l;
   }

   public lw k() {
      return this.m;
   }

   public jf<awm> l() {
      return this.n;
   }
}
