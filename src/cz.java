import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cz extends dj<cz.a> {
   @Override
   public Codec<cz.a> a() {
      return cz.a.a;
   }

   public void a(arr $$0, czd $$1, @Nullable bwf $$2) {
      ezh $$3 = bx.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bi> b, Optional<cl> c, Optional<bi> d) implements dj.a {
      public static final Codec<cz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cz.a::a),
                  cl.a.optionalFieldOf("item").forGetter(cz.a::b),
                  bx.b.optionalFieldOf("entity").forGetter(cz.a::c)
               )
               .apply($$0, cz.a::new)
      );

      public static aq<cz.a> a(bi $$0, Optional<cl> $$1, Optional<bi> $$2) {
         return ap.R.a(new cz.a(Optional.of($$0), $$1, $$2));
      }

      public static aq<cz.a> a(Optional<bi> $$0, Optional<cl> $$1, Optional<bi> $$2) {
         return ap.S.a(new cz.a($$0, $$1, $$2));
      }

      public boolean a(arr $$0, czd $$1, ezh $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cl> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
