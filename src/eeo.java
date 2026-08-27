import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeo extends eec {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egl.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eeo::new)
   );
   private final egk b;
   private final boolean c;

   private eeo(List<efp> $$0, egk $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eee b() {
      return eef.c;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.a();
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(arx.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eec.a<?> a(egk $$0) {
      return a($$1 -> new eeo($$1, $$0, false));
   }

   public static eec.a<?> a(egk $$0, boolean $$1) {
      return a($$2 -> new eeo($$2, $$0, $$1));
   }
}
