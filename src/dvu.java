import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dvu {
   public static final Codec<dvu> b = jc.S.q().dispatch(dvu::e, dvv::codec);
   private static final int a = 10387320;
   private final ia c;
   private final dvu.c d;
   private final float e;
   private final int f;
   private final Optional<dvu.a> g;

   protected static <S extends dvu> P5<Mu<S>, ia, dvu.c, Float, Integer, Optional<dvu.a>> a(Instance<S> $$0) {
      return $$0.group(
         ia.v(16).optionalFieldOf("locate_offset", ia.g).forGetter(dvu::f),
         dvu.c.e.optionalFieldOf("frequency_reduction_method", dvu.c.a).forGetter(dvu::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dvu::h),
         aqw.i.fieldOf("salt").forGetter(dvu::i),
         dvu.a.a.optionalFieldOf("exclusion_zone").forGetter(dvu::j)
      );
   }

   protected dvu(ia $$0, dvu.c $$1, float $$2, int $$3, Optional<dvu.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected ia f() {
      return this.c;
   }

   protected dvu.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dvu.a> j() {
      return this.g;
   }

   public boolean b(dgw $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(dgw var1, int var2, int var3);

   public gv a(cor $$0) {
      return new gv($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dvv<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlg $$5 = new dlg(new dki(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlg $$5 = new dlg(new dki(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dlg $$5 = new dlg(new dki(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dlg $$7 = new dlg(new dki(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(hf<dvd> b, int c) {
      public static final Codec<dvu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ael.a(jd.aB, dvd.a, false).fieldOf("other_set").forGetter(dvu.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dvu.a::b))
               .apply($$0, dvu.a::new)
      );

      boolean a(dgw $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public hf<dvd> a() {
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

   public static enum c implements asf {
      a("default", dvu::a),
      b("legacy_type_1", dvu::d),
      c("legacy_type_2", dvu::c),
      d("legacy_type_3", dvu::b);

      public static final Codec<dvu.c> e = asf.a(dvu.c::values);
      private final String f;
      private final dvu.b g;

      private c(String $$0, dvu.b $$1) {
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
