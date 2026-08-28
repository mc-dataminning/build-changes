import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class erq {
   public static final Codec<erq> b = mf.P.q().dispatch(erq::e, err::codec);
   private static final int a = 10387320;
   private final jz c;
   private final erq.c d;
   private final float e;
   private final int f;
   private final Optional<erq.a> g;

   protected static <S extends erq> P5<Mu<S>, jz, erq.c, Float, Integer, Optional<erq.a>> a(Instance<S> $$0) {
      return $$0.group(
         jz.v(16).optionalFieldOf("locate_offset", jz.i).forGetter(erq::f),
         erq.c.e.optionalFieldOf("frequency_reduction_method", erq.c.a).forGetter(erq::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(erq::h),
         ayu.l.fieldOf("salt").forGetter(erq::i),
         erq.a.a.optionalFieldOf("exclusion_zone").forGetter(erq::j)
      );
   }

   protected erq(jz $$0, erq.c $$1, float $$2, int $$3, Optional<erq.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jz f() {
      return this.c;
   }

   protected erq.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<erq.a> j() {
      return this.g;
   }

   public boolean b(eby $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(eby $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(eby var1, int var2, int var3);

   public iu a(dic $$0) {
      return new iu($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract err<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      egx $$5 = new egx(new efz(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      egx $$5 = new egx(new efz(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      egx $$5 = new egx(new efz(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      egx $$7 = new egx(new efz(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(je<eqz> b, int c) {
      public static final Codec<erq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alc.a(mg.bc, eqz.a, false).fieldOf("other_set").forGetter(erq.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(erq.a::b))
               .apply($$0, erq.a::new)
      );

      boolean a(eby $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public je<eqz> a() {
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

   public static enum c implements bak {
      a("default", erq::a),
      b("legacy_type_1", erq::d),
      c("legacy_type_2", erq::c),
      d("legacy_type_3", erq::b);

      public static final Codec<erq.c> e = bak.a(erq.c::values);
      private final String f;
      private final erq.b g;

      private c(final String $$0, final erq.b $$1) {
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
