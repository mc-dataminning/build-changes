import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record eel(
   OptionalLong m, boolean n, boolean o, boolean p, boolean q, double r, boolean s, boolean t, int u, int v, int w, axr<dmm> x, alg y, float z, eel.a A
) {
   public static final int a = iv.e;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<eel> h = ayu.e(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(eel::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(eel::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(eel::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(eel::i),
                  Codec.BOOL.fieldOf("natural").forGetter(eel::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(eel::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(eel::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(eel::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(eel::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(eel::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(eel::p),
                  axr.b(mh.i).fieldOf("infiniburn").forGetter(eel::q),
                  alg.a.fieldOf("effects").orElse(eej.e).forGetter(eel::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(eel::s),
                  eel.a.a.forGetter(eel::t)
               )
               .apply($$0, eel::new)
      )
   );
   public static final yw<wj, jf<eel>> i = yu.b(mh.aP);
   public static final int j = 8;
   public static final float[] k = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jf<eel>> l = alc.a(mh.aP, h);

   public eel(
      OptionalLong m, boolean n, boolean o, boolean p, boolean q, double r, boolean s, boolean t, int u, int v, int w, axr<dmm> x, alg y, float z, eel.a A
   ) {
      if (v < 16) {
         throw new IllegalStateException("height has to be at least 16");
      } else if (u + v > d + 1) {
         throw new IllegalStateException("min_y + height cannot be higher than: " + (d + 1));
      } else if (w > v) {
         throw new IllegalStateException("logical_height cannot be higher than height");
      } else if (v % 16 != 0) {
         throw new IllegalStateException("height has to be multiple of 16");
      } else if (u % 16 != 0) {
         throw new IllegalStateException("min_y has to be a multiple of 16");
      } else {
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
         this.A = A;
      }
   }

   @Deprecated
   public static DataResult<alf<djh>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(djh.j);
         }

         if ($$2 == 0) {
            return DataResult.success(djh.i);
         }

         if ($$2 == 1) {
            return DataResult.success(djh.k);
         }
      }

      return djh.h.parse($$0);
   }

   public static double a(eel $$0, eel $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(alf<djh> $$0, Path $$1) {
      if ($$0 == djh.i) {
         return $$1;
      } else if ($$0 == djh.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == djh.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
      }
   }

   public boolean a() {
      return this.m.isPresent();
   }

   public float a(long $$0) {
      double $$1 = azm.e((double)this.m.orElse($$0) / 24000.0 - 0.25);
      double $$2 = 0.5 - Math.cos($$1 * Math.PI) / 2.0;
      return (float)($$1 * 2.0 + $$2) / 3.0F;
   }

   public int b(long $$0) {
      return (int)($$0 / 24000L % 8L + 8L) % 8;
   }

   public boolean b() {
      return this.A.a();
   }

   public boolean c() {
      return this.A.b();
   }

   public btl d() {
      return this.A.c();
   }

   public int e() {
      return this.A.d();
   }

   public OptionalLong f() {
      return this.m;
   }

   public boolean g() {
      return this.n;
   }

   public boolean h() {
      return this.o;
   }

   public boolean i() {
      return this.p;
   }

   public boolean j() {
      return this.q;
   }

   public double k() {
      return this.r;
   }

   public boolean l() {
      return this.s;
   }

   public boolean m() {
      return this.t;
   }

   public int n() {
      return this.u;
   }

   public int o() {
      return this.v;
   }

   public int p() {
      return this.w;
   }

   public axr<dmm> q() {
      return this.x;
   }

   public alg r() {
      return this.y;
   }

   public float s() {
      return this.z;
   }

   public eel.a t() {
      return this.A;
   }

   public static record a(boolean b, boolean c, btl d, int e) {
      public static final MapCodec<eel.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(eel.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(eel.a::b),
                  btl.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(eel.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(eel.a::d)
               )
               .apply($$0, eel.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public btl c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
