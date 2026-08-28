import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eib(jj<eay<?, ?>> e, List<eie> f) {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eay.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eie.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eib::new)
   );
   public static final Codec<jj<eib>> b = akg.a(lr.aP, a);
   public static final Codec<jn<eib>> c = jy.a(lr.aP, a);
   public static final Codec<List<jn<eib>>> d = jy.a(lr.aP, a, true).listOf();

   public boolean a(ddc $$0, dui $$1, ayo $$2, ja $$3) {
      return this.a(new eic($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(ddc $$0, dui $$1, ayo $$2, ja $$3) {
      return this.a(new eic($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eic $$0, ayo $$1, ja $$2) {
      Stream<ja> $$3 = Stream.of($$2);

      for (eie $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eay<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eay<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jj<eay<?, ?>> b() {
      return this.e;
   }

   public List<eie> c() {
      return this.f;
   }
}
