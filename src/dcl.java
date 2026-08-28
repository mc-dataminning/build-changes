import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dcl(float c, float d, List<dcl.a> e, dcl.b f, Optional<ayc<bvv>> g, Optional<jg<awx>> h, Optional<jg<awx>> i) {
   public static final Codec<dcl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dcl::b),
               azg.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dcl::c),
               dcl.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dcl.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dcl::d),
               dcl.b.a.optionalFieldOf("item_damage", dcl.b.c).forGetter(dcl::e),
               ayc.b(mi.aN).optionalFieldOf("bypassed_by").forGetter(dcl::f),
               awx.b.optionalFieldOf("block_sound").forGetter(dcl::g),
               awx.b.optionalFieldOf("disabled_sound").forGetter(dcl::h)
            )
            .apply($$0, dcl::new)
   );
   public static final ze<wp, dcl> b = ze.a(
      zc.l,
      dcl::b,
      zc.l,
      dcl::c,
      dcl.a.b.a(zc.a()),
      dcl::d,
      dcl.b.b,
      dcl::e,
      ayc.c(mi.aN).a(zc::a),
      dcl::f,
      awx.d.a(zc::a),
      dcl::g,
      awx.d.a(zc::a),
      dcl::h,
      dcl::new
   );

   public void a(asb $$0, byf $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (jg<awx>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(asb $$0, byf $$1, float $$2, dak $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof csi $$5) {
            $$5.gG().a($$3, $$4);
         }

         $$1.fF();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(dkj $$0, dak $$1, byf $$2, bvb $$3, float $$4) {
      if ($$2 instanceof csi $$5) {
         if (!$$0.C) {
            $$5.b(axi.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, byf.d($$3));
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

   public float a(bvt $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dcl.a $$4 : this.e) {
         $$3 += $$4.a($$0, $$1, $$2);
      }

      return azz.a($$3, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dcl.a> d() {
      return this.e;
   }

   public dcl.b e() {
      return this.f;
   }

   public Optional<ayc<bvv>> f() {
      return this.g;
   }

   public Optional<jg<awx>> g() {
      return this.h;
   }

   public Optional<jg<awx>> h() {
      return this.i;
   }

   public static record a(float c, Optional<jk<bvv>> d, float e, float f) {
      public static final Codec<dcl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azg.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dcl.a::a),
                  jv.a(mi.aN).optionalFieldOf("type").forGetter(dcl.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dcl.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dcl.a::d)
               )
               .apply($$0, dcl.a::new)
      );
      public static final ze<wp, dcl.a> b = ze.a(zc.l, dcl.a::a, zc.c(mi.aN).a(zc::a), dcl.a::b, zc.l, dcl.a::c, zc.l, dcl.a::d, dcl.a::new);

      public float a(bvt $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azz.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<jk<bvv>> b() {
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
      public static final Codec<dcl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azg.n.fieldOf("threshold").forGetter(dcl.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dcl.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dcl.b::c)
               )
               .apply($$0, dcl.b::new)
      );
      public static final ze<ByteBuf, dcl.b> b = ze.a(zc.l, dcl.b::a, zc.l, dcl.b::b, zc.l, dcl.b::c, dcl.b::new);
      public static final dcl.b c = new dcl.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : azz.d(this.e + this.f * $$0);
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
