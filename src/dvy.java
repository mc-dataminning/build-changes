import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dvy extends dvs {
   public static final Codec<dvy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvs.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bja.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dvy::new)
   );
   private final dvs c;
   private final String d;
   @Nullable
   private dka e;
   private final bja f;

   public dvy(dvs $$0, dka $$1, bja $$2) {
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

   public dvy(dvs $$0, String $$1, bja $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dvt<?> a() {
      return dvt.g;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      dja $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dka a(dja $$0, String $$1) {
      Collection<dkd<?>> $$2 = $$0.B();
      Optional<dka> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dka).map($$0x -> (dka)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
