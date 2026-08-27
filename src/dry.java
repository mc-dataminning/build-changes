import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dry extends drs {
   public static final Codec<dry> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drs.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bfv.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dry::new)
   );
   private final drs c;
   private final String d;
   @Nullable
   private dga e;
   private final bfv f;

   public dry(drs $$0, dga $$1, bfv $$2) {
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

   public dry(drs $$0, String $$1, bfv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected drt<?> a() {
      return drt.g;
   }

   @Override
   public dfa a(aru $$0, gu $$1) {
      dfa $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dga a(dfa $$0, String $$1) {
      Collection<dgd<?>> $$2 = $$0.B();
      Optional<dga> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dga).map($$0x -> (dga)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
