import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eig {
   public static final Codec<eig> b = le.R.q().dispatch(eig::e, eih::codec);
   private static final int a = 10387320;
   private final js c;
   private final eig.c d;
   private final float e;
   private final int f;
   private final Optional<eig.a> g;

   protected static <S extends eig> P5<Mu<S>, js, eig.c, Float, Integer, Optional<eig.a>> a(Instance<S> $$0) {
      return $$0.group(
         js.v(16).optionalFieldOf("locate_offset", js.g).forGetter(eig::f),
         eig.c.e.optionalFieldOf("frequency_reduction_method", eig.c.a).forGetter(eig::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eig::h),
         axm.i.fieldOf("salt").forGetter(eig::i),
         eig.a.a.optionalFieldOf("exclusion_zone").forGetter(eig::j)
      );
   }

   protected eig(js $$0, eig.c $$1, float $$2, int $$3, Optional<eig.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected js f() {
      return this.c;
   }

   protected eig.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eig.a> j() {
      return this.g;
   }

   public boolean b(dsz $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dsz $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dsz var1, int var2, int var3);

   public io a(dae $$0) {
      return new io($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eih<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxs $$5 = new dxs(new dwu(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxs $$5 = new dxs(new dwu(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxs $$5 = new dxs(new dwu(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dxs $$7 = new dxs(new dwu(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ix<ehp> b, int c) {
      public static final Codec<eig.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aki.a(lf.aL, ehp.a, false).fieldOf("other_set").forGetter(eig.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eig.a::b))
               .apply($$0, eig.a::new)
      );

      boolean a(dsz $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ix<ehp> a() {
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

   public static enum c implements ayx {
      a("default", eig::a),
      b("legacy_type_1", eig::d),
      c("legacy_type_2", eig::c),
      d("legacy_type_3", eig::b);

      public static final Codec<eig.c> e = ayx.a(eig.c::values);
      private final String f;
      private final eig.b g;

      private c(String $$0, eig.b $$1) {
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
