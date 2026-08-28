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

public class fs<T> implements ArgumentType<jj<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.resource_or_id.invalid"));
   private final jl.a d;
   private final boolean e;
   private final Codec<jj<T>> f;

   protected fs(em $$0, akj<jw<T>> $$1, Codec<jj<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fs.c a(em $$0) {
      return new fs.c($$0);
   }

   public static jj<eqt> a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fs.a b(em $$0) {
      return new fs.a($$0);
   }

   public static jj<esc> b(CommandContext<eq> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fs.b c(em $$0) {
      return new fs.b($$0);
   }

   public static jj<etz> c(CommandContext<eq> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jj<T> d(CommandContext<eq> $$0, String $$1) {
      return (jj<T>)$$0.getArgument($$1, jj.class);
   }

   @Nullable
   public jj<T> a(StringReader $$0) throws CommandSyntaxException {
      uu $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         aki<uu> $$2 = this.d.a(ul.a);
         return (jj<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static uu b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      uu $$2 = new uv($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         akk $$3 = akk.a($$0);
         if (c($$0)) {
            return us.a($$3.toString());
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

   public static class a extends fs<esc> {
      protected a(em $$0) {
         super($$0, lr.bc, ese.d);
      }
   }

   public static class b extends fs<etz> {
      protected b(em $$0) {
         super($$0, lr.bd, etz.f);
      }
   }

   public static class c extends fs<eqt> {
      protected c(em $$0) {
         super($$0, lr.bb, eqt.e);
      }
   }
}
