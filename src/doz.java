import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class doz extends dot {
   public static final Codec<doz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dot.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bdc.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, doz::new)
   );
   private final dot c;
   private final String d;
   @Nullable
   private ddb e;
   private final bdc f;

   public doz(dot $$0, ddb $$1, bdc $$2) {
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

   public doz(dot $$0, String $$1, bdc $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dou<?> a() {
      return dou.g;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      dcb $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static ddb a(dcb $$0, String $$1) {
      Collection<dde<?>> $$2 = $$0.B();
      Optional<ddb> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof ddb).map($$0x -> (ddb)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
