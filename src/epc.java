import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epc extends eoo {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eqy.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, epc::new)
   );
   private final eqx b;
   private final boolean c;

   private epc(List<eqc> $$0, eqx $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eoq b() {
      return eor.c;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.a();
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      int $$2 = this.c ? $$0.G() : 0;
      $$0.e(axk.a($$2 + this.b.a($$1), 0, $$0.i()));
      return $$0;
   }

   public static eoo.a<?> a(eqx $$0) {
      return a($$1 -> new epc($$1, $$0, false));
   }

   public static eoo.a<?> a(eqx $$0, boolean $$1) {
      return a($$2 -> new epc($$2, $$0, $$1));
   }
}
