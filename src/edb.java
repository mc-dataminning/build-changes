import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edb extends edg {
   public static final Codec<edb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.i.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edb::new)
   );
   private final hg<civ> j;

   private edb(hg<civ> $$0, int $$1, int $$2, List<efk> $$3, List<edy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edf a() {
      return edc.c;
   }

   @Override
   public void a(Consumer<cja> $$0, ecl $$1) {
      $$0.accept(new cja(this.j));
   }

   public static edg.a<?> a(cpp $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edb($$0.k().j(), $$1, $$2, $$3, $$4));
   }
}
