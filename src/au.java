import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dv<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(arh $$0, je $$1, cvl $$2) {
      arg $$3 = $$0.B();
      dua $$4 = $$3.a_($$1);
      esw $$5 = new esw.a($$3).a(evp.f, $$1.b()).a(evp.a, $$0).a(evp.g, $$4).a(evp.i, $$2).a(evo.o);
      est $$6 = new est.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(au.a::a), bg.a.optionalFieldOf("location").forGetter(au.a::b)).apply($$0, au.a::new)
      );

      public boolean a(est $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, evo.o, ".location"));
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
