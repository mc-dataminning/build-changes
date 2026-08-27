import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dh<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(aqu $$0, cee $$1) {
      erp $$2 = bs.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bd> b, Optional<bd> c) implements dh.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dr.a::a), axu.a(bs.b, "entity").forGetter(dr.a::c)).apply($$0, dr.a::new)
      );

      public static ao<dr.a> b() {
         return an.y.a(new dr.a(Optional.empty(), Optional.empty()));
      }

      public static ao<dr.a> a(bs.a $$0) {
         return an.y.a(new dr.a(Optional.empty(), Optional.of(bs.a($$0))));
      }

      public boolean a(erp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
