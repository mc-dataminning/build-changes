import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyd extends dxx {
   public static final Codec<dyd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bkz.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dyd::new)
   );
   private final dxx c;
   private final String d;
   @Nullable
   private dmf e;
   private final bkz f;

   public dyd(dxx $$0, dmf $$1, bkz $$2) {
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

   public dyd(dxx $$0, String $$1, bkz $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dxy<?> a() {
      return dxy.g;
   }

   @Override
   public dlf a(awo $$0, hz $$1) {
      dlf $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dmf a(dlf $$0, String $$1) {
      Collection<dmi<?>> $$2 = $$0.B();
      Optional<dmf> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dmf).map($$0x -> (dmf)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
