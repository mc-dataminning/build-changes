import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ehm {
   public static final Codec<ehm> b = ld.R.q().dispatch(ehm::e, ehn::codec);
   private static final int a = 10387320;
   private final jr c;
   private final ehm.c d;
   private final float e;
   private final int f;
   private final Optional<ehm.a> g;

   protected static <S extends ehm> P5<Mu<S>, jr, ehm.c, Float, Integer, Optional<ehm.a>> a(Instance<S> $$0) {
      return $$0.group(
         jr.v(16).optionalFieldOf("locate_offset", jr.g).forGetter(ehm::f),
         ehm.c.e.optionalFieldOf("frequency_reduction_method", ehm.c.a).forGetter(ehm::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ehm::h),
         axh.i.fieldOf("salt").forGetter(ehm::i),
         ehm.a.a.optionalFieldOf("exclusion_zone").forGetter(ehm::j)
      );
   }

   protected ehm(jr $$0, ehm.c $$1, float $$2, int $$3, Optional<ehm.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jr f() {
      return this.c;
   }

   protected ehm.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ehm.a> j() {
      return this.g;
   }

   public boolean b(dsf $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dsf $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dsf var1, int var2, int var3);

   public in a(czk $$0) {
      return new in($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ehn<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwy $$5 = new dwy(new dwa(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwy $$5 = new dwy(new dwa(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwy $$5 = new dwy(new dwa(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dwy $$7 = new dwy(new dwa(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(iw<egv> b, int c) {
      public static final Codec<ehm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akd.a(le.aL, egv.a, false).fieldOf("other_set").forGetter(ehm.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ehm.a::b))
               .apply($$0, ehm.a::new)
      );

      boolean a(dsf $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public iw<egv> a() {
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

   public static enum c implements ayt {
      a("default", ehm::a),
      b("legacy_type_1", ehm::d),
      c("legacy_type_2", ehm::c),
      d("legacy_type_3", ehm::b);

      public static final Codec<ehm.c> e = ayt.a(ehm.c::values);
      private final String f;
      private final ehm.b g;

      private c(String $$0, ehm.b $$1) {
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
