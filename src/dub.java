import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dub(hf<dmy<?, ?>> e, List<due> f) {
   public static final Codec<dub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmy.b.fieldOf("feature").forGetter($$0x -> $$0x.e), due.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dub::new)
   );
   public static final Codec<hf<dub>> b = ael.a(jd.ay, a);
   public static final Codec<hj<dub>> c = hu.a(jd.ay, a);
   public static final Codec<List<hj<dub>>> d = hu.a(jd.ay, a, true).listOf();

   public boolean a(cqe $$0, dgv $$1, art $$2, gv $$3) {
      return this.a(new duc($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqe $$0, dgv $$1, art $$2, gv $$3) {
      return this.a(new duc($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(duc $$0, art $$1, gv $$2) {
      Stream<gv> $$3 = Stream.of($$2);

      for (due $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dmy<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dmy<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public hf<dmy<?, ?>> b() {
      return this.e;
   }

   public List<due> c() {
      return this.f;
   }
}
