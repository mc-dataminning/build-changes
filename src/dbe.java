import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dbe(float c, float d, List<dbe.a> e, dbe.b f, Optional<axr<buw>> g, Optional<je<awm>> h, Optional<je<awm>> i) {
   public static final Codec<dbe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dbe::b),
               ayu.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dbe::c),
               dbe.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dbe.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dbe::d),
               dbe.b.a.optionalFieldOf("item_damage", dbe.b.c).forGetter(dbe::e),
               axr.b(mg.aN).optionalFieldOf("bypassed_by").forGetter(dbe::f),
               awm.b.optionalFieldOf("block_sound").forGetter(dbe::g),
               awm.b.optionalFieldOf("disabled_sound").forGetter(dbe::h)
            )
            .apply($$0, dbe::new)
   );
   public static final yw<wj, dbe> b = yw.a(
      yu.l,
      dbe::b,
      yu.l,
      dbe::c,
      dbe.a.b.a(yu.a()),
      dbe::d,
      dbe.b.b,
      dbe::e,
      axr.c(mg.aN).a(yu::a),
      dbe::f,
      awm.d.a(yu::a),
      dbe::g,
      awm.d.a(yu::a),
      dbe::h,
      dbe::new
   );

   public void a(arq $$0, bxe $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (je<awm>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(arq $$0, bxe $$1, float $$2, czd $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof crc $$5) {
            $$5.gF().a($$3, $$4);
         }

         $$1.fF();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(dja $$0, czd $$1, bxe $$2, buc $$3, float $$4) {
      if ($$2 instanceof crc $$5) {
         if (!$$0.C) {
            $$5.b(awx.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bxe.d($$3));
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

   public float a(buu $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dbe.a $$4 : this.e) {
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

   public List<dbe.a> d() {
      return this.e;
   }

   public dbe.b e() {
      return this.f;
   }

   public Optional<axr<buw>> f() {
      return this.g;
   }

   public Optional<je<awm>> g() {
      return this.h;
   }

   public Optional<je<awm>> h() {
      return this.i;
   }

   public static record a(float c, Optional<ji<buw>> d, float e, float f) {
      public static final Codec<dbe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dbe.a::a),
                  jt.a(mg.aN).optionalFieldOf("type").forGetter(dbe.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dbe.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbe.a::d)
               )
               .apply($$0, dbe.a::new)
      );
      public static final yw<wj, dbe.a> b = yw.a(yu.l, dbe.a::a, yu.c(mg.aN).a(yu::a), dbe.a::b, yu.l, dbe.a::c, yu.l, dbe.a::d, dbe.a::new);

      public float a(buu $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azm.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<ji<buw>> b() {
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
      public static final Codec<dbe.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.n.fieldOf("threshold").forGetter(dbe.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dbe.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbe.b::c)
               )
               .apply($$0, dbe.b::new)
      );
      public static final yw<ByteBuf, dbe.b> b = yw.a(yu.l, dbe.b::a, yu.l, dbe.b::b, yu.l, dbe.b::c, dbe.b::new);
      public static final dbe.b c = new dbe.b(1.0F, 0.0F, 1.0F);

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
