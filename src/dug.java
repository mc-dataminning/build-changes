import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dug(he<dnd<?, ?>> e, List<duj> f) {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnd.b.fieldOf("feature").forGetter($$0x -> $$0x.e), duj.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dug::new)
   );
   public static final Codec<he<dug>> b = aev.a(jc.az, a);
   public static final Codec<hi<dug>> c = hs.a(jc.az, a);
   public static final Codec<List<hi<dug>>> d = hs.a(jc.az, a, true).listOf();

   public boolean a(cqv $$0, dha $$1, ash $$2, gw $$3) {
      return this.a(new duh($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqv $$0, dha $$1, ash $$2, gw $$3) {
      return this.a(new duh($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(duh $$0, ash $$1, gw $$2) {
      Stream<gw> $$3 = Stream.of($$2);

      for (duj $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dnd<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dnd<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public he<dnd<?, ?>> b() {
      return this.e;
   }

   public List<duj> c() {
      return this.f;
   }
}
