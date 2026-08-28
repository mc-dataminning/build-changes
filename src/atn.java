import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record atn(String a, xj b, auo c, Optional<auj> d) {
   public xj a(boolean $$0, xj $$1) {
      return xm.a(this.c.a(xj.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xp(xp.a.a, xj.i().b(this.b).f("\n").b($$1))));
   }
}
