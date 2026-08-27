import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dui extends dup {
   public static final Codec<dui> a = RecordCodecBuilder.create($$0 -> $$0.group(dks.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dui::new));
   private final dks.a c;

   private dui(dks.a $$0) {
      this.c = $$0;
   }

   public static dui a(dks.a $$0) {
      return new dui($$0);
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gw($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public duq<?> b() {
      return duq.k;
   }
}
