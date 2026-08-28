import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehu(jj<ear<?, ?>> e, List<ehx> f) {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ear.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehx.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehu::new)
   );
   public static final Codec<jj<ehu>> b = akg.a(lr.aP, a);
   public static final Codec<jn<ehu>> c = jy.a(lr.aP, a);
   public static final Codec<List<jn<ehu>>> d = jy.a(lr.aP, a, true).listOf();

   public boolean a(dcz $$0, due $$1, aym $$2, ja $$3) {
      return this.a(new ehv($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dcz $$0, due $$1, aym $$2, ja $$3) {
      return this.a(new ehv($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehv $$0, aym $$1, ja $$2) {
      Stream<ja> $$3 = Stream.of($$2);

      for (ehx $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ear<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ear<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jj<ear<?, ?>> b() {
      return this.e;
   }

   public List<ehx> c() {
      return this.f;
   }
}
