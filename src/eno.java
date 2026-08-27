import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eno extends enw {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajt.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eno::new)
   );
   private final ajt j;

   private eno(ajt $$0, int $$1, int $$2, List<eqc> $$3, List<eop> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public env a() {
      return ens.e;
   }

   @Override
   public void a(Consumer<crj> $$0, enb $$1) {
      $$1.a(this.j, $$0);
   }

   public static enw.a<?> a(ajt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eno($$0, $$1, $$2, $$3, $$4));
   }
}
