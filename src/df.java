import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class df extends dh<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(aqu $$0, czc<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static ao<df.a> a(akt $$0) {
      return an.g.a(new df.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bd> b, akt c) implements dh.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(df.a::a), akt.a.fieldOf("recipe").forGetter(df.a::b)).apply($$0, df.a::new)
      );

      public boolean a(czc<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public akt b() {
         return this.c;
      }
   }
}
