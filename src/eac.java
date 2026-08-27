import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eac {
   public static final Codec<eac> b = kd.R.q().dispatch(eac::e, ead::codec);
   private static final int a = 10387320;
   private final jb c;
   private final eac.c d;
   private final float e;
   private final int f;
   private final Optional<eac.a> g;

   protected static <S extends eac> P5<Mu<S>, jb, eac.c, Float, Integer, Optional<eac.a>> a(Instance<S> $$0) {
      return $$0.group(
         jb.v(16).optionalFieldOf("locate_offset", jb.g).forGetter(eac::f),
         eac.c.e.optionalFieldOf("frequency_reduction_method", eac.c.a).forGetter(eac::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eac::h),
         atv.i.fieldOf("salt").forGetter(eac::i),
         eac.a.a.optionalFieldOf("exclusion_zone").forGetter(eac::j)
      );
   }

   protected eac(jb $$0, eac.c $$1, float $$2, int $$3, Optional<eac.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jb f() {
      return this.c;
   }

   protected eac.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eac.a> j() {
      return this.g;
   }

   public boolean b(dle $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dle var1, int var2, int var3);

   public hx a(csv $$0) {
      return new hx($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ead<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpo $$5 = new dpo(new doq(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpo $$5 = new dpo(new doq(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpo $$5 = new dpo(new doq(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dpo $$7 = new dpo(new doq(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ih<dzl> b, int c) {
      public static final Codec<eac.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ahc.a(ke.aF, dzl.a, false).fieldOf("other_set").forGetter(eac.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eac.a::b))
               .apply($$0, eac.a::new)
      );

      boolean a(dle $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ih<dzl> a() {
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

   public static enum c implements avj {
      a("default", eac::a),
      b("legacy_type_1", eac::d),
      c("legacy_type_2", eac::c),
      d("legacy_type_3", eac::b);

      public static final Codec<eac.c> e = avj.a(eac.c::values);
      private final String f;
      private final eac.b g;

      private c(String $$0, eac.b $$1) {
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
