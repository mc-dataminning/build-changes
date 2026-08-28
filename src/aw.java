import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aw extends dz<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(are $$0, ji $$1, cwq $$2) {
      ard $$3 = $$0.y();
      dwy $$4 = $$3.a_($$1);
      evv $$5 = new evv.a($$3).a(eym.f, $$1.b()).a(eym.a, $$0).a(eym.g, $$4).a(eym.i, $$2).a(eyl.o);
      evs $$6 = new evs.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(aw.a::a), bi.a.optionalFieldOf("location").forGetter(aw.a::b)).apply($$0, aw.a::new)
      );

      public boolean a(evs $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eyl.o, ".location"));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
