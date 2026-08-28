import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfd(lq d, dfd.a e, dfd.a f, dfd.c g, dfd.c h, bsm i) implements deq {
   public static final MapCodec<dfd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ls.bh.fieldOf("particle").forGetter(dfd::c),
               dfd.a.a.fieldOf("horizontal_position").forGetter(dfd::d),
               dfd.a.a.fieldOf("vertical_position").forGetter(dfd::e),
               dfd.c.a.fieldOf("horizontal_velocity").forGetter(dfd::f),
               dfd.c.a.fieldOf("vertical_velocity").forGetter(dfd::g),
               bsm.c.optionalFieldOf("speed", bsk.a).forGetter(dfd::h)
            )
            .apply($$0, dfd::new)
   );

   public static dfd.a a(float $$0) {
      return new dfd.a(dfd.b.a, $$0, 1.0F);
   }

   public static dfd.a b() {
      return new dfd.a(dfd.b.b, 0.0F, 1.0F);
   }

   public static dfd.c b(float $$0) {
      return new dfd.c($$0, bsk.a);
   }

   public static dfd.c a(bsm $$0) {
      return new dfd.c(0.0F, $$0);
   }

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      bam $$5 = $$3.dZ();
      fby $$6 = $$3.ah();
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
   public MapCodec<dfd> a() {
      return a;
   }

   public lq c() {
      return this.d;
   }

   public dfd.a d() {
      return this.e;
   }

   public dfd.a e() {
      return this.f;
   }

   public dfd.c f() {
      return this.g;
   }

   public dfd.c g() {
      return this.h;
   }

   public bsm h() {
      return this.i;
   }

   public static record a(dfd.b b, float c, float d) {
      public static final MapCodec<dfd.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfd.b.c.fieldOf("type").forGetter(dfd.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dfd.a::b),
                     azn.o.optionalFieldOf("scale", 1.0F).forGetter(dfd.a::c)
                  )
                  .apply($$0, dfd.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dfd.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, bam $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dfd.b a() {
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

      public static final Codec<dfd.b> c = bba.a(dfd.b::values);
      private final String d;
      private final dfd.b.a e;

      private b(final String $$0, final dfd.b.a $$1) {
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

   public static record c(float b, bsm c) {
      public static final MapCodec<dfd.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dfd.c::a), bsm.c.optionalFieldOf("base", bsk.a).forGetter(dfd.c::b))
               .apply($$0, dfd.c::new)
      );

      public double a(double $$0, bam $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bsm b() {
         return this.c;
      }
   }
}
