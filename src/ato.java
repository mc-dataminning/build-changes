import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record ato(String a, wy b, auo c, Optional<auj> d) {
   public wy a(boolean $$0, wy $$1) {
      return xb.a(this.c.a(wy.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xe.e(wy.i().b(this.b).f("\n").b($$1))));
   }
}
