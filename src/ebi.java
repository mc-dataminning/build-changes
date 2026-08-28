import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.Optional;
import java.util.OptionalLong;

public record ebi(
   OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, ayk<dke> w, alz x, float y, ebi.a z
) {
   public static final int a = jh.d;
   public static final int b = 16;
   public static final int c = (1 << a) - 32;
   public static final int d = (c >> 1) - 1;
   public static final int e = d - c + 1;
   public static final int f = d << 4;
   public static final int g = e << 4;
   public static final Codec<ebi> h = azn.d(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azn.a(Codec.LONG.lenientOptionalFieldOf("fixed_time")).forGetter(ebi::f),
                  Codec.BOOL.fieldOf("has_skylight").forGetter(ebi::g),
                  Codec.BOOL.fieldOf("has_ceiling").forGetter(ebi::h),
                  Codec.BOOL.fieldOf("ultrawarm").forGetter(ebi::i),
                  Codec.BOOL.fieldOf("natural").forGetter(ebi::j),
                  Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(ebi::k),
                  Codec.BOOL.fieldOf("bed_works").forGetter(ebi::l),
                  Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(ebi::m),
                  Codec.intRange(e, d).fieldOf("min_y").forGetter(ebi::n),
                  Codec.intRange(16, c).fieldOf("height").forGetter(ebi::o),
                  Codec.intRange(0, c).fieldOf("logical_height").forGetter(ebi::p),
                  ayk.b(mb.f).fieldOf("infiniburn").forGetter(ebi::q),
                  alz.a.fieldOf("effects").orElse(ebg.e).forGetter(ebi::r),
                  Codec.FLOAT.fieldOf("ambient_light").forGetter(ebi::s),
                  ebi.a.a.forGetter(ebi::t)
               )
               .apply($$0, ebi::new)
      )
   );
   public static final zt<xg, jq<ebi>> i = zr.b(mb.aM);
   private static final int A = 8;
   public static final float[] j = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final Codec<jq<ebi>> k = alv.a(mb.aM, h);

   public ebi(
      OptionalLong l, boolean m, boolean n, boolean o, boolean p, double q, boolean r, boolean s, int t, int u, int v, ayk<dke> w, alz x, float y, ebi.a z
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
   public static DataResult<aly<dha>> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.asNumber().result();
      if ($$1.isPresent()) {
         int $$2 = $$1.get().intValue();
         if ($$2 == -1) {
            return DataResult.success(dha.j);
         }

         if ($$2 == 0) {
            return DataResult.success(dha.i);
         }

         if ($$2 == 1) {
            return DataResult.success(dha.k);
         }
      }

      return dha.h.parse($$0);
   }

   public static double a(ebi $$0, ebi $$1) {
      double $$2 = $$0.k();
      double $$3 = $$1.k();
      return $$2 / $$3;
   }

   public static Path a(aly<dha> $$0, Path $$1) {
      if ($$0 == dha.i) {
         return $$1;
      } else if ($$0 == dha.k) {
         return $$1.resolve("DIM1");
      } else {
         return $$0 == dha.j ? $$1.resolve("DIM-1") : $$1.resolve("dimensions").resolve($$0.a().b()).resolve($$0.a().a());
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

   public bsj d() {
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

   public ayk<dke> q() {
      return this.w;
   }

   public alz r() {
      return this.x;
   }

   public float s() {
      return this.y;
   }

   public ebi.a t() {
      return this.z;
   }

   public static record a(boolean b, boolean c, bsj d, int e) {
      public static final MapCodec<ebi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("piglin_safe").forGetter(ebi.a::a),
                  Codec.BOOL.fieldOf("has_raids").forGetter(ebi.a::b),
                  bsj.b(0, 15).fieldOf("monster_spawn_light_level").forGetter(ebi.a::c),
                  Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(ebi.a::d)
               )
               .apply($$0, ebi.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public bsj c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
