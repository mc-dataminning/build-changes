import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class enp extends enj {
   public static final MapCodec<enp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               enj.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               btg.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, enp::new)
   );
   private final enj c;
   private final String d;
   @Nullable
   private eaz e;
   private final btg f;

   public enp(enj $$0, eaz $$1, btg $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for (int $$4 = $$2.a(); $$4 <= $$2.b(); $$4++) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }
   }

   public enp(enj $$0, String $$1, btg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected enk<?> a() {
      return enk.g;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      dzz $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         eaz $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static eaz a(dzz $$0, String $$1) {
      Collection<ebc<?>> $$2 = $$0.F();
      Optional<eaz> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof eaz).map($$0x -> (eaz)$$0x).findAny();
      return $$3.orElse(null);
   }
}
