import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fl<T> implements ArgumentType<jf<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("argument.resource_or_id.invalid"));
   private final jh.a d;
   private final boolean e;
   private final Codec<jf<T>> f;

   protected fl(ef $$0, alf<js<T>> $$1, Codec<jf<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fl.c a(ef $$0) {
      return new fl.c($$0);
   }

   public static jf<ezt> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fl.a b(ef $$0) {
      return new fl.a($$0);
   }

   public static jf<fbc> b(CommandContext<ej> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fl.b c(ef $$0) {
      return new fl.b($$0);
   }

   public static jf<fcx> c(CommandContext<ej> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jf<T> d(CommandContext<ej> $$0, String $$1) {
      return (jf<T>)$$0.getArgument($$1, jf.class);
   }

   @Nullable
   public jf<T> a(StringReader $$0) throws CommandSyntaxException {
      ale<?> $$1 = this.d.a(JavaOps.INSTANCE);
      Dynamic<?> $$2 = a((DynamicOps<T>)$$1, $$0);
      return !this.e ? null : (jf)this.f.parse($$2).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
   }

   @VisibleForTesting
   static <T> Dynamic<T> a(DynamicOps<T> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();
      T $$3 = ux.b($$0, $$1);
      if (b($$1)) {
         return new Dynamic($$0, $$3);
      } else {
         $$1.setCursor($$2);
         alg $$4 = alg.a($$1);
         if (b($$1)) {
            return new Dynamic($$0, $$0.createString($$4.toString()));
         } else {
            $$1.setCursor($$2);
            throw c.createWithContext($$1);
         }
      }
   }

   private static boolean b(StringReader $$0) {
      return !$$0.canRead() || $$0.peek() == ' ';
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a extends fl<fbc> {
      protected a(ef $$0) {
         super($$0, mh.br, fbe.d);
      }
   }

   public static class b extends fl<fcx> {
      protected b(ef $$0) {
         super($$0, mh.bs, fcx.f);
      }
   }

   public static class c extends fl<ezt> {
      protected c(ef $$0) {
         super($$0, mh.bq, ezt.e);
      }
   }
}
