import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dxs {
   public static final Codec<dxs> b = jy.S.q().dispatch(dxs::e, dxt::codec);
   private static final int a = 10387320;
   private final iw c;
   private final dxs.c d;
   private final float e;
   private final int f;
   private final Optional<dxs.a> g;

   protected static <S extends dxs> P5<Mu<S>, iw, dxs.c, Float, Integer, Optional<dxs.a>> a(Instance<S> $$0) {
      return $$0.group(
         iw.v(16).optionalFieldOf("locate_offset", iw.g).forGetter(dxs::f),
         dxs.c.e.optionalFieldOf("frequency_reduction_method", dxs.c.a).forGetter(dxs::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dxs::h),
         asq.i.fieldOf("salt").forGetter(dxs::i),
         dxs.a.a.optionalFieldOf("exclusion_zone").forGetter(dxs::j)
      );
   }

   protected dxs(iw $$0, dxs.c $$1, float $$2, int $$3, Optional<dxs.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected iw f() {
      return this.c;
   }

   protected dxs.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dxs.a> j() {
      return this.g;
   }

   public boolean b(diu $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(diu var1, int var2, int var3);

   public ht a(cqz $$0) {
      return new ht($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dxt<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dne $$5 = new dne(new dmg(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dne $$5 = new dne(new dmg(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dne $$5 = new dne(new dmg(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dne $$7 = new dne(new dmg(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ib<dxb> b, int c) {
      public static final Codec<dxs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(agc.a(jz.aD, dxb.a, false).fieldOf("other_set").forGetter(dxs.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dxs.a::b))
               .apply($$0, dxs.a::new)
      );

      boolean a(diu $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ib<dxb> a() {
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

   public static enum c implements aub {
      a("default", dxs::a),
      b("legacy_type_1", dxs::d),
      c("legacy_type_2", dxs::c),
      d("legacy_type_3", dxs::b);

      public static final Codec<dxs.c> e = aub.a(dxs.c::values);
      private final String f;
      private final dxs.b g;

      private c(String $$0, dxs.b $$1) {
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
