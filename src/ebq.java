import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record ebq(
   OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, ayk<dkm> w, alz x, float y, ebq.a z
) {
   public static final int a = jh.e;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<ebq> h = azn.d(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azn.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(ebq::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(ebq::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(ebq::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(ebq::i),
                  Codec.BOOL.fieldOf("natural").forGetter(ebq::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(ebq::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(ebq::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(ebq::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(ebq::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(ebq::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(ebq::p),
                  ayk.b(mb.f).fieldOf("infiniburn").forGetter(ebq::q),
                  alz.a.fieldOf("effects").orElse(ebo.e).forGetter(ebq::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(ebq::s),
                  ebq.a.a.forGetter(ebq::t)
               )
               .apply($$0, ebq::new)
      )
   );
   public static final zt<xg, jq<ebq>> i = zr.b(mb.aN);
   private static final int A = 8;
   public static final float[] j = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jq<ebq>> k = alv.a(mb.aN, h);

   public ebq(
      OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, ayk<dkm> w, alz x, float y, ebq.a z
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
   public static DataResult<aly<dhi>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dhi.j);
         }

         if ($$2 == 0) {
            return DataResult.success(dhi.i);
         }

         if ($$2 == 1) {
            return DataResult.success(dhi.k);
         }
      }

      return dhi.h.parse($$0);
   }

   public static double a(ebq $$0, ebq $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(aly<dhi> $$0, Path $$1) {
      if ($$0 == dhi.i) {
         return $$1;
      } else if ($$0 == dhi.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dhi.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.l.isPresent();
   }

   public float a(long $$0) {
      double $$1 = bae.e((double)this.l.orElse($$0) / 24000.0 - 0.25);
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

   public bso d() {
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

   public ayk<dkm> q() {
      return this.w;
   }

   public alz r() {
      return this.x;
   }

   public float s() {
      return this.y;
   }

   public ebq.a t() {
      return this.z;
   }

   public static record a(boolean b, boolean c, bso d, int e) {
      public static final MapCodec<ebq.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(ebq.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(ebq.a::b),
                  bso.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(ebq.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(ebq.a::d)
               )
               .apply($$0, ebq.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bso c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
