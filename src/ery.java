import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ery {
   public static final Codec<ery> b = mf.P.q().dispatch(ery::e, erz::codec);
   private static final int a = 10387320;
   private final jz c;
   private final ery.c d;
   private final float e;
   private final int f;
   private final Optional<ery.a> g;

   protected static <S extends ery> P5<Mu<S>, jz, ery.c, Float, Integer, Optional<ery.a>> a(Instance<S> $$0) {
      return $$0.group(
         jz.v(16).optionalFieldOf("locate_offset", jz.i).forGetter(ery::f),
         ery.c.e.optionalFieldOf("frequency_reduction_method", ery.c.a).forGetter(ery::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ery::h),
         ayu.l.fieldOf("salt").forGetter(ery::i),
         ery.a.a.optionalFieldOf("exclusion_zone").forGetter(ery::j)
      );
   }

   protected ery(jz $$0, ery.c $$1, float $$2, int $$3, Optional<ery.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jz f() {
      return this.c;
   }

   protected ery.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ery.a> j() {
      return this.g;
   }

   public boolean b(ecg $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(ecg $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(ecg var1, int var2, int var3);

   public iu a(dih $$0) {
      return new iu($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract erz<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehf $$5 = new ehf(new egh(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehf $$5 = new ehf(new egh(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ehf $$5 = new ehf(new egh(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      ehf $$7 = new ehf(new egh(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(je<erh> b, int c) {
      public static final Codec<ery.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alc.a(mg.bd, erh.a, false).fieldOf("other_set").forGetter(ery.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ery.a::b))
               .apply($$0, ery.a::new)
      );

      boolean a(ecg $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public je<erh> a() {
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

   public static enum c implements bak {
      a("default", ery::a),
      b("legacy_type_1", ery::d),
      c("legacy_type_2", ery::c),
      d("legacy_type_3", ery::b);

      public static final Codec<ery.c> e = bak.a(ery.c::values);
      private final String f;
      private final ery.b g;

      private c(final String $$0, final ery.b $$1) {
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
