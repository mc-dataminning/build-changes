import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ejt {
   public static final Codec<ejt> b = lq.P.r().dispatch(ejt::e, eju::codec);
   private static final int a = 10387320;
   private final ke c;
   private final ejt.c d;
   private final float e;
   private final int f;
   private final Optional<ejt.a> g;

   protected static <S extends ejt> P5<Mu<S>, ke, ejt.c, Float, Integer, Optional<ejt.a>> a(Instance<S> $$0) {
      return $$0.group(
         ke.v(16).optionalFieldOf("locate_offset", ke.g).forGetter(ejt::f),
         ejt.c.e.optionalFieldOf("frequency_reduction_method", ejt.c.a).forGetter(ejt::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ejt::h),
         axo.k.fieldOf("salt").forGetter(ejt::i),
         ejt.a.a.optionalFieldOf("exclusion_zone").forGetter(ejt::j)
      );
   }

   protected ejt(ke $$0, ejt.c $$1, float $$2, int $$3, Optional<ejt.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ke f() {
      return this.c;
   }

   protected ejt.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ejt.a> j() {
      return this.g;
   }

   public boolean b(dui $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dui $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dui var1, int var2, int var3);

   public ja a(dbm $$0) {
      return new ja($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract eju<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dze $$5 = new dze(new dyg(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dze $$5 = new dze(new dyg(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dze $$5 = new dze(new dyg(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dze $$7 = new dze(new dyg(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jj<ejc> b, int c) {
      public static final Codec<ejt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akg.a(lr.aS, ejc.a, false).fieldOf("other_set").forGetter(ejt.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ejt.a::b))
               .apply($$0, ejt.a::new)
      );

      boolean a(dui $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jj<ejc> a() {
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

   public static enum c implements azc {
      a("default", ejt::a),
      b("legacy_type_1", ejt::d),
      c("legacy_type_2", ejt::c),
      d("legacy_type_3", ejt::b);

      public static final Codec<ejt.c> e = azc.a(ejt.c::values);
      private final String f;
      private final ejt.b g;

      private c(final String $$0, final ejt.b $$1) {
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
