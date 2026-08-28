import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dbl(float c, float d, List<dbl.a> e, dbl.b f, Optional<axr<buz>> g, Optional<jf<awm>> h, Optional<jf<awm>> i) {
   public static final Codec<dbl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dbl::b),
               ayu.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dbl::c),
               dbl.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dbl.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dbl::d),
               dbl.b.a.optionalFieldOf("item_damage", dbl.b.c).forGetter(dbl::e),
               axr.b(mh.aN).optionalFieldOf("bypassed_by").forGetter(dbl::f),
               awm.b.optionalFieldOf("block_sound").forGetter(dbl::g),
               awm.b.optionalFieldOf("disabled_sound").forGetter(dbl::h)
            )
            .apply($$0, dbl::new)
   );
   public static final yw<wj, dbl> b = yw.a(
      yu.l,
      dbl::b,
      yu.l,
      dbl::c,
      dbl.a.b.a(yu.a()),
      dbl::d,
      dbl.b.b,
      dbl::e,
      axr.c(mh.aN).a(yu::a),
      dbl::f,
      awm.d.a(yu::a),
      dbl::g,
      awm.d.a(yu::a),
      dbl::h,
      dbl::new
   );

   public void a(arq $$0, bxj $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (jf<awm>)$$2, $$1.dl(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(arq $$0, bxj $$1, float $$2, czk $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof crj $$5) {
            $$5.gE().a($$3, $$4);
         }

         $$1.fE();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$2x, $$1.dl(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(djh $$0, czk $$1, bxj $$2, buf $$3, float $$4) {
      if ($$2 instanceof crj $$5) {
         if (!$$0.C) {
            $$5.b(awx.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bxj.d($$3));
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

   public float a(bux $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dbl.a $$4 : this.e) {
         $$3 += $$4.a($$0, $$1, $$2);
      }

      return azm.a($$3, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dbl.a> d() {
      return this.e;
   }

   public dbl.b e() {
      return this.f;
   }

   public Optional<axr<buz>> f() {
      return this.g;
   }

   public Optional<jf<awm>> g() {
      return this.h;
   }

   public Optional<jf<awm>> h() {
      return this.i;
   }

   public static record a(float c, Optional<jj<buz>> d, float e, float f) {
      public static final Codec<dbl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dbl.a::a),
                  ju.a(mh.aN).optionalFieldOf("type").forGetter(dbl.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dbl.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbl.a::d)
               )
               .apply($$0, dbl.a::new)
      );
      public static final yw<wj, dbl.a> b = yw.a(yu.l, dbl.a::a, yu.c(mh.aN).a(yu::a), dbl.a::b, yu.l, dbl.a::c, yu.l, dbl.a::d, dbl.a::new);

      public float a(bux $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azm.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<jj<buz>> b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float d, float e, float f) {
      public static final Codec<dbl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.n.fieldOf("threshold").forGetter(dbl.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dbl.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbl.b::c)
               )
               .apply($$0, dbl.b::new)
      );
      public static final yw<ByteBuf, dbl.b> b = yw.a(yu.l, dbl.b::a, yu.l, dbl.b::b, yu.l, dbl.b::c, dbl.b::new);
      public static final dbl.b c = new dbl.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : azm.d(this.e + this.f * $$0);
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
