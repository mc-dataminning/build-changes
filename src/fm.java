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
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fm<T> implements ArgumentType<jg<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("argument.resource_or_id.invalid"));
   private static final vb<?> d = vb.a(uo.a);
   private final ji.a e;
   private final boolean f;
   private final Codec<jg<T>> g;

   protected fm(eg $$0, alq<jt<T>> $$1, Codec<jg<T>> $$2) {
      this.e = $$0;
      this.f = $$0.a($$1).isPresent();
      this.g = $$2;
   }

   public static fm.c a(eg $$0) {
      return new fm.c($$0);
   }

   public static jg<fay> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fm.a b(eg $$0) {
      return new fm.a($$0);
   }

   public static jg<fch> b(CommandContext<ek> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fm.b c(eg $$0) {
      return new fm.b($$0);
   }

   public static jg<fec> c(CommandContext<ek> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jg<T> d(CommandContext<ek> $$0, String $$1) {
      return (jg<T>)$$0.getArgument($$1, jg.class);
   }

   @Nullable
   public jg<T> a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, d);
   }

   @Nullable
   private <O> jg<T> a(StringReader $$0, vb<O> $$1) throws CommandSyntaxException {
      alp<O> $$2 = this.e.a($$1.a());
      Dynamic<?> $$3 = a($$2, $$1, $$0);
      return !this.f ? null : (jg)this.g.parse($$3).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
   }

   @VisibleForTesting
   static <T> Dynamic<T> a(DynamicOps<T> $$0, vb<T> $$1, StringReader $$2) throws CommandSyntaxException {
      int $$3 = $$2.getCursor();
      T $$4 = $$1.b($$2);
      if (b($$2)) {
         return new Dynamic($$0, $$4);
      } else {
         $$2.setCursor($$3);
         alr $$5 = alr.a($$2);
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

   public static class a extends fm<fch> {
      protected a(eg $$0) {
         super($$0, mi.bs, fcj.d);
      }
   }

   public static class b extends fm<fec> {
      protected b(eg $$0) {
         super($$0, mi.bt, fec.f);
      }
   }

   public static class c extends fm<fay> {
      protected c(eg $$0) {
         super($$0, mi.br, fay.e);
      }
   }
}
