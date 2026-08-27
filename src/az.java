import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dh<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(aqu $$0, aks<dca> $$1, aks<dca> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bd> b, Optional<aks<dca>> c, Optional<aks<dca>> d) implements dh.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(az.a::a), axu.a(aks.a(li.aS), "from").forGetter(az.a::c), axu.a(aks.a(li.aS), "to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(aks<dca> $$0, aks<dca> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(aks<dca> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(aks<dca> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(aks<dca> $$0, aks<dca> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
