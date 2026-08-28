import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record elf(jq<eeb<?, ?>> e, List<eli> f) {
   public static final Codec<elf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeb.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eli.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, elf::new)
   );
   public static final Codec<jq<elf>> b = alh.a(ma.aR, a);
   public static final Codec<ju<elf>> c = kf.a(ma.aR, a);
   public static final Codec<List<ju<elf>>> d = kf.a(ma.aR, a, true).listOf();

   public boolean a(dgd $$0, dxk $$1, azv $$2, jh $$3) {
      return this.a(new elg($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dgd $$0, dxk $$1, azv $$2, jh $$3) {
      return this.a(new elg($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(elg $$0, azv $$1, jh $$2) {
      Stream<jh> $$3 = Stream.of($$2);

      for (eli $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eeb<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eeb<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jq<eeb<?, ?>> b() {
      return this.e;
   }

   public List<eli> c() {
      return this.f;
   }
}
