import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dgf(boolean d, Optional<je<buu>> e, Optional<dfs> f, Optional<ji<dma>> g, fei h, dfs i, boolean j, div.a k, lv l, lv m, je<awm> n) implements dgc {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(dgf::b),
               buu.b.optionalFieldOf("damage_type").forGetter(dgf::c),
               dfs.b.optionalFieldOf("knockback_multiplier").forGetter(dgf::d),
               jt.a(mg.i).optionalFieldOf("immune_blocks").forGetter(dgf::e),
               fei.a.optionalFieldOf("offset", fei.c).forGetter(dgf::f),
               dfs.b.fieldOf("radius").forGetter(dgf::g),
               Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(dgf::h),
               div.a.f.fieldOf("block_interaction").forGetter(dgf::i),
               lx.bk.fieldOf("small_particle").forGetter(dgf::j),
               lx.bk.fieldOf("large_particle").forGetter(dgf::k),
               awm.b.fieldOf("sound").forGetter(dgf::l)
            )
            .apply($$0, dgf::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      fei $$5 = $$4.e(this.h);
      $$0.a(
         this.d ? $$3 : null,
         this.a($$3, $$5),
         new djo(this.k != div.a.a, this.e.isPresent(), this.f.map($$1x -> $$1x.a($$1)), this.g),
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
   private bus a(bwd $$0, fei $$1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         return this.d ? new bus(this.e.get(), $$0) : new bus(this.e.get(), $$1);
      }
   }

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public boolean b() {
      return this.d;
   }

   public Optional<je<buu>> c() {
      return this.e;
   }

   public Optional<dfs> d() {
      return this.f;
   }

   public Optional<ji<dma>> e() {
      return this.g;
   }

   public fei f() {
      return this.h;
   }

   public dfs g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public div.a i() {
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
