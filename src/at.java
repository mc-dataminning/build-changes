import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends dr<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(arf $$0, iz $$1, cuo $$2) {
      are $$3 = $$0.z();
      dsb $$4 = $$3.a_($$1);
      eqk $$5 = new eqk.a($$3).a(etd.f, $$1.b()).a(etd.a, $$0).a(etd.g, $$4).a(etd.i, $$2).a(etc.o);
      eqh $$6 = new eqh.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(at.a::a), bf.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eqh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etc.o, ".location"));
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
