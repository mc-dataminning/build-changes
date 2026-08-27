import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dvw {
   public static final Codec<dvw> b = jb.S.q().dispatch(dvw::e, dvx::codec);
   private static final int a = 10387320;
   private final hz c;
   private final dvw.c d;
   private final float e;
   private final int f;
   private final Optional<dvw.a> g;

   protected static <S extends dvw> P5<Mu<S>, hz, dvw.c, Float, Integer, Optional<dvw.a>> a(Instance<S> $$0) {
      return $$0.group(
         hz.v(16).optionalFieldOf("locate_offset", hz.g).forGetter(dvw::f),
         dvw.c.e.optionalFieldOf("frequency_reduction_method", dvw.c.a).forGetter(dvw::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dvw::h),
         aqy.i.fieldOf("salt").forGetter(dvw::i),
         dvw.a.a.optionalFieldOf("exclusion_zone").forGetter(dvw::j)
      );
   }

   protected dvw(hz $$0, dvw.c $$1, float $$2, int $$3, Optional<dvw.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected hz f() {
      return this.c;
   }

   protected dvw.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dvw.a> j() {
      return this.g;
   }

   public boolean b(dgy $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dgy var1, int var2, int var3);

   public gu a(cot $$0) {
      return new gu($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dvx<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dli $$5 = new dli(new dkk(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dli $$5 = new dli(new dkk(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dli $$5 = new dli(new dkk(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dli $$7 = new dli(new dkk(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(he<dvf> b, int c) {
      public static final Codec<dvw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aen.a(jc.aB, dvf.a, false).fieldOf("other_set").forGetter(dvw.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dvw.a::b))
               .apply($$0, dvw.a::new)
      );

      boolean a(dgy $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public he<dvf> a() {
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

   public static enum c implements ash {
      a("default", dvw::a),
      b("legacy_type_1", dvw::d),
      c("legacy_type_2", dvw::c),
      d("legacy_type_3", dvw::b);

      public static final Codec<dvw.c> e = ash.a(dvw.c::values);
      private final String f;
      private final dvw.b g;

      private c(String $$0, dvw.b $$1) {
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
