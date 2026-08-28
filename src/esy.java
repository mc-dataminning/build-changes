import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class esy {
   public static final Codec<esy> b = mg.P.q().dispatch(esy::e, esz::codec);
   private static final int a = 10387320;
   private final ka c;
   private final esy.c d;
   private final float e;
   private final int f;
   private final Optional<esy.a> g;

   protected static <S extends esy> P5<Mu<S>, ka, esy.c, Float, Integer, Optional<esy.a>> a(Instance<S> $$0) {
      return $$0.group(
         ka.v(16).optionalFieldOf("locate_offset", ka.i).forGetter(esy::f),
         esy.c.e.optionalFieldOf("frequency_reduction_method", esy.c.a).forGetter(esy::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(esy::h),
         ayw.l.fieldOf("salt").forGetter(esy::i),
         esy.a.a.optionalFieldOf("exclusion_zone").forGetter(esy::j)
      );
   }

   protected esy(ka $$0, esy.c $$1, float $$2, int $$3, Optional<esy.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ka f() {
      return this.c;
   }

   protected esy.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<esy.a> j() {
      return this.g;
   }

   public boolean b(edd $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(edd $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(edd var1, int var2, int var3);

   public iv a(djc $$0) {
      return new iv($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract esz<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eic $$5 = new eic(new ehe(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eic $$5 = new eic(new ehe(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eic $$5 = new eic(new ehe(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eic $$7 = new eic(new ehe(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jf<esh> b, int c) {
      public static final Codec<esy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ale.a(mh.bd, esh.a, false).fieldOf("other_set").forGetter(esy.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(esy.a::b))
               .apply($$0, esy.a::new)
      );

      boolean a(edd $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jf<esh> a() {
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

   public static enum c implements bam {
      a("default", esy::a),
      b("legacy_type_1", esy::d),
      c("legacy_type_2", esy::c),
      d("legacy_type_3", esy::b);

      public static final Codec<esy.c> e = bam.a(esy.c::values);
      private final String f;
      private final esy.b g;

      private c(final String $$0, final esy.b $$1) {
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
