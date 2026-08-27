import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ekq {
   public static final Codec<ekq> b = lh.R.q().dispatch(ekq::e, ekr::codec);
   private static final int a = 10387320;
   private final jv c;
   private final ekq.c d;
   private final float e;
   private final int f;
   private final Optional<ekq.a> g;

   protected static <S extends ekq> P5<Mu<S>, jv, ekq.c, Float, Integer, Optional<ekq.a>> a(Instance<S> $$0) {
      return $$0.group(
         jv.v(16).optionalFieldOf("locate_offset", jv.g).forGetter(ekq::f),
         ekq.c.e.optionalFieldOf("frequency_reduction_method", ekq.c.a).forGetter(ekq::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ekq::h),
         axu.i.fieldOf("salt").forGetter(ekq::i),
         ekq.a.a.optionalFieldOf("exclusion_zone").forGetter(ekq::j)
      );
   }

   protected ekq(jv $$0, ekq.c $$1, float $$2, int $$3, Optional<ekq.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jv f() {
      return this.c;
   }

   protected ekq.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ekq.a> j() {
      return this.g;
   }

   public boolean b(dva $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dva $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dva var1, int var2, int var3);

   public ir a(dbh $$0) {
      return new ir($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ekr<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzt $$5 = new dzt(new dyv(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzt $$5 = new dzt(new dyv(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dzt $$5 = new dzt(new dyv(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dzt $$7 = new dzt(new dyv(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(ja<ejz> b, int c) {
      public static final Codec<ekq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akp.a(li.aL, ejz.a, false).fieldOf("other_set").forGetter(ekq.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ekq.a::b))
               .apply($$0, ekq.a::new)
      );

      boolean a(dva $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public ja<ejz> a() {
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

   public static enum c implements azg {
      a("default", ekq::a),
      b("legacy_type_1", ekq::d),
      c("legacy_type_2", ekq::c),
      d("legacy_type_3", ekq::b);

      public static final Codec<ekq.c> e = azg.a(ekq.c::values);
      private final String f;
      private final ekq.b g;

      private c(String $$0, ekq.b $$1) {
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
