import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends ds<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aql $$0, ja $$1, cua $$2) {
      aqk $$3 = $$0.z();
      dsh $$4 = $$3.a_($$1);
      eqr $$5 = new eqr.a($$3).a(etk.f, $$1.b()).a(etk.a, $$0).a(etk.g, $$4).a(etk.i, $$2).a(etj.o);
      eqo $$6 = new eqo.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(at.a::a), bf.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eqo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etj.o, ".location"));
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
