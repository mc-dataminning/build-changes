import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erh extends erm {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.g.s().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erh::new)
   );
   private final jj<ctx> j;

   private erh(jj<ctx> $$0, int $$1, int $$2, List<euf> $$3, List<esi> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erl a() {
      return eri.c;
   }

   @Override
   public void a(Consumer<cuc> $$0, equ $$1) {
      $$0.accept(new cuc(this.j));
   }

   public static erm.a<?> a(dce $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erh($$0.r().o(), $$1, $$2, $$3, $$4));
   }
}
