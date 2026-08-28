import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eoj {
   public static final Codec<eoj> b = mb.P.q().dispatch(eoj::e, eok::codec);
   private static final int a = 10387320;
   private final km c;
   private final eoj.c d;
   private final float e;
   private final int f;
   private final Optional<eoj.a> g;

   protected static <S extends eoj> P5<Mu<S>, km, eoj.c, Float, Integer, Optional<eoj.a>> a(Instance<S> $$0) {
      return $$0.group(
         km.v(16).optionalFieldOf("locate_offset", km.h).forGetter(eoj::f),
         eoj.c.e.optionalFieldOf("frequency_reduction_method", eoj.c.a).forGetter(eoj::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eoj::h),
         ayi.l.fieldOf("salt").forGetter(eoj::i),
         eoj.a.a.optionalFieldOf("exclusion_zone").forGetter(eoj::j)
      );
   }

   protected eoj(km $$0, eoj.c $$1, float $$2, int $$3, Optional<eoj.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected km f() {
      return this.c;
   }

   protected eoj.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eoj.a> j() {
      return this.g;
   }

   public boolean b(dyu $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dyu $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dyu var1, int var2, int var3);

   public ji a(dfo $$0) {
      return new ji($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eok<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edr $$5 = new edr(new ect(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edr $$5 = new edr(new ect(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      edr $$5 = new edr(new ect(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      edr $$7 = new edr(new ect(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jr<ens> b, int c) {
      public static final Codec<eoj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akr.a(mc.aW, ens.a, false).fieldOf("other_set").forGetter(eoj.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eoj.a::b))
               .apply($$0, eoj.a::new)
      );

      boolean a(dyu $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jr<ens> a() {
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
      a("default", eoj::a),
      b("legacy_type_1", eoj::d),
      c("legacy_type_2", eoj::c),
      d("legacy_type_3", eoj::b);

      public static final Codec<eoj.c> e = azv.a(eoj.c::values);
      private final String f;
      private final eoj.b g;

      private c(final String $$0, final eoj.b $$1) {
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
