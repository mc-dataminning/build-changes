import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record dwv(
   OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, awt<dfw> w, akq x, float y, dwv.a z
) {
   public static final int a = jd.d;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<dwv> h = axv.c(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axv.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(dwv::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(dwv::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(dwv::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(dwv::i),
                  Codec.BOOL.fieldOf("natural").forGetter(dwv::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(dwv::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(dwv::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dwv::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(dwv::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(dwv::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(dwv::p),
                  awt.b(lu.f).fieldOf("infiniburn").forGetter(dwv::q),
                  akq.a.fieldOf("effects").orElse(dwt.e).forGetter(dwv::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(dwv::s),
                  dwv.a.a.forGetter(dwv::t)
               )
               .apply($$0, dwv::new)
      )
   );
   public static final yw<wj, jm<dwv>> i = yu.b(lu.aK);
   private static final int A = 8;
   public static final float[] j = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jm<dwv>> k = akm.a(lu.aK, h);

   public dwv(
      OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, awt<dfw> w, akq x, float y, dwv.a z
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
   public static DataResult<akp<dcu>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dcu.i);
         }

         if ($$2 == 0) {
            return DataResult.success(dcu.h);
         }

         if ($$2 == 1) {
            return DataResult.success(dcu.j);
         }
      }

      return dcu.g.parse($$0);
   }

   public static double a(dwv $$0, dwv $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(akp<dcu> $$0, Path $$1) {
      if ($$0 == dcu.h) {
         return $$1;
      } else if ($$0 == dcu.j) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dcu.i ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.l.isPresent();
   }

   public float a(long $$0) {
      double $$1 = ayn.e((double)this.l.orElse($$0) / 24000.0 - 0.25);
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

   public bpv d() {
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

   public awt<dfw> q() {
      return this.w;
   }

   public akq r() {
      return this.x;
   }

   public float s() {
      return this.y;
   }

   public dwv.a t() {
      return this.z;
   }

   public static record a(boolean b, boolean c, bpv d, int e) {
      public static final MapCodec<dwv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(dwv.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(dwv.a::b),
                  bpv.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(dwv.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(dwv.a::d)
               )
               .apply($$0, dwv.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bpv c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
