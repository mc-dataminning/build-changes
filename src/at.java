import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends dr<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(arc $$0, iz $$1, cuk $$2) {
      arb $$3 = $$0.z();
      drx $$4 = $$3.a_($$1);
      eqg $$5 = new eqg.a($$3).a(esz.f, $$1.b()).a(esz.a, $$0).a(esz.g, $$4).a(esz.i, $$2).a(esy.o);
      eqd $$6 = new eqd.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(at.a::a), bf.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eqd $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, esy.o, ".location"));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> b() {
         return this.c;
      }
   }
}
