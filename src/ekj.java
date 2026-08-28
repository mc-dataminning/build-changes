import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ekj {
   public static final Codec<ekj> b = lt.P.r().dispatch(ekj::e, ekk::codec);
   private static final int a = 10387320;
   private final kh c;
   private final ekj.c d;
   private final float e;
   private final int f;
   private final Optional<ekj.a> g;

   protected static <S extends ekj> P5<Mu<S>, kh, ekj.c, Float, Integer, Optional<ekj.a>> a(Instance<S> $$0) {
      return $$0.group(
         kh.v(16).optionalFieldOf("locate_offset", kh.g).forGetter(ekj::f),
         ekj.c.e.optionalFieldOf("frequency_reduction_method", ekj.c.a).forGetter(ekj::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ekj::h),
         axv.k.fieldOf("salt").forGetter(ekj::i),
         ekj.a.a.optionalFieldOf("exclusion_zone").forGetter(ekj::j)
      );
   }

   protected ekj(kh $$0, ekj.c $$1, float $$2, int $$3, Optional<ekj.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kh f() {
      return this.c;
   }

   protected ekj.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ekj.a> j() {
      return this.g;
   }

   public boolean b(duy $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(duy $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(duy var1, int var2, int var3);

   public jd a(dcb $$0) {
      return new jd($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ekk<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzu $$5 = new dzu(new dyw(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzu $$5 = new dzu(new dyw(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzu $$5 = new dzu(new dyw(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dzu $$7 = new dzu(new dyw(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jm<ejs> b, int c) {
      public static final Codec<ekj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akm.a(lu.aT, ejs.a, false).fieldOf("other_set").forGetter(ekj.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ekj.a::b))
               .apply($$0, ekj.a::new)
      );

      boolean a(duy $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jm<ejs> a() {
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

   public static enum c implements azj {
      a("default", ekj::a),
      b("legacy_type_1", ekj::d),
      c("legacy_type_2", ekj::c),
      d("legacy_type_3", ekj::b);

      public static final Codec<ekj.c> e = azj.a(ekj.c::values);
      private final String f;
      private final ekj.b g;

      private c(final String $$0, final ekj.b $$1) {
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
