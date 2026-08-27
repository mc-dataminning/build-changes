import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record duh(hg<dne<?, ?>> e, List<duk> f) {
   public static final Codec<duh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dne.b.fieldOf("feature").forGetter($$0x -> $$0x.e), duk.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, duh::new)
   );
   public static final Codec<hg<duh>> b = aeq.a(je.ay, a);
   public static final Codec<hk<duh>> c = hv.a(je.ay, a);
   public static final Codec<List<hk<duh>>> d = hv.a(je.ay, a, true).listOf();

   public boolean a(cqk $$0, dhb $$1, arx $$2, gw $$3) {
      return this.a(new dui($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cqk $$0, dhb $$1, arx $$2, gw $$3) {
      return this.a(new dui($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dui $$0, arx $$1, gw $$2) {
      Stream<gw> $$3 = Stream.of($$2);

      for (duk $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dne<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dne<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public hg<dne<?, ?>> b() {
      return this.e;
   }

   public List<duk> c() {
      return this.f;
   }
}
