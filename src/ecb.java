import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ecb {
   public static final Codec<ecb> b = kf.R.q().dispatch(ecb::e, ecc::codec);
   private static final int a = 10387320;
   private final jd c;
   private final ecb.c d;
   private final float e;
   private final int f;
   private final Optional<ecb.a> g;

   protected static <S extends ecb> P5<Mu<S>, jd, ecb.c, Float, Integer, Optional<ecb.a>> a(Instance<S> $$0) {
      return $$0.group(
         jd.v(16).optionalFieldOf("locate_offset", jd.g).forGetter(ecb::f),
         ecb.c.e.optionalFieldOf("frequency_reduction_method", ecb.c.a).forGetter(ecb::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ecb::h),
         avp.i.fieldOf("salt").forGetter(ecb::i),
         ecb.a.a.optionalFieldOf("exclusion_zone").forGetter(ecb::j)
      );
   }

   protected ecb(jd $$0, ecb.c $$1, float $$2, int $$3, Optional<ecb.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jd f() {
      return this.c;
   }

   protected ecb.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ecb.a> j() {
      return this.g;
   }

   public boolean b(dnd $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dnd var1, int var2, int var3);

   public hz a(cuu $$0) {
      return new hz($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ecc<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      drn $$5 = new drn(new dqp(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      drn $$5 = new drn(new dqp(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      drn $$5 = new drn(new dqp(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      drn $$7 = new drn(new dqp(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ij<ebk> b, int c) {
      public static final Codec<ecb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aiu.a(kg.aF, ebk.a, false).fieldOf("other_set").forGetter(ecb.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ecb.a::b))
               .apply($$0, ecb.a::new)
      );

      boolean a(dnd $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ij<ebk> a() {
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

   public static enum c implements axc {
      a("default", ecb::a),
      b("legacy_type_1", ecb::d),
      c("legacy_type_2", ecb::c),
      d("legacy_type_3", ecb::b);

      public static final Codec<ecb.c> e = axc.a(ecb.c::values);
      private final String f;
      private final ecb.b g;

      private c(String $$0, ecb.b $$1) {
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
