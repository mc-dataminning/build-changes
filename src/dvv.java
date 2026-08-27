import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dvv {
   public static final Codec<dvv> b = jb.S.q().dispatch(dvv::e, dvw::codec);
   private static final int a = 10387320;
   private final hz c;
   private final dvv.c d;
   private final float e;
   private final int f;
   private final Optional<dvv.a> g;

   protected static <S extends dvv> P5<Mu<S>, hz, dvv.c, Float, Integer, Optional<dvv.a>> a(Instance<S> $$0) {
      return $$0.group(
         hz.v(16).optionalFieldOf("locate_offset", hz.g).forGetter(dvv::f),
         dvv.c.e.optionalFieldOf("frequency_reduction_method", dvv.c.a).forGetter(dvv::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dvv::h),
         aqy.i.fieldOf("salt").forGetter(dvv::i),
         dvv.a.a.optionalFieldOf("exclusion_zone").forGetter(dvv::j)
      );
   }

   protected dvv(hz $$0, dvv.c $$1, float $$2, int $$3, Optional<dvv.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected hz f() {
      return this.c;
   }

   protected dvv.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dvv.a> j() {
      return this.g;
   }

   public boolean b(dgx $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dgx var1, int var2, int var3);

   public gu a(cos $$0) {
      return new gu($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dvw<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlh $$5 = new dlh(new dkj(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlh $$5 = new dlh(new dkj(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlh $$5 = new dlh(new dkj(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dlh $$7 = new dlh(new dkj(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(he<dve> b, int c) {
      public static final Codec<dvv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aen.a(jc.aB, dve.a, false).fieldOf("other_set").forGetter(dvv.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dvv.a::b))
               .apply($$0, dvv.a::new)
      );

      boolean a(dgx $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public he<dve> a() {
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
      a("default", dvv::a),
      b("legacy_type_1", dvv::d),
      c("legacy_type_2", dvv::c),
      d("legacy_type_3", dvv::b);

      public static final Codec<dvv.c> e = ash.a(dvv.c::values);
      private final String f;
      private final dvv.b g;

      private c(String $$0, dvv.b $$1) {
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
