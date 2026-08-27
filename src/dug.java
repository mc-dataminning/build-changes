import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dug extends dua {
   public static final Codec<dug> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bic.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dug::new)
   );
   private final dua c;
   private final String d;
   @Nullable
   private dii e;
   private final bic f;

   public dug(dua $$0, dii $$1, bic $$2) {
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

   public dug(dua $$0, String $$1, bic $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dub<?> a() {
      return dub.g;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      dhi $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dii a(dhi $$0, String $$1) {
      Collection<dil<?>> $$2 = $$0.B();
      Optional<dii> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dii).map($$0x -> (dii)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
