import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dca(ll d, dca.a e, dca.a f, dca.c g, dca.c h, bqn i) implements dbn {
   public static final MapCodec<dca> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ln.bf.fieldOf("particle").forGetter(dca::c),
               dca.a.a.fieldOf("horizontal_position").forGetter(dca::d),
               dca.a.a.fieldOf("vertical_position").forGetter(dca::e),
               dca.c.a.fieldOf("horizontal_velocity").forGetter(dca::f),
               dca.c.a.fieldOf("vertical_velocity").forGetter(dca::g),
               bqn.c.optionalFieldOf("speed", bql.a).forGetter(dca::h)
            )
            .apply($$0, dca::new)
   );

   public static dca.a a(float $$0) {
      return new dca.a(dca.b.a, $$0, 1.0F);
   }

   public static dca.a b() {
      return new dca.a(dca.b.b, 0.0F, 1.0F);
   }

   public static dca.c b(float $$0) {
      return new dca.c($$0, bql.a);
   }

   public static dca.c a(bqn $$0) {
      return new dca.c(0.0F, $$0);
   }

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      azk $$5 = $$3.dV();
      eye $$6 = $$3.ai();
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
   public MapCodec<dca> a() {
      return a;
   }

   public ll c() {
      return this.d;
   }

   public dca.a d() {
      return this.e;
   }

   public dca.a e() {
      return this.f;
   }

   public dca.c f() {
      return this.g;
   }

   public dca.c g() {
      return this.h;
   }

   public bqn h() {
      return this.i;
   }

   public static record a(dca.b b, float c, float d) {
      public static final MapCodec<dca.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dca.b.c.fieldOf("type").forGetter(dca.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dca.a::b),
                     ayl.m.optionalFieldOf("scale", 1.0F).forGetter(dca.a::c)
                  )
                  .apply($$0, dca.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dca.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azk $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dca.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azy {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dca.b> c = azy.a(dca.b::values);
      private final String d;
      private final dca.b.a e;

      private b(final String $$0, final dca.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azk $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azk var6);
      }
   }

   public static record c(float b, bqn c) {
      public static final MapCodec<dca.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dca.c::a), bqn.c.optionalFieldOf("base", bql.a).forGetter(dca.c::b))
               .apply($$0, dca.c::new)
      );

      public double a(double $$0, azk $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bqn b() {
         return this.c;
      }
   }
}
