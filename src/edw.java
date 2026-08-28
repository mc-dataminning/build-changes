import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record edw(
   OptionalLong m, boolean n, boolean o, boolean p, boolean q, double r, boolean s, boolean t, int u, int v, int w, axr<dma> x, alg y, float z, edw.a A
) {
   public static final int a = iu.e;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<edw> h = ayu.e(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayu.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(edw::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(edw::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(edw::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(edw::i),
                  Codec.BOOL.fieldOf("natural").forGetter(edw::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(edw::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(edw::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(edw::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(edw::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(edw::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(edw::p),
                  axr.b(mg.i).fieldOf("infiniburn").forGetter(edw::q),
                  alg.a.fieldOf("effects").orElse(edu.e).forGetter(edw::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(edw::s),
                  edw.a.a.forGetter(edw::t)
               )
               .apply($$0, edw::new)
      )
   );
   public static final yw<wj, je<edw>> i = yu.b(mg.aO);
   public static final int j = 8;
   public static final float[] k = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<je<edw>> l = alc.a(mg.aO, h);

   public edw(
      OptionalLong m, boolean n, boolean o, boolean p, boolean q, double r, boolean s, boolean t, int u, int v, int w, axr<dma> x, alg y, float z, edw.a A
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
   public static DataResult<alf<div>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(div.j);
         }

         if ($$2 == 0) {
            return DataResult.success(div.i);
         }

         if ($$2 == 1) {
            return DataResult.success(div.k);
         }
      }

      return div.h.parse($$0);
   }

   public static double a(edw $$0, edw $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(alf<div> $$0, Path $$1) {
      if ($$0 == div.i) {
         return $$1;
      } else if ($$0 == div.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == div.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
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

   public btg d() {
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

   public axr<dma> q() {
      return this.x;
   }

   public alg r() {
      return this.y;
   }

   public float s() {
      return this.z;
   }

   public edw.a t() {
      return this.A;
   }

   public static record a(boolean b, boolean c, btg d, int e) {
      public static final MapCodec<edw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(edw.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(edw.a::b),
                  btg.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(edw.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(edw.a::d)
               )
               .apply($$0, edw.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public btg c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
