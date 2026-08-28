import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record dzf(
   OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, axq<die> w, ali x, float y, dzf.a z
) {
   public static final int a = jh.d;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<dzf> h = ayt.d(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayt.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(dzf::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(dzf::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(dzf::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(dzf::i),
                  Codec.BOOL.fieldOf("natural").forGetter(dzf::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(dzf::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(dzf::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dzf::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(dzf::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(dzf::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(dzf::p),
                  axq.b(lz.f).fieldOf("infiniburn").forGetter(dzf::q),
                  ali.a.fieldOf("effects").orElse(dzd.e).forGetter(dzf::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(dzf::s),
                  dzf.a.a.forGetter(dzf::t)
               )
               .apply($$0, dzf::new)
      )
   );
   public static final zg<wt, jq<dzf>> i = ze.b(lz.aL);
   private static final int A = 8;
   public static final float[] j = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jq<dzf>> k = ale.a(lz.aL, h);

   public dzf(
      OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, axq<die> w, ali x, float y, dzf.a z
   ) {
      if (u < 16) {
         throw new IllegalStateException("height has to be at least 16");
      } else if (t + u > d + 1) {
         throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
      } else if (v > u) {
         throw new IllegalStateException("logical_height cannot be higher than height");
      } else if (u % 16 != 0) {
         throw new IllegalStateException("height has to be multiple of 16");
      } else if (t % 16 != 0) {
         throw new IllegalStateException("min_y has to be a multiple of 16");
      } else {
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
         this.z = z;
      }
   }

   @Deprecated
   public static DataResult<alh<dfb>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dfb.j);
         }

         if ($$2 == 0) {
            return DataResult.success(dfb.i);
         }

         if ($$2 == 1) {
            return DataResult.success(dfb.k);
         }
      }

      return dfb.h.parse($$0);
   }

   public static double a(dzf $$0, dzf $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(alh<dfb> $$0, Path $$1) {
      if ($$0 == dfb.i) {
         return $$1;
      } else if ($$0 == dfb.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dfb.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.l.isPresent();
   }

   public float a(long $$0) {
      double $$1 = azk.e((double)this.l.orElse($$0) / 24000.0 - 0.25);
      double $$2 = 0.5 - Math.cos($$1 * Math.PI) / 2.0;
      return (float)($$1 * 2.0 + $$2) / 3.0F;
   }

   public int b(long $$0) {
      return (int)($$0 / 24000L % 8L + 8L) % 8;
   }

   public boolean b() {
      return this.z.a();
   }

   public boolean c() {
      return this.z.b();
   }

   public bri d() {
      return this.z.c();
   }

   public int e() {
      return this.z.d();
   }

   public OptionalLong f() {
      return this.l;
   }

   public boolean g() {
      return this.m;
   }

   public boolean h() {
      return this.n;
   }

   public boolean i() {
      return this.o;
   }

   public boolean j() {
      return this.p;
   }

   public double k() {
      return this.q;
   }

   public boolean l() {
      return this.r;
   }

   public boolean m() {
      return this.s;
   }

   public int n() {
      return this.t;
   }

   public int o() {
      return this.u;
   }

   public int p() {
      return this.v;
   }

   public axq<die> q() {
      return this.w;
   }

   public ali r() {
      return this.x;
   }

   public float s() {
      return this.y;
   }

   public dzf.a t() {
      return this.z;
   }

   public static record a(boolean b, boolean c, bri d, int e) {
      public static final MapCodec<dzf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(dzf.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(dzf.a::b),
                  bri.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(dzf.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(dzf.a::d)
               )
               .apply($$0, dzf.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bri c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
