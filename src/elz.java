import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class elz {
   public static final Codec<elz> b = lu.P.q().dispatch(elz::e, ema::codec);
   private static final int a = 10387320;
   private final ki c;
   private final elz.c d;
   private final float e;
   private final int f;
   private final Optional<elz.a> g;

   protected static <S extends elz> P5<Mu<S>, ki, elz.c, Float, Integer, Optional<elz.a>> a(Instance<S> $$0) {
      return $$0.group(
         ki.v(16).optionalFieldOf("locate_offset", ki.g).forGetter(elz::f),
         elz.c.e.optionalFieldOf("frequency_reduction_method", elz.c.a).forGetter(elz::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(elz::h),
         aym.k.fieldOf("salt").forGetter(elz::i),
         elz.a.a.optionalFieldOf("exclusion_zone").forGetter(elz::j)
      );
   }

   protected elz(ki $$0, elz.c $$1, float $$2, int $$3, Optional<elz.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ki f() {
      return this.c;
   }

   protected elz.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<elz.a> j() {
      return this.g;
   }

   public boolean b(dwm $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dwm $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dwm var1, int var2, int var3);

   public je a(ddm $$0) {
      return new je($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ema<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebj $$5 = new ebj(new eal(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebj $$5 = new ebj(new eal(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebj $$5 = new ebj(new eal(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      ebj $$7 = new ebj(new eal(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jn<eli> b, int c) {
      public static final Codec<elz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aky.a(lv.aU, eli.a, false).fieldOf("other_set").forGetter(elz.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(elz.a::b))
               .apply($$0, elz.a::new)
      );

      boolean a(dwm $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jn<eli> a() {
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

   public static enum c implements azz {
      a("default", elz::a),
      b("legacy_type_1", elz::d),
      c("legacy_type_2", elz::c),
      d("legacy_type_3", elz::b);

      public static final Codec<elz.c> e = azz.a(elz.c::values);
      private final String f;
      private final elz.b g;

      private c(final String $$0, final elz.b $$1) {
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
