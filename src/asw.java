import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record asw(String a, xl b, atx c, Optional<ats> d) {
   public xl a(boolean $$0, xl $$1) {
      return xo.a(this.c.a(xl.b(this.a)))
         .a($$2 -> $$2.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xr(xr.a.a, xl.i().b(this.b).f("\n").b($$1))));
   }
}
