import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record del(boolean d, Optional<jq<btx>> e, Optional<ddy> f, Optional<ju<dke>> g, fbs h, ddy i, boolean j, dha.a k, lq l, lq m, jq<axe> n) implements dei {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(del::b),
               btx.b.optionalFieldOf("damage_type").forGetter(del::c),
               ddy.b.optionalFieldOf("knockback_multiplier").forGetter(del::d),
               kf.a(mb.f).optionalFieldOf("immune_blocks").forGetter(del::e),
               fbs.a.optionalFieldOf("offset", fbs.c).forGetter(del::f),
               ddy.b.fieldOf("radius").forGetter(del::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(del::h),
               dha.a.f.fieldOf("block_interaction").forGetter(del::i),
               ls.bh.fieldOf("small_particle").forGetter(del::j),
               ls.bh.fieldOf("large_particle").forGetter(del::k),
               axe.b.fieldOf("sound").forGetter(del::l)
            )
            .apply($$0, del::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      fbs $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dht(this.k != dha.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private btv a(bvf $$0, fbs $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new btv(this.e.get(), $$0) : new btv(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jq<btx>> c() {
      return this.e;
   }

   public Optional<ddy> d() {
      return this.f;
   }

   public Optional<ju<dke>> e() {
      return this.g;
   }

   public fbs f() {
      return this.h;
   }

   public ddy g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dha.a i() {
      return this.k;
   }

   public lq j() {
      return this.l;
   }

   public lq k() {
      return this.m;
   }

   public jq<axe> l() {
      return this.n;
   }
}
