import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record del(boolean d, Optional<jr<btr>> e, Optional<ddy> f, Optional<jv<dke>> g, fbx h, ddy i, boolean j, dgz.a k, lr l, lr m, jr<avz> n) implements dei {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(del::b),
               btr.b.optionalFieldOf("damage_type").forGetter(del::c),
               ddy.b.optionalFieldOf("knockback_multiplier").forGetter(del::d),
               kg.a(mc.f).optionalFieldOf("immune_blocks").forGetter(del::e),
               fbx.a.optionalFieldOf("offset", fbx.c).forGetter(del::f),
               ddy.b.fieldOf("radius").forGetter(del::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(del::h),
               dgz.a.f.fieldOf("block_interaction").forGetter(del::i),
               lt.bj.fieldOf("small_particle").forGetter(del::j),
               lt.bj.fieldOf("large_particle").forGetter(del::k),
               avz.b.fieldOf("sound").forGetter(del::l)
            )
            .apply($$0, del::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      fbx $$5 = $$4.e(this.h);
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
   private btp a(bva $$0, fbx $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btp(this.e.get(), $$0) : new btp(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jr<btr>> c() {
      return this.e;
   }

   public Optional<ddy> d() {
      return this.f;
   }

   public Optional<jv<dke>> e() {
      return this.g;
   }

   public fbx f() {
      return this.h;
   }

   public ddy g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgz.a i() {
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
