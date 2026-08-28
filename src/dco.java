import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dco(ll d, dco.a e, dco.a f, dco.c g, dco.c h, bqs i) implements dcb {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ln.bf.fieldOf("particle").forGetter(dco::c),
               dco.a.a.fieldOf("horizontal_position").forGetter(dco::d),
               dco.a.a.fieldOf("vertical_position").forGetter(dco::e),
               dco.c.a.fieldOf("horizontal_velocity").forGetter(dco::f),
               dco.c.a.fieldOf("vertical_velocity").forGetter(dco::g),
               bqs.c.optionalFieldOf("speed", bqq.a).forGetter(dco::h)
            )
            .apply($$0, dco::new)
   );

   public static dco.a a(float $$0) {
      return new dco.a(dco.b.a, $$0, 1.0F);
   }

   public static dco.a b() {
      return new dco.a(dco.b.b, 0.0F, 1.0F);
   }

   public static dco.c b(float $$0) {
      return new dco.c($$0, bqq.a);
   }

   public static dco.c a(bqs $$0) {
      return new dco.c(0.0F, $$0);
   }

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      azl $$5 = $$3.dV();
      eys $$6 = $$3.ai();
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
   public MapCodec<dco> a() {
      return a;
   }

   public ll c() {
      return this.d;
   }

   public dco.a d() {
      return this.e;
   }

   public dco.a e() {
      return this.f;
   }

   public dco.c f() {
      return this.g;
   }

   public dco.c g() {
      return this.h;
   }

   public bqs h() {
      return this.i;
   }

   public static record a(dco.b b, float c, float d) {
      public static final MapCodec<dco.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dco.b.c.fieldOf("type").forGetter(dco.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dco.a::b),
                     aym.n.optionalFieldOf("scale", 1.0F).forGetter(dco.a::c)
                  )
                  .apply($$0, dco.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dco.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azl $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dco.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azz {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dco.b> c = azz.a(dco.b::values);
      private final String d;
      private final dco.b.a e;

      private b(final String $$0, final dco.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azl $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azl var6);
      }
   }

   public static record c(float b, bqs c) {
      public static final MapCodec<dco.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dco.c::a), bqs.c.optionalFieldOf("base", bqq.a).forGetter(dco.c::b))
               .apply($$0, dco.c::new)
      );

      public double a(double $$0, azl $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bqs b() {
         return this.c;
      }
   }
}
