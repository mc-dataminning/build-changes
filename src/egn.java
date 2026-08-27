import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class egn {
   public static final Codec<egn> b = kt.R.q().dispatch(egn::e, ego::codec);
   private static final int a = 10387320;
   private final ji c;
   private final egn.c d;
   private final float e;
   private final int f;
   private final Optional<egn.a> g;

   protected static <S extends egn> P5<Mu<S>, ji, egn.c, Float, Integer, Optional<egn.a>> a(Instance<S> $$0) {
      return $$0.group(
         ji.v(16).optionalFieldOf("locate_offset", ji.g).forGetter(egn::f),
         egn.c.e.optionalFieldOf("frequency_reduction_method", egn.c.a).forGetter(egn::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(egn::h),
         awu.i.fieldOf("salt").forGetter(egn::i),
         egn.a.a.optionalFieldOf("exclusion_zone").forGetter(egn::j)
      );
   }

   protected egn(ji $$0, egn.c $$1, float $$2, int $$3, Optional<egn.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ji f() {
      return this.c;
   }

   protected egn.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<egn.a> j() {
      return this.g;
   }

   public boolean b(drg $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(drg $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(drg var1, int var2, int var3);

   public id a(cyn $$0) {
      return new id($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ego<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvz $$5 = new dvz(new dvb(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvz $$5 = new dvz(new dvb(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvz $$5 = new dvz(new dvb(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dvz $$7 = new dvz(new dvb(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(in<efw> b, int c) {
      public static final Codec<egn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ajr.a(ku.aI, efw.a, false).fieldOf("other_set").forGetter(egn.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(egn.a::b))
               .apply($$0, egn.a::new)
      );

      boolean a(drg $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public in<efw> a() {
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

   public static enum c implements ayg {
      a("default", egn::a),
      b("legacy_type_1", egn::d),
      c("legacy_type_2", egn::c),
      d("legacy_type_3", egn::b);

      public static final Codec<egn.c> e = ayg.a(egn.c::values);
      private final String f;
      private final egn.b g;

      private c(String $$0, egn.b $$1) {
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
