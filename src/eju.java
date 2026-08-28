import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eju {
   public static final Codec<eju> b = lq.P.r().dispatch(eju::e, ejv::codec);
   private static final int a = 10387320;
   private final ke c;
   private final eju.c d;
   private final float e;
   private final int f;
   private final Optional<eju.a> g;

   protected static <S extends eju> P5<Mu<S>, ke, eju.c, Float, Integer, Optional<eju.a>> a(Instance<S> $$0) {
      return $$0.group(
         ke.v(16).optionalFieldOf("locate_offset", ke.g).forGetter(eju::f),
         eju.c.e.optionalFieldOf("frequency_reduction_method", eju.c.a).forGetter(eju::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eju::h),
         axo.k.fieldOf("salt").forGetter(eju::i),
         eju.a.a.optionalFieldOf("exclusion_zone").forGetter(eju::j)
      );
   }

   protected eju(ke $$0, eju.c $$1, float $$2, int $$3, Optional<eju.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ke f() {
      return this.c;
   }

   protected eju.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eju.a> j() {
      return this.g;
   }

   public boolean b(duj $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(duj $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(duj var1, int var2, int var3);

   public ja a(dbn $$0) {
      return new ja($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ejv<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzf $$5 = new dzf(new dyh(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzf $$5 = new dzf(new dyh(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzf $$5 = new dzf(new dyh(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dzf $$7 = new dzf(new dyh(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jj<ejd> b, int c) {
      public static final Codec<eju.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akg.a(lr.aS, ejd.a, false).fieldOf("other_set").forGetter(eju.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eju.a::b))
               .apply($$0, eju.a::new)
      );

      boolean a(duj $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jj<ejd> a() {
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

   public static enum c implements azc {
      a("default", eju::a),
      b("legacy_type_1", eju::d),
      c("legacy_type_2", eju::c),
      d("legacy_type_3", eju::b);

      public static final Codec<eju.c> e = azc.a(eju.c::values);
      private final String f;
      private final eju.b g;

      private c(final String $$0, final eju.b $$1) {
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
