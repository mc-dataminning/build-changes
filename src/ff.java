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

public class ff<T> implements ArgumentType<iw<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.resource_or_id.invalid"));
   private final iy.a d;
   private final boolean e;
   private final Codec<iw<T>> f;

   protected ff(dz $$0, akg<jj<T>> $$1, Codec<iw<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static ff.c a(dz $$0) {
      return new ff.c($$0);
   }

   public static iw<eoq> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static ff.a b(dz $$0) {
      return new ff.a($$0);
   }

   public static iw<epx> b(CommandContext<ed> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static ff.b c(dz $$0) {
      return new ff.b($$0);
   }

   public static iw<erq> c(CommandContext<ed> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> iw<T> d(CommandContext<ed> $$0, String $$1) {
      return (iw<T>)$$0.getArgument($$1, iw.class);
   }

   @Nullable
   public iw<T> a(StringReader $$0) throws CommandSyntaxException {
      ux $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         akf<ux> $$2 = this.d.a(uo.a);
         return ac.a(this.f.parse($$2, $$1), $$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static ux b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      ux $$2 = new uy($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         akh $$3 = akh.a($$0);
         if (c($$0)) {
            return uv.a($$3.toString());
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

   public static class a extends ff<epx> {
      protected a(dz $$0) {
         super($$0, le.aV, epz.d);
      }
   }

   public static class b extends ff<erq> {
      protected b(dz $$0) {
         super($$0, le.aW, ers.b);
      }
   }

   public static class c extends ff<eoq> {
      protected c(dz $$0) {
         super($$0, le.aU, eoq.e);
      }
   }
}
