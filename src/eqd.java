import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eqd {
   public static final Codec<eqd> b = md.P.q().dispatch(eqd::e, eqe::codec);
   private static final int a = 10387320;
   private final kn c;
   private final eqd.c d;
   private final float e;
   private final int f;
   private final Optional<eqd.a> g;

   protected static <S extends eqd> P5<Mu<S>, kn, eqd.c, Float, Integer, Optional<eqd.a>> a(Instance<S> $$0) {
      return $$0.group(
         kn.v(16).optionalFieldOf("locate_offset", kn.i).forGetter(eqd::f),
         eqd.c.e.optionalFieldOf("frequency_reduction_method", eqd.c.a).forGetter(eqd::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eqd::h),
         ays.l.fieldOf("salt").forGetter(eqd::i),
         eqd.a.a.optionalFieldOf("exclusion_zone").forGetter(eqd::j)
      );
   }

   protected eqd(kn $$0, eqd.c $$1, float $$2, int $$3, Optional<eqd.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kn f() {
      return this.c;
   }

   protected eqd.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eqd.a> j() {
      return this.g;
   }

   public boolean b(eal $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(eal $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(eal var1, int var2, int var3);

   public jj a(dgw $$0) {
      return new jj($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eqe<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      efk $$5 = new efk(new eem(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      efk $$5 = new efk(new eem(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      efk $$5 = new efk(new eem(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      efk $$7 = new efk(new eem(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(js<epm> b, int c) {
      public static final Codec<eqd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akz.a(me.bb, epm.a, false).fieldOf("other_set").forGetter(eqd.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eqd.a::b))
               .apply($$0, eqd.a::new)
      );

      boolean a(eal $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public js<epm> a() {
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

   public static enum c implements bag {
      a("default", eqd::a),
      b("legacy_type_1", eqd::d),
      c("legacy_type_2", eqd::c),
      d("legacy_type_3", eqd::b);

      public static final Codec<eqd.c> e = bag.a(eqd.c::values);
      private final String f;
      private final eqd.b g;

      private c(final String $$0, final eqd.b $$1) {
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
