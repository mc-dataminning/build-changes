import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dx<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(arn $$0, jg $$1, cvx $$2) {
      arm $$3 = $$0.B();
      dvd $$4 = $$3.a_($$1);
      etz $$5 = new etz.a($$3).a(ews.f, $$1.b()).a(ews.a, $$0).a(ews.g, $$4).a(ews.i, $$2).a(ewr.o);
      etw $$6 = new etw.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dx.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(au.a::a), bg.a.optionalFieldOf("location").forGetter(au.a::b)).apply($$0, au.a::new)
      );

      public boolean a(etw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewr.o, ".location"));
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
