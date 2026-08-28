import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class esf {
   public static final Codec<esf> b = mg.P.q().dispatch(esf::e, esg::codec);
   private static final int a = 10387320;
   private final ka c;
   private final esf.c d;
   private final float e;
   private final int f;
   private final Optional<esf.a> g;

   protected static <S extends esf> P5<Mu<S>, ka, esf.c, Float, Integer, Optional<esf.a>> a(Instance<S> $$0) {
      return $$0.group(
         ka.v(16).optionalFieldOf("locate_offset", ka.i).forGetter(esf::f),
         esf.c.e.optionalFieldOf("frequency_reduction_method", esf.c.a).forGetter(esf::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(esf::h),
         ayu.l.fieldOf("salt").forGetter(esf::i),
         esf.a.a.optionalFieldOf("exclusion_zone").forGetter(esf::j)
      );
   }

   protected esf(ka $$0, esf.c $$1, float $$2, int $$3, Optional<esf.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ka f() {
      return this.c;
   }

   protected esf.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<esf.a> j() {
      return this.g;
   }

   public boolean b(ecn $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(ecn $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(ecn var1, int var2, int var3);

   public iv a(dio $$0) {
      return new iv($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract esg<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehm $$5 = new ehm(new ego(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehm $$5 = new ehm(new ego(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehm $$5 = new ehm(new ego(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      ehm $$7 = new ehm(new ego(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jf<ero> b, int c) {
      public static final Codec<esf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alc.a(mh.bd, ero.a, false).fieldOf("other_set").forGetter(esf.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(esf.a::b))
               .apply($$0, esf.a::new)
      );

      boolean a(ecn $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jf<ero> a() {
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

   public static enum c implements bak {
      a("default", esf::a),
      b("legacy_type_1", esf::d),
      c("legacy_type_2", esf::c),
      d("legacy_type_3", esf::b);

      public static final Codec<esf.c> e = bak.a(esf.c::values);
      private final String f;
      private final esf.b g;

      private c(final String $$0, final esf.b $$1) {
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
