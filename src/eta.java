import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eta {
   public static final Codec<eta> b = mh.P.q().dispatch(eta::e, etb::codec);
   private static final int a = 10387320;
   private final kb c;
   private final eta.c d;
   private final float e;
   private final int f;
   private final Optional<eta.a> g;

   protected static <S extends eta> P5<Mu<S>, kb, eta.c, Float, Integer, Optional<eta.a>> a(Instance<S> $$0) {
      return $$0.group(
         kb.v(16).optionalFieldOf("locate_offset", kb.i).forGetter(eta::f),
         eta.c.e.optionalFieldOf("frequency_reduction_method", eta.c.a).forGetter(eta::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eta::h),
         ayy.l.fieldOf("salt").forGetter(eta::i),
         eta.a.a.optionalFieldOf("exclusion_zone").forGetter(eta::j)
      );
   }

   protected eta(kb $$0, eta.c $$1, float $$2, int $$3, Optional<eta.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kb f() {
      return this.c;
   }

   protected eta.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eta.a> j() {
      return this.g;
   }

   public boolean b(edf $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(edf $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(edf var1, int var2, int var3);

   public iw a(dje $$0) {
      return new iw($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract etb<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eie $$5 = new eie(new ehg(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eie $$5 = new eie(new ehg(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eie $$5 = new eie(new ehg(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eie $$7 = new eie(new ehg(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jg<esj> b, int c) {
      public static final Codec<eta.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alg.a(mi.bd, esj.a, false).fieldOf("other_set").forGetter(eta.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eta.a::b))
               .apply($$0, eta.a::new)
      );

      boolean a(edf $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jg<esj> a() {
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

   public static enum c implements bao {
      a("default", eta::a),
      b("legacy_type_1", eta::d),
      c("legacy_type_2", eta::c),
      d("legacy_type_3", eta::b);

      public static final Codec<eta.c> e = bao.a(eta.c::values);
      private final String f;
      private final eta.b g;

      private c(final String $$0, final eta.b $$1) {
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
