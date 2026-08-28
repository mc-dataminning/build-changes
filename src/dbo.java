import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dbo(float c, float d, List<dbo.a> e, dbo.b f, Optional<axr<buz>> g, Optional<jf<awm>> h, Optional<jf<awm>> i) {
   public static final Codec<dbo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dbo::b),
               ayu.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dbo::c),
               dbo.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dbo.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dbo::d),
               dbo.b.a.optionalFieldOf("item_damage", dbo.b.c).forGetter(dbo::e),
               axr.b(mh.aN).optionalFieldOf("bypassed_by").forGetter(dbo::f),
               awm.b.optionalFieldOf("block_sound").forGetter(dbo::g),
               awm.b.optionalFieldOf("disabled_sound").forGetter(dbo::h)
            )
            .apply($$0, dbo::new)
   );
   public static final yw<wj, dbo> b = yw.a(
      yu.l,
      dbo::b,
      yu.l,
      dbo::c,
      dbo.a.b.a(yu.a()),
      dbo::d,
      dbo.b.b,
      dbo::e,
      axr.c(mh.aN).a(yu::a),
      dbo::f,
      awm.d.a(yu::a),
      dbo::g,
      awm.d.a(yu::a),
      dbo::h,
      dbo::new
   );

   public void a(arq $$0, bxj $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (jf<awm>)$$2, $$1.dl(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(arq $$0, bxj $$1, float $$2, czn $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof crm $$5) {
            $$5.gE().a($$3, $$4);
         }

         $$1.fE();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$2x, $$1.dl(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(djm $$0, czn $$1, bxj $$2, buf $$3, float $$4) {
      if ($$2 instanceof crm $$5) {
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

      for (dbo.a $$4 : this.e) {
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

   public List<dbo.a> d() {
      return this.e;
   }

   public dbo.b e() {
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
      public static final Codec<dbo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dbo.a::a),
                  ju.a(mh.aN).optionalFieldOf("type").forGetter(dbo.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dbo.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbo.a::d)
               )
               .apply($$0, dbo.a::new)
      );
      public static final yw<wj, dbo.a> b = yw.a(yu.l, dbo.a::a, yu.c(mh.aN).a(yu::a), dbo.a::b, yu.l, dbo.a::c, yu.l, dbo.a::d, dbo.a::new);

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
      public static final Codec<dbo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.n.fieldOf("threshold").forGetter(dbo.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dbo.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbo.b::c)
               )
               .apply($$0, dbo.b::new)
      );
      public static final yw<ByteBuf, dbo.b> b = yw.a(yu.l, dbo.b::a, yu.l, dbo.b::b, yu.l, dbo.b::c, dbo.b::new);
      public static final dbo.b c = new dbo.b(1.0F, 0.0F, 1.0F);

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
