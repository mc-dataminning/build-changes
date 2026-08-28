import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ehn extends ehh {
   public static final MapCodec<ehn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ehh.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bqp.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehn::new)
   );
   private final ehh c;
   private final String d;
   @Nullable
   private dva e;
   private final bqp f;

   public ehn(ehh $$0, dva $$1, bqp $$2) {
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

   public ehn(ehh $$0, String $$1, bqp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ehi<?> a() {
      return ehi.g;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      dua $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dva $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dva a(dua $$0, String $$1) {
      Collection<dvd<?>> $$2 = $$0.F();
      Optional<dva> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dva).map($$0x -> (dva)$$0x).findAny();
      return $$3.orElse(null);
   }
}
