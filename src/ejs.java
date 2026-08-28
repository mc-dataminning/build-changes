import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record ejs(jn<eco<?, ?>> e, List<ejv> f) {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eco.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ejv.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, ejs::new)
   );
   public static final Codec<jn<ejs>> b = akx.a(lv.aQ, a);
   public static final Codec<jr<ejs>> c = kc.a(lv.aQ, a);
   public static final Codec<List<jr<ejs>>> d = kc.a(lv.aQ, a, true).listOf();

   public boolean a(dep $$0, dvx $$1, azk $$2, je $$3) {
      return this.a(new ejt($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dep $$0, dvx $$1, azk $$2, je $$3) {
      return this.a(new ejt($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ejt $$0, azk $$1, je $$2) {
      Stream<je> $$3 = Stream.of($$2);

      for (ejv $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eco<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eco<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jn<eco<?, ?>> b() {
      return this.e;
   }

   public List<ejv> c() {
      return this.f;
   }
}
