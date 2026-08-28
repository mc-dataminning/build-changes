import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class emo {
   public static final Codec<emo> b = lx.P.q().dispatch(emo::e, emp::codec);
   private static final int a = 10387320;
   private final kk c;
   private final emo.c d;
   private final float e;
   private final int f;
   private final Optional<emo.a> g;

   protected static <S extends emo> P5<Mu<S>, kk, emo.c, Float, Integer, Optional<emo.a>> a(Instance<S> $$0) {
      return $$0.group(
         kk.v(16).optionalFieldOf("locate_offset", kk.g).forGetter(emo::f),
         emo.c.e.optionalFieldOf("frequency_reduction_method", emo.c.a).forGetter(emo::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(emo::h),
         ays.l.fieldOf("salt").forGetter(emo::i),
         emo.a.a.optionalFieldOf("exclusion_zone").forGetter(emo::j)
      );
   }

   protected emo(kk $$0, emo.c $$1, float $$2, int $$3, Optional<emo.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kk f() {
      return this.c;
   }

   protected emo.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<emo.a> j() {
      return this.g;
   }

   public boolean b(dxb $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dxb $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dxb var1, int var2, int var3);

   public jg a(deb $$0) {
      return new jg($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract emp<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eby $$5 = new eby(new eba(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eby $$5 = new eby(new eba(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eby $$5 = new eby(new eba(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eby $$7 = new eby(new eba(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jp<elx> b, int c) {
      public static final Codec<emo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ald.a(ly.aU, elx.a, false).fieldOf("other_set").forGetter(emo.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(emo.a::b))
               .apply($$0, emo.a::new)
      );

      boolean a(dxb $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jp<elx> a() {
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

   public static enum c implements baf {
      a("default", emo::a),
      b("legacy_type_1", emo::d),
      c("legacy_type_2", emo::c),
      d("legacy_type_3", emo::b);

      public static final Codec<emo.c> e = baf.a(emo.c::values);
      private final String f;
      private final emo.b g;

      private c(final String $$0, final emo.b $$1) {
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
