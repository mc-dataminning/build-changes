import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dum(he<dnj<?, ?>> e, List<dup> f) {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnj.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dup.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dum::new)
   );
   public static final Codec<he<dum>> b = aes.a(jc.ay, a);
   public static final Codec<hi<dum>> c = hs.a(jc.ay, a);
   public static final Codec<List<hi<dum>>> d = hs.a(jc.ay, a, true).listOf();

   public boolean a(cqp $$0, dhg $$1, asc $$2, gw $$3) {
      return this.a(new dun($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqp $$0, dhg $$1, asc $$2, gw $$3) {
      return this.a(new dun($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dun $$0, asc $$1, gw $$2) {
      Stream<gw> $$3 = Stream.of($$2);

      for (dup $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dnj<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dnj<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public he<dnj<?, ?>> b() {
      return this.e;
   }

   public List<dup> c() {
      return this.f;
   }
}
