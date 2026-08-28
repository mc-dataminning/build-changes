import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dgk(boolean d, Optional<je<buw>> e, Optional<dfx> f, Optional<ji<dmf>> g, feq h, dfx i, boolean j, dja.a k, lv l, lv m, je<awm> n) implements dgh {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dgk::b),
               buw.b.optionalFieldOf("damage_type").forGetter(dgk::c),
               dfx.b.optionalFieldOf("knockback_multiplier").forGetter(dgk::d),
               jt.a(mg.i).optionalFieldOf("immune_blocks").forGetter(dgk::e),
               feq.a.optionalFieldOf("offset", feq.c).forGetter(dgk::f),
               dfx.b.fieldOf("radius").forGetter(dgk::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dgk::h),
               dja.a.f.fieldOf("block_interaction").forGetter(dgk::i),
               lx.bk.fieldOf("small_particle").forGetter(dgk::j),
               lx.bk.fieldOf("large_particle").forGetter(dgk::k),
               awm.b.fieldOf("sound").forGetter(dgk::l)
            )
            .apply($$0, dgk::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      feq $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new djt(this.k != dja.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private buu a(bwf $$0, feq $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new buu(this.e.get(), $$0) : new buu(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<je<buw>> c() {
      return this.e;
   }

   public Optional<dfx> d() {
      return this.f;
   }

   public Optional<ji<dmf>> e() {
      return this.g;
   }

   public feq f() {
      return this.h;
   }

   public dfx g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public dja.a i() {
      return this.k;
   }

   public lv j() {
      return this.l;
   }

   public lv k() {
      return this.m;
   }

   public je<awm> l() {
      return this.n;
   }
}
