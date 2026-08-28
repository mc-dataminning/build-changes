import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eou {
   public static final Codec<eou> f = mb.ag.q().dispatch("element_type", eou::a, eov::codec);
   private static final jr<erm> a = jr.a(new erm(List.of()));
   @Nullable
   private volatile eow.a b;

   protected static <E extends eou> RecordCodecBuilder<E, eow.a> e() {
      return eow.a.c.fieldOf("projection").forGetter(eou::f);
   }

   protected eou(eow.a $$0) {
      this.b = $$0;
   }

   public abstract km a(erp var1, dqe var2);

   public abstract List<ero.a> a(erp var1, ji var2, dqe var3, azh var4);

   public abstract ene a(erp var1, ji var2, dqe var3);

   public abstract boolean a(erp var1, dhg var2, dhe var3, dyt var4, ji var5, ji var6, dqe var7, ene var8, azh var9, eqy var10, boolean var11);

   public abstract eov<?> a();

   public void a(dgj $$0, ero.d $$1, ji $$2, dqe $$3, azh $$4, ene $$5) {
   }

   public eou a(eow.a $$0) {
      this.b = $$0;
      return this;
   }

   public eow.a f() {
      eow.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<eow.a, eon> h() {
      return $$0 -> eon.b;
   }

   public static Function<eow.a, eor> a(String $$0) {
      return $$1 -> new eor(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eow.a, eor> a(String $$0, jr<erm> $$1) {
      return $$2 -> new eor(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eow.a, eot> b(String $$0) {
      return $$1 -> new eot(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eow.a, eot> b(String $$0, jr<erm> $$1) {
      return $$2 -> new eot(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eow.a, eot> a(String $$0, eqy $$1) {
      return $$2 -> new eot(Either.left(aku.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<eow.a, eot> a(String $$0, jr<erm> $$1, eqy $$2) {
      return $$3 -> new eot(Either.left(aku.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<eow.a, eoo> a(jr<emq> $$0) {
      return $$1 -> new eoo($$0, $$1);
   }

   public static Function<eow.a, eos> b(List<Function<eow.a, ? extends eou>> $$0) {
      return $$1 -> new eos($$0.stream().map($$1x -> (eou)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
