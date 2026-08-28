import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dce(boolean d, Optional<jn<bsi>> e, Optional<dbr> f, Optional<jr<dhj>> g, eys h, dbr i, boolean j, deg.a k, ll l, ll m, jn<awd> n) implements dcb {
   public static final MapCodec<dce> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dce::b),
               bsi.b.optionalFieldOf("damage_type").forGetter(dce::c),
               dbr.b.optionalFieldOf("knockback_multiplier").forGetter(dce::d),
               kc.a(lv.f).optionalFieldOf("immune_blocks").forGetter(dce::e),
               eys.a.optionalFieldOf("offset", eys.c).forGetter(dce::f),
               dbr.b.fieldOf("radius").forGetter(dce::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dce::h),
               deg.a.f.fieldOf("block_interaction").forGetter(dce::i),
               ln.bf.fieldOf("small_particle").forGetter(dce::j),
               ln.bf.fieldOf("large_particle").forGetter(dce::k),
               awd.b.fieldOf("sound").forGetter(dce::l)
            )
            .apply($$0, dce::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      eys $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dey(this.k != deg.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsg a(bto $$0, eys $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsg(this.e.get(), $$0) : new bsg(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jn<bsi>> c() {
      return this.e;
   }

   public Optional<dbr> d() {
      return this.f;
   }

   public Optional<jr<dhj>> e() {
      return this.g;
   }

   public eys f() {
      return this.h;
   }

   public dbr g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public deg.a i() {
      return this.k;
   }

   public ll j() {
      return this.l;
   }

   public ll k() {
      return this.m;
   }

   public jn<awd> l() {
      return this.n;
   }
}
