import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record enn(jr<egg<?, ?>> e, List<enq> f) {
   public static final Codec<enn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egg.b.fieldOf("feature").forGetter($$0x -> $$0x.e), enq.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, enn::new)
   );
   public static final Codec<jr<enn>> b = akq.a(mc.aV, a);
   public static final Codec<jv<enn>> c = kg.a(mc.aV, a);
   public static final Codec<List<jv<enn>>> d = kg.a(mc.aV, a, true).listOf();

   public boolean a(dhy $$0, dzn $$1, azh $$2, ji $$3) {
      return this.a(new eno($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dhy $$0, dzn $$1, azh $$2, ji $$3) {
      return this.a(new eno($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eno $$0, azh $$1, ji $$2) {
      Stream<ji> $$3 = Stream.of($$2);

      for (enq $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      egg<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<egg<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jr<egg<?, ?>> b() {
      return this.e;
   }

   public List<enq> c() {
      return this.f;
   }
}
