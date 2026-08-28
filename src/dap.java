import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dap(lh d, dap.a e, dap.a f, dap.c g, dap.c h, bpk i) implements dac {
   public static final MapCodec<dap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lj.bf.fieldOf("particle").forGetter(dap::c),
               dap.a.a.fieldOf("horizontal_position").forGetter(dap::d),
               dap.a.a.fieldOf("vertical_position").forGetter(dap::e),
               dap.c.a.fieldOf("horizontal_velocity").forGetter(dap::f),
               dap.c.a.fieldOf("vertical_velocity").forGetter(dap::g),
               bpk.c.optionalFieldOf("speed", bpi.a).forGetter(dap::h)
            )
            .apply($$0, dap::new)
   );

   public static dap.a a(float $$0) {
      return new dap.a(dap.b.a, $$0, 1.0F);
   }

   public static dap.a b() {
      return new dap.a(dap.b.b, 0.0F, 1.0F);
   }

   public static dap.c b(float $$0) {
      return new dap.c($$0, bpi.a);
   }

   public static dap.c a(bpk $$0) {
      return new dap.c(0.0F, $$0);
   }

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ayo $$5 = $$3.dU();
      ewh $$6 = $$3.ag();
      float $$7 = $$3.dl();
      float $$8 = $$3.dm();
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
   public MapCodec<dap> a() {
      return a;
   }

   public lh c() {
      return this.d;
   }

   public dap.a d() {
      return this.e;
   }

   public dap.a e() {
      return this.f;
   }

   public dap.c f() {
      return this.g;
   }

   public dap.c g() {
      return this.h;
   }

   public bpk h() {
      return this.i;
   }

   public static record a(dap.b b, float c, float d) {
      public static final MapCodec<dap.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dap.b.c.fieldOf("type").forGetter(dap.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dap.a::b),
                     axo.m.optionalFieldOf("scale", 1.0F).forGetter(dap.a::c)
                  )
                  .apply($$0, dap.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dap.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, float $$1, ayo $$2) {
         return this.b.a($$0, $$1 * this.d, $$2) + (double)this.c;
      }

      public dap.b a() {
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

      public static final Codec<dap.b> c = azc.a(dap.b::values);
      private final String d;
      private final dap.b.a e;

      private b(final String $$0, final dap.b.a $$1) {
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

   public static record c(float b, bpk c) {
      public static final MapCodec<dap.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dap.c::a), bpk.c.optionalFieldOf("base", bpi.a).forGetter(dap.c::b))
               .apply($$0, dap.c::new)
      );

      public double a(double $$0, ayo $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bpk b() {
         return this.c;
      }
   }
}
