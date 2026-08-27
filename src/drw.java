import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class drw extends drq {
   public static final Codec<drw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drq.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bft.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, drw::new)
   );
   private final drq c;
   private final String d;
   @Nullable
   private dfy e;
   private final bft f;

   public drw(drq $$0, dfy $$1, bft $$2) {
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

   public drw(drq $$0, String $$1, bft $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected drr<?> a() {
      return drr.g;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      dey $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dfy a(dey $$0, String $$1) {
      Collection<dgb<?>> $$2 = $$0.B();
      Optional<dfy> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dfy).map($$0x -> (dfy)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
