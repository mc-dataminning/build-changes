import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgu(lv d, dgu.a e, dgu.a f, dgu.c g, dgu.c h, btg i) implements dgh {
   public static final MapCodec<dgu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lx.bk.fieldOf("particle").forGetter(dgu::c),
               dgu.a.a.fieldOf("horizontal_position").forGetter(dgu::d),
               dgu.a.a.fieldOf("vertical_position").forGetter(dgu::e),
               dgu.c.a.fieldOf("horizontal_velocity").forGetter(dgu::f),
               dgu.c.a.fieldOf("vertical_velocity").forGetter(dgu::g),
               btg.c.optionalFieldOf("speed", bte.a).forGetter(dgu::h)
            )
            .apply($$0, dgu::new)
   );

   public static dgu.a a(float $$0) {
      return new dgu.a(dgu.b.a, $$0, 1.0F);
   }

   public static dgu.a b() {
      return new dgu.a(dgu.b.b, 0.0F, 1.0F);
   }

   public static dgu.c b(float $$0) {
      return new dgu.c($$0, bte.a);
   }

   public static dgu.c a(btg $$0) {
      return new dgu.c(0.0F, $$0);
   }

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      azv $$5 = $$3.dY();
      feq $$6 = $$3.ah();
      float $$7 = $$3.dq();
      float $$8 = $$3.dr();
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
   public MapCodec<dgu> a() {
      return a;
   }

   public lv c() {
      return this.d;
   }

   public dgu.a d() {
      return this.e;
   }

   public dgu.a e() {
      return this.f;
   }

   public dgu.c f() {
      return this.g;
   }

   public dgu.c g() {
      return this.h;
   }

   public btg h() {
      return this.i;
   }

   public static record a(dgu.b b, float c, float d) {
      public static final MapCodec<dgu.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgu.b.c.fieldOf("type").forGetter(dgu.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dgu.a::b),
                     ayu.o.optionalFieldOf("scale", 1.0F).forGetter(dgu.a::c)
                  )
                  .apply($$0, dgu.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dgu.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dgu.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bak {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dgu.b> c = bak.a(dgu.b::values);
      private final String d;
      private final dgu.b.a e;

      private b(final String $$0, final dgu.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azv var6);
      }
   }

   public static record c(float b, btg c) {
      public static final MapCodec<dgu.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dgu.c::a), btg.c.optionalFieldOf("base", bte.a).forGetter(dgu.c::b))
               .apply($$0, dgu.c::new)
      );

      public double a(double $$0, azv $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public btg b() {
         return this.c;
      }
   }
}
