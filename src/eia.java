import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eia(jj<eax<?, ?>> e, List<eid> f) {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eax.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eid.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eia::new)
   );
   public static final Codec<jj<eia>> b = akg.a(lr.aP, a);
   public static final Codec<jn<eia>> c = jy.a(lr.aP, a);
   public static final Codec<List<jn<eia>>> d = jy.a(lr.aP, a, true).listOf();

   public boolean a(ddb $$0, duh $$1, ayo $$2, ja $$3) {
      return this.a(new eib($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(ddb $$0, duh $$1, ayo $$2, ja $$3) {
      return this.a(new eib($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eib $$0, ayo $$1, ja $$2) {
      Stream<ja> $$3 = Stream.of($$2);

      for (eid $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eax<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eax<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jj<eax<?, ?>> b() {
      return this.e;
   }

   public List<eid> c() {
      return this.f;
   }
}
