import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends dd<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aqf $$0, im $$1, csd $$2) {
      aqe $$3 = $$0.z();
      dpy $$4 = $$3.a_($$1);
      eog $$5 = new eog.a($$3).a(eqt.f, $$1.b()).a(eqt.a, $$0).a(eqt.g, $$4).a(eqt.i, $$2).a(eqs.n);
      eoa $$6 = new eoa.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements dd.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(at.a::a), axe.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eoa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eqs.n, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
