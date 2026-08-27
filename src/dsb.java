import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsb extends drv {
   public static final Codec<dsb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bgj.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dsb::new)
   );
   private final drv c;
   private final String d;
   @Nullable
   private dgd e;
   private final bgj f;

   public dsb(drv $$0, dgd $$1, bgj $$2) {
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

   public dsb(drv $$0, String $$1, bgj $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected drw<?> a() {
      return drw.g;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      dfd $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dgd a(dfd $$0, String $$1) {
      Collection<dgg<?>> $$2 = $$0.B();
      Optional<dgd> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dgd).map($$0x -> (dgd)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
