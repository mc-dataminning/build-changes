import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record aso(String a, wy b, atp c, Optional<atk> d) {
   public wy a(boolean $$0, wy $$1) {
      return xb.a(this.c.a(wy.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xe(xe.a.a, wy.i().b(this.b).f("\n").b($$1))));
   }
}
