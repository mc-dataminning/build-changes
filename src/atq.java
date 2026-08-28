import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record atq(String a, xa b, auq c, Optional<aul> d) {
   public xa a(boolean $$0, xa $$1) {
      return xd.a(this.c.a(xa.b(this.a)))
         .a($$2 -> $$2.a($$0 ? o.k : o.m).a(StringArgumentType.escapeIfRequired(this.a)).a(new xg.e(xa.i().b(this.b).f("\n").b($$1))));
   }
}
