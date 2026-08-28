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

public class fk<T> implements ArgumentType<je<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("argument.resource_or_id.invalid"));
   private final jg.a d;
   private final boolean e;
   private final Codec<je<T>> f;

   protected fk(ee $$0, alf<jr<T>> $$1, Codec<je<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fk.c a(ee $$0) {
      return new fk.c($$0);
   }

   public static je<ezm> a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fk.a b(ee $$0) {
      return new fk.a($$0);
   }

   public static je<fav> b(CommandContext<ei> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fk.b c(ee $$0) {
      return new fk.b($$0);
   }

   public static je<fcq> c(CommandContext<ei> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> je<T> d(CommandContext<ei> $$0, String $$1) {
      return (je<T>)$$0.getArgument($$1, je.class);
   }

   @Nullable
   public je<T> a(StringReader $$0) throws CommandSyntaxException {
      ale<?> $$1 = this.d.a(JavaOps.INSTANCE);
      Dynamic<?> $$2 = a((DynamicOps<T>)$$1, $$0);
      return !this.e ? null : (je)this.f.parse($$2).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
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

   public static class a extends fk<fav> {
      protected a(ee $$0) {
         super($$0, mg.br, fax.d);
      }
   }

   public static class b extends fk<fcq> {
      protected b(ee $$0) {
         super($$0, mg.bs, fcq.f);
      }
   }

   public static class c extends fk<ezm> {
      protected c(ee $$0) {
         super($$0, mg.bq, ezm.e);
      }
   }
}
