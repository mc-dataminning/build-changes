import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class etk {
   public static final Codec<etk> b = mh.P.q().dispatch(etk::e, etl::codec);
   private static final int a = 10387320;
   private final kb c;
   private final etk.c d;
   private final float e;
   private final int f;
   private final Optional<etk.a> g;

   protected static <S extends etk> P5<Mu<S>, kb, etk.c, Float, Integer, Optional<etk.a>> a(Instance<S> $$0) {
      return $$0.group(
         kb.v(16).optionalFieldOf("locate_offset", kb.i).forGetter(etk::f),
         etk.c.e.optionalFieldOf("frequency_reduction_method", etk.c.a).forGetter(etk::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(etk::h),
         azg.l.fieldOf("salt").forGetter(etk::i),
         etk.a.a.optionalFieldOf("exclusion_zone").forGetter(etk::j)
      );
   }

   protected etk(kb $$0, etk.c $$1, float $$2, int $$3, Optional<etk.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kb f() {
      return this.c;
   }

   protected etk.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<etk.a> j() {
      return this.g;
   }

   public boolean b(edp $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(edp $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(edp var1, int var2, int var3);

   public iw a(djo $$0) {
      return new iw($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract etl<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eio $$5 = new eio(new ehq(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eio $$5 = new eio(new ehq(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eio $$5 = new eio(new ehq(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eio $$7 = new eio(new ehq(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jg<est> b, int c) {
      public static final Codec<etk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aln.a(mi.bd, est.a, false).fieldOf("other_set").forGetter(etk.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(etk.a::b))
               .apply($$0, etk.a::new)
      );

      boolean a(edp $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jg<est> a() {
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

   public static enum c implements bax {
      a("default", etk::a),
      b("legacy_type_1", etk::d),
      c("legacy_type_2", etk::c),
      d("legacy_type_3", etk::b);

      public static final Codec<etk.c> e = bax.a(etk.c::values);
      private final String f;
      private final etk.b g;

      private c(final String $$0, final etk.b $$1) {
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
