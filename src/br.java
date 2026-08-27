import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class br extends dh<br.a> {
   @Override
   public Codec<br.a> a() {
      return br.a.a;
   }

   public void a(aqu $$0, bqt $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static record a(Optional<bd> b, Optional<bg> c) implements dh.a {
      public static final Codec<br.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(br.a::a), axu.a(bg.a, "damage").forGetter(br.a::c)).apply($$0, br.a::new)
      );

      public static ao<br.a> b() {
         return an.i.a(new br.a(Optional.empty(), Optional.empty()));
      }

      public static ao<br.a> a(bg $$0) {
         return an.i.a(new br.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<br.a> a(bg.a $$0) {
         return an.i.a(new br.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(aqu $$0, bqt $$1, float $$2, float $$3, boolean $$4) {
         return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
