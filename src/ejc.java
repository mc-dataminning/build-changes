import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ejc {
   public static final Codec<ejc> b = lp.R.q().dispatch(ejc::e, ejd::codec);
   private static final int a = 10387320;
   private final kd c;
   private final ejc.c d;
   private final float e;
   private final int f;
   private final Optional<ejc.a> g;

   protected static <S extends ejc> P5<Mu<S>, kd, ejc.c, Float, Integer, Optional<ejc.a>> a(Instance<S> $$0) {
      return $$0.group(
         kd.v(16).optionalFieldOf("locate_offset", kd.g).forGetter(ejc::f),
         ejc.c.e.optionalFieldOf("frequency_reduction_method", ejc.c.a).forGetter(ejc::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ejc::h),
         ayc.k.fieldOf("salt").forGetter(ejc::i),
         ejc.a.a.optionalFieldOf("exclusion_zone").forGetter(ejc::j)
      );
   }

   protected ejc(kd $$0, ejc.c $$1, float $$2, int $$3, Optional<ejc.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kd f() {
      return this.c;
   }

   protected ejc.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ejc.a> j() {
      return this.g;
   }

   public boolean b(dtv $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dtv $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dtv var1, int var2, int var3);

   public iz a(dba $$0) {
      return new iz($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ejd<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyo $$5 = new dyo(new dxq(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyo $$5 = new dyo(new dxq(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyo $$5 = new dyo(new dxq(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dyo $$7 = new dyo(new dxq(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ji<eil> b, int c) {
      public static final Codec<ejc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akx.a(lq.aL, eil.a, false).fieldOf("other_set").forGetter(ejc.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ejc.a::b))
               .apply($$0, ejc.a::new)
      );

      boolean a(dtv $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ji<eil> a() {
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

   public static enum c implements azp {
      a("default", ejc::a),
      b("legacy_type_1", ejc::d),
      c("legacy_type_2", ejc::c),
      d("legacy_type_3", ejc::b);

      public static final Codec<ejc.c> e = azp.a(ejc.c::values);
      private final String f;
      private final ejc.b g;

      private c(final String $$0, final ejc.b $$1) {
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
