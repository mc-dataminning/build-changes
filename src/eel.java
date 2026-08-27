import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eel {
   public static final Codec<eel> e = ki.ai.q().dispatch("element_type", eel::a, eem::codec);
   private static final il<ehc> a = il.a(new ehc(List.of()));
   @Nullable
   private volatile een.a b;

   protected static <E extends eel> RecordCodecBuilder<E, een.a> d() {
      return een.a.c.fieldOf("projection").forGetter(eel::e);
   }

   protected eel(een.a $$0) {
      this.b = $$0;
   }

   public abstract jg a(ehf var1, dgo var2);

   public abstract List<ehe.c> a(ehf var1, ib var2, dgo var3, axd var4);

   public abstract ecw a(ehf var1, ib var2, dgo var3);

   public abstract boolean a(ehf var1, cxw var2, cxu var3, doy var4, ib var5, ib var6, dgo var7, ecw var8, axd var9, boolean var10);

   public abstract eem<?> a();

   public void a(cxc $$0, ehe.c $$1, ib $$2, dgo $$3, axd $$4, ecw $$5) {
   }

   public eel a(een.a $$0) {
      this.b = $$0;
      return this;
   }

   public een.a e() {
      een.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<een.a, eee> g() {
      return $$0 -> eee.b;
   }

   public static Function<een.a, eei> a(String $$0) {
      return $$1 -> new eei(Either.left(new ajh($$0)), a, $$1);
   }

   public static Function<een.a, eei> a(String $$0, il<ehc> $$1) {
      return $$2 -> new eei(Either.left(new ajh($$0)), $$1, $$2);
   }

   public static Function<een.a, eek> b(String $$0) {
      return $$1 -> new eek(Either.left(new ajh($$0)), a, $$1);
   }

   public static Function<een.a, eek> b(String $$0, il<ehc> $$1) {
      return $$2 -> new eek(Either.left(new ajh($$0)), $$1, $$2);
   }

   public static Function<een.a, eef> a(il<eci> $$0) {
      return $$1 -> new eef($$0, $$1);
   }

   public static Function<een.a, eej> b(List<Function<een.a, ? extends eel>> $$0) {
      return $$1 -> new eej($$0.stream().map($$1x -> (eel)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
