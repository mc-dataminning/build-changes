import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dcb(float c, float d, List<dcb.a> e, dcb.b f, Optional<axv<bvm>> g, Optional<jg<awq>> h, Optional<jg<awq>> i) {
   public static final Codec<dcb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dcb::b),
               ayy.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dcb::c),
               dcb.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dcb.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dcb::d),
               dcb.b.a.optionalFieldOf("item_damage", dcb.b.c).forGetter(dcb::e),
               axv.b(mi.aN).optionalFieldOf("bypassed_by").forGetter(dcb::f),
               awq.b.optionalFieldOf("block_sound").forGetter(dcb::g),
               awq.b.optionalFieldOf("disabled_sound").forGetter(dcb::h)
            )
            .apply($$0, dcb::new)
   );
   public static final za<wn, dcb> b = za.a(
      yy.l,
      dcb::b,
      yy.l,
      dcb::c,
      dcb.a.b.a(yy.a()),
      dcb::d,
      dcb.b.b,
      dcb::e,
      axv.c(mi.aN).a(yy::a),
      dcb::f,
      awq.d.a(yy::a),
      dcb::g,
      awq.d.a(yy::a),
      dcb::h,
      dcb::new
   );

   public void a(aru $$0, bxw $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (jg<awq>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(aru $$0, bxw $$1, float $$2, daa $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof crz $$5) {
            $$5.gF().a($$3, $$4);
         }

         $$1.fF();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(djz $$0, daa $$1, bxw $$2, bus $$3, float $$4) {
      if ($$2 instanceof crz $$5) {
         if (!$$0.C) {
            $$5.b(axb.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bxw.d($$3));
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

   public float a(bvk $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dcb.a $$4 : this.e) {
         $$3 += $$4.a($$0, $$1, $$2);
      }

      return azq.a($$3, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dcb.a> d() {
      return this.e;
   }

   public dcb.b e() {
      return this.f;
   }

   public Optional<axv<bvm>> f() {
      return this.g;
   }

   public Optional<jg<awq>> g() {
      return this.h;
   }

   public Optional<jg<awq>> h() {
      return this.i;
   }

   public static record a(float c, Optional<jk<bvm>> d, float e, float f) {
      public static final Codec<dcb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayy.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dcb.a::a),
                  jv.a(mi.aN).optionalFieldOf("type").forGetter(dcb.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dcb.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dcb.a::d)
               )
               .apply($$0, dcb.a::new)
      );
      public static final za<wn, dcb.a> b = za.a(yy.l, dcb.a::a, yy.c(mi.aN).a(yy::a), dcb.a::b, yy.l, dcb.a::c, yy.l, dcb.a::d, dcb.a::new);

      public float a(bvk $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azq.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<jk<bvm>> b() {
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
      public static final Codec<dcb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayy.n.fieldOf("threshold").forGetter(dcb.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dcb.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dcb.b::c)
               )
               .apply($$0, dcb.b::new)
      );
      public static final za<ByteBuf, dcb.b> b = za.a(yy.l, dcb.b::a, yy.l, dcb.b::b, yy.l, dcb.b::c, dcb.b::new);
      public static final dcb.b c = new dcb.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : azq.d(this.e + this.f * $$0);
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
