import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwh extends dwo {
   public static final Codec<dwh> a = RecordCodecBuilder.create($$0 -> $$0.group(dmr.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dwh::new));
   private final dmr.a c;

   private dwh(dmr.a $$0) {
      this.c = $$0;
   }

   public static dwh a(dmr.a $$0) {
      return new dwh($$0);
   }

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ht($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dwp<?> b() {
      return dwp.k;
   }
}
