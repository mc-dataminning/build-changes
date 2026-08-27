import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends dd<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aqf $$0, im $$1) {
      aqe $$2 = $$0.z();
      dpy $$3 = $$2.a_($$1);
      eog $$4 = new eog.a($$2).a(eqt.f, $$1.b()).a(eqt.a, $$0).a(eqt.g, $$3).a(eqs.o);
      eoa $$5 = new eoa.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements dd.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(bh.a::a), axe.a(bc.a, "location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(eoa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eqs.o, ".location"));
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
