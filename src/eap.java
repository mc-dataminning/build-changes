import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eap(ij<dtm<?, ?>> e, List<eas> f) {
   public static final Codec<eap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtm.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eas.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eap::new)
   );
   public static final Codec<ij<eap>> b = aiu.a(kg.aC, a);
   public static final Codec<in<eap>> c = ix.a(kg.aC, a);
   public static final Codec<List<in<eap>>> d = ix.a(kg.aC, a, true).listOf();

   public boolean a(cwm $$0, dng $$1, awp $$2, hz $$3) {
      return this.a(new eaq($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cwm $$0, dng $$1, awp $$2, hz $$3) {
      return this.a(new eaq($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eaq $$0, awp $$1, hz $$2) {
      Stream<hz> $$3 = Stream.of($$2);

      for (eas $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dtm<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dtm<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ij<dtm<?, ?>> b() {
      return this.e;
   }

   public List<eas> c() {
      return this.f;
   }
}
