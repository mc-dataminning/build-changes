import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class ehd {
   public static final Codec<ehd> b = lc.R.q().dispatch(ehd::e, ehe::codec);
   private static final int a = 10387320;
   private final jq c;
   private final ehd.c d;
   private final float e;
   private final int f;
   private final Optional<ehd.a> g;

   protected static <S extends ehd> P5<Mu<S>, jq, ehd.c, Float, Integer, Optional<ehd.a>> a(Instance<S> $$0) {
      return $$0.group(
         jq.v(16).optionalFieldOf("locate_offset", jq.g).forGetter(ehd::f),
         ehd.c.e.optionalFieldOf("frequency_reduction_method", ehd.c.a).forGetter(ehd::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(ehd::h),
         axe.i.fieldOf("salt").forGetter(ehd::i),
         ehd.a.a.optionalFieldOf("exclusion_zone").forGetter(ehd::j)
      );
   }

   protected ehd(jq $$0, ehd.c $$1, float $$2, int $$3, Optional<ehd.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected jq f() {
      return this.c;
   }

   protected ehd.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<ehd.a> j() {
      return this.g;
   }

   public boolean b(drw $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(drw $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(drw var1, int var2, int var3);

   public im a(czb $$0) {
      return new im($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract ehe<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwp $$5 = new dwp(new dvr(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwp $$5 = new dwp(new dvr(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dwp $$5 = new dwp(new dvr(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dwp $$7 = new dwp(new dvr(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(iv<egm> b, int c) {
      public static final Codec<ehd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(akb.a(ld.aK, egm.a, false).fieldOf("other_set").forGetter(ehd.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(ehd.a::b))
               .apply($$0, ehd.a::new)
      );

      boolean a(drw $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public iv<egm> a() {
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

   public static enum c implements ayq {
      a("default", ehd::a),
      b("legacy_type_1", ehd::d),
      c("legacy_type_2", ehd::c),
      d("legacy_type_3", ehd::b);

      public static final Codec<ehd.c> e = ayq.a(ehd.c::values);
      private final String f;
      private final ehd.b g;

      private c(String $$0, ehd.b $$1) {
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
