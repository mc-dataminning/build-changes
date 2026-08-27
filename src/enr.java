import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class enr extends enw {
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kr.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, enr::new)
   );
   private final il<cre> j;

   private enr(il<cre> $$0, int $$1, int $$2, List<eqc> $$3, List<eop> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public env a() {
      return ens.c;
   }

   @Override
   public void a(Consumer<crj> $$0, enb $$1) {
      $$0.accept(new crj(this.j));
   }

   public static enw.a<?> a(cyw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enr($$0.p().n(), $$1, $$2, $$3, $$4));
   }
}
