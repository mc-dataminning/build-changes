import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehc(ehe b, ehb c) {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehe.a.forGetter(ehc::a), ehb.a.forGetter(ehc::b)).apply($$0, $$0.stable(ehc::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehe $$1, ehb $$2) {
      return a.encodeStart($$0, new ehc($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehe $$1, js $$2) {
      return a($$0, $$1, new ehb($$2.f(mg.bp)));
   }

   public ehe a() {
      return this.b;
   }

   public ehb b() {
      return this.c;
   }
}
