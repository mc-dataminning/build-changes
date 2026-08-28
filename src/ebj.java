import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record ebj(
   OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, aya<dkd> w, alp x, float y, ebj.a z
) {
   public static final int a = jh.e;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<ebj> h = azd.d(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azd.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(ebj::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(ebj::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(ebj::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(ebj::i),
                  Codec.BOOL.fieldOf("natural").forGetter(ebj::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(ebj::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(ebj::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(ebj::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(ebj::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(ebj::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(ebj::p),
                  aya.b(mb.f).fieldOf("infiniburn").forGetter(ebj::q),
                  alp.a.fieldOf("effects").orElse(ebh.e).forGetter(ebj::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(ebj::s),
                  ebj.a.a.forGetter(ebj::t)
               )
               .apply($$0, ebj::new)
      )
   );
   public static final zi<wv, jq<ebj>> i = zg.b(mb.aN);
   private static final int A = 8;
   public static final float[] j = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jq<ebj>> k = all.a(mb.aN, h);

   public ebj(
      OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, aya<dkd> w, alp x, float y, ebj.a z
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
   public static DataResult<alo<dgz>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dgz.j);
         }

         if ($$2 == 0) {
            return DataResult.success(dgz.i);
         }

         if ($$2 == 1) {
            return DataResult.success(dgz.k);
         }
      }

      return dgz.h.parse($$0);
   }

   public static double a(ebj $$0, ebj $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(alo<dgz> $$0, Path $$1) {
      if ($$0 == dgz.i) {
         return $$1;
      } else if ($$0 == dgz.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dgz.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.l.isPresent();
   }

   public float a(long $$0) {
      double $$1 = azu.e((double)this.l.orElse($$0) / 24000.0 - 0.25);
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

   public bsf d() {
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

   public aya<dkd> q() {
      return this.w;
   }

   public alp r() {
      return this.x;
   }

   public float s() {
      return this.y;
   }

   public ebj.a t() {
      return this.z;
   }

   public static record a(boolean b, boolean c, bsf d, int e) {
      public static final MapCodec<ebj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(ebj.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(ebj.a::b),
                  bsf.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(ebj.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(ebj.a::d)
               )
               .apply($$0, ebj.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bsf c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
