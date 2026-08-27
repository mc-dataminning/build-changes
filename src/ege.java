import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ege {
   public static final Codec<ege> b = kr.R.q().dispatch(ege::e, egf::codec);
   private static final int a = 10387320;
   private final jg c;
   private final ege.c d;
   private final float e;
   private final int f;
   private final Optional<ege.a> g;

   protected static <S extends ege> P5<Mu<S>, jg, ege.c, Float, Integer, Optional<ege.a>> a(Instance<S> $$0) {
      return $$0.group(
         jg.v(16).optionalFieldOf("locate_offset", jg.g).forGetter(ege::f),
         ege.c.e.optionalFieldOf("frequency_reduction_method", ege.c.a).forGetter(ege::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ege::h),
         aws.i.fieldOf("salt").forGetter(ege::i),
         ege.a.a.optionalFieldOf("exclusion_zone").forGetter(ege::j)
      );
   }

   protected ege(jg $$0, ege.c $$1, float $$2, int $$3, Optional<ege.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jg f() {
      return this.c;
   }

   protected ege.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ege.a> j() {
      return this.g;
   }

   public boolean b(dqx $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dqx $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dqx var1, int var2, int var3);

   public ib a(cye $$0) {
      return new ib($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract egf<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvq $$5 = new dvq(new dus(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvq $$5 = new dvq(new dus(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dvq $$5 = new dvq(new dus(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dvq $$7 = new dvq(new dus(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(il<efn> b, int c) {
      public static final Codec<ege.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ajp.a(ks.aH, efn.a, false).fieldOf("other_set").forGetter(ege.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ege.a::b))
               .apply($$0, ege.a::new)
      );

      boolean a(dqx $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public il<efn> a() {
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

   public static enum c implements aye {
      a("default", ege::a),
      b("legacy_type_1", ege::d),
      c("legacy_type_2", ege::c),
      d("legacy_type_3", ege::b);

      public static final Codec<ege.c> e = aye.a(ege.c::values);
      private final String f;
      private final ege.b g;

      private c(String $$0, ege.b $$1) {
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
