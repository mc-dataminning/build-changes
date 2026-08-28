import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dfz(boolean d, Optional<je<bur>> e, Optional<dfm> f, Optional<ji<dlu>> g, fdw h, dfm i, boolean j, dip.a k, lv l, lv m, je<awk> n) implements dfw {
   public static final MapCodec<dfz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dfz::b),
               bur.b.optionalFieldOf("damage_type").forGetter(dfz::c),
               dfm.b.optionalFieldOf("knockback_multiplier").forGetter(dfz::d),
               jt.a(mg.i).optionalFieldOf("immune_blocks").forGetter(dfz::e),
               fdw.a.optionalFieldOf("offset", fdw.c).forGetter(dfz::f),
               dfm.b.fieldOf("radius").forGetter(dfz::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dfz::h),
               dip.a.f.fieldOf("block_interaction").forGetter(dfz::i),
               lx.bj.fieldOf("small_particle").forGetter(dfz::j),
               lx.bj.fieldOf("large_particle").forGetter(dfz::k),
               awk.b.fieldOf("sound").forGetter(dfz::l)
            )
            .apply($$0, dfz::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      fdw $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new dji(this.k != dip.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bup a(bwa $$0, fdw $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bup(this.e.get(), $$0) : new bup(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<je<bur>> c() {
      return this.e;
   }

   public Optional<dfm> d() {
      return this.f;
   }

   public Optional<ji<dlu>> e() {
      return this.g;
   }

   public fdw f() {
      return this.h;
   }

   public dfm g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dip.a i() {
      return this.k;
   }

   public lv j() {
      return this.l;
   }

   public lv k() {
      return this.m;
   }

   public je<awk> l() {
      return this.n;
   }
}
