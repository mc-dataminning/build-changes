import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eci {
   public static final Codec<eci> b = kf.R.q().dispatch(eci::e, ecj::codec);
   private static final int a = 10387320;
   private final jd c;
   private final eci.c d;
   private final float e;
   private final int f;
   private final Optional<eci.a> g;

   protected static <S extends eci> P5<Mu<S>, jd, eci.c, Float, Integer, Optional<eci.a>> a(Instance<S> $$0) {
      return $$0.group(
         jd.v(16).optionalFieldOf("locate_offset", jd.g).forGetter(eci::f),
         eci.c.e.optionalFieldOf("frequency_reduction_method", eci.c.a).forGetter(eci::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eci::h),
         avq.i.fieldOf("salt").forGetter(eci::i),
         eci.a.a.optionalFieldOf("exclusion_zone").forGetter(eci::j)
      );
   }

   protected eci(jd $$0, eci.c $$1, float $$2, int $$3, Optional<eci.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jd f() {
      return this.c;
   }

   protected eci.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eci.a> j() {
      return this.g;
   }

   public boolean b(dnh $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dnh $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dnh var1, int var2, int var3);

   public hz a(cuy $$0) {
      return new hz($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ecj<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dru $$5 = new dru(new dqw(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dru $$5 = new dru(new dqw(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dru $$5 = new dru(new dqw(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dru $$7 = new dru(new dqw(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ij<ebr> b, int c) {
      public static final Codec<eci.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aiu.a(kg.aF, ebr.a, false).fieldOf("other_set").forGetter(eci.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eci.a::b))
               .apply($$0, eci.a::new)
      );

      boolean a(dnh $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ij<ebr> a() {
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

   public static enum c implements axc {
      a("default", eci::a),
      b("legacy_type_1", eci::d),
      c("legacy_type_2", eci::c),
      d("legacy_type_3", eci::b);

      public static final Codec<eci.c> e = axc.a(eci.c::values);
      private final String f;
      private final eci.b g;

      private c(String $$0, eci.b $$1) {
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
