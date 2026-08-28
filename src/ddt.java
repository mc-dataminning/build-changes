import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ddt(boolean d, Optional<jr<btc>> e, Optional<ddg> f, Optional<jv<djm>> g, fba h, ddg i, boolean j, dgi.a k, lr l, lr m, jr<avz> n) implements ddq {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(ddt::b),
               btc.b.optionalFieldOf("damage_type").forGetter(ddt::c),
               ddg.b.optionalFieldOf("knockback_multiplier").forGetter(ddt::d),
               kg.a(mc.f).optionalFieldOf("immune_blocks").forGetter(ddt::e),
               fba.a.optionalFieldOf("offset", fba.c).forGetter(ddt::f),
               ddg.b.fieldOf("radius").forGetter(ddt::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(ddt::h),
               dgi.a.f.fieldOf("block_interaction").forGetter(ddt::i),
               lt.bi.fieldOf("small_particle").forGetter(ddt::j),
               lt.bi.fieldOf("large_particle").forGetter(ddt::k),
               avz.b.fieldOf("sound").forGetter(ddt::l)
            )
            .apply($$0, ddt::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      fba $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dhb(this.k != dgi.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bta a(buk $$0, fba $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bta(this.e.get(), $$0) : new bta(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jr<btc>> c() {
      return this.e;
   }

   public Optional<ddg> d() {
      return this.f;
   }

   public Optional<jv<djm>> e() {
      return this.g;
   }

   public fba f() {
      return this.h;
   }

   public ddg g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dgi.a i() {
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
