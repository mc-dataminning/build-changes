import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class da extends dk<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(art $$0, czy $$1, @Nullable bwt $$2) {
      fah $$3 = by.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bj> b, Optional<cm> c, Optional<bj> d) implements dk.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(da.a::a),
                  cm.a.optionalFieldOf("item").forGetter(da.a::b),
                  by.b.optionalFieldOf("entity").forGetter(da.a::c)
               )
               .apply($$0, da.a::new)
      );

      public static ar<da.a> a(bj $$0, Optional<cm> $$1, Optional<bj> $$2) {
         return aq.R.a(new da.a(Optional.of($$0), $$1, $$2));
      }

      public static ar<da.a> a(Optional<bj> $$0, Optional<cm> $$1, Optional<bj> $$2) {
         return aq.S.a(new da.a($$0, $$1, $$2));
      }

      public boolean a(art $$0, czy $$1, fah $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cm> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
