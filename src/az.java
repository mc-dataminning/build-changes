import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class az extends dr<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(arf $$0, Collection<? extends bss> $$1) {
      List<eqg> $$2 = $$1.stream().map($$1x -> bu.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bf> b, List<bf> c) implements dr.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(az.a::a), bu.b.listOf().optionalFieldOf("victims", List.of()).forGetter(az.a::b))
               .apply($$0, az.a::new)
      );

      public static an<az.a> a(bu.a... $$0) {
         return am.F.a(new az.a(Optional.empty(), bu.a($$0)));
      }

      public boolean a(Collection<? extends eqg> $$0) {
         for (bf $$1 : this.c) {
            boolean $$2 = false;

            for (eqg $$3 : $$0) {
               if ($$1.a($$3)) {
                  $$2 = true;
                  break;
               }
            }

            if (!$$2) {
               return false;
            }
         }

         return true;
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public List<bf> b() {
         return this.c;
      }
   }
}
