import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class br extends dk<br.a> {
   @Override
   public Codec<br.a> a() {
      return br.a.a;
   }

   public void a(art $$0, @Nullable bwt $$1) {
      fah $$2 = $$1 != null ? by.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bj> b, Optional<cx> c, Optional<bj> d) implements dk.a {
      public static final Codec<br.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(br.a::a),
                  cx.a.optionalFieldOf("effects").forGetter(br.a::b),
                  by.b.optionalFieldOf("source").forGetter(br.a::c)
               )
               .apply($$0, br.a::new)
      );

      public static ar<br.a> a(cx.a $$0) {
         return aq.B.a(new br.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static ar<br.a> a(by.a $$0) {
         return aq.B.a(new br.a(Optional.empty(), Optional.empty(), Optional.of(by.a($$0.b()))));
      }

      public boolean a(art $$0, @Nullable fah $$1) {
         return this.c.isPresent() && !this.c.get().a((bxu)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cx> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
