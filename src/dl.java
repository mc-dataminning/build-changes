import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dl extends dv<dl.a> {
   @Override
   public Codec<dl.a> a() {
      return dl.a.a;
   }

   public void a(ari $$0, cvp $$1, @Nullable bto $$2) {
      eth $$3 = bv.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bg> b, Optional<cs> c, Optional<bg> d) implements dv.a {
      public static final Codec<dl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dl.a::a),
                  cs.a.optionalFieldOf("item").forGetter(dl.a::b),
                  bv.b.optionalFieldOf("entity").forGetter(dl.a::c)
               )
               .apply($$0, dl.a::new)
      );

      public static ao<dl.a> a(bg $$0, Optional<cs> $$1, Optional<bg> $$2) {
         return an.R.a(new dl.a(Optional.of($$0), $$1, $$2));
      }

      public static ao<dl.a> a(Optional<bg> $$0, Optional<cs> $$1, Optional<bg> $$2) {
         return an.S.a(new dl.a($$0, $$1, $$2));
      }

      public boolean a(ari $$0, cvp $$1, eth $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
