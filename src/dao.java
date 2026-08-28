import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(lh d, dao.a e, dao.a f, dao.c g, dao.c h, bpj i) implements dab {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lj.bf.fieldOf("particle").forGetter(dao::c),
               dao.a.a.fieldOf("horizontal_position").forGetter(dao::d),
               dao.a.a.fieldOf("vertical_position").forGetter(dao::e),
               dao.c.a.fieldOf("horizontal_velocity").forGetter(dao::f),
               dao.c.a.fieldOf("vertical_velocity").forGetter(dao::g),
               bpj.c.optionalFieldOf("speed", bph.a).forGetter(dao::h)
            )
            .apply($$0, dao::new)
   );

   public static dao.a a(float $$0) {
      return new dao.a(dao.b.a, $$0, 1.0F);
   }

   public static dao.a b() {
      return new dao.a(dao.b.b, 0.0F, 1.0F);
   }

   public static dao.c b(float $$0) {
      return new dao.c($$0, bph.a);
   }

   public static dao.c a(bpj $$0) {
      return new dao.c(0.0F, $$0);
   }

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ayo $$5 = $$3.dT();
      ewf $$6 = $$3.af();
      float $$7 = $$3.dk();
      float $$8 = $$3.dl();
      $$0.a(
         this.d,
         this.e.a($$4.a(), $$7, $$5),
         this.f.a($$4.b(), $$8, $$5),
         this.e.a($$4.c(), $$7, $$5),
         0,
         this.g.a($$6.a(), $$5),
         this.h.a($$6.b(), $$5),
         this.g.a($$6.c(), $$5),
         (double)this.i.a($$5)
      );
   }

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public lh c() {
      return this.d;
   }

   public dao.a d() {
      return this.e;
   }

   public dao.a e() {
      return this.f;
   }

   public dao.c f() {
      return this.g;
   }

   public dao.c g() {
      return this.h;
   }

   public bpj h() {
      return this.i;
   }

   public static record a(dao.b b, float c, float d) {
      public static final MapCodec<dao.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dao.b.c.fieldOf("type").forGetter(dao.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dao.a::b),
                     axo.m.optionalFieldOf("scale", 1.0F).forGetter(dao.a::c)
                  )
                  .apply($$0, dao.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dao.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, float $$1, ayo $$2) {
         return this.b.a($$0, $$1 * this.d, $$2) + (double)this.c;
      }

      public dao.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azc {
      a("entity_position", ($$0, $$1, $$2) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2) -> $$0 + ($$2.j() - 0.5) * (double)$$1);

      public static final Codec<dao.b> c = azc.a(dao.b::values);
      private final String d;
      private final dao.b.a e;

      private b(final String $$0, final dao.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, float $$1, ayo $$2) {
         return this.e.getCoordinate($$0, $$1, $$2);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, float var3, ayo var4);
      }
   }

   public static record c(float b, bpj c) {
      public static final MapCodec<dao.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dao.c::a), bpj.c.optionalFieldOf("base", bph.a).forGetter(dao.c::b))
               .apply($$0, dao.c::new)
      );

      public double a(double $$0, ayo $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bpj b() {
         return this.c;
      }
   }
}
