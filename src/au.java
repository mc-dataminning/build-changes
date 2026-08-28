import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dv<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(aqv $$0, jd $$1, cuq $$2) {
      aqu $$3 = $$0.A();
      dtc $$4 = $$3.a_($$1);
      eru $$5 = new eru.a($$3).a(eun.f, $$1.b()).a(eun.a, $$0).a(eun.g, $$4).a(eun.i, $$2).a(eum.o);
      err $$6 = new err.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(au.a::a), bg.a.optionalFieldOf("location").forGetter(au.a::b)).apply($$0, au.a::new)
      );

      public boolean a(err $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eum.o, ".location"));
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
