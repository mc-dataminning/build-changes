import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dch(boolean d, Optional<jo<bsl>> e, Optional<dbu> f, Optional<js<dhm>> g, eyw h, dbu i, boolean j, dej.a k, lm l, lm m, jo<awf> n) implements dce {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dch::b),
               bsl.b.optionalFieldOf("damage_type").forGetter(dch::c),
               dbu.b.optionalFieldOf("knockback_multiplier").forGetter(dch::d),
               kd.a(lw.f).optionalFieldOf("immune_blocks").forGetter(dch::e),
               eyw.a.optionalFieldOf("offset", eyw.c).forGetter(dch::f),
               dbu.b.fieldOf("radius").forGetter(dch::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dch::h),
               dej.a.f.fieldOf("block_interaction").forGetter(dch::i),
               lo.bf.fieldOf("small_particle").forGetter(dch::j),
               lo.bf.fieldOf("large_particle").forGetter(dch::k),
               awf.b.fieldOf("sound").forGetter(dch::l)
            )
            .apply($$0, dch::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      eyw $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dfb(this.k != dej.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bsj a(btr $$0, eyw $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bsj(this.e.get(), $$0) : new bsj(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<jo<bsl>> c() {
      return this.e;
   }

   public Optional<dbu> d() {
      return this.f;
   }

   public Optional<js<dhm>> e() {
      return this.g;
   }

   public eyw f() {
      return this.h;
   }

   public dbu g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dej.a i() {
      return this.k;
   }

   public lm j() {
      return this.l;
   }

   public lm k() {
      return this.m;
   }

   public jo<awf> l() {
      return this.n;
   }
}
