import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eos {
   public static final Codec<eos> f = mb.ag.q().dispatch("element_type", eos::a, eot::codec);
   private static final jr<erk> a = jr.a(new erk(List.of()));
   @Nullable
   private volatile eou.a b;

   protected static <E extends eos> RecordCodecBuilder<E, eou.a> e() {
      return eou.a.c.fieldOf("projection").forGetter(eos::f);
   }

   protected eos(eou.a $$0) {
      this.b = $$0;
   }

   public abstract km a(ern var1, dqc var2);

   public abstract List<erm.a> a(ern var1, ji var2, dqc var3, azg var4);

   public abstract enc a(ern var1, ji var2, dqc var3);

   public abstract boolean a(ern var1, dhe var2, dhc var3, dyr var4, ji var5, ji var6, dqc var7, enc var8, azg var9, eqw var10, boolean var11);

   public abstract eot<?> a();

   public void a(dgh $$0, erm.d $$1, ji $$2, dqc $$3, azg $$4, enc $$5) {
   }

   public eos a(eou.a $$0) {
      this.b = $$0;
      return this;
   }

   public eou.a f() {
      eou.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<eou.a, eol> h() {
      return $$0 -> eol.b;
   }

   public static Function<eou.a, eop> a(String $$0) {
      return $$1 -> new eop(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eou.a, eop> a(String $$0, jr<erk> $$1) {
      return $$2 -> new eop(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eou.a, eor> b(String $$0) {
      return $$1 -> new eor(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eou.a, eor> b(String $$0, jr<erk> $$1) {
      return $$2 -> new eor(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eou.a, eor> a(String $$0, eqw $$1) {
      return $$2 -> new eor(Either.left(aku.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<eou.a, eor> a(String $$0, jr<erk> $$1, eqw $$2) {
      return $$3 -> new eor(Either.left(aku.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<eou.a, eom> a(jr<emo> $$0) {
      return $$1 -> new eom($$0, $$1);
   }

   public static Function<eou.a, eoq> b(List<Function<eou.a, ? extends eos>> $$0) {
      return $$1 -> new eoq($$0.stream().map($$1x -> (eos)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
