import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(lq d, dfc.a e, dfc.a f, dfc.c g, dfc.c h, bsl i) implements dep {
   public static final MapCodec<dfc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ls.bh.fieldOf("particle").forGetter(dfc::c),
               dfc.a.a.fieldOf("horizontal_position").forGetter(dfc::d),
               dfc.a.a.fieldOf("vertical_position").forGetter(dfc::e),
               dfc.c.a.fieldOf("horizontal_velocity").forGetter(dfc::f),
               dfc.c.a.fieldOf("vertical_velocity").forGetter(dfc::g),
               bsl.c.optionalFieldOf("speed", bsj.a).forGetter(dfc::h)
            )
            .apply($$0, dfc::new)
   );

   public static dfc.a a(float $$0) {
      return new dfc.a(dfc.b.a, $$0, 1.0F);
   }

   public static dfc.a b() {
      return new dfc.a(dfc.b.b, 0.0F, 1.0F);
   }

   public static dfc.c b(float $$0) {
      return new dfc.c($$0, bsj.a);
   }

   public static dfc.c a(bsl $$0) {
      return new dfc.c(0.0F, $$0);
   }

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      bam $$5 = $$3.dY();
      fbx $$6 = $$3.ah();
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
   public MapCodec<dfc> a() {
      return a;
   }

   public lq c() {
      return this.d;
   }

   public dfc.a d() {
      return this.e;
   }

   public dfc.a e() {
      return this.f;
   }

   public dfc.c f() {
      return this.g;
   }

   public dfc.c g() {
      return this.h;
   }

   public bsl h() {
      return this.i;
   }

   public static record a(dfc.b b, float c, float d) {
      public static final MapCodec<dfc.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfc.b.c.fieldOf("type").forGetter(dfc.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dfc.a::b),
                     azn.o.optionalFieldOf("scale", 1.0F).forGetter(dfc.a::c)
                  )
                  .apply($$0, dfc.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dfc.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, bam $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dfc.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bba {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dfc.b> c = bba.a(dfc.b::values);
      private final String d;
      private final dfc.b.a e;

      private b(final String $$0, final dfc.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, bam $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, bam var6);
      }
   }

   public static record c(float b, bsl c) {
      public static final MapCodec<dfc.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dfc.c::a), bsl.c.optionalFieldOf("base", bsj.a).forGetter(dfc.c::b))
               .apply($$0, dfc.c::new)
      );

      public double a(double $$0, bam $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bsl b() {
         return this.c;
      }
   }
}
