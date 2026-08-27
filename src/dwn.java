import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwn extends dwh {
   public static final Codec<dwn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bjh.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dwn::new)
   );
   private final dwh c;
   private final String d;
   @Nullable
   private dkp e;
   private final bjh f;

   public dwn(dwh $$0, dkp $$1, bjh $$2) {
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

   public dwn(dwh $$0, String $$1, bjh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dwi<?> a() {
      return dwi.g;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      djp $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dkp a(djp $$0, String $$1) {
      Collection<dks<?>> $$2 = $$0.B();
      Optional<dkp> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dkp).map($$0x -> (dkp)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
