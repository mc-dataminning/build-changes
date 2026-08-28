import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deb(lr d, deb.a e, deb.a f, deb.c g, deb.c h, brl i) implements ddo {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.bi.fieldOf("particle").forGetter(deb::c),
               deb.a.a.fieldOf("horizontal_position").forGetter(deb::d),
               deb.a.a.fieldOf("vertical_position").forGetter(deb::e),
               deb.c.a.fieldOf("horizontal_velocity").forGetter(deb::f),
               deb.c.a.fieldOf("vertical_velocity").forGetter(deb::g),
               brl.c.optionalFieldOf("speed", brj.a).forGetter(deb::h)
            )
            .apply($$0, deb::new)
   );

   public static deb.a a(float $$0) {
      return new deb.a(deb.b.a, $$0, 1.0F);
   }

   public static deb.a b() {
      return new deb.a(deb.b.b, 0.0F, 1.0F);
   }

   public static deb.c b(float $$0) {
      return new deb.c($$0, brj.a);
   }

   public static deb.c a(brl $$0) {
      return new deb.c(0.0F, $$0);
   }

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      azg $$5 = $$3.dZ();
      fay $$6 = $$3.ah();
      float $$7 = $$3.dr();
      float $$8 = $$3.ds();
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
   public MapCodec<deb> a() {
      return a;
   }

   public lr c() {
      return this.d;
   }

   public deb.a d() {
      return this.e;
   }

   public deb.a e() {
      return this.f;
   }

   public deb.c f() {
      return this.g;
   }

   public deb.c g() {
      return this.h;
   }

   public brl h() {
      return this.i;
   }

   public static record a(deb.b b, float c, float d) {
      public static final MapCodec<deb.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     deb.b.c.fieldOf("type").forGetter(deb.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(deb.a::b),
                     ayh.o.optionalFieldOf("scale", 1.0F).forGetter(deb.a::c)
                  )
                  .apply($$0, deb.a::new)
         )
         .validate(
            $$0 -> $$0.a() == deb.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azg $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public deb.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azu {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<deb.b> c = azu.a(deb.b::values);
      private final String d;
      private final deb.b.a e;

      private b(final String $$0, final deb.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azg $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azg var6);
      }
   }

   public static record c(float b, brl c) {
      public static final MapCodec<deb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(deb.c::a), brl.c.optionalFieldOf("base", brj.a).forGetter(deb.c::b))
               .apply($$0, deb.c::new)
      );

      public double a(double $$0, azg $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brl b() {
         return this.c;
      }
   }
}
