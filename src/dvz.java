import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dvz {
   public static final Codec<dvz> b = jb.S.q().dispatch(dvz::e, dwa::codec);
   private static final int a = 10387320;
   private final hy c;
   private final dvz.c d;
   private final float e;
   private final int f;
   private final Optional<dvz.a> g;

   protected static <S extends dvz> P5<Mu<S>, hy, dvz.c, Float, Integer, Optional<dvz.a>> a(Instance<S> $$0) {
      return $$0.group(
         hy.v(16).optionalFieldOf("locate_offset", hy.g).forGetter(dvz::f),
         dvz.c.e.optionalFieldOf("frequency_reduction_method", dvz.c.a).forGetter(dvz::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dvz::h),
         arj.i.fieldOf("salt").forGetter(dvz::i),
         dvz.a.a.optionalFieldOf("exclusion_zone").forGetter(dvz::j)
      );
   }

   protected dvz(hy $$0, dvz.c $$1, float $$2, int $$3, Optional<dvz.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected hy f() {
      return this.c;
   }

   protected dvz.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dvz.a> j() {
      return this.g;
   }

   public boolean b(dhb $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dhb var1, int var2, int var3);

   public gw a(cpi $$0) {
      return new gw($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dwa<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dll $$5 = new dll(new dkn(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dll $$5 = new dll(new dkn(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dll $$5 = new dll(new dkn(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dll $$7 = new dll(new dkn(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(he<dvi> b, int c) {
      public static final Codec<dvz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aev.a(jc.aC, dvi.a, false).fieldOf("other_set").forGetter(dvz.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dvz.a::b))
               .apply($$0, dvz.a::new)
      );

      boolean a(dhb $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public he<dvi> a() {
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

   public static enum c implements asu {
      a("default", dvz::a),
      b("legacy_type_1", dvz::d),
      c("legacy_type_2", dvz::c),
      d("legacy_type_3", dvz::b);

      public static final Codec<dvz.c> e = asu.a(dvz.c::values);
      private final String f;
      private final dvz.b g;

      private c(String $$0, dvz.b $$1) {
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
