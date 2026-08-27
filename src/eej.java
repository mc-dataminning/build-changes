import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eej extends edx {
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egg.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eej::new)
   );
   private final egf b;
   private final boolean c;

   private eej(List<efk> $$0, egf $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edz b() {
      return eea.c;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.a();
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(ars.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static edx.a<?> a(egf $$0) {
      return a($$1 -> new eej($$1, $$0, false));
   }

   public static edx.a<?> a(egf $$0, boolean $$1) {
      return a($$2 -> new eej($$2, $$0, $$1));
   }
}
