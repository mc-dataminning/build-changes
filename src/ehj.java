import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ehj(ji<eag<?, ?>> e, List<ehm> f) {
   public static final Codec<ehj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eag.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehm.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ehj::new)
   );
   public static final Codec<ji<ehj>> b = akx.a(lq.aI, a);
   public static final Codec<jm<ehj>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<ehj>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dco $$0, dtu $$1, azc $$2, iz $$3) {
      return this.a(new ehk($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dco $$0, dtu $$1, azc $$2, iz $$3) {
      return this.a(new ehk($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehk $$0, azc $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (ehm $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eag<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eag<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<eag<?, ?>> b() {
      return this.e;
   }

   public List<ehm> c() {
      return this.f;
   }
}
