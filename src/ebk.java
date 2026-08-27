import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ebk(il<duh<?, ?>> e, List<ebn> f) {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duh.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ebn.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ebk::new)
   );
   public static final Codec<il<ebk>> b = aiy.a(ki.aD, a);
   public static final Codec<ip<ebk>> c = iz.a(ki.aD, a);
   public static final Codec<List<ip<ebk>>> d = iz.a(ki.aD, a, true).listOf();

   public boolean a(cwz $$0, dob $$1, awt $$2, ib $$3) {
      return this.a(new ebl($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cwz $$0, dob $$1, awt $$2, ib $$3) {
      return this.a(new ebl($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ebl $$0, awt $$1, ib $$2) {
      Stream<ib> $$3 = Stream.of($$2);

      for (ebn $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      duh<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<duh<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public il<duh<?, ?>> b() {
      return this.e;
   }

   public List<ebn> c() {
      return this.f;
   }
}
