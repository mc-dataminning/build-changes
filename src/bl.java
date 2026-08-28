import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dx<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(arn $$0, jg $$1) {
      arm $$2 = $$0.B();
      dvd $$3 = $$2.a_($$1);
      etz $$4 = new etz.a($$2).a(ews.f, $$1.b()).a(ews.a, $$0).a(ews.g, $$3).a(ewr.p);
      etw $$5 = new etw.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dx.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bl.a::a), bg.a.optionalFieldOf("location").forGetter(bl.a::b)).apply($$0, bl.a::new)
      );

      public boolean a(etw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewr.p, ".location"));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
