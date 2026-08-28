import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record atd(String a, xd b, aue c, Optional<atz> d) {
   public xd a(boolean $$0, xd $$1) {
      return xg.a(this.c.a(xd.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xj(xj.a.a, xd.i().b(this.b).f("\n").b($$1))));
   }
}
