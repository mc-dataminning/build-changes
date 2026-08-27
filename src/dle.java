import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dle(dlg b, dld c) {
   public static final Codec<dle> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlg.a.forGetter(dle::a), dld.a.forGetter(dle::b)).apply($$0, $$0.stable(dle::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlg $$1, dld $$2) {
      return a.encodeStart($$0, new dle($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlg $$1, hs $$2) {
      return a($$0, $$1, new dld($$2.d(jc.aI)));
   }

   public dlg a() {
      return this.b;
   }

   public dld b() {
      return this.c;
   }
}
