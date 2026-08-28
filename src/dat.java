import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dat(float c, float d, List<dat.a> e, dat.b f, Optional<je<awk>> g, Optional<je<awk>> h) {
   public static final Codec<dat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dat::b),
               ays.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dat::c),
               dat.a.a.listOf().optionalFieldOf("damage_reductions", List.of(dat.a.c)).forGetter(dat::d),
               dat.b.a.optionalFieldOf("item_damage", dat.b.c).forGetter(dat::e),
               awk.b.optionalFieldOf("block_sound").forGetter(dat::f),
               awk.b.optionalFieldOf("disabled_sound").forGetter(dat::g)
            )
            .apply($$0, dat::new)
   );
   public static final yu<wh, dat> b = yu.a(
      ys.l, dat::b, ys.l, dat::c, dat.a.b.a(ys.a()), dat::d, dat.b.b, dat::e, awk.d.a(ys::a), dat::f, awk.d.a(ys::a), dat::g, dat::new
   );

   public void a(aro $$0, bwz $$1) {
      this.g.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (je<awk>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(aro $$0, bwz $$1, float $$2, cys $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof cqs $$5) {
            $$5.gE().a($$3, $$4);
         }

         $$1.fE();
         this.h.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(dip $$0, cys $$1, bwz $$2, btx $$3, float $$4) {
      if ($$2 instanceof cqs $$5) {
         if (!$$0.C) {
            $$5.b(awv.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bwz.d($$3));
         }
      }
   }

   private int a(float $$0) {
      float $$1 = $$0 * this.d;
      return $$1 > 0.0F ? Math.round($$1 * 20.0F) : 0;
   }

   public int a() {
      return Math.round(this.c * 20.0F);
   }

   public float a(bup $$0, float $$1) {
      float $$2 = 0.0F;

      for (dat.a $$3 : this.e) {
         $$2 += $$3.a($$0, $$1);
      }

      return azk.a($$2, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dat.a> d() {
      return this.e;
   }

   public dat.b e() {
      return this.f;
   }

   public Optional<je<awk>> f() {
      return this.g;
   }

   public Optional<je<awk>> g() {
      return this.h;
   }

   public static record a(Optional<ji<bur>> d, float e, float f) {
      public static final Codec<dat.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.aL).optionalFieldOf("type").forGetter(dat.a::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dat.a::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dat.a::c)
               )
               .apply($$0, dat.a::new)
      );
      public static final yu<wh, dat.a> b = yu.a(ys.c(mg.aL).a(ys::a), dat.a::a, ys.l, dat.a::b, ys.l, dat.a::c, dat.a::new);
      public static final dat.a c = new dat.a(Optional.empty(), 0.0F, 1.0F);

      public float a(bup $$0, float $$1) {
         return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azk.a(this.e + this.f * $$1, 0.0F, $$1);
      }

      public Optional<ji<bur>> a() {
         return this.d;
      }

      public float b() {
         return this.e;
      }

      public float c() {
         return this.f;
      }
   }

   public static record b(float d, float e, float f) {
      public static final Codec<dat.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ays.n.fieldOf("threshold").forGetter(dat.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dat.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dat.b::c)
               )
               .apply($$0, dat.b::new)
      );
      public static final yu<ByteBuf, dat.b> b = yu.a(ys.l, dat.b::a, ys.l, dat.b::b, ys.l, dat.b::c, dat.b::new);
      public static final dat.b c = new dat.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : azk.d(this.e + this.f * $$0);
      }

      public float a() {
         return this.d;
      }

      public float b() {
         return this.e;
      }

      public float c() {
         return this.f;
      }
   }
}
