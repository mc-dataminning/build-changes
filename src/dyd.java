import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dyd(ih<dra<?, ?>> e, List<dyg> f) {
   public static final Codec<dyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dra.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dyg.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dyd::new)
   );
   public static final Codec<ih<dyd>> b = agz.a(ke.aC, a);
   public static final Codec<il<dyd>> c = iv.a(ke.aC, a);
   public static final Codec<List<il<dyd>>> d = iv.a(ke.aC, a, true).listOf();

   public boolean a(cud $$0, dkx $$1, aup $$2, hx $$3) {
      return this.a(new dye($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cud $$0, dkx $$1, aup $$2, hx $$3) {
      return this.a(new dye($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dye $$0, aup $$1, hx $$2) {
      Stream<hx> $$3 = Stream.of($$2);

      for (dyg $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dra<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dra<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ih<dra<?, ?>> b() {
      return this.e;
   }

   public List<dyg> c() {
      return this.f;
   }
}
