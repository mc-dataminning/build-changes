import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ejh {
   public static final Codec<ejh> b = lp.R.q().dispatch(ejh::e, eji::codec);
   private static final int a = 10387320;
   private final kd c;
   private final ejh.c d;
   private final float e;
   private final int f;
   private final Optional<ejh.a> g;

   protected static <S extends ejh> P5<Mu<S>, kd, ejh.c, Float, Integer, Optional<ejh.a>> a(Instance<S> $$0) {
      return $$0.group(
         kd.v(16).optionalFieldOf("locate_offset", kd.g).forGetter(ejh::f),
         ejh.c.e.optionalFieldOf("frequency_reduction_method", ejh.c.a).forGetter(ejh::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ejh::h),
         ayh.k.fieldOf("salt").forGetter(ejh::i),
         ejh.a.a.optionalFieldOf("exclusion_zone").forGetter(ejh::j)
      );
   }

   protected ejh(kd $$0, ejh.c $$1, float $$2, int $$3, Optional<ejh.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kd f() {
      return this.c;
   }

   protected ejh.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ejh.a> j() {
      return this.g;
   }

   public boolean b(dua $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dua $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dua var1, int var2, int var3);

   public iz a(dbf $$0) {
      return new iz($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eji<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyt $$5 = new dyt(new dxv(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyt $$5 = new dyt(new dxv(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyt $$5 = new dyt(new dxv(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dyt $$7 = new dyt(new dxv(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ji<eiq> b, int c) {
      public static final Codec<ejh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alb.a(lq.aL, eiq.a, false).fieldOf("other_set").forGetter(ejh.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ejh.a::b))
               .apply($$0, ejh.a::new)
      );

      boolean a(dua $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ji<eiq> a() {
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

   public static enum c implements azu {
      a("default", ejh::a),
      b("legacy_type_1", ejh::d),
      c("legacy_type_2", ejh::c),
      d("legacy_type_3", ejh::b);

      public static final Codec<ejh.c> e = azu.a(ejh.c::values);
      private final String f;
      private final ejh.b g;

      private c(final String $$0, final ejh.b $$1) {
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
