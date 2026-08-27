import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class edd {
   public static final Codec<edd> b = kh.R.q().dispatch(edd::e, ede::codec);
   private static final int a = 10387320;
   private final jf c;
   private final edd.c d;
   private final float e;
   private final int f;
   private final Optional<edd.a> g;

   protected static <S extends edd> P5<Mu<S>, jf, edd.c, Float, Integer, Optional<edd.a>> a(Instance<S> $$0) {
      return $$0.group(
         jf.v(16).optionalFieldOf("locate_offset", jf.g).forGetter(edd::f),
         edd.c.e.optionalFieldOf("frequency_reduction_method", edd.c.a).forGetter(edd::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(edd::h),
         avu.i.fieldOf("salt").forGetter(edd::i),
         edd.a.a.optionalFieldOf("exclusion_zone").forGetter(edd::j)
      );
   }

   protected edd(jf $$0, edd.c $$1, float $$2, int $$3, Optional<edd.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jf f() {
      return this.c;
   }

   protected edd.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<edd.a> j() {
      return this.g;
   }

   public boolean b(doc $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(doc $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(doc var1, int var2, int var3);

   public ib a(cvl $$0) {
      return new ib($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ede<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dsp $$5 = new dsp(new drr(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dsp $$5 = new dsp(new drr(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dsp $$5 = new dsp(new drr(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dsp $$7 = new dsp(new drr(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(il<ecm> b, int c) {
      public static final Codec<edd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aiy.a(ki.aG, ecm.a, false).fieldOf("other_set").forGetter(edd.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(edd.a::b))
               .apply($$0, edd.a::new)
      );

      boolean a(doc $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public il<ecm> a() {
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

   public static enum c implements axg {
      a("default", edd::a),
      b("legacy_type_1", edd::d),
      c("legacy_type_2", edd::c),
      d("legacy_type_3", edd::b);

      public static final Codec<edd.c> e = axg.a(edd.c::values);
      private final String f;
      private final edd.b g;

      private c(String $$0, edd.b $$1) {
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
