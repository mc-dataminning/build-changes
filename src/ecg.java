import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ecg(il<dvd<?, ?>> e, List<ecj> f) {
   public static final Codec<ecg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvd.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ecj.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ecg::new)
   );
   public static final Codec<il<ecg>> b = ajd.a(kj.aD, a);
   public static final Codec<ip<ecg>> c = ja.a(kj.aD, a);
   public static final Codec<List<ip<ecg>>> d = ja.a(kj.aD, a, true).listOf();

   public boolean a(cxu $$0, dow $$1, axd $$2, ib $$3) {
      return this.a(new ech($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cxu $$0, dow $$1, axd $$2, ib $$3) {
      return this.a(new ech($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ech $$0, axd $$1, ib $$2) {
      Stream<ib> $$3 = Stream.of($$2);

      for (ecj $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dvd<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dvd<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public il<dvd<?, ?>> b() {
      return this.e;
   }

   public List<ecj> c() {
      return this.f;
   }
}
