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

public class fg<T> implements ArgumentType<ix<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("argument.resource_or_id.invalid"));
   private final iz.a d;
   private final boolean e;
   private final Codec<ix<T>> f;

   protected fg(ea $$0, akm<jk<T>> $$1, Codec<ix<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fg.c a(ea $$0) {
      return new fg.c($$0);
   }

   public static ix<epm> a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fg.a b(ea $$0) {
      return new fg.a($$0);
   }

   public static ix<eqt> b(CommandContext<ee> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fg.b c(ea $$0) {
      return new fg.b($$0);
   }

   public static ix<esn> c(CommandContext<ee> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> ix<T> d(CommandContext<ee> $$0, String $$1) {
      return (ix<T>)$$0.getArgument($$1, ix.class);
   }

   @Nullable
   public ix<T> a(StringReader $$0) throws CommandSyntaxException {
      va $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         akl<va> $$2 = this.d.a(ur.a);
         return (ix<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static va b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      va $$2 = new vb($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         akn $$3 = akn.a($$0);
         if (c($$0)) {
            return uy.a($$3.toString());
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

   public static class a extends fg<eqt> {
      protected a(ea $$0) {
         super($$0, lf.aV, eqv.d);
      }
   }

   public static class b extends fg<esn> {
      protected b(ea $$0) {
         super($$0, lf.aW, esp.b);
      }
   }

   public static class c extends fg<epm> {
      protected c(ea $$0) {
         super($$0, lf.aU, epm.e);
      }
   }
}
