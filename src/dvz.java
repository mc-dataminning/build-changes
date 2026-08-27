import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dvz(ib<dow<?, ?>> e, List<dwc> f) {
   public static final Codec<dvz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dow.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dwc.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dvz::new)
   );
   public static final Codec<ib<dvz>> b = agc.a(jz.aA, a);
   public static final Codec<ig<dvz>> c = iq.a(jz.aA, a);
   public static final Codec<List<ig<dvz>>> d = iq.a(jz.aA, a, true).listOf();

   public boolean a(csm $$0, dit $$1, ato $$2, ht $$3) {
      return this.a(new dwa($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(csm $$0, dit $$1, ato $$2, ht $$3) {
      return this.a(new dwa($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dwa $$0, ato $$1, ht $$2) {
      Stream<ht> $$3 = Stream.of($$2);

      for (dwc $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dow<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dow<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ib<dow<?, ?>> b() {
      return this.e;
   }

   public List<dwc> c() {
      return this.f;
   }
}
