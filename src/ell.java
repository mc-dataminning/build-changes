import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ell {
   public static final Codec<ell> b = lu.P.q().dispatch(ell::e, elm::codec);
   private static final int a = 10387320;
   private final ki c;
   private final ell.c d;
   private final float e;
   private final int f;
   private final Optional<ell.a> g;

   protected static <S extends ell> P5<Mu<S>, ki, ell.c, Float, Integer, Optional<ell.a>> a(Instance<S> $$0) {
      return $$0.group(
         ki.v(16).optionalFieldOf("locate_offset", ki.g).forGetter(ell::f),
         ell.c.e.optionalFieldOf("frequency_reduction_method", ell.c.a).forGetter(ell::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ell::h),
         ayl.k.fieldOf("salt").forGetter(ell::i),
         ell.a.a.optionalFieldOf("exclusion_zone").forGetter(ell::j)
      );
   }

   protected ell(ki $$0, ell.c $$1, float $$2, int $$3, Optional<ell.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ki f() {
      return this.c;
   }

   protected ell.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ell.a> j() {
      return this.g;
   }

   public boolean b(dvy $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dvy $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dvy var1, int var2, int var3);

   public je a(dcy $$0) {
      return new je($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract elm<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eav $$5 = new eav(new dzx(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eav $$5 = new eav(new dzx(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      eav $$5 = new eav(new dzx(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      eav $$7 = new eav(new dzx(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jn<eku> b, int c) {
      public static final Codec<ell.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akx.a(lv.aT, eku.a, false).fieldOf("other_set").forGetter(ell.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ell.a::b))
               .apply($$0, ell.a::new)
      );

      boolean a(dvy $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jn<eku> a() {
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

   public static enum c implements azy {
      a("default", ell::a),
      b("legacy_type_1", ell::d),
      c("legacy_type_2", ell::c),
      d("legacy_type_3", ell::b);

      public static final Codec<ell.c> e = azy.a(ell.c::values);
      private final String f;
      private final ell.b g;

      private c(final String $$0, final ell.b $$1) {
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
