import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dwh {
   public static final Codec<dwh> b = jd.S.q().dispatch(dwh::e, dwi::codec);
   private static final int a = 10387320;
   private final ib c;
   private final dwh.c d;
   private final float e;
   private final int f;
   private final Optional<dwh.a> g;

   protected static <S extends dwh> P5<Mu<S>, ib, dwh.c, Float, Integer, Optional<dwh.a>> a(Instance<S> $$0) {
      return $$0.group(
         ib.v(16).optionalFieldOf("locate_offset", ib.g).forGetter(dwh::f),
         dwh.c.e.optionalFieldOf("frequency_reduction_method", dwh.c.a).forGetter(dwh::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dwh::h),
         arh.i.fieldOf("salt").forGetter(dwh::i),
         dwh.a.a.optionalFieldOf("exclusion_zone").forGetter(dwh::j)
      );
   }

   protected dwh(ib $$0, dwh.c $$1, float $$2, int $$3, Optional<dwh.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ib f() {
      return this.c;
   }

   protected dwh.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dwh.a> j() {
      return this.g;
   }

   public boolean b(dhj $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dhj var1, int var2, int var3);

   public gw a(cpe $$0) {
      return new gw($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dwi<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlt $$5 = new dlt(new dkv(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlt $$5 = new dlt(new dkv(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlt $$5 = new dlt(new dkv(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dlt $$7 = new dlt(new dkv(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(hg<dvq> b, int c) {
      public static final Codec<dwh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aeu.a(je.aB, dvq.a, false).fieldOf("other_set").forGetter(dwh.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dwh.a::b))
               .apply($$0, dwh.a::new)
      );

      boolean a(dhj $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public hg<dvq> a() {
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

   public static enum c implements asr {
      a("default", dwh::a),
      b("legacy_type_1", dwh::d),
      c("legacy_type_2", dwh::c),
      d("legacy_type_3", dwh::b);

      public static final Codec<dwh.c> e = asr.a(dwh.c::values);
      private final String f;
      private final dwh.b g;

      private c(String $$0, dwh.b $$1) {
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
