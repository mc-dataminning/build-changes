import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eii {
   public static final Codec<eii> b = le.R.q().dispatch(eii::e, eij::codec);
   private static final int a = 10387320;
   private final js c;
   private final eii.c d;
   private final float e;
   private final int f;
   private final Optional<eii.a> g;

   protected static <S extends eii> P5<Mu<S>, js, eii.c, Float, Integer, Optional<eii.a>> a(Instance<S> $$0) {
      return $$0.group(
         js.v(16).optionalFieldOf("locate_offset", js.g).forGetter(eii::f),
         eii.c.e.optionalFieldOf("frequency_reduction_method", eii.c.a).forGetter(eii::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eii::h),
         axn.i.fieldOf("salt").forGetter(eii::i),
         eii.a.a.optionalFieldOf("exclusion_zone").forGetter(eii::j)
      );
   }

   protected eii(js $$0, eii.c $$1, float $$2, int $$3, Optional<eii.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected js f() {
      return this.c;
   }

   protected eii.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eii.a> j() {
      return this.g;
   }

   public boolean b(dtb $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dtb $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dtb var1, int var2, int var3);

   public io a(dag $$0) {
      return new io($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eij<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxu $$5 = new dxu(new dww(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxu $$5 = new dxu(new dww(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dxu $$5 = new dxu(new dww(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dxu $$7 = new dxu(new dww(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ix<ehr> b, int c) {
      public static final Codec<eii.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akj.a(lf.aL, ehr.a, false).fieldOf("other_set").forGetter(eii.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eii.a::b))
               .apply($$0, eii.a::new)
      );

      boolean a(dtb $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ix<ehr> a() {
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

   public static enum c implements ayz {
      a("default", eii::a),
      b("legacy_type_1", eii::d),
      c("legacy_type_2", eii::c),
      d("legacy_type_3", eii::b);

      public static final Codec<eii.c> e = ayz.a(eii.c::values);
      private final String f;
      private final eii.b g;

      private c(String $$0, eii.b $$1) {
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
