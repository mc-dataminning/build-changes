import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ekv(jp<edr<?, ?>> e, List<eky> f) {
   public static final Codec<ekv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edr.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eky.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ekv::new)
   );
   public static final Codec<jp<ekv>> b = ald.a(ly.aR, a);
   public static final Codec<jt<ekv>> c = ke.a(ly.aR, a);
   public static final Codec<List<jt<ekv>>> d = ke.a(ly.aR, a, true).listOf();

   public boolean a(dfs $$0, dxa $$1, azr $$2, jg $$3) {
      return this.a(new ekw($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dfs $$0, dxa $$1, azr $$2, jg $$3) {
      return this.a(new ekw($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ekw $$0, azr $$1, jg $$2) {
      Stream<jg> $$3 = Stream.of($$2);

      for (eky $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      edr<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<edr<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jp<edr<?, ?>> b() {
      return this.e;
   }

   public List<eky> c() {
      return this.f;
   }
}
