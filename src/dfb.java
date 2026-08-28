import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dfb(boolean d, Optional<js<buj>> e, Optional<deo> f, Optional<jw<dku>> g, fcu h, deo i, boolean j, dhp.a k, lt l, lt m, js<awj> n) implements dey {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dfb::b),
               buj.b.optionalFieldOf("damage_type").forGetter(dfb::c),
               deo.b.optionalFieldOf("knockback_multiplier").forGetter(dfb::d),
               kh.a(me.f).optionalFieldOf("immune_blocks").forGetter(dfb::e),
               fcu.a.optionalFieldOf("offset", fcu.c).forGetter(dfb::f),
               deo.b.fieldOf("radius").forGetter(dfb::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dfb::h),
               dhp.a.f.fieldOf("block_interaction").forGetter(dfb::i),
               lv.bj.fieldOf("small_particle").forGetter(dfb::j),
               lv.bj.fieldOf("large_particle").forGetter(dfb::k),
               awj.b.fieldOf("sound").forGetter(dfb::l)
            )
            .apply($$0, dfb::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      fcu $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dii(this.k != dhp.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private buh a(bvs $$0, fcu $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new buh(this.e.get(), $$0) : new buh(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<js<buj>> c() {
      return this.e;
   }

   public Optional<deo> d() {
      return this.f;
   }

   public Optional<jw<dku>> e() {
      return this.g;
   }

   public fcu f() {
      return this.h;
   }

   public deo g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dhp.a i() {
      return this.k;
   }

   public lt j() {
      return this.l;
   }

   public lt k() {
      return this.m;
   }

   public js<awj> l() {
      return this.n;
   }
}
