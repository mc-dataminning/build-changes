import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dvv extends dwc {
   public static final Codec<dvv> a = RecordCodecBuilder.create($$0 -> $$0.group(dmf.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dvv::new));
   private final dmf.a c;

   private dvv(dmf.a $$0) {
      this.c = $$0;
   }

   public static dvv a(dmf.a $$0) {
      return new dvv($$0);
   }

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ht($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dwd<?> b() {
      return dwd.k;
   }
}
