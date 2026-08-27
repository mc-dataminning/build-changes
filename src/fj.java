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

public class fj<T> implements ArgumentType<ja<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.resource_or_id.invalid"));
   private final jc.a d;
   private final boolean e;
   private final Codec<ja<T>> f;

   protected fj(ed $$0, aks<jn<T>> $$1, Codec<ja<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fj.c a(ed $$0) {
      return new fj.c($$0);
   }

   public static ja<eru> a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fj.a b(ed $$0) {
      return new fj.a($$0);
   }

   public static ja<etb> b(CommandContext<eh> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fj.b c(ed $$0) {
      return new fj.b($$0);
   }

   public static ja<euu> c(CommandContext<eh> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> ja<T> d(CommandContext<eh> $$0, String $$1) {
      return (ja<T>)$$0.getArgument($$1, ja.class);
   }

   @Nullable
   public ja<T> a(StringReader $$0) throws CommandSyntaxException {
      vh $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         akr<vh> $$2 = this.d.a(uy.a);
         return ad.a(this.f.parse($$2, $$1), $$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vh b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vh $$2 = new vi($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         akt $$3 = akt.a($$0);
         if (c($$0)) {
            return vf.a($$3.toString());
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

   public static class a extends fj<etb> {
      protected a(ed $$0) {
         super($$0, li.aV, etd.d);
      }
   }

   public static class b extends fj<euu> {
      protected b(ed $$0) {
         super($$0, li.aW, euw.b);
      }
   }

   public static class c extends fj<eru> {
      protected c(ed $$0) {
         super($$0, li.aU, eru.e);
      }
   }
}
