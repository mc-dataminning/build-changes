import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dwl(ib<dpi<?, ?>> e, List<dwo> f) {
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpi.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dwo.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dwl::new)
   );
   public static final Codec<ib<dwl>> b = age.a(jz.aA, a);
   public static final Codec<ig<dwl>> c = iq.a(jz.aA, a);
   public static final Codec<List<ig<dwl>>> d = iq.a(jz.aA, a, true).listOf();

   public boolean a(csu $$0, djf $$1, ats $$2, ht $$3) {
      return this.a(new dwm($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(csu $$0, djf $$1, ats $$2, ht $$3) {
      return this.a(new dwm($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dwm $$0, ats $$1, ht $$2) {
      Stream<ht> $$3 = Stream.of($$2);

      for (dwo $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dpi<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dpi<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ib<dpi<?, ?>> b() {
      return this.e;
   }

   public List<dwo> c() {
      return this.f;
   }
}
