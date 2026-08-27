import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record dih(
   OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, apy<csk> v, aep w, float x, dih.a y
) {
   public static final int a = gv.c;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<dih> h = aqw.c(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqw.a(Codec.LONG.optionalFieldOf("fixed_time")).forGetter(dih::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(dih::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(dih::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(dih::i),
                  Codec.BOOL.fieldOf("natural").forGetter(dih::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(dih::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(dih::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dih::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(dih::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(dih::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(dih::p),
                  apy.b(jd.e).fieldOf("infiniburn").forGetter(dih::q),
                  aep.a.fieldOf("effects").orElse(dif.e).forGetter(dih::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(dih::s),
                  dih.a.a.forGetter(dih::t)
               )
               .apply($$0, dih::new)
      )
   );
   private static final int z = 8;
   public static final float[] i = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<hf<dih>> j = ael.a(jd.au, h);

   public dih(
      OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, apy<csk> v, aep w, float x, dih.a y
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
   public static DataResult<aeo<cpk>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(cpk.i);
         }

         if ($$2 == 0) {
            return DataResult.success(cpk.h);
         }

         if ($$2 == 1) {
            return DataResult.success(cpk.j);
         }
      }

      return cpk.g.parse($$0);
   }

   public static double a(dih $$0, dih $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(aeo<cpk> $$0, Path $$1) {
      if ($$0 == cpk.h) {
         return $$1;
      } else if ($$0 == cpk.j) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == cpk.i ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.k.isPresent();
   }

   public float a(long $$0) {
      double $$1 = aro.e((double)this.k.orElse($$0) / 24000.0 - 0.25);
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

   public bft d() {
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

   public apy<csk> q() {
      return this.v;
   }

   public aep r() {
      return this.w;
   }

   public float s() {
      return this.x;
   }

   public dih.a t() {
      return this.y;
   }

   public static record a(boolean b, boolean c, bft d, int e) {
      public static final MapCodec<dih.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(dih.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(dih.a::b),
                  bft.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(dih.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(dih.a::d)
               )
               .apply($$0, dih.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bft c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
