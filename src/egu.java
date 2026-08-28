import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egu(egw b, egt c) {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egw.a.forGetter(egu::a), egt.a.forGetter(egu::b)).apply($$0, $$0.stable(egu::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, egw $$1, egt $$2) {
      return a.encodeStart($$0, new egu($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, egw $$1, js $$2) {
      return a($$0, $$1, new egt($$2.f(mg.bo)));
   }

   public egw a() {
      return this.b;
   }

   public egt b() {
      return this.c;
   }
}
