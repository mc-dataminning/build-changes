import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcr(lm d, dcr.a e, dcr.a f, dcr.c g, dcr.c h, bqv i) implements dce {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lo.bf.fieldOf("particle").forGetter(dcr::c),
               dcr.a.a.fieldOf("horizontal_position").forGetter(dcr::d),
               dcr.a.a.fieldOf("vertical_position").forGetter(dcr::e),
               dcr.c.a.fieldOf("horizontal_velocity").forGetter(dcr::f),
               dcr.c.a.fieldOf("vertical_velocity").forGetter(dcr::g),
               bqv.c.optionalFieldOf("speed", bqt.a).forGetter(dcr::h)
            )
            .apply($$0, dcr::new)
   );

   public static dcr.a a(float $$0) {
      return new dcr.a(dcr.b.a, $$0, 1.0F);
   }

   public static dcr.a b() {
      return new dcr.a(dcr.b.b, 0.0F, 1.0F);
   }

   public static dcr.c b(float $$0) {
      return new dcr.c($$0, bqt.a);
   }

   public static dcr.c a(bqv $$0) {
      return new dcr.c(0.0F, $$0);
   }

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      azn $$5 = $$3.dV();
      eyw $$6 = $$3.ai();
      float $$7 = $$3.dn();
      float $$8 = $$3.do();
      $$0.a(
         this.d,
         this.e.a($$4.a(), $$4.a(), $$7, $$5),
         this.f.a($$4.b(), $$4.b() + (double)($$8 / 2.0F), $$8, $$5),
         this.e.a($$4.c(), $$4.c(), $$7, $$5),
         0,
         this.g.a($$6.a(), $$5),
         this.h.a($$6.b(), $$5),
         this.g.a($$6.c(), $$5),
         (double)this.i.a($$5)
      );
   }

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public lm c() {
      return this.d;
   }

   public dcr.a d() {
      return this.e;
   }

   public dcr.a e() {
      return this.f;
   }

   public dcr.c f() {
      return this.g;
   }

   public dcr.c g() {
      return this.h;
   }

   public bqv h() {
      return this.i;
   }

   public static record a(dcr.b b, float c, float d) {
      public static final MapCodec<dcr.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dcr.b.c.fieldOf("type").forGetter(dcr.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dcr.a::b),
                     ayo.n.optionalFieldOf("scale", 1.0F).forGetter(dcr.a::c)
                  )
                  .apply($$0, dcr.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dcr.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azn $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dcr.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bab {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dcr.b> c = bab.a(dcr.b::values);
      private final String d;
      private final dcr.b.a e;

      private b(final String $$0, final dcr.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azn $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azn var6);
      }
   }

   public static record c(float b, bqv c) {
      public static final MapCodec<dcr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dcr.c::a), bqv.c.optionalFieldOf("base", bqt.a).forGetter(dcr.c::b))
               .apply($$0, dcr.c::new)
      );

      public double a(double $$0, azn $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bqv b() {
         return this.c;
      }
   }
}
