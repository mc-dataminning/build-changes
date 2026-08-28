import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record dwf(
   OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, awm<dfh> v, akk w, float x, dwf.a y
) {
   public static final int a = ja.d;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<dwf> h = axo.c(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axo.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(dwf::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(dwf::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(dwf::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(dwf::i),
                  Codec.BOOL.fieldOf("natural").forGetter(dwf::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(dwf::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(dwf::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(dwf::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(dwf::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(dwf::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(dwf::p),
                  awm.b(lr.f).fieldOf("infiniburn").forGetter(dwf::q),
                  akk.a.fieldOf("effects").orElse(dwd.e).forGetter(dwf::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(dwf::s),
                  dwf.a.a.forGetter(dwf::t)
               )
               .apply($$0, dwf::new)
      )
   );
   private static final int z = 8;
   public static final float[] i = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jj<dwf>> j = akg.a(lr.aJ, h);

   public dwf(
      OptionalLong k, boolean l, boolean m, boolean n, boolean o, double p, boolean q, boolean r, int s, int t, int u, awm<dfh> v, akk w, float x, dwf.a y
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
   public static DataResult<akj<dcf>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dcf.i);
         }

         if ($$2 == 0) {
            return DataResult.success(dcf.h);
         }

         if ($$2 == 1) {
            return DataResult.success(dcf.j);
         }
      }

      return dcf.g.parse($$0);
   }

   public static double a(dwf $$0, dwf $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(akj<dcf> $$0, Path $$1) {
      if ($$0 == dcf.h) {
         return $$1;
      } else if ($$0 == dcf.j) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dcf.i ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.k.isPresent();
   }

   public float a(long $$0) {
      double $$1 = ayg.e((double)this.k.orElse($$0) / 24000.0 - 0.25);
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

   public bpl d() {
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

   public awm<dfh> q() {
      return this.v;
   }

   public akk r() {
      return this.w;
   }

   public float s() {
      return this.x;
   }

   public dwf.a t() {
      return this.y;
   }

   public static record a(boolean b, boolean c, bpl d, int e) {
      public static final MapCodec<dwf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(dwf.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(dwf.a::b),
                  bpl.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(dwf.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(dwf.a::d)
               )
               .apply($$0, dwf.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bpl c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
