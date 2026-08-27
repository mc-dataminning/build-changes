import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ead extends dzx {
   public static final Codec<ead> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzx.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bmi.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ead::new)
   );
   private final dzx c;
   private final String d;
   @Nullable
   private dob e;
   private final bmi f;

   public ead(dzx $$0, dob $$1, bmi $$2) {
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

   public ead(dzx $$0, String $$1, bmi $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dzy<?> a() {
      return dzy.g;
   }

   @Override
   public dnb a(axd $$0, ib $$1) {
      dnb $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dob a(dnb $$0, String $$1) {
      Collection<doe<?>> $$2 = $$0.B();
      Optional<dob> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dob).map($$0x -> (dob)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
