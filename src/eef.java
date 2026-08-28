import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eef(eeh b, eee c) {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeh.a.forGetter(eef::a), eee.a.forGetter(eef::b)).apply($$0, $$0.stable(eef::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeh $$1, eee $$2) {
      return a.encodeStart($$0, new eef($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeh $$1, ke $$2) {
      return a($$0, $$1, new eee($$2.e(mb.bf)));
   }

   public eeh a() {
      return this.b;
   }

   public eee b() {
      return this.c;
   }
}
