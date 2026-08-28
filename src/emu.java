import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class emu {
   public static final Codec<emu> b = ly.P.q().dispatch(emu::e, emv::codec);
   private static final int a = 10387320;
   private final kl c;
   private final emu.c d;
   private final float e;
   private final int f;
   private final Optional<emu.a> g;

   protected static <S extends emu> P5<Mu<S>, kl, emu.c, Float, Integer, Optional<emu.a>> a(Instance<S> $$0) {
      return $$0.group(
         kl.v(16).optionalFieldOf("locate_offset", kl.g).forGetter(emu::f),
         emu.c.e.optionalFieldOf("frequency_reduction_method", emu.c.a).forGetter(emu::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(emu::h),
         ayt.l.fieldOf("salt").forGetter(emu::i),
         emu.a.a.optionalFieldOf("exclusion_zone").forGetter(emu::j)
      );
   }

   protected emu(kl $$0, emu.c $$1, float $$2, int $$3, Optional<emu.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected kl f() {
      return this.c;
   }

   protected emu.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<emu.a> j() {
      return this.g;
   }

   public boolean b(dxh $$0, int $$1, int $$2) {
      return this.a($$0, $$1, $$2) && this.a($$1, $$2, $$0.d()) && this.c($$0, $$1, $$2);
   }

   public boolean a(int $$0, int $$1, long $$2) {
      return !(this.e < 1.0F) || this.d.a($$2, this.f, $$0, $$1, this.e);
   }

   public boolean c(dxh $$0, int $$1, int $$2) {
      return !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
   }

   protected abstract boolean a(dxh var1, int var2, int var3);

   public jh a(deh $$0) {
      return new jh($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract emv<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ece $$5 = new ece(new ebg(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ece $$5 = new ece(new ebg(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      ece $$5 = new ece(new ebg(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      ece $$7 = new ece(new ebg(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(jq<emd> b, int c) {
      public static final Codec<emu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ale.a(lz.aU, emd.a, false).fieldOf("other_set").forGetter(emu.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(emu.a::b))
               .apply($$0, emu.a::new)
      );

      boolean a(dxh $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public jq<emd> a() {
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

   public static enum c implements bag {
      a("default", emu::a),
      b("legacy_type_1", emu::d),
      c("legacy_type_2", emu::c),
      d("legacy_type_3", emu::b);

      public static final Codec<emu.c> e = bag.a(emu.c::values);
      private final String f;
      private final emu.b g;

      private c(final String $$0, final emu.b $$1) {
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
