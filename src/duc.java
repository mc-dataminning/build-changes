import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record duc(he<dmz<?, ?>> e, List<duf> f) {
   public static final Codec<duc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmz.b.fieldOf("feature").forGetter($$0x -> $$0x.e), duf.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, duc::new)
   );
   public static final Codec<he<duc>> b = aen.a(jc.ay, a);
   public static final Codec<hi<duc>> c = ht.a(jc.ay, a);
   public static final Codec<List<hi<duc>>> d = ht.a(jc.ay, a, true).listOf();

   public boolean a(cqf $$0, dgw $$1, aru $$2, gu $$3) {
      return this.a(new dud($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqf $$0, dgw $$1, aru $$2, gu $$3) {
      return this.a(new dud($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dud $$0, aru $$1, gu $$2) {
      Stream<gu> $$3 = Stream.of($$2);

      for (duf $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dmz<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dmz<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public he<dmz<?, ?>> b() {
      return this.e;
   }

   public List<duf> c() {
      return this.f;
   }
}
