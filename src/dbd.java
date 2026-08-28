import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbd(lk d, dbd.a e, dbd.a f, dbd.c g, dbd.c h, bpt i) implements daq {
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lm.bf.fieldOf("particle").forGetter(dbd::c),
               dbd.a.a.fieldOf("horizontal_position").forGetter(dbd::d),
               dbd.a.a.fieldOf("vertical_position").forGetter(dbd::e),
               dbd.c.a.fieldOf("horizontal_velocity").forGetter(dbd::f),
               dbd.c.a.fieldOf("vertical_velocity").forGetter(dbd::g),
               bpt.c.optionalFieldOf("speed", bpr.a).forGetter(dbd::h)
            )
            .apply($$0, dbd::new)
   );

   public static dbd.a a(float $$0) {
      return new dbd.a(dbd.b.a, $$0, 1.0F);
   }

   public static dbd.a b() {
      return new dbd.a(dbd.b.b, 0.0F, 1.0F);
   }

   public static dbd.c b(float $$0) {
      return new dbd.c($$0, bpr.a);
   }

   public static dbd.c a(bpt $$0) {
      return new dbd.c(0.0F, $$0);
   }

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      ayv $$5 = $$3.dT();
      eww $$6 = $$3.ag();
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
   public MapCodec<dbd> a() {
      return a;
   }

   public lk c() {
      return this.d;
   }

   public dbd.a d() {
      return this.e;
   }

   public dbd.a e() {
      return this.f;
   }

   public dbd.c f() {
      return this.g;
   }

   public dbd.c g() {
      return this.h;
   }

   public bpt h() {
      return this.i;
   }

   public static record a(dbd.b b, float c, float d) {
      public static final MapCodec<dbd.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbd.b.c.fieldOf("type").forGetter(dbd.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dbd.a::b),
                     axv.m.optionalFieldOf("scale", 1.0F).forGetter(dbd.a::c)
                  )
                  .apply($$0, dbd.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dbd.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, float $$1, ayv $$2) {
         return this.b.a($$0, $$1 * this.d, $$2) + (double)this.c;
      }

      public dbd.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azj {
      a("entity_position", ($$0, $$1, $$2) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2) -> $$0 + ($$2.j() - 0.5) * (double)$$1);

      public static final Codec<dbd.b> c = azj.a(dbd.b::values);
      private final String d;
      private final dbd.b.a e;

      private b(final String $$0, final dbd.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, float $$1, ayv $$2) {
         return this.e.getCoordinate($$0, $$1, $$2);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, float var3, ayv var4);
      }
   }

   public static record c(float b, bpt c) {
      public static final MapCodec<dbd.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dbd.c::a), bpt.c.optionalFieldOf("base", bpr.a).forGetter(dbd.c::b))
               .apply($$0, dbd.c::new)
      );

      public double a(double $$0, ayv $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bpt b() {
         return this.c;
      }
   }
}
