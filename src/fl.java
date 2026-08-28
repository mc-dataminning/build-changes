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
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("argument.resource_or_id.invalid"));
   private static final uz<Object> d = uz.a(JavaOps.INSTANCE);
   private final jh.a e;
   private final boolean f;
   private final Codec<jf<T>> g;

   protected fl(ef $$0, alh<js<T>> $$1, Codec<jf<T>> $$2) {
      this.e = $$0;
      this.f = $$0.a($$1).isPresent();
      this.g = $$2;
   }

   public static fl.c a(ef $$0) {
      return new fl.c($$0);
   }

   public static jf<fam> a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fl.a b(ef $$0) {
      return new fl.a($$0);
   }

   public static jf<fbv> b(CommandContext<ej> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fl.b c(ef $$0) {
      return new fl.b($$0);
   }

   public static jf<fdq> c(CommandContext<ej> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jf<T> d(CommandContext<ej> $$0, String $$1) {
      return (jf<T>)$$0.getArgument($$1, jf.class);
   }

   @Nullable
   public jf<T> a(StringReader $$0) throws CommandSyntaxException {
      alg<Object> $$1 = this.e.a(JavaOps.INSTANCE);
      Dynamic<?> $$2 = a($$1, d, $$0);
      return !this.f ? null : (jf)this.g.parse($$2).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
   }

   @VisibleForTesting
   static <T> Dynamic<T> a(DynamicOps<T> $$0, uz<T> $$1, StringReader $$2) throws CommandSyntaxException {
      int $$3 = $$2.getCursor();
      T $$4 = $$1.b($$2);
      if (b($$2)) {
         return new Dynamic($$0, $$4);
      } else {
         $$2.setCursor($$3);
         ali $$5 = ali.a($$2);
         if (b($$2)) {
            return new Dynamic($$0, $$0.createString($$5.toString()));
         } else {
            $$2.setCursor($$3);
            throw c.createWithContext($$2);
         }
      }
   }

   private static boolean b(StringReader $$0) {
      return !$$0.canRead() || $$0.peek() == ' ';
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a extends fl<fbv> {
      protected a(ef $$0) {
         super($$0, mh.bs, fbx.d);
      }
   }

   public static class b extends fl<fdq> {
      protected b(ef $$0) {
         super($$0, mh.bt, fdq.f);
      }
   }

   public static class c extends fl<fam> {
      protected c(ef $$0) {
         super($$0, mh.br, fam.e);
      }
   }
}
