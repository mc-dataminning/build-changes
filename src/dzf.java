import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dzf extends dyz {
   public static final Codec<dzf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyz.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               blq.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dzf::new)
   );
   private final dyz c;
   private final String d;
   @Nullable
   private dne e;
   private final blq f;

   public dzf(dyz $$0, dne $$1, blq $$2) {
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

   public dzf(dyz $$0, String $$1, blq $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dza<?> a() {
      return dza.g;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      dme $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dne a(dme $$0, String $$1) {
      Collection<dnh<?>> $$2 = $$0.B();
      Optional<dne> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dne).map($$0x -> (dne)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
