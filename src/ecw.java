import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecw extends edb {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ecw::new)
   );
   private final he<cis> j;

   private ecw(he<cis> $$0, int $$1, int $$2, List<eff> $$3, List<edt> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eda a() {
      return ecx.c;
   }

   @Override
   public void a(Consumer<cix> $$0, ecg $$1) {
      $$0.accept(new cix(this.j));
   }

   public static edb.a<?> a(cpk $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecw($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
