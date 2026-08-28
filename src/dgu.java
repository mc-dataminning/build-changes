import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dgu(boolean d, Optional<jf<buz>> e, Optional<dgh> f, Optional<jj<dmr>> g, ffc h, dgh i, boolean j, djm.a k, lw l, lw m, jf<awm> n) implements dgr {
   public static final MapCodec<dgu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dgu::b),
               buz.b.optionalFieldOf("damage_type").forGetter(dgu::c),
               dgh.b.optionalFieldOf("knockback_multiplier").forGetter(dgu::d),
               ju.a(mh.i).optionalFieldOf("immune_blocks").forGetter(dgu::e),
               ffc.a.optionalFieldOf("offset", ffc.c).forGetter(dgu::f),
               dgh.b.fieldOf("radius").forGetter(dgu::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dgu::h),
               djm.a.f.fieldOf("block_interaction").forGetter(dgu::i),
               ly.bk.fieldOf("small_particle").forGetter(dgu::j),
               ly.bk.fieldOf("large_particle").forGetter(dgu::k),
               awm.b.fieldOf("sound").forGetter(dgu::l)
            )
            .apply($$0, dgu::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      ffc $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dkf(this.k != djm.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bux a(bwi $$0, ffc $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bux(this.e.get(), $$0) : new bux(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jf<buz>> c() {
      return this.e;
   }

   public Optional<dgh> d() {
      return this.f;
   }

   public Optional<jj<dmr>> e() {
      return this.g;
   }

   public ffc f() {
      return this.h;
   }

   public dgh g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public djm.a i() {
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
