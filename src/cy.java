import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cy(Optional<bd<ase<String>, cy.a>> c) implements dy<czc> {
   public static final Codec<cy> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cy.a.a).optionalFieldOf("pages").forGetter(cy::b)).apply($$0, cy::new));

   @Override
   public ks<czc> a() {
      return kt.R;
   }

   public boolean a(cvx $$0, czc $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.a());
   }

   public Optional<bd<ase<String>, cy.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<ase<String>> {
      public static final Codec<cy.a> a = Codec.STRING.xmap(cy.a::new, cy.a::a);

      public boolean a(ase<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
