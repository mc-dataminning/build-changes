import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dzw {
   public static final Codec<dzw> b = kd.R.q().dispatch(dzw::e, dzx::codec);
   private static final int a = 10387320;
   private final jb c;
   private final dzw.c d;
   private final float e;
   private final int f;
   private final Optional<dzw.a> g;

   protected static <S extends dzw> P5<Mu<S>, jb, dzw.c, Float, Integer, Optional<dzw.a>> a(Instance<S> $$0) {
      return $$0.group(
         jb.v(16).optionalFieldOf("locate_offset", jb.g).forGetter(dzw::f),
         dzw.c.e.optionalFieldOf("frequency_reduction_method", dzw.c.a).forGetter(dzw::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dzw::h),
         atq.i.fieldOf("salt").forGetter(dzw::i),
         dzw.a.a.optionalFieldOf("exclusion_zone").forGetter(dzw::j)
      );
   }

   protected dzw(jb $$0, dzw.c $$1, float $$2, int $$3, Optional<dzw.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jb f() {
      return this.c;
   }

   protected dzw.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dzw.a> j() {
      return this.g;
   }

   public boolean b(dky $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dky var1, int var2, int var3);

   public hx a(csp $$0) {
      return new hx($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dzx<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpi $$5 = new dpi(new dok(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpi $$5 = new dpi(new dok(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpi $$5 = new dpi(new dok(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dpi $$7 = new dpi(new dok(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ih<dzf> b, int c) {
      public static final Codec<dzw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(agz.a(ke.aF, dzf.a, false).fieldOf("other_set").forGetter(dzw.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dzw.a::b))
               .apply($$0, dzw.a::new)
      );

      boolean a(dky $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ih<dzf> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   @FunctionalInterface
   public interface b {
      boolean shouldGenerate(long var1, int var3, int var4, int var5, float var6);
   }

   public static enum c implements ave {
      a("default", dzw::a),
      b("legacy_type_1", dzw::d),
      c("legacy_type_2", dzw::c),
      d("legacy_type_3", dzw::b);

      public static final Codec<dzw.c> e = ave.a(dzw.c::values);
      private final String f;
      private final dzw.b g;

      private c(String $$0, dzw.b $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
         return this.g.shouldGenerate($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
