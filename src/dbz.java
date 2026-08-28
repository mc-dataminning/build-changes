import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record dbz(float c, float d, List<dbz.a> e, dbz.b f, Optional<axt<bvk>> g, Optional<jf<awo>> h, Optional<jf<awo>> i) {
   public static final Codec<dbz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.n.optionalFieldOf("block_delay_seconds", 0.0F).forGetter(dbz::b),
               ayw.n.optionalFieldOf("disable_cooldown_scale", 1.0F).forGetter(dbz::c),
               dbz.a.a.listOf().optionalFieldOf("damage_reductions", List.of(new dbz.a(90.0F, Optional.empty(), 0.0F, 1.0F))).forGetter(dbz::d),
               dbz.b.a.optionalFieldOf("item_damage", dbz.b.c).forGetter(dbz::e),
               axt.b(mh.aN).optionalFieldOf("bypassed_by").forGetter(dbz::f),
               awo.b.optionalFieldOf("block_sound").forGetter(dbz::g),
               awo.b.optionalFieldOf("disabled_sound").forGetter(dbz::h)
            )
            .apply($$0, dbz::new)
   );
   public static final yy<wl, dbz> b = yy.a(
      yw.l,
      dbz::b,
      yw.l,
      dbz::c,
      dbz.a.b.a(yw.a()),
      dbz::d,
      dbz.b.b,
      dbz::e,
      axt.c(mh.aN).a(yw::a),
      dbz::f,
      awo.d.a(yw::a),
      dbz::g,
      awo.d.a(yw::a),
      dbz::h,
      dbz::new
   );

   public void a(ars $$0, bxu $$1) {
      this.h.ifPresent($$2 -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (jf<awo>)$$2, $$1.dm(), 1.0F, 0.8F + $$0.A.i() * 0.4F));
   }

   public void a(ars $$0, bxu $$1, float $$2, czy $$3) {
      int $$4 = this.a($$2);
      if ($$4 > 0) {
         if ($$1 instanceof crx $$5) {
            $$5.gF().a($$3, $$4);
         }

         $$1.fF();
         this.i.ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$2x, $$1.dm(), 0.8F, 0.8F + $$0.A.i() * 0.4F));
      }
   }

   public void a(djx $$0, czy $$1, bxu $$2, buq $$3, float $$4) {
      if ($$2 instanceof crx $$5) {
         if (!$$0.C) {
            $$5.b(awz.c.b($$1.h()));
         }

         int $$7 = this.f.a($$4);
         if ($$7 > 0) {
            $$1.a($$7, $$2, bxu.d($$3));
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

   public float a(bvi $$0, float $$1, double $$2) {
      float $$3 = 0.0F;

      for (dbz.a $$4 : this.e) {
         $$3 += $$4.a($$0, $$1, $$2);
      }

      return azo.a($$3, 0.0F, $$1);
   }

   public float b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public List<dbz.a> d() {
      return this.e;
   }

   public dbz.b e() {
      return this.f;
   }

   public Optional<axt<bvk>> f() {
      return this.g;
   }

   public Optional<jf<awo>> g() {
      return this.h;
   }

   public Optional<jf<awo>> h() {
      return this.i;
   }

   public static record a(float c, Optional<jj<bvk>> d, float e, float f) {
      public static final Codec<dbz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayw.o.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(dbz.a::a),
                  ju.a(mh.aN).optionalFieldOf("type").forGetter(dbz.a::b),
                  Codec.FLOAT.fieldOf("base").forGetter(dbz.a::c),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbz.a::d)
               )
               .apply($$0, dbz.a::new)
      );
      public static final yy<wl, dbz.a> b = yy.a(yw.l, dbz.a::a, yw.c(mh.aN).a(yw::a), dbz.a::b, yw.l, dbz.a::c, yw.l, dbz.a::d, dbz.a::new);

      public float a(bvi $$0, float $$1, double $$2) {
         if ($$2 > (double)((float) (Math.PI / 180.0) * this.c)) {
            return 0.0F;
         } else {
            return this.d.isPresent() && !this.d.get().a($$0.l()) ? 0.0F : azo.a(this.e + this.f * $$1, 0.0F, $$1);
         }
      }

      public float a() {
         return this.c;
      }

      public Optional<jj<bvk>> b() {
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
      public static final Codec<dbz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayw.n.fieldOf("threshold").forGetter(dbz.b::a),
                  Codec.FLOAT.fieldOf("base").forGetter(dbz.b::b),
                  Codec.FLOAT.fieldOf("factor").forGetter(dbz.b::c)
               )
               .apply($$0, dbz.b::new)
      );
      public static final yy<ByteBuf, dbz.b> b = yy.a(yw.l, dbz.b::a, yw.l, dbz.b::b, yw.l, dbz.b::c, dbz.b::new);
      public static final dbz.b c = new dbz.b(1.0F, 0.0F, 1.0F);

      public int a(float $$0) {
         return $$0 < this.d ? 0 : azo.d(this.e + this.f * $$0);
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
