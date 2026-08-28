import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class efl extends eff {
   public static final MapCodec<efl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eff.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bqb.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efl::new)
   );
   private final eff c;
   private final String d;
   @Nullable
   private dte e;
   private final bqb f;

   public efl(eff $$0, dte $$1, bqb $$2) {
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

   public efl(eff $$0, String $$1, bqb $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected efg<?> a() {
      return efg.g;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      dse $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dte a(dse $$0, String $$1) {
      Collection<dth<?>> $$2 = $$0.B();
      Optional<dte> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dte).map($$0x -> (dte)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
