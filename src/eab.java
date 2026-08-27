import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class eab extends dzv {
   public static final Codec<eab> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzv.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bmh.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eab::new)
   );
   private final dzv c;
   private final String d;
   @Nullable
   private dnz e;
   private final bmh f;

   public eab(dzv $$0, dnz $$1, bmh $$2) {
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

   public eab(dzv $$0, String $$1, bmh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dzw<?> a() {
      return dzw.g;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      dmz $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dnz a(dmz $$0, String $$1) {
      Collection<doc<?>> $$2 = $$0.B();
      Optional<dnz> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dnz).map($$0x -> (dnz)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
