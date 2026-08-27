import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dzl {
   public static final Codec<dzl> b = kb.R.q().dispatch(dzl::e, dzm::codec);
   private static final int a = 10387320;
   private final iz c;
   private final dzl.c d;
   private final float e;
   private final int f;
   private final Optional<dzl.a> g;

   protected static <S extends dzl> P5<Mu<S>, iz, dzl.c, Float, Integer, Optional<dzl.a>> a(Instance<S> $$0) {
      return $$0.group(
         iz.v(16).optionalFieldOf("locate_offset", iz.g).forGetter(dzl::f),
         dzl.c.e.optionalFieldOf("frequency_reduction_method", dzl.c.a).forGetter(dzl::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dzl::h),
         atg.i.fieldOf("salt").forGetter(dzl::i),
         dzl.a.a.optionalFieldOf("exclusion_zone").forGetter(dzl::j)
      );
   }

   protected dzl(iz $$0, dzl.c $$1, float $$2, int $$3, Optional<dzl.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected iz f() {
      return this.c;
   }

   protected dzl.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dzl.a> j() {
      return this.g;
   }

   public boolean b(dkn $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dkn var1, int var2, int var3);

   public hv a(csf $$0) {
      return new hv($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dzm<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dox $$5 = new dox(new dnz(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dox $$5 = new dox(new dnz(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dox $$5 = new dox(new dnz(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dox $$7 = new dox(new dnz(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ie<dyu> b, int c) {
      public static final Codec<dzl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(agp.a(kc.aE, dyu.a, false).fieldOf("other_set").forGetter(dzl.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dzl.a::b))
               .apply($$0, dzl.a::new)
      );

      boolean a(dkn $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ie<dyu> a() {
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

   public static enum c implements aut {
      a("default", dzl::a),
      b("legacy_type_1", dzl::d),
      c("legacy_type_2", dzl::c),
      d("legacy_type_3", dzl::b);

      public static final Codec<dzl.c> e = aut.a(dzl.c::values);
      private final String f;
      private final dzl.b g;

      private c(String $$0, dzl.b $$1) {
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
