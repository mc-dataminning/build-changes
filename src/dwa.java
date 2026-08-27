import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dwa {
   public static final Codec<dwa> b = jd.S.q().dispatch(dwa::e, dwb::codec);
   private static final int a = 10387320;
   private final ib c;
   private final dwa.c d;
   private final float e;
   private final int f;
   private final Optional<dwa.a> g;

   protected static <S extends dwa> P5<Mu<S>, ib, dwa.c, Float, Integer, Optional<dwa.a>> a(Instance<S> $$0) {
      return $$0.group(
         ib.v(16).optionalFieldOf("locate_offset", ib.g).forGetter(dwa::f),
         dwa.c.e.optionalFieldOf("frequency_reduction_method", dwa.c.a).forGetter(dwa::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dwa::h),
         arb.i.fieldOf("salt").forGetter(dwa::i),
         dwa.a.a.optionalFieldOf("exclusion_zone").forGetter(dwa::j)
      );
   }

   protected dwa(ib $$0, dwa.c $$1, float $$2, int $$3, Optional<dwa.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ib f() {
      return this.c;
   }

   protected dwa.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dwa.a> j() {
      return this.g;
   }

   public boolean b(dhc $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dhc var1, int var2, int var3);

   public gw a(cox $$0) {
      return new gw($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dwb<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlm $$5 = new dlm(new dko(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlm $$5 = new dlm(new dko(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlm $$5 = new dlm(new dko(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dlm $$7 = new dlm(new dko(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(hg<dvj> b, int c) {
      public static final Codec<dwa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aeq.a(je.aB, dvj.a, false).fieldOf("other_set").forGetter(dwa.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dwa.a::b))
               .apply($$0, dwa.a::new)
      );

      boolean a(dhc $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public hg<dvj> a() {
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

   public static enum c implements ask {
      a("default", dwa::a),
      b("legacy_type_1", dwa::d),
      c("legacy_type_2", dwa::c),
      d("legacy_type_3", dwa::b);

      public static final Codec<dwa.c> e = ask.a(dwa.c::values);
      private final String f;
      private final dwa.b g;

      private c(String $$0, dwa.b $$1) {
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
