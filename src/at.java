import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends dr<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(arg $$0, iz $$1, cup $$2) {
      arf $$3 = $$0.z();
      dsc $$4 = $$3.a_($$1);
      eql $$5 = new eql.a($$3).a(ete.f, $$1.b()).a(ete.a, $$0).a(ete.g, $$4).a(ete.i, $$2).a(etd.o);
      eqi $$6 = new eqi.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(at.a::a), bf.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eqi $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etd.o, ".location"));
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
