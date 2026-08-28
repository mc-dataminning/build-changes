import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record daz(float c, float d, List<daz.a> e, daz.b f, Optional<axr<buu>> g, Optional<je<awm>> h, Optional<je<awm>> i) {
   public static final Codec<daz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(daz::b),
               ayu.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(daz::c),
               daz.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new daz.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(daz::d),
               daz.b.a.optionalFieldOf("item_damage", daz.b.c).forGetter(daz::e),
               axr.b(mg.aM).optionalFieldOf("bypassed_by").forGetter(daz::f),
               awm.b.optionalFieldOf("block_sound").forGetter(daz::g),
               awm.b.optionalFieldOf("disabled_sound").forGetter(daz::h)
            )
            .apply($$0, daz::new)
   );
   public static final yw<wj, daz> b = yw.a(
      yu.l,
      daz::b,
      yu.l,
      daz::c,
      daz.a.b.a(yu.a()),
      daz::d,
      daz.b.b,
      daz::e,
      axr.c(mg.aM).a(yu::a),
      daz::f,
      awm.d.a(yu::a),
      daz::g,
      awm.d.a(yu::a),
      daz::h,
      daz::new
   );

   public void a(arq $$0, bxc $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (je<awm>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(arq $$0, bxc $$1, float $$2, cyy $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof cqy $$5) {
            $$5.gE().a($$3, $$4);
         }

         $$1.fE();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(div $$0, cyy $$1, bxc $$2, bua $$3, float $$4) {
      if ($$2 instanceof cqy $$5) {
         if (!$$0.C) {
            $$5.b(awx.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bxc.d($$3));
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

   public float a(bus $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (daz.a $$4 : this.e) {
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

   public List<daz.a> d() {
      return this.e;
   }

   public daz.b e() {
      return this.f;
   }

   public Optional<axr<buu>> f() {
      return this.g;
   }

   public Optional<je<awm>> g() {
      return this.h;
   }

   public Optional<je<awm>> h() {
      return this.i;
   }

   public static record a(float c, Optional<ji<buu>> d, float e, float f) {
      public static final Codec<daz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(daz.a::a),
                  jt.a(mg.aM).optionalFieldOf("type").forGetter(daz.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(daz.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(daz.a::d)
               )
               .apply($$0, daz.a::new)
      );
      public static final yw<wj, daz.a> b = yw.a(yu.l, daz.a::a, yu.c(mg.aM).a(yu::a), daz.a::b, yu.l, daz.a::c, yu.l, daz.a::d, daz.a::new);

      public float a(bus $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azm.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<ji<buu>> b() {
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
      public static final Codec<daz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.n.fieldOf("threshold").forGetter(daz.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(daz.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(daz.b::c)
               )
               .apply($$0, daz.b::new)
      );
      public static final yw<ByteBuf, daz.b> b = yw.a(yu.l, daz.b::a, yu.l, daz.b::b, yu.l, daz.b::c, daz.b::new);
      public static final daz.b c = new daz.b(1.0F, 0.0F, 1.0F);

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
