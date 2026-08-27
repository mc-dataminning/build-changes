import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class edz {
   public static final Codec<edz> b = ki.R.q().dispatch(edz::e, eea::codec);
   private static final int a = 10387320;
   private final jg c;
   private final edz.c d;
   private final float e;
   private final int f;
   private final Optional<edz.a> g;

   protected static <S extends edz> P5<Mu<S>, jg, edz.c, Float, Integer, Optional<edz.a>> a(Instance<S> $$0) {
      return $$0.group(
         jg.v(16).optionalFieldOf("locate_offset", jg.g).forGetter(edz::f),
         edz.c.e.optionalFieldOf("frequency_reduction_method", edz.c.a).forGetter(edz::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(edz::h),
         awe.j.fieldOf("salt").forGetter(edz::i),
         edz.a.a.optionalFieldOf("exclusion_zone").forGetter(edz::j)
      );
   }

   protected edz(jg $$0, edz.c $$1, float $$2, int $$3, Optional<edz.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jg f() {
      return this.c;
   }

   protected edz.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<edz.a> j() {
      return this.g;
   }

   public boolean b(dox $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dox $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dox var1, int var2, int var3);

   public ib a(cwg $$0) {
      return new ib($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eea<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dtl $$5 = new dtl(new dsn(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dtl $$5 = new dtl(new dsn(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dtl $$5 = new dtl(new dsn(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dtl $$7 = new dtl(new dsn(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(il<edi> b, int c) {
      public static final Codec<edz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ajd.a(kj.aG, edi.a, false).fieldOf("other_set").forGetter(edz.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(edz.a::b))
               .apply($$0, edz.a::new)
      );

      boolean a(dox $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public il<edi> a() {
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

   public static enum c implements axq {
      a("default", edz::a),
      b("legacy_type_1", edz::d),
      c("legacy_type_2", edz::c),
      d("legacy_type_3", edz::b);

      public static final Codec<edz.c> e = axq.a(edz.c::values);
      private final String f;
      private final edz.b g;

      private c(String $$0, edz.b $$1) {
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
