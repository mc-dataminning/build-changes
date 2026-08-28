import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ejn {
   public static final Codec<ejn> b = lq.P.r().dispatch(ejn::e, ejo::codec);
   private static final int a = 10387320;
   private final ke c;
   private final ejn.c d;
   private final float e;
   private final int f;
   private final Optional<ejn.a> g;

   protected static <S extends ejn> P5<Mu<S>, ke, ejn.c, Float, Integer, Optional<ejn.a>> a(Instance<S> $$0) {
      return $$0.group(
         ke.v(16).optionalFieldOf("locate_offset", ke.g).forGetter(ejn::f),
         ejn.c.e.optionalFieldOf("frequency_reduction_method", ejn.c.a).forGetter(ejn::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ejn::h),
         axm.k.fieldOf("salt").forGetter(ejn::i),
         ejn.a.a.optionalFieldOf("exclusion_zone").forGetter(ejn::j)
      );
   }

   protected ejn(ke $$0, ejn.c $$1, float $$2, int $$3, Optional<ejn.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ke f() {
      return this.c;
   }

   protected ejn.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ejn.a> j() {
      return this.g;
   }

   public boolean b(duf $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(duf $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(duf var1, int var2, int var3);

   public ja a(dbk $$0) {
      return new ja($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ejo<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyy $$5 = new dyy(new dya(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyy $$5 = new dyy(new dya(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dyy $$5 = new dyy(new dya(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dyy $$7 = new dyy(new dya(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jj<eiw> b, int c) {
      public static final Codec<ejn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akg.a(lr.aS, eiw.a, false).fieldOf("other_set").forGetter(ejn.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ejn.a::b))
               .apply($$0, ejn.a::new)
      );

      boolean a(duf $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jj<eiw> a() {
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

   public static enum c implements ayz {
      a("default", ejn::a),
      b("legacy_type_1", ejn::d),
      c("legacy_type_2", ejn::c),
      d("legacy_type_3", ejn::b);

      public static final Codec<ejn.c> e = ayz.a(ejn.c::values);
      private final String f;
      private final ejn.b g;

      private c(final String $$0, final ejn.b $$1) {
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
