import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class edf extends ecz {
   public static final Codec<edf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bnv.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, edf::new)
   );
   private final ecz c;
   private final String d;
   @Nullable
   private dqy e;
   private final bnv f;

   public edf(ecz $$0, dqy $$1, bnv $$2) {
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

   public edf(ecz $$0, String $$1, bnv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected eda<?> a() {
      return eda.g;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      dpy $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dqy a(dpy $$0, String $$1) {
      Collection<drb<?>> $$2 = $$0.B();
      Optional<dqy> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dqy).map($$0x -> (dqy)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
