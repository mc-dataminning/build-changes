import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class edo extends edi {
   public static final Codec<edo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bor.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, edo::new)
   );
   private final edi c;
   private final String d;
   @Nullable
   private drh e;
   private final bor f;

   public edo(edi $$0, drh $$1, bor $$2) {
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

   public edo(edi $$0, String $$1, bor $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected edj<?> a() {
      return edj.g;
   }

   @Override
   public dqh a(ayg $$0, in $$1) {
      dqh $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static drh a(dqh $$0, String $$1) {
      Collection<drk<?>> $$2 = $$0.B();
      Optional<drh> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof drh).map($$0x -> (drh)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
