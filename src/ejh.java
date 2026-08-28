import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ejh extends ejb {
   public static final MapCodec<ejh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ejb.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               brp.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ejh::new)
   );
   private final ejb c;
   private final String d;
   @Nullable
   private dwu e;
   private final brp f;

   public ejh(ejb $$0, dwu $$1, brp $$2) {
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

   public ejh(ejb $$0, String $$1, brp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ejc<?> a() {
      return ejc.g;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      dvv $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         dwu $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, Integer.valueOf(this.f.a($$0)));
   }

   @Nullable
   private static dwu a(dvv $$0, String $$1) {
      Collection<dwx<?>> $$2 = $$0.F();
      Optional<dwu> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dwu).map($$0x -> (dwu)$$0x).findAny();
      return $$3.orElse(null);
   }
}
