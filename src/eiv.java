import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eiv(jm<ebq<?, ?>> e, List<eiy> f) {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebq.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eiy.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eiv::new)
   );
   public static final Codec<jm<eiv>> b = akn.a(lu.aQ, a);
   public static final Codec<jq<eiv>> c = kb.a(lu.aQ, a);
   public static final Codec<List<jq<eiv>>> d = kb.a(lu.aQ, a, true).listOf();

   public boolean a(dds $$0, duz $$1, ayw $$2, jd $$3) {
      return this.a(new eiw($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dds $$0, duz $$1, ayw $$2, jd $$3) {
      return this.a(new eiw($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eiw $$0, ayw $$1, jd $$2) {
      Stream<jd> $$3 = Stream.of($$2);

      for (eiy $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ebq<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ebq<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jm<ebq<?, ?>> b() {
      return this.e;
   }

   public List<eiy> c() {
      return this.f;
   }
}
