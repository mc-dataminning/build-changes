import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class efj extends efd {
   public static final MapCodec<efj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               efd.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bpz.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efj::new)
   );
   private final efd c;
   private final String d;
   @Nullable
   private dtc e;
   private final bpz f;

   public efj(efd $$0, dtc $$1, bpz $$2) {
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

   public efj(efd $$0, String $$1, bpz $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected efe<?> a() {
      return efe.g;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      dsc $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dtc a(dsc $$0, String $$1) {
      Collection<dtf<?>> $$2 = $$0.B();
      Optional<dtc> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dtc).map($$0x -> (dtc)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
