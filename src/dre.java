import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dre(he<dkb<?, ?>> e, List<drh> f) {
   public static final Codec<dre> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkb.b.fieldOf("feature").forGetter($$0x -> $$0x.e), drh.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dre::new)
   );
   public static final Codec<he<dre>> b = acm.a(jc.ay, a);
   public static final Codec<hi<dre>> c = ht.a(jc.ay, a);
   public static final Codec<List<hi<dre>>> d = ht.a(jc.ay, a, true).listOf();

   public boolean a(cng $$0, ddy $$1, apf $$2, gu $$3) {
      return this.a(new drf($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cng $$0, ddy $$1, apf $$2, gu $$3) {
      return this.a(new drf($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(drf $$0, apf $$1, gu $$2) {
      Stream<gu> $$3 = Stream.of($$2);

      for (drh $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dkb<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dkb<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public he<dkb<?, ?>> b() {
      return this.e;
   }

   public List<drh> c() {
      return this.f;
   }
}
