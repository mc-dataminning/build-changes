import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eok {
   public static final Codec<eok> b = mb.P.q().dispatch(eok::e, eol::codec);
   private static final int a = 10387320;
   private final km c;
   private final eok.c d;
   private final float e;
   private final int f;
   private final Optional<eok.a> g;

   protected static <S extends eok> P5<Mu<S>, km, eok.c, Float, Integer, Optional<eok.a>> a(Instance<S> $$0) {
      return $$0.group(
         km.v(16).optionalFieldOf("locate_offset", km.h).forGetter(eok::f),
         eok.c.e.optionalFieldOf("frequency_reduction_method", eok.c.a).forGetter(eok::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eok::h),
         ayi.l.fieldOf("salt").forGetter(eok::i),
         eok.a.a.optionalFieldOf("exclusion_zone").forGetter(eok::j)
      );
   }

   protected eok(km $$0, eok.c $$1, float $$2, int $$3, Optional<eok.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected km f() {
      return this.c;
   }

   protected eok.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eok.a> j() {
      return this.g;
   }

   public boolean b(dyv $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dyv $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dyv var1, int var2, int var3);

   public ji a(dfp $$0) {
      return new ji($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eol<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eds $$5 = new eds(new ecu(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eds $$5 = new eds(new ecu(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eds $$5 = new eds(new ecu(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eds $$7 = new eds(new ecu(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jr<ent> b, int c) {
      public static final Codec<eok.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akr.a(mc.aW, ent.a, false).fieldOf("other_set").forGetter(eok.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eok.a::b))
               .apply($$0, eok.a::new)
      );

      boolean a(dyv $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jr<ent> a() {
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
      a("default", eok::a),
      b("legacy_type_1", eok::d),
      c("legacy_type_2", eok::c),
      d("legacy_type_3", eok::b);

      public static final Codec<eok.c> e = azv.a(eok.c::values);
      private final String f;
      private final eok.b g;

      private c(final String $$0, final eok.b $$1) {
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
