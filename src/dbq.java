import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dbq(boolean d, Optional<jn<bsd>> e, Optional<dbd> f, Optional<jr<dgv>> g, eye h, dbd i, boolean j, dds.a k, ll l, ll m, jn<awc> n) implements dbn {
   public static final MapCodec<dbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dbq::b),
               bsd.b.optionalFieldOf("damage_type").forGetter(dbq::c),
               dbd.b.optionalFieldOf("knockback_multiplier").forGetter(dbq::d),
               kc.a(lv.f).optionalFieldOf("immune_blocks").forGetter(dbq::e),
               eye.a.optionalFieldOf("offset", eye.c).forGetter(dbq::f),
               dbd.b.fieldOf("radius").forGetter(dbq::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dbq::h),
               dds.a.f.fieldOf("block_interaction").forGetter(dbq::i),
               ln.bf.fieldOf("small_particle").forGetter(dbq::j),
               ln.bf.fieldOf("large_particle").forGetter(dbq::k),
               awc.b.fieldOf("sound").forGetter(dbq::l)
            )
            .apply($$0, dbq::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      eye $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dek(this.k != dds.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsb a(btj $$0, eye $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsb(this.e.get(), $$0) : new bsb(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jn<bsd>> c() {
      return this.e;
   }

   public Optional<dbd> d() {
      return this.f;
   }

   public Optional<jr<dgv>> e() {
      return this.g;
   }

   public eye f() {
      return this.h;
   }

   public dbd g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dds.a i() {
      return this.k;
   }

   public ll j() {
      return this.l;
   }

   public ll k() {
      return this.m;
   }

   public jn<awc> l() {
      return this.n;
   }
}
