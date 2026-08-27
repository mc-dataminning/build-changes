import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eix(ja<ebm<?, ?>> e, List<eja> f) {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebm.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eja.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eix::new)
   );
   public static final Codec<ja<eix>> b = akp.a(li.aI, a);
   public static final Codec<je<eix>> c = jp.a(li.aI, a);
   public static final Codec<List<je<eix>>> d = jp.a(li.aI, a, true).listOf();

   public boolean a(dcv $$0, duz $$1, ayt $$2, ir $$3) {
      return this.a(new eiy($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcv $$0, duz $$1, ayt $$2, ir $$3) {
      return this.a(new eiy($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eiy $$0, ayt $$1, ir $$2) {
      Stream<ir> $$3 = Stream.of($$2);

      for (eja $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ebm<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ebm<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ja<ebm<?, ?>> b() {
      return this.e;
   }

   public List<eja> c() {
      return this.f;
   }
}
