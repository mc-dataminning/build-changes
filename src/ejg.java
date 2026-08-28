import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ejg {
   public static final Codec<ejg> b = lp.R.q().dispatch(ejg::e, ejh::codec);
   private static final int a = 10387320;
   private final kd c;
   private final ejg.c d;
   private final float e;
   private final int f;
   private final Optional<ejg.a> g;

   protected static <S extends ejg> P5<Mu<S>, kd, ejg.c, Float, Integer, Optional<ejg.a>> a(Instance<S> $$0) {
      return $$0.group(
         kd.v(16).optionalFieldOf("locate_offset", kd.g).forGetter(ejg::f),
         ejg.c.e.optionalFieldOf("frequency_reduction_method", ejg.c.a).forGetter(ejg::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ejg::h),
         ayg.k.fieldOf("salt").forGetter(ejg::i),
         ejg.a.a.optionalFieldOf("exclusion_zone").forGetter(ejg::j)
      );
   }

   protected ejg(kd $$0, ejg.c $$1, float $$2, int $$3, Optional<ejg.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kd f() {
      return this.c;
   }

   protected ejg.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ejg.a> j() {
      return this.g;
   }

   public boolean b(dtz $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dtz $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dtz var1, int var2, int var3);

   public iz a(dbe $$0) {
      return new iz($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ejh<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dys $$5 = new dys(new dxu(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dys $$5 = new dys(new dxu(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dys $$5 = new dys(new dxu(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dys $$7 = new dys(new dxu(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ji<eip> b, int c) {
      public static final Codec<ejg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ala.a(lq.aL, eip.a, false).fieldOf("other_set").forGetter(ejg.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ejg.a::b))
               .apply($$0, ejg.a::new)
      );

      boolean a(dtz $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ji<eip> a() {
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

   public static enum c implements azt {
      a("default", ejg::a),
      b("legacy_type_1", ejg::d),
      c("legacy_type_2", ejg::c),
      d("legacy_type_3", ejg::b);

      public static final Codec<ejg.c> e = azt.a(ejg.c::values);
      private final String f;
      private final ejg.b g;

      private c(final String $$0, final ejg.b $$1) {
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
