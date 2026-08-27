import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dyj {
   public static final Codec<dyj> b = kc.S.q().dispatch(dyj::e, dyk::codec);
   private static final int a = 10387320;
   private final ja c;
   private final dyj.c d;
   private final float e;
   private final int f;
   private final Optional<dyj.a> g;

   protected static <S extends dyj> P5<Mu<S>, ja, dyj.c, Float, Integer, Optional<dyj.a>> a(Instance<S> $$0) {
      return $$0.group(
         ja.v(16).optionalFieldOf("locate_offset", ja.g).forGetter(dyj::f),
         dyj.c.e.optionalFieldOf("frequency_reduction_method", dyj.c.a).forGetter(dyj::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dyj::h),
         asy.i.fieldOf("salt").forGetter(dyj::i),
         dyj.a.a.optionalFieldOf("exclusion_zone").forGetter(dyj::j)
      );
   }

   protected dyj(ja $$0, dyj.c $$1, float $$2, int $$3, Optional<dyj.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ja f() {
      return this.c;
   }

   protected dyj.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dyj.a> j() {
      return this.g;
   }

   public boolean b(djl $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(djl var1, int var2, int var3);

   public hx a(crm $$0) {
      return new hx($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dyk<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnv $$5 = new dnv(new dmx(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnv $$5 = new dnv(new dmx(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dnv $$5 = new dnv(new dmx(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dnv $$7 = new dnv(new dmx(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ig<dxs> b, int c) {
      public static final Codec<dyj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(agi.a(kd.aD, dxs.a, false).fieldOf("other_set").forGetter(dyj.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dyj.a::b))
               .apply($$0, dyj.a::new)
      );

      boolean a(djl $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ig<dxs> a() {
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

   public static enum c implements auk {
      a("default", dyj::a),
      b("legacy_type_1", dyj::d),
      c("legacy_type_2", dyj::c),
      d("legacy_type_3", dyj::b);

      public static final Codec<dyj.c> e = auk.a(dyj.c::values);
      private final String f;
      private final dyj.b g;

      private c(String $$0, dyj.b $$1) {
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
