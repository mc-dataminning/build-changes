import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class eal {
   public static final Codec<eal> b = kd.R.q().dispatch(eal::e, eam::codec);
   private static final int a = 10387320;
   private final jb c;
   private final eal.c d;
   private final float e;
   private final int f;
   private final Optional<eal.a> g;

   protected static <S extends eal> P5<Mu<S>, jb, eal.c, Float, Integer, Optional<eal.a>> a(Instance<S> $$0) {
      return $$0.group(
         jb.v(16).optionalFieldOf("locate_offset", jb.g).forGetter(eal::f),
         eal.c.e.optionalFieldOf("frequency_reduction_method", eal.c.a).forGetter(eal::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(eal::h),
         atx.i.fieldOf("salt").forGetter(eal::i),
         eal.a.a.optionalFieldOf("exclusion_zone").forGetter(eal::j)
      );
   }

   protected eal(jb $$0, eal.c $$1, float $$2, int $$3, Optional<eal.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jb f() {
      return this.c;
   }

   protected eal.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<eal.a> j() {
      return this.g;
   }

   public boolean b(dln $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dln var1, int var2, int var3);

   public hx a(cte $$0) {
      return new hx($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eam<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpx $$5 = new dpx(new doz(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpx $$5 = new dpx(new doz(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dpx $$5 = new dpx(new doz(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dpx $$7 = new dpx(new doz(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ih<dzu> b, int c) {
      public static final Codec<eal.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ahd.a(ke.aF, dzu.a, false).fieldOf("other_set").forGetter(eal.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(eal.a::b))
               .apply($$0, eal.a::new)
      );

      boolean a(dln $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ih<dzu> a() {
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

   public static enum c implements avl {
      a("default", eal::a),
      b("legacy_type_1", eal::d),
      c("legacy_type_2", eal::c),
      d("legacy_type_3", eal::b);

      public static final Codec<eal.c> e = avl.a(eal.c::values);
      private final String f;
      private final eal.b g;

      private c(String $$0, eal.b $$1) {
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
