import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bk extends de<bk.a> {
   @Override
   public Codec<bk.a> a() {
      return bk.a.a;
   }

   public void a(aqi $$0, @Nullable brh $$1) {
      eol $$2 = $$1 != null ? br.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bc> b, Optional<cu> c, Optional<bc> d) implements de.a {
      public static final Codec<bk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(bk.a::a), axh.a(cu.a, "effects").forGetter(bk.a::b), axh.a(br.b, "source").forGetter(bk.a::c))
               .apply($$0, bk.a::new)
      );

      public static an<bk.a> a(cu.a $$0) {
         return am.B.a(new bk.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static an<bk.a> a(br.a $$0) {
         return am.B.a(new bk.a(Optional.empty(), Optional.empty(), Optional.of(br.a($$0.b()))));
      }

      public boolean a(aqi $$0, @Nullable eol $$1) {
         return this.c.isPresent() && !this.c.get().a((bsa)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
