import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eho(ji<eal<?, ?>> e, List<ehr> f) {
   public static final Codec<eho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eal.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ehr.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eho::new)
   );
   public static final Codec<ji<eho>> b = alb.a(lq.aI, a);
   public static final Codec<jm<eho>> c = jx.a(lq.aI, a);
   public static final Codec<List<jm<eho>>> d = jx.a(lq.aI, a, true).listOf();

   public boolean a(dct $$0, dtz $$1, azh $$2, iz $$3) {
      return this.a(new ehp($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dct $$0, dtz $$1, azh $$2, iz $$3) {
      return this.a(new ehp($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ehp $$0, azh $$1, iz $$2) {
      Stream<iz> $$3 = Stream.of($$2);

      for (ehr $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eal<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eal<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ji<eal<?, ?>> b() {
      return this.e;
   }

   public List<ehr> c() {
      return this.f;
   }
}
