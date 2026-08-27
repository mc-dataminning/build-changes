import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eel(il<dxi<?, ?>> e, List<eeo> f) {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxi.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eeo.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eel::new)
   );
   public static final Codec<il<eel>> b = ajp.a(ks.aE, a);
   public static final Codec<ip<eel>> c = ja.a(ks.aE, a);
   public static final Codec<List<ip<eel>>> d = ja.a(ks.aE, a, true).listOf();

   public boolean a(czs $$0, dqw $$1, axr $$2, ib $$3) {
      return this.a(new eem($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(czs $$0, dqw $$1, axr $$2, ib $$3) {
      return this.a(new eem($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eem $$0, axr $$1, ib $$2) {
      Stream<ib> $$3 = Stream.of($$2);

      for (eeo $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dxi<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dxi<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public il<dxi<?, ?>> b() {
      return this.e;
   }

   public List<eeo> c() {
      return this.f;
   }
}
