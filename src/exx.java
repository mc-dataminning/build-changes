import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exx extends exf {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezy.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, exx::new)
   );
   private final ezx b;
   private final boolean c;

   private exx(List<ezb> $$0, ezx $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exh<exx> b() {
      return exi.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static exf.a<?> a(ezx $$0) {
      return a($$1 -> new exx($$1, $$0, false));
   }

   public static exf.a<?> a(ezx $$0, boolean $$1) {
      return a($$2 -> new exx($$2, $$0, $$1));
   }
}
