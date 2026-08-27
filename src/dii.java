import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record dii(
   OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, aqa<csl> v, aer w, float x, dii.a y
) {
   public static final int a = gu.c;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<dii> h = aqy.c(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqy.a(Codec.LONG.optionalFieldOf("fixed_time")).forGetter(dii::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(dii::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(dii::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(dii::i),
                  Codec.BOOL.fieldOf("natural").forGetter(dii::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(dii::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(dii::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dii::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(dii::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(dii::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(dii::p),
                  aqa.b(jc.e).fieldOf("infiniburn").forGetter(dii::q),
                  aer.a.fieldOf("effects").orElse(dig.e).forGetter(dii::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(dii::s),
                  dii.a.a.forGetter(dii::t)
               )
               .apply($$0, dii::new)
      )
   );
   private static final int z = 8;
   public static final float[] i = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<he<dii>> j = aen.a(jc.au, h);

   public dii(
      OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, aqa<csl> v, aer w, float x, dii.a y
   ) {
      if (t < 16) {
         throw new IllegalStateException("height has to be at least 16");
      } else if (s + t > d + 1) {
         throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
      } else if (u > t) {
         throw new IllegalStateException("logical_height cannot be higher than height");
      } else if (t % 16 != 0) {
         throw new IllegalStateException("height has to be multiple of 16");
      } else if (s % 16 != 0) {
         throw new IllegalStateException("min_y has to be a multiple of 16");
      } else {
         this.k = k;
         this.l = l;
         this.m = m;
         this.n = n;
         this.o = o;
         this.p = p;
         this.q = q;
         this.r = r;
         this.s = s;
         this.t = t;
         this.u = u;
         this.v = v;
         this.w = w;
         this.x = x;
         this.y = y;
      }
   }

   @Deprecated
   public static DataResult<aeq<cpl>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(cpl.i);
         }

         if ($$2 == 0) {
            return DataResult.success(cpl.h);
         }

         if ($$2 == 1) {
            return DataResult.success(cpl.j);
         }
      }

      return cpl.g.parse($$0);
   }

   public static double a(dii $$0, dii $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(aeq<cpl> $$0, Path $$1) {
      if ($$0 == cpl.h) {
         return $$1;
      } else if ($$0 == cpl.j) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == cpl.i ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.k.isPresent();
   }

   public float a(long $$0) {
      double $$1 = arp.e((double)this.k.orElse($$0) / 24000.0 - 0.25);
      double $$2 = 0.5 - Math.cos($$1 * Math.PI) / 2.0;
      return (float)($$1 * 2.0 + $$2) / 3.0F;
   }

   public int b(long $$0) {
      return (int)($$0 / 24000L % 8L + 8L) % 8;
   }

   public boolean b() {
      return this.y.a();
   }

   public boolean c() {
      return this.y.b();
   }

   public bfv d() {
      return this.y.c();
   }

   public int e() {
      return this.y.d();
   }

   public OptionalLong f() {
      return this.k;
   }

   public boolean g() {
      return this.l;
   }

   public boolean h() {
      return this.m;
   }

   public boolean i() {
      return this.n;
   }

   public boolean j() {
      return this.o;
   }

   public double k() {
      return this.p;
   }

   public boolean l() {
      return this.q;
   }

   public boolean m() {
      return this.r;
   }

   public int n() {
      return this.s;
   }

   public int o() {
      return this.t;
   }

   public int p() {
      return this.u;
   }

   public aqa<csl> q() {
      return this.v;
   }

   public aer r() {
      return this.w;
   }

   public float s() {
      return this.x;
   }

   public dii.a t() {
      return this.y;
   }

   public static record a(boolean b, boolean c, bfv d, int e) {
      public static final MapCodec<dii.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(dii.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(dii.a::b),
                  bfv.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(dii.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(dii.a::d)
               )
               .apply($$0, dii.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bfv c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
