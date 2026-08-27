import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dvn extends dvh {
   public static final Codec<dvn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvh.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               biq.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dvn::new)
   );
   private final dvh c;
   private final String d;
   @Nullable
   private djp e;
   private final biq f;

   public dvn(dvh $$0, djp $$1, biq $$2) {
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

   public dvn(dvh $$0, String $$1, biq $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dvi<?> a() {
      return dvi.g;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      dip $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static djp a(dip $$0, String $$1) {
      Collection<djs<?>> $$2 = $$0.B();
      Optional<djp> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof djp).map($$0x -> (djp)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
