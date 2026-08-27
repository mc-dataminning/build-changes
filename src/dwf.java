import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwf extends dvz {
   public static final Codec<dwf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bjg.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dwf::new)
   );
   private final dvz c;
   private final String d;
   @Nullable
   private dkh e;
   private final bjg f;

   public dwf(dvz $$0, dkh $$1, bjg $$2) {
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

   public dwf(dvz $$0, String $$1, bjg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dwa<?> a() {
      return dwa.g;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      djh $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dkh a(djh $$0, String $$1) {
      Collection<dkk<?>> $$2 = $$0.B();
      Optional<dkh> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dkh).map($$0x -> (dkh)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
