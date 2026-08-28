import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cws(jq<awm> e, xj f, float g, int h) {
   public static final Codec<cws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(cws::b),
               xl.a.fieldOf("description").forGetter(cws::c),
               ayv.o.fieldOf("length_in_seconds").forGetter(cws::d),
               ayv.a(0, 15).fieldOf("comparator_output").forGetter(cws::e)
            )
            .apply($$0, cws::new)
   );
   public static final zh<wu, cws> b = zh.a(awm.d, cws::b, xl.b, cws::c, zf.k, cws::d, zf.h, cws::e, cws::new);
   public static final Codec<jq<cws>> c = alg.a(ma.L);
   public static final zh<wu, jq<cws>> d = zf.a(ma.L, b);
   private static final int i = 20;

   public int a() {
      return azm.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cws>> a(js.a $$0, cwm $$1) {
      cwr $$2 = $$1.a(ku.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jq<awm> b() {
      return this.e;
   }

   public xj c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
