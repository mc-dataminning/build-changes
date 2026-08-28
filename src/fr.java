import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fr<T> implements ArgumentType<ji<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.resource_or_id.invalid"));
   private final jk.a d;
   private final boolean e;
   private final Codec<ji<T>> f;

   protected fr(el $$0, ala<jv<T>> $$1, Codec<ji<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fr.c a(el $$0) {
      return new fr.c($$0);
   }

   public static ji<eqi> a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fr.a b(el $$0) {
      return new fr.a($$0);
   }

   public static ji<erq> b(CommandContext<ep> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fr.b c(el $$0) {
      return new fr.b($$0);
   }

   public static ji<etn> c(CommandContext<ep> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> ji<T> d(CommandContext<ep> $$0, String $$1) {
      return (ji<T>)$$0.getArgument($$1, ji.class);
   }

   @Nullable
   public ji<T> a(StringReader $$0) throws CommandSyntaxException {
      vo $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         akz<vo> $$2 = this.d.a(vf.a);
         return (ji<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vo b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vo $$2 = new vp($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         alb $$3 = alb.a($$0);
         if (c($$0)) {
            return vm.a($$3.toString());
         } else {
            $$0.setCursor($$1);
            throw c.createWithContext($$0);
         }
      }
   }

   private static boolean c(StringReader $$0) {
      return !$$0.canRead() || $$0.peek() == ' ';
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a extends fr<erq> {
      protected a(el $$0) {
         super($$0, lq.aV, ers.d);
      }
   }

   public static class b extends fr<etn> {
      protected b(el $$0) {
         super($$0, lq.aW, etp.b);
      }
   }

   public static class c extends fr<eqi> {
      protected c(el $$0) {
         super($$0, lq.aU, eqi.e);
      }
   }
}
