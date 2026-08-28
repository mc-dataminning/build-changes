import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eoi {
   public static final Codec<eoi> b = mb.P.q().dispatch(eoi::e, eoj::codec);
   private static final int a = 10387320;
   private final km c;
   private final eoi.c d;
   private final float e;
   private final int f;
   private final Optional<eoi.a> g;

   protected static <S extends eoi> P5<Mu<S>, km, eoi.c, Float, Integer, Optional<eoi.a>> a(Instance<S> $$0) {
      return $$0.group(
         km.v(16).optionalFieldOf("locate_offset", km.h).forGetter(eoi::f),
         eoi.c.e.optionalFieldOf("frequency_reduction_method", eoi.c.a).forGetter(eoi::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eoi::h),
         ayi.l.fieldOf("salt").forGetter(eoi::i),
         eoi.a.a.optionalFieldOf("exclusion_zone").forGetter(eoi::j)
      );
   }

   protected eoi(km $$0, eoi.c $$1, float $$2, int $$3, Optional<eoi.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected km f() {
      return this.c;
   }

   protected eoi.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eoi.a> j() {
      return this.g;
   }

   public boolean b(dyt $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dyt $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dyt var1, int var2, int var3);

   public ji a(dfn $$0) {
      return new ji($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eoj<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edq $$5 = new edq(new ecs(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edq $$5 = new edq(new ecs(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edq $$5 = new edq(new ecs(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      edq $$7 = new edq(new ecs(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jr<enr> b, int c) {
      public static final Codec<eoi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akr.a(mc.aW, enr.a, false).fieldOf("other_set").forGetter(eoi.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eoi.a::b))
               .apply($$0, eoi.a::new)
      );

      boolean a(dyt $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jr<enr> a() {
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

   public static enum c implements azv {
      a("default", eoi::a),
      b("legacy_type_1", eoi::d),
      c("legacy_type_2", eoi::c),
      d("legacy_type_3", eoi::b);

      public static final Codec<eoi.c> e = azv.a(eoi.c::values);
      private final String f;
      private final eoi.b g;

      private c(final String $$0, final eoi.b $$1) {
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
