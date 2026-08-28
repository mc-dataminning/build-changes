import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record atv(String a, xk b, auw c, Optional<aur> d) {
   public xk a(boolean $$0, xk $$1) {
      return xn.a(this.c.a(xk.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xq(xq.a.a, xk.i().b(this.b).f("\n").b($$1))));
   }
}
