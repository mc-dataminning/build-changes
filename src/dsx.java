import com.mojang.datafixers.Products.P5;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;

public abstract class dsx {
   public static final Codec<dsx> b = jb.S.q().dispatch(dsx::e, dsy::codec);
   private static final int a = 10387320;
   private final hz c;
   private final dsx.c d;
   private final float e;
   private final int f;
   private final Optional<dsx.a> g;

   protected static <S extends dsx> P5<Mu<S>, hz, dsx.c, Float, Integer, Optional<dsx.a>> a(Instance<S> $$0) {
      return $$0.group(
         hz.v(16).optionalFieldOf("locate_offset", hz.g).forGetter(dsx::f),
         dsx.c.e.optionalFieldOf("frequency_reduction_method", dsx.c.a).forGetter(dsx::g),
         Codec.floatRange(0.0F, 1.0F).optionalFieldOf("frequency", 1.0F).forGetter(dsx::h),
         aoi.i.fieldOf("salt").forGetter(dsx::i),
         dsx.a.a.optionalFieldOf("exclusion_zone").forGetter(dsx::j)
      );
   }

   protected dsx(hz $$0, dsx.c $$1, float $$2, int $$3, Optional<dsx.a> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   protected hz f() {
      return this.c;
   }

   protected dsx.c g() {
      return this.d;
   }

   protected float h() {
      return this.e;
   }

   protected int i() {
      return this.f;
   }

   protected Optional<dsx.a> j() {
      return this.g;
   }

   public boolean b(ddz $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         return this.e < 1.0F && !this.d.a($$0.d(), this.f, $$1, $$2, this.e) ? false : !this.g.isPresent() || !this.g.get().a($$0, $$1, $$2);
      }
   }

   protected abstract boolean a(ddz var1, int var2, int var3);

   public gu a(clt $$0) {
      return new gu($$0.d(), 0, $$0.e()).a(this.f());
   }

   public abstract dsy<?> e();

   private static boolean a(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dij $$5 = new dij(new dhl(0L));
      $$5.a($$0, $$1, $$2, $$3);
      return $$5.i() < $$4;
   }

   private static boolean b(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dij $$5 = new dij(new dhl(0L));
      $$5.c($$0, $$2, $$3);
      return $$5.j() < (double)$$4;
   }

   private static boolean c(long $$0, int $$1, int $$2, int $$3, float $$4) {
      dij $$5 = new dij(new dhl(0L));
      $$5.a($$0, $$2, $$3, 10387320);
      return $$5.i() < $$4;
   }

   private static boolean d(long $$0, int $$1, int $$2, int $$3, float $$4) {
      int $$5 = $$2 >> 4;
      int $$6 = $$3 >> 4;
      dij $$7 = new dij(new dhl(0L));
      $$7.b((long)($$5 ^ $$6 << 4) ^ $$0);
      $$7.f();
      return $$7.a((int)(1.0F / $$4)) == 0;
   }

   @Deprecated
   public static record a(he<dsg> b, int c) {
      public static final Codec<dsx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(acm.a(jc.aB, dsg.a, false).fieldOf("other_set").forGetter(dsx.a::a), Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(dsx.a::b))
               .apply($$0, dsx.a::new)
      );

      boolean a(ddz $$0, int $$1, int $$2) {
         return $$0.a(this.b, $$1, $$2, this.c);
      }

      public he<dsg> a() {
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

   public static enum c implements apr {
      a("default", dsx::a),
      b("legacy_type_1", dsx::d),
      c("legacy_type_2", dsx::c),
      d("legacy_type_3", dsx::b);

      public static final Codec<dsx.c> e = apr.a(dsx.c::values);
      private final String f;
      private final dsx.b g;

      private c(String $$0, dsx.b $$1) {
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
