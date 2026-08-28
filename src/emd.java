import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class emd {
   public static final Codec<emd> b = lv.P.q().dispatch(emd::e, eme::codec);
   private static final int a = 10387320;
   private final kj c;
   private final emd.c d;
   private final float e;
   private final int f;
   private final Optional<emd.a> g;

   protected static <S extends emd> P5<Mu<S>, kj, emd.c, Float, Integer, Optional<emd.a>> a(Instance<S> $$0) {
      return $$0.group(
         kj.v(16).optionalFieldOf("locate_offset", kj.g).forGetter(emd::f),
         emd.c.e.optionalFieldOf("frequency_reduction_method", emd.c.a).forGetter(emd::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(emd::h),
         ayo.k.fieldOf("salt").forGetter(emd::i),
         emd.a.a.optionalFieldOf("exclusion_zone").forGetter(emd::j)
      );
   }

   protected emd(kj $$0, emd.c $$1, float $$2, int $$3, Optional<emd.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kj f() {
      return this.c;
   }

   protected emd.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<emd.a> j() {
      return this.g;
   }

   public boolean b(dwq $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dwq $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dwq var1, int var2, int var3);

   public jf a(ddp $$0) {
      return new jf($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eme<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebn $$5 = new ebn(new eap(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebn $$5 = new ebn(new eap(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ebn $$5 = new ebn(new eap(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      ebn $$7 = new ebn(new eap(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jo<elm> b, int c) {
      public static final Codec<emd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ala.a(lw.aV, elm.a, false).fieldOf("other_set").forGetter(emd.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(emd.a::b))
               .apply($$0, emd.a::new)
      );

      boolean a(dwq $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jo<elm> a() {
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

   public static enum c implements bab {
      a("default", emd::a),
      b("legacy_type_1", emd::d),
      c("legacy_type_2", emd::c),
      d("legacy_type_3", emd::b);

      public static final Codec<emd.c> e = bab.a(emd.c::values);
      private final String f;
      private final emd.b g;

      private c(final String $$0, final emd.b $$1) {
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
