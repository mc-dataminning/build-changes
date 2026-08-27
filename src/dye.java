import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dye {
   public static final Codec<dye> b = jy.S.q().dispatch(dye::e, dyf::codec);
   private static final int a = 10387320;
   private final iw c;
   private final dye.c d;
   private final float e;
   private final int f;
   private final Optional<dye.a> g;

   protected static <S extends dye> P5<Mu<S>, iw, dye.c, Float, Integer, Optional<dye.a>> a(Instance<S> $$0) {
      return $$0.group(
         iw.v(16).optionalFieldOf("locate_offset", iw.g).forGetter(dye::f),
         dye.c.e.optionalFieldOf("frequency_reduction_method", dye.c.a).forGetter(dye::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dye::h),
         asu.i.fieldOf("salt").forGetter(dye::i),
         dye.a.a.optionalFieldOf("exclusion_zone").forGetter(dye::j)
      );
   }

   protected dye(iw $$0, dye.c $$1, float $$2, int $$3, Optional<dye.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected iw f() {
      return this.c;
   }

   protected dye.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dye.a> j() {
      return this.g;
   }

   public boolean b(djg $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(djg var1, int var2, int var3);

   public ht a(crh $$0) {
      return new ht($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dyf<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnq $$5 = new dnq(new dms(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnq $$5 = new dnq(new dms(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnq $$5 = new dnq(new dms(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dnq $$7 = new dnq(new dms(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ib<dxn> b, int c) {
      public static final Codec<dye.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(age.a(jz.aD, dxn.a, false).fieldOf("other_set").forGetter(dye.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dye.a::b))
               .apply($$0, dye.a::new)
      );

      boolean a(djg $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ib<dxn> a() {
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

   public static enum c implements aug {
      a("default", dye::a),
      b("legacy_type_1", dye::d),
      c("legacy_type_2", dye::c),
      d("legacy_type_3", dye::b);

      public static final Codec<dye.c> e = aug.a(dye.c::values);
      private final String f;
      private final dye.b g;

      private c(String $$0, dye.b $$1) {
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
