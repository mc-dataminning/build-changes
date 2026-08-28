import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfl(lt d, dfl.a e, dfl.a f, dfl.c g, dfl.c h, bst i) implements dey {
   public static final MapCodec<dfl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lv.bj.fieldOf("particle").forGetter(dfl::c),
               dfl.a.a.fieldOf("horizontal_position").forGetter(dfl::d),
               dfl.a.a.fieldOf("vertical_position").forGetter(dfl::e),
               dfl.c.a.fieldOf("horizontal_velocity").forGetter(dfl::f),
               dfl.c.a.fieldOf("vertical_velocity").forGetter(dfl::g),
               bst.c.optionalFieldOf("speed", bsr.a).forGetter(dfl::h)
            )
            .apply($$0, dfl::new)
   );

   public static dfl.a a(float $$0) {
      return new dfl.a(dfl.b.a, $$0, 1.0F);
   }

   public static dfl.a b() {
      return new dfl.a(dfl.b.b, 0.0F, 1.0F);
   }

   public static dfl.c b(float $$0) {
      return new dfl.c($$0, bsr.a);
   }

   public static dfl.c a(bst $$0) {
      return new dfl.c(0.0F, $$0);
   }

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      azs $$5 = $$3.dY();
      fcu $$6 = $$3.ah();
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
   public MapCodec<dfl> a() {
      return a;
   }

   public lt c() {
      return this.d;
   }

   public dfl.a d() {
      return this.e;
   }

   public dfl.a e() {
      return this.f;
   }

   public dfl.c f() {
      return this.g;
   }

   public dfl.c g() {
      return this.h;
   }

   public bst h() {
      return this.i;
   }

   public static record a(dfl.b b, float c, float d) {
      public static final MapCodec<dfl.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfl.b.c.fieldOf("type").forGetter(dfl.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dfl.a::b),
                     ays.o.optionalFieldOf("scale", 1.0F).forGetter(dfl.a::c)
                  )
                  .apply($$0, dfl.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dfl.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azs $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dfl.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bag {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dfl.b> c = bag.a(dfl.b::values);
      private final String d;
      private final dfl.b.a e;

      private b(final String $$0, final dfl.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azs $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azs var6);
      }
   }

   public static record c(float b, bst c) {
      public static final MapCodec<dfl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dfl.c::a), bst.c.optionalFieldOf("base", bsr.a).forGetter(dfl.c::b))
               .apply($$0, dfl.c::new)
      );

      public double a(double $$0, azs $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bst b() {
         return this.c;
      }
   }
}
