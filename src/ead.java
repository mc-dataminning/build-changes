import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ead {
   public static final Codec<ead> b = kd.R.q().dispatch(ead::e, eae::codec);
   private static final int a = 10387320;
   private final jb c;
   private final ead.c d;
   private final float e;
   private final int f;
   private final Optional<ead.a> g;

   protected static <S extends ead> P5<Mu<S>, jb, ead.c, Float, Integer, Optional<ead.a>> a(Instance<S> $$0) {
      return $$0.group(
         jb.v(16).optionalFieldOf("locate_offset", jb.g).forGetter(ead::f),
         ead.c.e.optionalFieldOf("frequency_reduction_method", ead.c.a).forGetter(ead::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ead::h),
         atw.i.fieldOf("salt").forGetter(ead::i),
         ead.a.a.optionalFieldOf("exclusion_zone").forGetter(ead::j)
      );
   }

   protected ead(jb $$0, ead.c $$1, float $$2, int $$3, Optional<ead.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jb f() {
      return this.c;
   }

   protected ead.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ead.a> j() {
      return this.g;
   }

   public boolean b(dlf $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dlf var1, int var2, int var3);

   public hx a(csw $$0) {
      return new hx($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eae<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpp $$5 = new dpp(new dor(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpp $$5 = new dpp(new dor(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpp $$5 = new dpp(new dor(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dpp $$7 = new dpp(new dor(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ih<dzm> b, int c) {
      public static final Codec<ead.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ahc.a(ke.aF, dzm.a, false).fieldOf("other_set").forGetter(ead.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ead.a::b))
               .apply($$0, ead.a::new)
      );

      boolean a(dlf $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ih<dzm> a() {
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

   public static enum c implements avk {
      a("default", ead::a),
      b("legacy_type_1", ead::d),
      c("legacy_type_2", ead::c),
      d("legacy_type_3", ead::b);

      public static final Codec<ead.c> e = avk.a(ead.c::values);
      private final String f;
      private final ead.b g;

      private c(String $$0, ead.b $$1) {
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
